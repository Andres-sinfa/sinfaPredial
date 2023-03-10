package com.predial.repositorio;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import java.util.regex.Matcher;


import com.predial.ModelosRetorno.FiltrosModelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.OrderDefault;

import jakarta.ws.rs.core.UriInfo;


public interface FiltrosRepositorio {
	FiltrosModelo Filtrosmodelo = new FiltrosModelo();
	
	public default <T> String queryType(String paramKey, String paramValue,T t) throws SQLException{
		Field fields[] = t.getClass().getDeclaredFields();
		String param = paramValue.replace("[", "").replace("]", "").split("\\.")[0];
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
	
	public default <T> FiltrosModelo Filtros(T t,Entry<String, List<String>> param){
	//	Field fields[] = t.getClass().getDeclaredFields();
		Filtrosmodelo.setPagina(1);
		Filtrosmodelo.setRegistros(10);
		Filtrosmodelo.setOrdenar(t.getClass().getAnnotation(OrderDefault.class).value());
		Filtrosmodelo.setFiltro(false);
	//	for(Field field : fields) {
					switch(param.getKey().toLowerCase()) {
					  case "pagina":
						  Filtrosmodelo.setPagina(Integer.parseInt(param.getValue().toString().replace("[", "").replace("]", ""))); 
						  Filtrosmodelo.setFiltro(true);
					    break;
					  case "registros":
						  Filtrosmodelo.setRegistros(Integer.parseInt(param.getValue().toString().replace("[", "").replace("]", ""))); 
						  Filtrosmodelo.setFiltro(true);
					    break;
					  case "ordenar":
						  String[] ordenar = param.getValue().toString().replace("[", "").replace("]", "").split("\\.");
						  if(ordenar.length > 1) {
							  Filtrosmodelo.setOrdenar(ordenar[0] + " " + ordenar[1]);
						  }else {
							  Filtrosmodelo.setOrdenar(ordenar[0]);
						  } 
						  Filtrosmodelo.setFiltro(true);
					    break;
					  	case "operacioncondicional":
						  Filtrosmodelo.setAdicionalesCondicionales(param.getValue().toString().replace("[", "").replace("]", "")); 
						  Filtrosmodelo.setFiltro(false);
					    break;
					}
	//	}

		return Filtrosmodelo;
	}
	
	public default <T> String condiciones(T t,Entry<String, List<String>> param,String query,boolean filtro) throws SQLException{
			
		if(!(filtro)) {
				String[] valor = param.getValue().toString().replace("[", "").replace("]", "").split("\\.");
				if(!(param.getKey().equals("OperacionCondicional"))) {
					if(valor.length > 1) {
						switch(valor[1].toLowerCase()) {
						  case "like":
							  query =query + param.getKey() +" "+valor[1]+" "+this.queryType(param.getKey(), param.getValue().toString(), t)+" and ";
						    break;
						  case "in":
							  String[] ors = valor[0].split(",");
							  query =query + param.getKey() +" "+valor[1]+" (";
							  for(String or: ors) {
								  query =query +this.queryType(param.getKey(), or, t)+" , ";
							  }
							  if(query.endsWith(" , ")) {
								  query =query.substring(0, query.length()-3);
							  }
							  query =query + ") and ";
						    break;
						}
						
					}else {
						query =query + param.getKey() +" = "+this.queryType(param.getKey(), param.getValue().toString(), t)+" and ";
					}
				}
			}
		return query;
	}
	
	public default <T> String CondicionalEspecifico(T t,UriInfo info ,String query) throws SQLException {
		String Condicional =""; 
		for (Entry<String, List<String>> paramToMap : info.getQueryParameters().entrySet()) {
			if(paramToMap.getKey().toLowerCase().equals("operacioncondicional")) {
				Condicional = paramToMap.getValue().toString().replace("[", "").replace("]", "");
				query = query.replace(" operacionCondicional = "+Condicional+" and", "");
			}
		}
		for (Entry<String, List<String>> paramToMap : info.getQueryParameters().entrySet()) {
			if(!(this.Filtros(t, paramToMap).isFiltro() || paramToMap.getKey().toLowerCase().equals("operacioncondicional") )) {
				
				System.out.println(paramToMap.getKey().toLowerCase().equals("operacioncondicional"));
//				if(!(paramToMap.getKey().equals("OperacionCondicional"))) {
//					QueryParams.put(paramToMap.getKey(), paramToMap.getValue().toString().replace("[", "").replace("]", ""));
//				}else {
//					Condicional = paramToMap.getValue().toString().replace("[", "").replace("]", "W");
//				}
				String opciones ="";
				String[] valor = paramToMap.getValue().toString().replace("[", "").replace("]", "").split("\\.");
				if(valor.length > 1) {
					switch(valor[1].toLowerCase()) {
					  case "like":
						  opciones =opciones + paramToMap.getKey() +" "+valor[1]+" "+this.queryType(paramToMap.getKey(), paramToMap.getValue().toString(), t)+" and ";
					    break;
					  case "in":
						  String[] ors = valor[0].split(",");
						  opciones =opciones + paramToMap.getKey() +" "+valor[1]+" (";
						  for(String or: ors) {
							  opciones =opciones +this.queryType(paramToMap.getKey(), or, t)+" , ";
						  }
						  if(opciones.endsWith(" , ")) {
							  opciones =opciones.substring(0, opciones.length()-3);
						  }
						  opciones =opciones + ") and ";
					    break;
					}
//					opciones =opciones + paramToMap.getKey() +" "+valor[1]+" "+this.queryType(paramToMap.getKey(), paramToMap.getValue().toString(), t)+" and ";
				}else {
					opciones =opciones + paramToMap.getKey() +" = "+this.queryType(paramToMap.getKey(), paramToMap.getValue().toString(), t)+" and ";
				}
				System.out.println(opciones+"<---------------");
				if(!(paramToMap.getKey().equals("OperacionCondicional"))) {
					String regex = paramToMap.getKey();
					Pattern pat = Pattern.compile(regex);
					Matcher mat = pat.matcher(Condicional);
					if (mat.find()) {
					    System.out.println("regex encontrada "+paramToMap.getKey());
					    String regex2 = opciones;
					    System.out.println(regex2+" "+query);
						Pattern pat2 = Pattern.compile(regex2);
						Matcher mat2 = pat2.matcher(query);
						if(mat2.find()) {
							System.out.println("regex encontrada "+opciones);
							Condicional = Condicional.replace(regex, opciones.replace(" and ", ""));
							System.out.println(Condicional+"<----------->");
							query = query.replace(opciones, "");
						}else {
							System.err.println("regex NO encontrada " +opciones);
						}
					} else {
					    System.err.println("regex NO encontrada" +paramToMap.getKey());
					}
				}

			}
//			System.out.println(query + Condicional +" and ");

		}
		
		return query + Condicional;
	}
	
	public default boolean condicional(String query ) {
		return !((query.contains("=")) || query.toLowerCase().contains("like")|| query.toLowerCase().contains("in"));
	} 
}
