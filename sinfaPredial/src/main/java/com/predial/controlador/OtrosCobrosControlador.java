package com.predial.controlador;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.predial.modelo.OtrosCobrosModelo;
import com.predial.servicio.ServicioGeneral;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
@Path("OtrosCobros")
public class OtrosCobrosControlador {
	ServicioGeneral servicio = new ServicioGeneral();
	OtrosCobrosModelo modelo = new OtrosCobrosModelo();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response encontrar(@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.encontrar("OtrosCobros", modelo, uriinfo,httpHeaders);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertar(@BeanParam OtrosCobrosModelo modelo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.insertar("OtrosCobros", modelo,httpHeaders);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizar(@BeanParam OtrosCobrosModelo modelo,@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.actualizar("OtrosCobros", modelo ,uriinfo,httpHeaders);
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@BeanParam OtrosCobrosModelo modelo,@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.eliminar("OtrosCobros", modelo ,uriinfo,httpHeaders);
    }
}
