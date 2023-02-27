package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class Mes_PredialModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = -32768, until = 32767)
    @FormParam("Mes")
    @NotNull(update = false)
    private Integer Mes;
    @Size(since = 0 , until = 1)
    @FormParam("Estado")
    private String Estado;
    @DateFormat
    @FormParam("f_interface")
    private String f_interface;
    
    private Integer Id_Mes_Predial;

	public Mes_PredialModelo(Integer ano, Integer mes, String estado, String f_interface, Integer id_Mes_Predial) {
		super();
		Ano = ano;
		Mes = mes;
		Estado = estado;
		this.f_interface = f_interface;
		Id_Mes_Predial = id_Mes_Predial;
	}

	public Mes_PredialModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getMes() {
		return Mes;
	}

	public void setMes(Integer mes) {
		Mes = mes;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getF_interface() {
		return f_interface;
	}

	public void setF_interface(String f_interface) {
		this.f_interface = f_interface;
	}

	public Integer getId_Mes_Predial() {
		return Id_Mes_Predial;
	}

	public void setId_Mes_Predial(Integer id_Mes_Predial) {
		Id_Mes_Predial = id_Mes_Predial;
	}
    
}
