package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;

import jakarta.ws.rs.FormParam;
@OrderDefault("codigo")
public class DocumentosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 40)
    @FormParam("codigo")
    private String codigo;
    @Size(since = 0 , until = 50)
    @FormParam("origen")
    private String origen;
    @Size(since = 0 , until = 50)
    @FormParam("nombre")
    private String nombre;
    @Size(since = 0 , until = 100)
    @FormParam("path")
    private String path;
    @FormParam("Contenido")
    private String Contenido;

    private Integer Id_Documentos;

	public DocumentosModelo() {
		super();
	}

	public DocumentosModelo(String codigo, String origen, String nombre, String path, String contenido,
			Integer id_Documentos) {
		super();
		this.codigo = codigo;
		this.origen = origen;
		this.nombre = nombre;
		this.path = path;
		Contenido = contenido;
		Id_Documentos = id_Documentos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public Integer getId_Documentos() {
		return Id_Documentos;
	}

	public void setId_Documentos(Integer id_Documentos) {
		Id_Documentos = id_Documentos;
	}
    
}
