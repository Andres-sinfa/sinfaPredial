package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Nombre")
public class ParametroModelo {
    @Size(since = 0 , until = 48)
    @FormParam("Nombre")
    @NotNull(update = false)
    private String Nombre;
    @Size(since = 0 , until = 100)
    @FormParam("Valor")
    private String Valor;
    
    private Integer Id_Parametro;

	public ParametroModelo() {
		super();
	}

	public ParametroModelo(String nombre, String valor, Integer id_Parametro) {
		super();
		Nombre = nombre;
		Valor = valor;
		Id_Parametro = id_Parametro;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public Integer getId_Parametro() {
		return Id_Parametro;
	}

	public void setId_Parametro(Integer id_Parametro) {
		Id_Parametro = id_Parametro;
	}
    
}
