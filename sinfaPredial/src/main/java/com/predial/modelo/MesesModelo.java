package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class MesesModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Codigo")
    @NotNull(update = false)
    private Integer Codigo;
    @Size(since = 0 , until = 15)
    @FormParam("Mes")
    private String Mes;
    
    private Integer Id_Meses;

	public MesesModelo() {
		super();
	}

	public MesesModelo(Integer codigo, String mes, Integer id_Meses) {
		super();
		Codigo = codigo;
		Mes = mes;
		Id_Meses = id_Meses;
	}

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public String getMes() {
		return Mes;
	}

	public void setMes(String mes) {
		Mes = mes;
	}

	public Integer getId_Meses() {
		return Id_Meses;
	}

	public void setId_Meses(Integer id_Meses) {
		Id_Meses = id_Meses;
	}
    
}
