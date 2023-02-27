package com.predial.controlador;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.predial.modelo.RecibosAnuladosModelo;
import com.predial.servicio.ServicioGeneral;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("RecibosAnulados")
public class RecibosAnuladosControlador {
	ServicioGeneral servicio = new ServicioGeneral();
	RecibosAnuladosModelo modelo = new RecibosAnuladosModelo();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response encontrar(@Context UriInfo uriinfo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.encontrar("RecibosAnulados", modelo, uriinfo);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertar(@BeanParam RecibosAnuladosModelo modelo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.insertar("RecibosAnulados", modelo);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizar(@BeanParam RecibosAnuladosModelo modelo,@Context UriInfo uriinfo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.actualizar("RecibosAnulados", modelo ,uriinfo);
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@BeanParam RecibosAnuladosModelo modelo,@Context UriInfo uriinfo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.eliminar("RecibosAnulados", modelo ,uriinfo);
    }
}