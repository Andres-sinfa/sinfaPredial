package com.predial.controlador;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.predial.modelo.mod010_insolvenciaOtrosModelo;
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
@Path("mod010_insolvenciaOtros")
public class mod010_insolvenciaOtrosControlador {
	ServicioGeneral servicio = new ServicioGeneral();
	mod010_insolvenciaOtrosModelo modelo = new mod010_insolvenciaOtrosModelo();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response encontrar(@Context UriInfo uriinfo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.encontrar("mod010_insolvenciaOtros", modelo, uriinfo);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertar(@BeanParam mod010_insolvenciaOtrosModelo modelo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.insertar("mod010_insolvenciaOtros", modelo);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizar(@BeanParam mod010_insolvenciaOtrosModelo modelo,@Context UriInfo uriinfo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.actualizar("mod010_insolvenciaOtros", modelo ,uriinfo);
    }
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@BeanParam mod010_insolvenciaOtrosModelo modelo,@Context UriInfo uriinfo) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        return servicio.eliminar("mod010_insolvenciaOtros", modelo ,uriinfo);
    }
}
