package com.predial.servicio;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.predial.repositorio.CrudRepositorio;
import com.predial.repositorio.JwtSinfaRepositorio;
import com.predial.repositorio.ValidarRepositorio;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

public class ServicioGeneral implements CrudRepositorio,ValidarRepositorio,JwtSinfaRepositorio {
	
	
	public Response encontrar(String tabla,Object modelo , UriInfo uriinfo,ContainerRequestContext httpHeaders ) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		try {
			JwtSinfaRepositorio.validaHeaders(httpHeaders);
			if(JwtSinfaRepositorio.validaHeaders(httpHeaders).getStatus() == 202) {
				return CrudRepositorio.responder(this.find(tabla, modelo, uriinfo),httpHeaders);
			}else {
				return CrudRepositorio.responder(JwtSinfaRepositorio.validaHeaders(httpHeaders),httpHeaders);
			}
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			return Response.serverError().entity(e).build();
		}
	}
	
	public Response insertar(String tabla,Object modelo,ContainerRequestContext httpHeaders) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		if(JwtSinfaRepositorio.validaHeaders(httpHeaders).getStatus() == 202) {
			if(this.validar(modelo, "insertar").getData() == null) {
				try {
					return CrudRepositorio.responder(this.insert(tabla, modelo),httpHeaders);
				} catch (ClassNotFoundException | SQLException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return Response.serverError().entity(e).build();
				}
			} else {
				return CrudRepositorio.responder(this.validar(modelo, "insertar"),httpHeaders);
			}
		}else {
			return CrudRepositorio.responder(JwtSinfaRepositorio.validaHeaders(httpHeaders),httpHeaders);
		}
		
		
	}
	
	public Response actualizar(String tabla,Object modelo , UriInfo uriinfo,ContainerRequestContext httpHeaders) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		if(JwtSinfaRepositorio.validaHeaders(httpHeaders).getStatus() == 202) {
			if(this.validar(modelo, "actualizar").getData() == null) {
			try {
				return CrudRepositorio.responder(this.update(tabla, modelo , uriinfo),httpHeaders);
			} catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return Response.serverError().entity(e).build();
			}
			} else {
				return CrudRepositorio.responder(this.validar(modelo, "actualizar"),httpHeaders);
			}
		}else {
			return CrudRepositorio.responder(JwtSinfaRepositorio.validaHeaders(httpHeaders),httpHeaders);
		}
	}
	public Response eliminar(String tabla,Object modelo , UriInfo uriinfo,ContainerRequestContext httpHeaders) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
		if(JwtSinfaRepositorio.validaHeaders(httpHeaders).getStatus() == 202) {
			try {
				return CrudRepositorio.responder(this.delete(modelo,tabla, uriinfo),httpHeaders);
			} catch (ClassNotFoundException | SQLException | IOException e) {
				return Response.serverError().entity(e).build();
			}
		}else {
			return CrudRepositorio.responder(JwtSinfaRepositorio.validaHeaders(httpHeaders),httpHeaders);
		}
	}
}
