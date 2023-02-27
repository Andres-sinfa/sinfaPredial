package com.predial.repositorio;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.Size;
import com.predial.anotacion.DateFormat;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public interface ValidarRepositorio extends CrudRepositorio {
	RetornoMostrable RetornoModelo = new RetornoMostrable();
	public default <T> RetornoMostrable validar(T t ,String metodo) {
		JsonObjectBuilder validaciones =  Json.createObjectBuilder();
		JsonObjectBuilder comparacion =  Json.createObjectBuilder();
		validaciones = this.NotNull(t, metodo, validaciones);
		validaciones = this.Size(t, validaciones);
		validaciones = this.DateFormat(t, validaciones);
		JsonObject empObject = validaciones.build();
		JsonObject condicional = comparacion.build();
		if(empObject.equals(condicional)) {
			RetornoModelo.setData(null);
		}else {
			RetornoModelo.setData(empObject);
		}
		
		RetornoModelo.setMensaje("no se logro realizar la peticion solicitada");
		RetornoModelo.setStatus(406);
		RetornoModelo.setId(null);

		return RetornoModelo;
	} 
	
	public default <T> JsonObjectBuilder NotNull(T t ,String metodo,JsonObjectBuilder json) {
		Field fields[] = t.getClass().getDeclaredFields();
		
		for(Field field: fields){
			if(!(field.getAnnotation(NotNull.class) == null)) {
			if(!(field.getType().getSimpleName().equals("boolean"))) {
				if(!(metodo.equals("actualizar") && !(field.getAnnotation(NotNull.class).update()))) {
					if(this.callGetter(t, field.getName()) == null) {
						json.add(field.getName(), "este valor no puede ser nulo");
					}
				}
				
			}
			}
		}
		 
		return json;
	} 
	
	public default <T> JsonObjectBuilder Size(T t,JsonObjectBuilder json) {
		Field fields[] = t.getClass().getDeclaredFields();
		
		for(Field field: fields){
			if(!(field.getAnnotation(Size.class) == null)) {
			if(!(field.getType().getSimpleName().equals("boolean"))) {
					if(!(this.callGetter(t, field.getName()) == null)) {
						int since =((int) field.getAnnotation(Size.class).since());
						int until = (int) field.getAnnotation(Size.class).until();
						switch(field.getType().getSimpleName()) {
						  case "String":
							  if(!(((String)this.callGetter(t, field.getName())).length() > since && ((String)this.callGetter(t, field.getName())).length() <= until )) {
								  json.add(field.getName(), "este valor esta fuera de los limites");
							  }
							  break;
						  case "BigDecimal":
							  if(!(((BigDecimal) this.callGetter(t, field.getName())).compareTo(new BigDecimal(field.getAnnotation(Size.class).since())) > 0 && ((BigDecimal) this.callGetter(t, field.getName())).compareTo(new BigDecimal(field.getAnnotation(Size.class).until())) <= 0  )) {
								  json.add(field.getName(), "este valor esta fuera de los limites");
							  }
						    break;
						  case "Integer":
							  if(!(((int) this.callGetter(t, field.getName())) > since && ((int) this.callGetter(t, field.getName())) <= until)) {
								  json.add(field.getName(), "este valor esta fuera de los limites");
							  }
						    break;
						  case "Float":
							  if(!(((float) this.callGetter(t, field.getName())) > since && ((float) this.callGetter(t, field.getName())) <= until)) {
								  json.add(field.getName(), "este valor esta fuera de los limites");
							  }
						    break;
						}
				}
				
			}
			}
		}
		 
		return json;
	}
	public default <T> JsonObjectBuilder DateFormat(T t ,JsonObjectBuilder json) {
		Field fields[] = t.getClass().getDeclaredFields();
		
		for(Field field: fields){
			if(!(field.getAnnotation(DateFormat.class) == null)) {
			if((field.getType().getSimpleName().equals("String"))) {
					if(!(this.callGetter(t, field.getName()) == null)) {
						Pattern pat = Pattern.compile("^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$");
						Matcher mat = pat.matcher((String) this.callGetter(t, field.getName()));
						if (!(mat.find())) {
							json.add(field.getName(), "este valor no es adecuado pra una fecha");;
						} 
				}
				
			}
			}
		}
		 
		return json;
	} 
}
