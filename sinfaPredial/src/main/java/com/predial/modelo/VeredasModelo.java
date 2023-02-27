package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Codigo")
public class VeredasModelo {
    @NotNull(update = false)
	@FormParam("Codigo")
	@Size(since = 0 , until = 12)
    private String Codigo;
	@FormParam("Nombre")
	@Size(since = 0 , until = 50)
    private String Nombre;
	
	private Integer Id_Veredas;
	
	public VeredasModelo(String codigo, String nombre, Integer id_Veredas) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Id_Veredas = id_Veredas;
	}
	@Override
	public String toString() {
		return "VeredasModelo [Codigo=" + Codigo + ", Nombre=" + Nombre + ", Id_Veredas=" + Id_Veredas + "]";
	}
	public VeredasModelo() {
		super();
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getId_Veredas() {
		return Id_Veredas;
	}
	public void setId_Veredas(Integer id_Veredas) {
		Id_Veredas = id_Veredas;
	}
	
	

}
