package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class ConceptosDetalleModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 2)
    @FormParam("Concepto")
    @NotNull(update = false)
    private String Concepto;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    @NotNull(update = false)
    private String Rango;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    @NotNull(update = false)
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String Codigo;
    @FormParam("LimiteInferior")
    @NotNull
    private Float LimiteInferior;
    @FormParam("LimiteSuperior")
    @NotNull
    private Float LimiteSuperior;
    @FormParam("VlrConcepto")
    @NotNull
    private Float VlrConcepto;
    @FormParam("Impuesto")
    @NotNull
    private Float Impuesto;
    @FormParam("VlrMinimo")
    @NotNull
    private Float VlrMinimo;
    @FormParam("VlrMaximo")
    @NotNull
    private Float VlrMaximo;
    
    private Integer Id_ConceptosDetalle;

	public ConceptosDetalleModelo() {
		super();
	}

	public ConceptosDetalleModelo(Integer ano, String concepto, String rango, String tarifa, String codigo,
			Float limiteInferior, Float limiteSuperior, Float vlrConcepto, Float impuesto, Float vlrMinimo,
			Float vlrMaximo, Integer id_ConceptosDetalle) {
		super();
		Ano = ano;
		Concepto = concepto;
		Rango = rango;
		Tarifa = tarifa;
		Codigo = codigo;
		LimiteInferior = limiteInferior;
		LimiteSuperior = limiteSuperior;
		VlrConcepto = vlrConcepto;
		Impuesto = impuesto;
		VlrMinimo = vlrMinimo;
		VlrMaximo = vlrMaximo;
		Id_ConceptosDetalle = id_ConceptosDetalle;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getRango() {
		return Rango;
	}

	public void setRango(String rango) {
		Rango = rango;
	}

	public String getTarifa() {
		return Tarifa;
	}

	public void setTarifa(String tarifa) {
		Tarifa = tarifa;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Float getLimiteInferior() {
		return LimiteInferior;
	}

	public void setLimiteInferior(Float limiteInferior) {
		LimiteInferior = limiteInferior;
	}

	public Float getLimiteSuperior() {
		return LimiteSuperior;
	}

	public void setLimiteSuperior(Float limiteSuperior) {
		LimiteSuperior = limiteSuperior;
	}

	public Float getVlrConcepto() {
		return VlrConcepto;
	}

	public void setVlrConcepto(Float vlrConcepto) {
		VlrConcepto = vlrConcepto;
	}

	public Float getImpuesto() {
		return Impuesto;
	}

	public void setImpuesto(Float impuesto) {
		Impuesto = impuesto;
	}

	public Float getVlrMinimo() {
		return VlrMinimo;
	}

	public void setVlrMinimo(Float vlrMinimo) {
		VlrMinimo = vlrMinimo;
	}

	public Float getVlrMaximo() {
		return VlrMaximo;
	}

	public void setVlrMaximo(Float vlrMaximo) {
		VlrMaximo = vlrMaximo;
	}

	public Integer getId_ConceptosDetalle() {
		return Id_ConceptosDetalle;
	}

	public void setId_ConceptosDetalle(Integer id_ConceptosDetalle) {
		Id_ConceptosDetalle = id_ConceptosDetalle;
	}   
    
}
