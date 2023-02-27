package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class ResolucionPredialModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 15)
    @FormParam("Resolucion")
    @NotNull(update = false)
    private String Resolucion;
    @Size(since = -32768, until = 32767)
    @FormParam("Tipo")
    private Integer Tipo;
    @FormParam("Avaluo")
    private Float Avaluo;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    private String Tarifa;
    @FormParam("PeriodoInicial")
    private Float PeriodoInicial;
    @FormParam("PeriodoFinal")
    private Float PeriodoFinal;
    @Size(since = 0 , until = 11)
    @FormParam("Usuario")
    private String Usuario;
    
    private Integer Id_ResolucionPredial;

	public ResolucionPredialModelo() {
		super();
	}
	

	public ResolucionPredialModelo(String codigoCatastral, String resolucion, Integer tipo, Float avaluo, String tarifa,
			Float periodoInicial, Float periodoFinal, String usuario, Integer id_ResolucionPredial) {
		super();
		CodigoCatastral = codigoCatastral;
		Resolucion = resolucion;
		Tipo = tipo;
		Avaluo = avaluo;
		Tarifa = tarifa;
		PeriodoInicial = periodoInicial;
		PeriodoFinal = periodoFinal;
		Usuario = usuario;
		Id_ResolucionPredial = id_ResolucionPredial;
	}


	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public Integer getTipo() {
		return Tipo;
	}

	public void setTipo(Integer tipo) {
		Tipo = tipo;
	}

	public Float getAvaluo() {
		return Avaluo;
	}

	public void setAvaluo(Float avaluo) {
		Avaluo = avaluo;
	}

	public String getTarifa() {
		return Tarifa;
	}

	public void setTarifa(String tarifa) {
		Tarifa = tarifa;
	}

	public Float getPeriodoInicial() {
		return PeriodoInicial;
	}

	public void setPeriodoInicial(Float periodoInicial) {
		PeriodoInicial = periodoInicial;
	}

	public Float getPeriodoFinal() {
		return PeriodoFinal;
	}

	public void setPeriodoFinal(Float periodoFinal) {
		PeriodoFinal = periodoFinal;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public Integer getId_ResolucionPredial() {
		return Id_ResolucionPredial;
	}

	public void setId_ResolucionPredial(Integer id_ResolucionPredial) {
		Id_ResolucionPredial = id_ResolucionPredial;
	}


    
}
