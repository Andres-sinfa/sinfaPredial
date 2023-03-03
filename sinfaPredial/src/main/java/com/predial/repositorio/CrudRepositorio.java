package com.predial.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.lang.reflect.Method;

import com.predial.ModelosRetorno.FiltrosModelo;
import com.predial.ModelosRetorno.RetornoBusqueda;
import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.OrderDefault;
import com.predial.conexion.conexion;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.Response.Status;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;



public interface CrudRepositorio extends FiltrosRepositorio{
	conexion conectar = new conexion();
	RetornoBusqueda busquedaModelo = new RetornoBusqueda();
	RetornoMostrable RetornoModelo = new RetornoMostrable();
	
	public default Response responder(RetornoMostrable modelo){
		Response responder = null;
		switch(modelo.getStatus()) {
		  case 200:
			  responder = Response.ok(modelo).build();
		    break;
		  case 406:
			  responder = Response.status(Status.NOT_ACCEPTABLE).entity(modelo).build();
		    break;
		  case 500:
			  responder = Response.serverError().entity(modelo).build();
		    break;
		}
		return responder;
	}
	
	public default int count( String query) throws SQLException{
		Connection con = conectar.Conexion();
		int count = 0;
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			count++;
		}
		return count;
	}
	
	public default void merge(Object obj, Object update){
	    if(!obj.getClass().isAssignableFrom(update.getClass())){
	        return;
	    }

	    Method[] methods = obj.getClass().getMethods();

	    for(Method fromMethod: methods){
	        if(fromMethod.getDeclaringClass().equals(obj.getClass())
	                && fromMethod.getName().startsWith("get")){

	            String fromName = fromMethod.getName();
	            String toName = fromName.replace("get", "set");

	            try {
	                Method toMetod = obj.getClass().getMethod(toName, fromMethod.getReturnType());
	                Object value = fromMethod.invoke(update, (Object[])null);
	                if(value != null){
	                    toMetod.invoke(obj, value);
	                }
	                System.out.println(value);
	            } catch (Exception e) {
	                e.printStackTrace();
	            } 
	        }
	    }
	}
	
	
	public default void callSetter(Object obj, String fieldName, Object value){
		  PropertyDescriptor pd;
		  try {
		   pd = new PropertyDescriptor(fieldName, obj.getClass());
		   pd.getWriteMethod().invoke(obj, value);
		  } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		 }
		 
	public default Object callGetter(Object obj, String fieldName){
		  PropertyDescriptor pd;
		  try {
		   pd = new PropertyDescriptor(fieldName, obj.getClass());
		   return pd.getReadMethod().invoke(obj);
		  } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   return null;
		  }
		 }
	
	public default <T> RetornoMostrable find(String tabla,T t,UriInfo info) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		FiltrosModelo Filtros = new  FiltrosModelo(); 
		Filtros.setPagina(1);
		Filtros.setRegistros(10);
		Filtros.setOrdenar(t.getClass().getAnnotation(OrderDefault.class).value());
		for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
		Filtros = this.Filtros(t, param);
		}
		System.out.println(Filtros);
		Connection con = conectar.Conexion();
		Field fields[] = t.getClass().getDeclaredFields();
		ArrayList<Object> data = new ArrayList<Object>();
		
		String select = "select * from "+tabla+" where ";
		
//		int i = 0;
//		int paramsLength = info.getQueryParameters().entrySet().size();
//		int pagina = 1;
//		int registros = 10;
		int total = 0;
//		String ordenar = t.getClass().getAnnotation(OrderDefault.class).value();
		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
			  	FiltrosModelo FiltrosBusqueda = this.Filtros(t, param);
				select = this.condiciones(t, param, select,FiltrosBusqueda.isFiltro());
		  }
			  
//		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
//				switch(param.getKey().toLowerCase()) {
//				  case "pagina":
//					  pagina = Integer.parseInt(param.getValue().toString().replace("[", "").replace("]", ""));
//				    break;
//				  case "registros":
//					  registros = Integer.parseInt(param.getValue().toString().replace("[", "").replace("]", ""));
//				    break;
//				  case "ordenar":
//					  ordenar = param.getValue().toString().replace("[", "").replace("]", "");
//				    break;
//				}
//		  }
		
		  select = this.CondicionalEspecifico(t, info, select);
		 
		if(this.condicional(select)) {
			select = "select * from "+tabla;
		}
		if(!(Filtros.getPagina() == 0)) {
			Filtros.setPagina(Filtros.getPagina() - 1);
		}
		if(select.endsWith(" and ")) {
			select = select.substring(0, select.length()-5);
		}
		try {
			total = this.count(select);	
		} catch(Exception e) {
			System.out.print(e);
			RetornoModelo.setData(null);
			if(e.getMessage().contains("Invalid column name")) {
				RetornoModelo.setMensaje("Busque por un parametro adecuado");
				RetornoModelo.setStatus(406);
			}else {
				RetornoModelo.setMensaje("Busque por un parametro adecuado");
				RetornoModelo.setStatus(500);
			}
			RetornoModelo.setId(null);
			return RetornoModelo;
		}
		

		select = select+ " order by "+Filtros.getOrdenar()+" offset "+ (Filtros.getPagina() * Filtros.getRegistros()) +" rows FETCH FIRST " +Filtros.getRegistros()+" ROWS ONLY"; 

		
		System.out.println(select);
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Object objeto = t.getClass().getDeclaredConstructor().newInstance();
			Map<String, Object> map = new HashMap<>();
			for(Field field: fields) {

				switch(field.getType().getSimpleName()) {
				  case "String":
					  
					  if(!(field.getAnnotation(DateFormat.class)==null)) {
						  if(!(rs.getString(field.getName()) == null )) {
							  String[] partesFecha1 = rs.getString(field.getName()).split(" ");
							   partesFecha1 = partesFecha1[0].split("-");
							  String Fecha = partesFecha1[2]+"-"+partesFecha1[1]+"-"+partesFecha1[0];
//							  this.callSetter(objeto, field.getName(), Fecha);  
							  map.put(field.getName(), Fecha);
						  }else {
//							  this.callSetter(objeto, field.getName(),  rs.getString(field.getName()));  
							  map.put(field.getName(),  rs.getString(field.getName()));
						  }
					  }else {
//						  this.callSetter(objeto, field.getName(), rs.getString(field.getName()));
						  map.put(field.getName(),  rs.getString(field.getName()));
					  }
					  
				    break;
				  case "Integer":
//					  this.callSetter(objeto, field.getName(), rs.getInt(field.getName()));
					  map.put(field.getName(),  rs.getInt(field.getName()));
				    break;
				  case "BigDecimal":
					  this.callSetter(objeto, field.getName(), rs.getBigDecimal(field.getName()));
					  map.put(field.getName(),  rs.getBigDecimal(field.getName()));
				    break;
				  case "boolean":
//					  this.callSetter(objeto, field.getName(), rs.getBoolean(field.getName()));
					  map.put(field.getName(),  rs.getBoolean(field.getName()));
				    break;
				  case "Long":
//					  this.callSetter(objeto, field.getName(), rs.getLong(field.getName()));
					  map.put(field.getName(),  rs.getLong(field.getName()));
				    break;
				  case "Float":
//					  this.callSetter(objeto, field.getName(), rs.getFloat(field.getName()));
					  map.put(field.getName(),  rs.getFloat(field.getName()));
				    break;
				  default:
				}
			}
			if(t.getClass().getSimpleName().equals("ParametrosModelo")) {
				String imagenes = "select * from Images where TableFather = '"+tabla+"'";
				System.out.println(imagenes);
				PreparedStatement pstwo = con.prepareStatement(imagenes);
				ResultSet rstwo = pstwo.executeQuery();
				while(rstwo.next()) {
					if(rstwo.getInt("TableFatherId") == rs.getInt("Id_Parametros")){
						map.put(rstwo.getString("Descripcion"),  rstwo.getString("Patch"));
					}
					
				}
			}
			data.add(map);
			
		}
		con.close();
		busquedaModelo.setFilas(data);
		busquedaModelo.setFilasPorPagina(data.size());
		busquedaModelo.setTotalPaginas((int) Math.ceil((float) ((float) total / (float)Filtros.getRegistros())));
		busquedaModelo.setTotalRegistros(total);
		RetornoModelo.setData(busquedaModelo);
		RetornoModelo.setMensaje("nada");
		RetornoModelo.setStatus(200);
		RetornoModelo.setId(null);
		return RetornoModelo;
		
	}
	
	public default <T> RetornoMostrable insert(String tabla,T t) throws SQLException {
		Connection con = conectar.Conexion();
		int idGenerado= 0;
		Field fields[] = t.getClass().getDeclaredFields();
		String insert = "insert into "+tabla+"(";
		for(Field field: fields) {
			if(!(this.callGetter(t, field.getName()) == null)) {
				if(!(field.getName().equals("File"))) {
					insert = insert + field.getName()+",";
				}
			}
		}
		insert = insert.substring(0, insert.length()-1);
		insert = insert+ ") values(";
		for(Field field: fields) {
			if(!(this.callGetter(t, field.getName()) == null)) {
				if(!(this.callGetter(t, field.getName()) == null)) {
					if(!(field.getName().equals("File"))) {
						insert = insert +"? ,";
					}
				}
			}
		}
		insert = insert.substring(0, insert.length()-1);
		insert = insert+")";
		System.out.println(insert);
		
	        	try {
					PreparedStatement ps = con.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
					int i = 1;
					for(Field field: fields) {
						if(!(this.callGetter(t, field.getName()) == null)) {
							if(!(field.getName().equals("File"))) {
								if(field.getType().getSimpleName().equals("String") && !(field.getAnnotation(DateFormat.class) == null)) {
									String Fecha = (String) this.callGetter(t, field.getName());
									String[] FechaList = Fecha.split("-|\\/|\\.");
									Fecha = FechaList[2]+"-"+FechaList[1]+"-"+FechaList[0];
									SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
									java.sql.Date fechaConvertida=null;
									try {
									    Date parsed =  dateFormat.parse(Fecha);
									    fechaConvertida = new java.sql.Date(parsed.getTime());
									} catch(Exception e) {
									    System.out.println("Error occurred"+ e.getMessage());
									}
									ps.setObject(i, fechaConvertida);
								}else {
									ps.setObject(i, this.callGetter(t, field.getName()));
								}
								i++;
						}
						}
					}
					ps.execute();
					
					ResultSet generatedKeys = ps.getGeneratedKeys();
					
					if (generatedKeys.next()) {
				         idGenerado = generatedKeys.getInt(1);
					}
					RetornoModelo.setData(t);
					RetornoModelo.setMensaje("insertado correctamente");
					RetornoModelo.setId(idGenerado);
					RetornoModelo.setStatus(200);
					con.close();
					return RetornoModelo;
				}catch(Exception e) {
					
					System.out.println(e +" data insert unsuccess.");
					RetornoModelo.setData(t);
					RetornoModelo.setData(t);
					if(e.getMessage().contains("Cannot insert duplicate key in object")) {
						RetornoModelo.setMensaje("no puede duplicar el registro");
						RetornoModelo.setStatus(500);
					}else {
						RetornoModelo.setMensaje("No se logro actualizar");
						RetornoModelo.setStatus(500);
					}
					RetornoModelo.setId(null);
					con.close();
					return RetornoModelo;
				}

	        
	}
	
	public default <T> RetornoMostrable update(String tabla,T t,UriInfo info) throws SQLException {
		Connection con = conectar.Conexion();
		String Select = "Select * from "+tabla+" where ";
		
		Field fields[] = t.getClass().getDeclaredFields();
		String update = "update "+tabla+" set ";
		for(Field field: fields) {
			if(!(this.callGetter(t, field.getName()) == null)) {
				update = update + field.getName() +" = ? ,";
			}
		}
		
		update = update.substring(0, update.length()-1);
		update = update + " where ";
		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
			  update = update + param.getKey()+ " = "+this.queryType(param.getKey(), param.getValue(),t)+" and ";
			  Select = Select + param.getKey()+ " = "+this.queryType(param.getKey(), param.getValue(),t)+" and ";
		  }
		  update = update.substring(0, update.length()-4);
		  Select = Select.substring(0, Select.length()-4);
		  try {
		  if(this.count(Select) == 0) {
			  	RetornoModelo.setData(t);
				RetornoModelo.setMensaje("no se logro encontro el parametro buscado");
				RetornoModelo.setId(null);
				RetornoModelo.setStatus(406);
				
				return RetornoModelo;
		  }
	} catch(Exception e) {
		System.out.print(e);
		RetornoModelo.setData(null);
		if(e.getMessage().contains("Invalid column name")) {
			RetornoModelo.setMensaje("Busque por un parametro adecuado");
			RetornoModelo.setStatus(406);
		}else {
			RetornoModelo.setMensaje("Busque por un parametro adecuado");
			RetornoModelo.setStatus(500);
		}
		RetornoModelo.setId(null);
		return RetornoModelo;
	}
		  
		try {
			PreparedStatement ps = con.prepareStatement(update);
			int i = 1;
			for(Field field: fields) {
				if(!(this.callGetter(t, field.getName()) == null)) {
					if(field.getType().getSimpleName().equals("String") && !(field.getAnnotation(DateFormat.class) == null)) {
						String Fecha = (String) this.callGetter(t, field.getName());
						String[] FechaList = Fecha.split("-|\\/|\\.");
						Fecha = FechaList[2]+"-"+FechaList[1]+"-"+FechaList[0];
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
						java.sql.Date fechaConvertida=null;
						try {
						    Date parsed =  dateFormat.parse(Fecha);
						    fechaConvertida = new java.sql.Date(parsed.getTime());
						} catch(Exception e) {
						    System.out.println("Error occurred"+ e.getMessage());
						}
						ps.setObject(i, fechaConvertida);
					}else {
						ps.setObject(i, this.callGetter(t, field.getName()));
					}
					i++;
				}
			}
			ps.executeUpdate();			con.close();
			RetornoModelo.setData(t);
			RetornoModelo.setMensaje("actualizado correctamente");
			RetornoModelo.setId(null);
			RetornoModelo.setStatus(200);
			return RetornoModelo;
		}catch(Exception e) {			con.close();
			System.out.println(e +" data insert unsuccess.");
			RetornoModelo.setData(t);
			if(e.getMessage().contains("Cannot insert duplicate key in object")) {
				RetornoModelo.setMensaje("no puede duplicar el registro");
				RetornoModelo.setStatus(500);
			}else if(e.getMessage().contains("Incorrect syntax near 'wh'")){
				RetornoModelo.setMensaje("No coloco ningun valor a buscar");
				RetornoModelo.setStatus(406);
			}else {
				RetornoModelo.setMensaje("No se logro actualizar");
				RetornoModelo.setStatus(500);
			}
			
			RetornoModelo.setId(null);
			
			return RetornoModelo;
		}
	}

	public default <T> RetornoMostrable delete(T t,String tabla,UriInfo info) throws SQLException {
		Connection con = conectar.Conexion();
		String Select = "select * from "+tabla+" where ";
		String delete = "delete from "+tabla+" where ";
		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
			  delete = delete + param.getKey()+ " = "+this.queryType(param.getKey(), param.getValue(),t)+" and ";
			  Select = Select + param.getKey()+ " = "+this.queryType(param.getKey(), param.getValue(),t)+" and ";
		  }
		  delete = delete.substring(0, delete.length()-4);
		  Select = Select.substring(0, Select.length()-4);

		  if(this.count(Select) == 0) {
			  	RetornoModelo.setData(null);
				RetornoModelo.setMensaje("no se logro encontro el parametro buscado");
				RetornoModelo.setId(null);
				RetornoModelo.setStatus(406);
				
				return RetornoModelo;
		  }
			
		try {
			
			PreparedStatement ps = con.prepareStatement(delete);
			ps.executeUpdate();
			con.close();
			RetornoModelo.setData(null);
			RetornoModelo.setMensaje("eliminado correctamente");
			RetornoModelo.setId(null);
			RetornoModelo.setStatus(200);
			return RetornoModelo;
		}catch(Exception e) {
			con.close();
			System.out.println(e +"data insert unsuccess.");
			RetornoModelo.setData(null);
			RetornoModelo.setMensaje("No se logro eliminar");
			RetornoModelo.setId(null);
			RetornoModelo.setStatus(500);
			return RetornoModelo;
		}
		}
	
	public default <T> RetornoMostrable findJoin(String tablasBuscar,UriInfo info,ArrayList<Object> modelos) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		int pagina = 1;
		int registros = 10;
		int total = 0;
		int acomuladoTodas = 0;
		int acomuladoexistentes = 0;
		String ordenar= modelos.get(0).getClass().getSimpleName().substring(0, modelos.get(0).getClass().getSimpleName().length()-6)+"."+modelos.get(0).getClass().getAnnotation(OrderDefault.class).value(); 
		ArrayList<Map<String, Object>> anidado = new ArrayList<Map<String, Object>>();
		String select = "select ";
		for(Object Modelo : modelos) {
			Field fields[] = Modelo.getClass().getDeclaredFields();
			for(Field field : fields) {
				select = select + Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName()+" , ";
			}
		}
		if(select.endsWith(" , ")) {
			select = select.substring(0, select.length()-3);
		}

		Connection con = conectar.Conexion();
		String[] Tablas = tablasBuscar.split(",");
		select = select +" from";
		for (int i = 0; i < Tablas.length - 1; i++) {
			int count = 0;
			String[] RelacionesPuntuales = Tablas[i+1].split("-");
			String RelacionesQuery = "SELECT \r\n"
					+ "	fk.name [Constraint],\r\n"
					+ "    OBJECT_NAME(fk.parent_object_id) [Tabla],\r\n"
					+ "    COL_NAME(fc.parent_object_id,fc.parent_column_id) [Columna],\r\n"
					+ "    OBJECT_NAME (fk.referenced_object_id) AS [TablaBase],\r\n"
					+ "    COL_NAME(fc.referenced_object_id, fc.referenced_column_id) AS [ColumnaTablaBase]\r\n"
					+ "FROM \r\n"
					+ "	sys.foreign_keys fk\r\n"
					+ "	INNER JOIN sys.foreign_key_columns fc ON (fk.OBJECT_ID = fc.constraint_object_id)\r\n";
			if(RelacionesPuntuales.length > 1) {
				RelacionesQuery = RelacionesQuery+" where OBJECT_NAME(fk.parent_object_id) = '"+RelacionesPuntuales[0]+"' and OBJECT_NAME (fk.referenced_object_id) = '"+RelacionesPuntuales[1]+"'";
			}else {
				RelacionesQuery = RelacionesQuery+ " where OBJECT_NAME(fk.parent_object_id) = '"+Tablas[i+1].split("-")[0]+"' and OBJECT_NAME (fk.referenced_object_id) = '"+Tablas[i]+"'";
			}
			PreparedStatement ps = con.prepareStatement(RelacionesQuery);
			ResultSet rs = ps.executeQuery();
			
			if(RelacionesPuntuales.length > 1) {
				if(select.endsWith(" from")) {
					select = select + " "+ RelacionesPuntuales[1] + " inner join "+ RelacionesPuntuales[0] +" on ";
				}else if(select.endsWith(" inner join ")){
					select = select + RelacionesPuntuales[0] +" on ";
				}
			}else { 
				if(select.endsWith(" from")) {
					select = select + " "+ Tablas[i] + " inner join "+ Tablas[i+1].split("-")[0] +" on ";
				}else if(select.endsWith(" inner join ")){
					select = select + Tablas[i+1].split("-")[0] +" on ";
				}
			}
			if(select.endsWith(" on ")) {
				while(rs.next()) {
					select = select + rs.getString("TablaBase") + "." + rs.getString("ColumnaTablaBase")+" = "+ rs.getString("Tabla") + "."+rs.getString("Columna") + " and ";
					count++;
				}
				rs.close();
				if(count == 0) {
					RetornoModelo.setData(null);
					if(RelacionesPuntuales.length > 1) {
						RetornoModelo.setMensaje("No hay relacion entre la tabla "+RelacionesPuntuales[1]+" y la tabla "+RelacionesPuntuales[0]);
					}else {
						RetornoModelo.setMensaje("No hay relacion entre la tabla "+Tablas[i]+" y la tabla "+Tablas[i+1].split("-")[0]);
					}
					
					RetornoModelo.setStatus(406);
					RetornoModelo.setId(null);
					return RetornoModelo;
				}
				if(select.endsWith(" and ")) {
					select = select.substring(0, select.length()-4);
				}
				select = select+ " inner join ";
			}

		}
		if(select.endsWith(" inner join ")) {
			select = select.substring(0, select.length()-12);
		}
		select = select + " where ";
		for(Object Modelo : modelos) {
			Field fields[] = Modelo.getClass().getDeclaredFields();		
			for(Field field: fields) {
				for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
					  if(!(param.getKey().toLowerCase().equals("pagina") || param.getKey().toLowerCase().equals("ordenar") || param.getKey().toLowerCase().equals("registros"))) {
						  String[] condicionales = param.getKey().toString().split("\\.");
						  acomuladoTodas++;
						  if(condicionales.length == 2) {
							  if(condicionales[0].equals(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)) && condicionales[1].equals(field.getName())){
								select =select + param.getKey() +" = "+this.queryType(param.getKey(), param.getValue(), Modelo)+ " and "; 
							  }else {
								  acomuladoexistentes++;
							  }
						  }else {
							RetornoModelo.setData(null);
							RetornoModelo.setMensaje("La clave del parametro debe tener un sufijo indicando la tabla a la que pertenece ejemplo:[tabla].[clave]");
							RetornoModelo.setStatus(406);
							RetornoModelo.setId(null);
							return RetornoModelo;
						  }
					  }else {

					  }
				}
			}
		}
		if(!(acomuladoexistentes == 0) && acomuladoexistentes == acomuladoTodas) {
			RetornoModelo.setData(null);
			RetornoModelo.setMensaje("la clave del parameteo o el sufijo de la tabla no existen");
			RetornoModelo.setStatus(406);
			RetornoModelo.setId(null);
			return RetornoModelo;
		}
		
		if(select.endsWith(" and ")) {
			select = select.substring(0, select.length()-4);
		}else if(select.endsWith(" where ")) {
			select = select.substring(0, select.length()-6);
		}
		
		try {
			total = this.count(select);	
		} catch(Exception e) {
			System.out.print(e);
			RetornoModelo.setData(null);
			if(e.getMessage().contains("Invalid column name")) {
				RetornoModelo.setMensaje("Busque por un parametro adecuado");
				RetornoModelo.setStatus(406);
			}else {
				RetornoModelo.setMensaje("Busque por un parametro adecuado");
				RetornoModelo.setStatus(500);
			}
			RetornoModelo.setId(null);
			return RetornoModelo;
		}
		
		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
				switch(param.getKey().toLowerCase()) {
				  case "pagina":
					  pagina = Integer.parseInt(param.getValue().toString().replace("[", "").replace("]", ""));
				    break;
				  case "registros":
					  registros = Integer.parseInt(param.getValue().toString().replace("[", "").replace("]", ""));
				    break;
				  case "ordenar":
					  ordenar = param.getValue().toString().replace("[", "").replace("]", "");
				    break;
				}
		  }
		if(!(pagina == 0)) {
			pagina--;
		}
		
		select = select+ "order by "+ordenar+" offset "+ (pagina * registros)+" rows FETCH FIRST " +registros+" ROWS ONLY"; 
		
		System.out.println(select);
		PreparedStatement pstwo = con.prepareStatement(select);
		ResultSet rstwo = pstwo .executeQuery();
		while(rstwo.next()) {
			Map<String, Object> map = new HashMap<>();
			for(Object Modelo : modelos) {
				
				Field fields[] = Modelo.getClass().getDeclaredFields();
				
				for(Field field: fields) {
					switch(field.getType().getSimpleName()) {
					  case "String":
						  
						  if(!(field.getAnnotation(DateFormat.class)==null)) {
							  if(!(rstwo.getString(field.getName())== null)) {
								  String[] partesFecha1 = rstwo.getString(field.getName()).split(" ");
								   partesFecha1 = partesFecha1[0].split("-");
								  String Fecha = partesFecha1[2]+"-"+partesFecha1[1]+"-"+partesFecha1[0];
								  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), Fecha);
//								  this.callSetter(objeto, field.getName(), Fecha);  
							  }else {
								  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getString(field.getName()));
//								  this.callSetter(objeto, field.getName(),  rstwo.getString(field.getName()));  
							  }
						  }else {
							  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getString(field.getName()));
//							  this.callSetter(objeto, field.getName(), rstwo.getString(field.getName()));
						  }
					    break;
					  case "Integer":
						  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getInt(field.getName()));
//						  this.callSetter(objeto, field.getName(), rstwo.getInt(field.getName()));	
					    break;
					  case "BigDecimal":
						  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getBigDecimal(field.getName()));
//						  this.callSetter(objeto, field.getName(), rstwo.getBigDecimal(field.getName()));	
					    break;
					  case "boolean":
						  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getBoolean(field.getName()));
//						  this.callSetter(objeto, field.getName(), rstwo.getBoolean(field.getName()));	
					    break;
					  case "Long":
						  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getLong(field.getName()));
//						  this.callSetter(objeto, field.getName(), rstwo.getLong(field.getName()));		
					    break;
					  case "Float":
						  map.put(Modelo.getClass().getSimpleName().substring(0, Modelo.getClass().getSimpleName().length()-6)+"."+field.getName(), rstwo.getFloat(field.getName()));
//						  this.callSetter(objeto, field.getName(), rstwo.getFloat(field.getName()));
					    break;
					  default:
					}
				}
			}
//			Object ejemplo = data.get(0), data.get(1);
			anidado.add(map);
		}
//		System.out.println(anidado);
//		if(Relaciones.isEmpty()) {
//			System.out.println("no se logro realizar");
//		}
//		System.out.println(Relaciones);
//		String Select = "select * from ";
		
//		return anidado;
		busquedaModelo.setFilas(anidado);
		busquedaModelo.setFilasPorPagina(anidado.size());
		busquedaModelo.setTotalPaginas((int) Math.ceil((float) ((float) total / (float)registros)));
		busquedaModelo.setTotalRegistros(total);
		RetornoModelo.setData(busquedaModelo);
		RetornoModelo.setMensaje("nada");
		RetornoModelo.setStatus(200);
		RetornoModelo.setId(null);
		return RetornoModelo;
	}
		
}
