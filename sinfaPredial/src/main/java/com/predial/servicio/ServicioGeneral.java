package com.predial.servicio;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.repositorio.CrudRepositorio;
import com.predial.repositorio.ValidarRepositorio;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;import jakarta.ws.rs.core.Response.Status;

public class ServicioGeneral implements CrudRepositorio,ValidarRepositorio {
	
	
	public Response encontrar(String tabla,Object modelo , UriInfo uriinfo ) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		return this.responder(this.find(tabla, modelo, uriinfo));
	}
	
	public Response insertar(String tabla,Object modelo) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		if(this.validar(modelo, "insertar").getData() == null) {
			return this.responder(this.insert(tabla, modelo));
		} else {
			return this.responder(this.validar(modelo, "insertar"));
		}
		
		
	}
	
	public Response actualizar(String tabla,Object modelo , UriInfo uriinfo) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		if(this.validar(modelo, "actualizar").getData() == null) {
		return this.responder(this.update(tabla, modelo , uriinfo));
		} else {
			return this.responder(this.validar(modelo, "actualizar"));
		}
	}
	public Response eliminar(String tabla,Object modelo , UriInfo uriinfo) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		return this.responder(this.delete(modelo,tabla, uriinfo));
	}
}
