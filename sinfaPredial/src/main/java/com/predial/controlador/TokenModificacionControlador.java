package com.predial.controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import java.sql.SQLException;

import com.predial.servicio.ServicioTokenModificacion;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("TokenModlificacion")
public class TokenModificacionControlador {
ServicioTokenModificacion tokenservicio = new ServicioTokenModificacion();

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearToken(@Context ContainerRequestContext httpHeaders) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
        return tokenservicio.crearToken(httpHeaders);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response validarToken(@FormParam("Token") String Token,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
        return tokenservicio.validarToken(httpHeaders, Token);
    }
}
