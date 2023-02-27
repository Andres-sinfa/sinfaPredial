package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class AnoModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 1)
    @FormParam("Estado")
    private String Estado;
    @FormParam("Vlr_SalarioMinimo")
    private Float Vlr_SalarioMinimo;
    @FormParam("Vlr_MinDepreciacion")
    private Float Vlr_MinDepreciacion;

    private Integer Id_Ano;

	public AnoModelo() {
		super();
	}

	public AnoModelo(Integer ano, String estado, Float vlr_SalarioMinimo, Float vlr_MinDepreciacion, Integer id_Ano) {
		super();
		Ano = ano;
		Estado = estado;
		Vlr_SalarioMinimo = vlr_SalarioMinimo;
		Vlr_MinDepreciacion = vlr_MinDepreciacion;
		Id_Ano = id_Ano;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Float getVlr_SalarioMinimo() {
		return Vlr_SalarioMinimo;
	}

	public void setVlr_SalarioMinimo(Float vlr_SalarioMinimo) {
		Vlr_SalarioMinimo = vlr_SalarioMinimo;
	}

	public Float getVlr_MinDepreciacion() {
		return Vlr_MinDepreciacion;
	}

	public void setVlr_MinDepreciacion(Float vlr_MinDepreciacion) {
		Vlr_MinDepreciacion = vlr_MinDepreciacion;
	}

	public Integer getId_Ano() {
		return Id_Ano;
	}

	public void setId_Ano(Integer id_Ano) {
		Id_Ano = id_Ano;
	}
    
    
}
