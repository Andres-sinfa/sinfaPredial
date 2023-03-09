package com.predial.controlador;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.predial.modelo.PropietariosModelo;
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
@Path("Propietarios")
public class PropietariosControlador {
	ServicioGeneral servicio = new ServicioGeneral();
	PropietariosModelo modelo = new PropietariosModelo();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response encontrar(@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.encontrar("Propietarios", modelo, uriinfo,httpHeaders);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertar(@BeanParam PropietariosModelo modelo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.insertar("Propietarios", modelo,httpHeaders);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizar(@BeanParam PropietariosModelo modelo,@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.actualizar("Propietarios", modelo ,uriinfo,httpHeaders);
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@BeanParam PropietariosModelo modelo,@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.eliminar("Propietarios", modelo ,uriinfo,httpHeaders);
    }
}
