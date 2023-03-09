package com.predial.controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;


import com.predial.modelo.VeredasModelo;
import com.predial.repositorio.JwtSinfaRepositorio;
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

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("Veredas")
public class VeredasControlador implements JwtSinfaRepositorio {
	ServicioGeneral servicio = new ServicioGeneral();
	VeredasModelo modelo = new VeredasModelo();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response encontrar(@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
//    	System.out.println(this.getToken());
//    	prueba prueba = new prueba(); 
//    	System.out.println(this.decode("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJub21icmVVc3VhcmlvIjoiQVBJIiwiaWQiOiJJVl9Za3NqUmFjcTdnSHZyVk5ONGpnPT0iLCJ1bHRpbW9JbmdyZXNvIjoxNjc4MjkxMzA2NjY4LCJqdGkiOiIiLCJpc3MiOiJTSU5GQS5BUEkiLCJpYXQiOjE2NzgyOTEzMDYsImV4cCI6MTY3ODM3NzcwNn0.Zfai90-31AREu4Pa6PlZgho71SsSVgMZv0PkUhiSuig"));
    	return servicio.encontrar("Veredas", modelo, uriinfo,httpHeaders);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertar(@BeanParam VeredasModelo modelo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.insertar("Veredas", modelo,httpHeaders);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizar(@BeanParam VeredasModelo modelo,@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.actualizar("Veredas", modelo ,uriinfo,httpHeaders);
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@BeanParam VeredasModelo modelo,@Context UriInfo uriinfo,@Context ContainerRequestContext httpHeaders) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
        return servicio.eliminar("Veredas", modelo ,uriinfo,httpHeaders);
    }

}
