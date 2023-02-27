package com.predial.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;

import com.predial.ModelosRetorno.RetornoBusqueda;
import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.OrderDefault;
import com.predial.conexion.conexion;

import jakarta.ws.rs.core.UriInfo;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;



public interface CrudRepositorio {
	conexion conectar = new conexion();
	Connection con = conectar.Conexion();
	RetornoBusqueda busquedaModelo = new RetornoBusqueda();
	RetornoMostrable RetornoModelo = new RetornoMostrable();

	public default int count( String query) throws SQLException{
		int count = 0;
		PreparedStatement ps = con.prepareStatement(query.replace("*", "count(*)"));
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}
	public default <T> String queryType(String paramKey, List<String> paramValue,T t) throws SQLException{
		Field fields[] = t.getClass().getDeclaredFields();
		String param = paramValue.toString().replace("[", "").replace("]", "");
		for(Field field: fields) {
			if (field.getName().equals(paramKey)) {
				if(field.getType().getSimpleName().equals("String")) {
					if(!(field.getAnnotation(DateFormat.class) == null)) {
						String Fecha = param;
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
						param = "'"+fechaConvertida+"'";
					}else {
						param = "'"+param+"'";
					}
				}
			}
		}
		return param;
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
		Field fields[] = t.getClass().getDeclaredFields();
		ArrayList<Object> data = new ArrayList<Object>();
		
		String select = "select * from "+tabla+" where ";
		int i = 0;
		int paramsLength = info.getQueryParameters().entrySet().size();
		int pagina = 1;
		int registros = 10;
		int total = 0;
		String ordenar = t.getClass().getAnnotation(OrderDefault.class).value();
		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
			  
			  if(param.getKey().equals("pagina") || param.getKey().equals("ordenar") || param.getKey().equals("registros")) {
				  paramsLength--;  
			  }
			  if(!(param.getKey().equals("pagina") || param.getKey().equals("ordenar") || param.getKey().equals("registros"))) {
				    select =select + param.getKey() +" = "+this.queryType(param.getKey(), param.getValue(), t);
				    if(i+1 < paramsLength) {
				    	select =select+ " and ";
				    	
				    }
			  }
			    i++;
			  }
		  
		  for (Entry<String, List<String>> param : info.getQueryParameters().entrySet()) {
				switch(param.getKey()) {
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
		if(!(select.contains("="))) {
			select = "select * from "+tabla;
		}
		if(!(pagina == 0)) {
			pagina--;
		}
		if(select.endsWith(" and ")) {
			select = select.substring(0, select.length()-4);
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
		
		select = select+ " order by "+ordenar+" offset "+ (pagina * registros)+" rows FETCH FIRST " +registros+" ROWS ONLY"; 
		System.out.println(select);
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Object objeto = t.getClass().getDeclaredConstructor().newInstance();
			
			for(Field field: fields) {
				switch(field.getType().getSimpleName()) {
				  case "String":
					  
					  if(!(field.getAnnotation(DateFormat.class)==null)) {
						  if(!(rs.getString(field.getName()).equals(null))) {
							  String[] partesFecha1 = rs.getString(field.getName()).split(" ");
							   partesFecha1 = partesFecha1[0].split("-");
							  String Fecha = partesFecha1[2]+"-"+partesFecha1[1]+"-"+partesFecha1[0];
							  this.callSetter(objeto, field.getName(), Fecha);  
						  }else {
							  this.callSetter(objeto, field.getName(),  rs.getString(field.getName()));  
						  }
					  }else {
						  this.callSetter(objeto, field.getName(), rs.getString(field.getName()));
					  }
					  
				    break;
				  case "Integer":
					  this.callSetter(objeto, field.getName(), rs.getInt(field.getName()));
							
				    break;
				  case "BigDecimal":
					  this.callSetter(objeto, field.getName(), rs.getBigDecimal(field.getName()));
							
				    break;
				  case "boolean":
					  this.callSetter(objeto, field.getName(), rs.getBoolean(field.getName()));
							
				    break;
				  case "Long":
					  this.callSetter(objeto, field.getName(), rs.getLong(field.getName()));
							
				    break;
				  case "Float":
					  this.callSetter(objeto, field.getName(), rs.getFloat(field.getName()));
				    break;
				  default:
				}

			}
			data.add(objeto);
			
		}

		busquedaModelo.setFilas(data);
		busquedaModelo.setFilasPorPagina(data.size());
		busquedaModelo.setTotalPaginas((int) Math.ceil((float) ((float) total / (float)registros)));
		busquedaModelo.setTotalRegistros(total);
		RetornoModelo.setData(busquedaModelo);
		RetornoModelo.setMensaje("nada");
		RetornoModelo.setStatus(200);
		RetornoModelo.setId(null);
		return RetornoModelo;
		
	}
	
	public default <T> RetornoMostrable insert(String tabla,T t) throws SQLException {
		int idGenerado= 0;
		Field fields[] = t.getClass().getDeclaredFields();
		String insert = "insert into "+tabla+"(";
		for(Field field: fields) {
			if(!(this.callGetter(t, field.getName()) == null)) {
				insert = insert + field.getName()+",";
			}
		}
		insert = insert.substring(0, insert.length()-1);
		insert = insert+ ") values(";
		for(Field field: fields) {
			if(!(this.callGetter(t, field.getName()) == null)) {
				if(!(this.callGetter(t, field.getName()) == null)) {
				insert = insert +"? ,";
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
					ps.execute();
					ResultSet generatedKeys = ps.getGeneratedKeys();
					
					if (generatedKeys.next()) {
				         idGenerado = generatedKeys.getInt(1);
					}
					RetornoModelo.setData(t);
					RetornoModelo.setMensaje("insertado correctamente");
					RetornoModelo.setId(idGenerado);
					RetornoModelo.setStatus(200);
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
					return RetornoModelo;
				}

	        
	}
	
	public default <T> RetornoMostrable update(String tabla,T t,UriInfo info) throws SQLException {
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
			ps.executeUpdate();
			RetornoModelo.setData(t);
			RetornoModelo.setMensaje("actualizado correctamente");
			RetornoModelo.setId(null);
			RetornoModelo.setStatus(200);
			return RetornoModelo;
		}catch(Exception e) {
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
			RetornoModelo.setData(null);
			RetornoModelo.setMensaje("eliminado correctamente");
			RetornoModelo.setId(null);
			RetornoModelo.setStatus(200);
			return RetornoModelo;
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
			RetornoModelo.setData(null);
			RetornoModelo.setMensaje("No se logro eliminar");
			RetornoModelo.setId(null);
			RetornoModelo.setStatus(500);
			return RetornoModelo;
		}
		}
		
}
