package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("nombre")
public class tblconsultasModelo {
    @Size(since = 0 , until = 255)
    @NotNull(update = false)
    @FormParam("nombre")
    private String nombre;
    
    private Integer Id_tblconsultas;

	public tblconsultasModelo() {
		super();
	}

	public tblconsultasModelo(String nombre, Integer id_tblconsultas) {
		super();
		this.nombre = nombre;
		Id_tblconsultas = id_tblconsultas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId_tblconsultas() {
		return Id_tblconsultas;
	}

	public void setId_tblconsultas(Integer id_tblconsultas) {
		Id_tblconsultas = id_tblconsultas;
	}
    
    
}
