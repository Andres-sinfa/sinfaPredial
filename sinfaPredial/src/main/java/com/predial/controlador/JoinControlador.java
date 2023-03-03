package com.predial.controlador;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import com.predial.servicio.ServicioQueryJoin;


@Path("JoinQuery")
public class JoinControlador{
	ServicioQueryJoin ServicioQueryJoin = new ServicioQueryJoin();
	
    @GET
    @Path("/{tablas}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response encontrar(@PathParam("tablas") String tablas , @Context UriInfo info) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
    	return ServicioQueryJoin.encontrarJoin(tablas, info);
    }
}
