package com.predial.servicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.modelo.ImagesModelo;
import com.predial.repositorio.CrudRepositorio;
import com.predial.repositorio.ValidarRepositorio;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

public class ServicioImagenes implements CrudRepositorio,ValidarRepositorio {
//	
//	
//	public Response encontrar(String tabla,Object modelo , UriInfo uriinfo ) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException {
//		return this.responder(this.find(tabla, modelo, uriinfo));
//	}
//	
	RetornoMostrable RetornoModelo = new RetornoMostrable();
	public ImagesModelo CrearArchivo(ImagesModelo modelo) throws IOException {
	    String mimeType = modelo.getFile().getMediaType().toString();
	    InputStream is = modelo.getFile().getEntityAs(InputStream.class);
		FileOutputStream fw = new FileOutputStream("D:/copia_" + ((String) this.callGetter(modelo, "Descripcion"))+"."+mimeType.split("/")[1]);
//		FileOutputStream fw = new FileOutputStream("C:/Users/andre/OneDrive/Pictures/Saved Pictures/" + nombre);
		byte bytes[] = new byte[1024];
		int leidos = is.read(bytes);
		while (leidos > 0) {
		   fw.write(bytes);
		   leidos = is.read(bytes);
		}
		fw.close();
		is.close();

		modelo.setPatch("D:/copia_" + modelo.getDescripcion()+"."+mimeType.split("/")[1]);
		modelo.setFile(null);
		return modelo;
	}
	
	public boolean EliminarArchivo(String patch) {
		boolean estatus = false;
        try{
            File archivo = new File(patch);
            estatus = archivo.delete();
            if (!estatus) {
                System.out.println("Error no se ha podido eliminar el  archivo");

           }else{
                System.out.println("Se ha eliminado el archivo exitosamente");
           }
        }catch(Exception e){
           System.out.println(e);
        }
		return estatus;
	}
	
	public Response insertar(String tabla,ImagesModelo modelo,ContainerRequestContext httpHeaders) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException, IOException, ClassNotFoundException {
		if(this.validar(modelo, "insertar").getData() == null) {
			return CrudRepositorio.responder(this.insert(tabla, this.CrearArchivo(modelo)),httpHeaders);
//			return Response.ok().build();
		} else {
			return CrudRepositorio.responder(this.validar(modelo, "insertar"),httpHeaders);
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	public Response actualizar(String tabla,ImagesModelo modelo , UriInfo uriinfo,ContainerRequestContext httpHeaders) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException, IOException, ClassNotFoundException {
		if(this.validar(modelo, "actualizar").getData() == null) {
			RetornoMostrable modeloBusqueda = this.find(tabla, modelo, uriinfo);
			if(((Map<String , Object>) ((ArrayList<?>) this.callGetter(modeloBusqueda.getData(), "filas")).get(0)).size() > 1) {
				boolean eliminado = this.EliminarArchivo(((Map<String , Object>) ((ArrayList<?>) this.callGetter(modeloBusqueda.getData(), "filas")).get(0)).get("Patch").toString());
				if(!eliminado) {
					RetornoModelo.setData(null);
					RetornoModelo.setMensaje("No se logro actualizar la imagen");
					RetornoModelo.setStatus(500);
					RetornoModelo.setId(null);
					CrudRepositorio.responder(RetornoModelo,httpHeaders);
				}
			} else {
				RetornoModelo.setData(null);
				RetornoModelo.setMensaje("Busque por un parametro adecuado");
				RetornoModelo.setStatus(406);
				RetornoModelo.setId(null);
				CrudRepositorio.responder(RetornoModelo,httpHeaders);
			}
		return CrudRepositorio.responder(this.update(tabla, this.CrearArchivo(modelo) , uriinfo),httpHeaders);
		} else {
			return CrudRepositorio.responder(this.validar(modelo, "actualizar"),httpHeaders);
		}
	}
	
	@SuppressWarnings("unchecked")
	public Response eliminar(String tabla,Object modelo , UriInfo uriinfo,ContainerRequestContext httpHeaders) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		RetornoMostrable modeloBusqueda = this.find(tabla, modelo, uriinfo);
		if(((Map<String , Object>) ((ArrayList<?>) this.callGetter(modeloBusqueda.getData(), "filas")).get(0)).size() > 1) {
			boolean eliminado = this.EliminarArchivo(((Map<String , Object>) ((ArrayList<?>) this.callGetter(modeloBusqueda.getData(), "filas")).get(0)).get("Patch").toString());
			if(!eliminado) {
				RetornoModelo.setData(null);
				RetornoModelo.setMensaje("No se logro actualizar la imagen");
				RetornoModelo.setStatus(500);
				RetornoModelo.setId(null);
				CrudRepositorio.responder(RetornoModelo,httpHeaders);
			}
		}else {
			RetornoModelo.setData(null);
			RetornoModelo.setMensaje("Busque por un parametro adecuado");
			RetornoModelo.setStatus(406);
			RetornoModelo.setId(null);
			CrudRepositorio.responder(RetornoModelo,httpHeaders);
		}
		return CrudRepositorio.responder(this.delete(modelo,tabla, uriinfo),httpHeaders);
	}

}
