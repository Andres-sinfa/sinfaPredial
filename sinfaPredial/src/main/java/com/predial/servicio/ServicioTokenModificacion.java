package com.predial.servicio;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.predial.repositorio.CrudRepositorio;
import com.predial.repositorio.JwtSinfaRepositorio;
import com.predial.repositorio.webBdAdmin;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Response;


public class ServicioTokenModificacion implements webBdAdmin{
	
	public Response crearToken(ContainerRequestContext httpHeaders) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		if(JwtSinfaRepositorio.validaHeaders(httpHeaders).getStatus() == 202) {
			return CrudRepositorio.responder(this.update(httpHeaders),httpHeaders);
		}else {
			return CrudRepositorio.responder(JwtSinfaRepositorio.validaHeaders(httpHeaders),httpHeaders);
		}
	}
	
	public Response validarToken(ContainerRequestContext httpHeaders ,String TokenModificar) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		if(JwtSinfaRepositorio.validaHeaders(httpHeaders).getStatus() == 202) {
			return CrudRepositorio.responder(this.validate(httpHeaders, TokenModificar),httpHeaders);
		}else {
			return CrudRepositorio.responder(JwtSinfaRepositorio.validaHeaders(httpHeaders),httpHeaders);
		}
	}
	
}
