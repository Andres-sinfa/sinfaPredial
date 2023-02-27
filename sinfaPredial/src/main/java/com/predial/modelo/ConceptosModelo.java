package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class ConceptosModelo {
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
    @Size(since = 0 , until = 30)
    @FormParam("Descripcion")
    private String  Descripcion;
    @FormParam("VlrConcepto")
    private Float VlrConcepto;
    @FormParam("Interes")
    private Float Interes;
    @FormParam("Impuesto")
    private Float Impuesto;
    @FormParam("IndImpuesto")
    private boolean IndImpuesto;
    @FormParam("IndAvaluo")
    private boolean IndAvaluo;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoInicial")
    private Integer AnoInicial;
    @FormParam("IndUrbano")
    private boolean IndUrbano;
    @FormParam("IndRural")
    private boolean IndRural;
    @FormParam("IndArea")
    private boolean IndArea;
    @FormParam("VlrMinimo")
    private Float VlrMinimo;
    @DateFormat
    @FormParam("F_Cobro")
    private String F_Cobro;
    @FormParam("IndSancion")
    private boolean IndSancion;
    @FormParam("PerNoCobro")
    private Integer PerNoCobro;
    @Size(since = 0 , until = 2)
    @FormParam("TipoConcepto")
    @NotNull
    private String TipoConcepto;
    @NotNull
    @FormParam("VlrExcento")
    private Float VlrExcento;
    @FormParam("IndLote")
    private boolean IndLote;
    @Size(since = 0 , until = 2)
    @FormParam("BaseCobro")
    @NotNull
    private String BaseCobro;
    @Size(since = 0 , until = 2)
    @FormParam("BaseRangos")
    @NotNull
    private String BaseRangos;
    @FormParam("IndResolucionSancion")
    private boolean IndResolucionSancion;
    @FormParam("PorResolucionSancion")
    @NotNull
    private Float PorResolucionSancion;
    @Size(since = 0 , until = 2)
    @FormParam("BaseResolucionSancion")
    @NotNull
    private String BaseResolucionSancion;
    @Size(since = 0 , until = 5)
    @FormParam("estratoOtrosCobros")
    private String estratoOtrosCobros;

    private Integer Id_Conceptos;

	public ConceptosModelo() {
		super();
	}

	public ConceptosModelo(Integer ano, String concepto, String rango, String tarifa, String descripcion,
			Float vlrConcepto, Float interes, Float impuesto, boolean indImpuesto, boolean indAvaluo,
			Integer anoInicial, boolean indUrbano, boolean indRural, boolean indArea, Float vlrMinimo, String f_Cobro,
			boolean indSancion, Integer perNoCobro, String tipoConcepto, Float vlrExcento, boolean indLote,
			String baseCobro, String baseRangos, boolean indResolucionSancion, Float porResolucionSancion,
			String baseResolucionSancion, String estratoOtrosCobros, Integer id_Conceptos) {
		super();
		Ano = ano;
		Concepto = concepto;
		Rango = rango;
		Tarifa = tarifa;
		Descripcion = descripcion;
		VlrConcepto = vlrConcepto;
		Interes = interes;
		Impuesto = impuesto;
		IndImpuesto = indImpuesto;
		IndAvaluo = indAvaluo;
		AnoInicial = anoInicial;
		IndUrbano = indUrbano;
		IndRural = indRural;
		IndArea = indArea;
		VlrMinimo = vlrMinimo;
		F_Cobro = f_Cobro;
		IndSancion = indSancion;
		PerNoCobro = perNoCobro;
		TipoConcepto = tipoConcepto;
		VlrExcento = vlrExcento;
		IndLote = indLote;
		BaseCobro = baseCobro;
		BaseRangos = baseRangos;
		IndResolucionSancion = indResolucionSancion;
		PorResolucionSancion = porResolucionSancion;
		BaseResolucionSancion = baseResolucionSancion;
		this.estratoOtrosCobros = estratoOtrosCobros;
		Id_Conceptos = id_Conceptos;
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

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Float getVlrConcepto() {
		return VlrConcepto;
	}

	public void setVlrConcepto(Float vlrConcepto) {
		VlrConcepto = vlrConcepto;
	}

	public Float getInteres() {
		return Interes;
	}

	public void setInteres(Float interes) {
		Interes = interes;
	}

	public Float getImpuesto() {
		return Impuesto;
	}

	public void setImpuesto(Float impuesto) {
		Impuesto = impuesto;
	}

	public boolean isIndImpuesto() {
		return IndImpuesto;
	}

	public void setIndImpuesto(boolean indImpuesto) {
		IndImpuesto = indImpuesto;
	}

	public boolean isIndAvaluo() {
		return IndAvaluo;
	}

	public void setIndAvaluo(boolean indAvaluo) {
		IndAvaluo = indAvaluo;
	}

	public Integer getAnoInicial() {
		return AnoInicial;
	}

	public void setAnoInicial(Integer anoInicial) {
		AnoInicial = anoInicial;
	}

	public boolean isIndUrbano() {
		return IndUrbano;
	}

	public void setIndUrbano(boolean indUrbano) {
		IndUrbano = indUrbano;
	}

	public boolean isIndRural() {
		return IndRural;
	}

	public void setIndRural(boolean indRural) {
		IndRural = indRural;
	}

	public boolean isIndArea() {
		return IndArea;
	}

	public void setIndArea(boolean indArea) {
		IndArea = indArea;
	}

	public Float getVlrMinimo() {
		return VlrMinimo;
	}

	public void setVlrMinimo(Float vlrMinimo) {
		VlrMinimo = vlrMinimo;
	}

	public String getF_Cobro() {
		return F_Cobro;
	}

	public void setF_Cobro(String f_Cobro) {
		F_Cobro = f_Cobro;
	}

	public boolean isIndSancion() {
		return IndSancion;
	}

	public void setIndSancion(boolean indSancion) {
		IndSancion = indSancion;
	}

	public Integer getPerNoCobro() {
		return PerNoCobro;
	}

	public void setPerNoCobro(Integer perNoCobro) {
		PerNoCobro = perNoCobro;
	}

	public String getTipoConcepto() {
		return TipoConcepto;
	}

	public void setTipoConcepto(String tipoConcepto) {
		TipoConcepto = tipoConcepto;
	}

	public Float getVlrExcento() {
		return VlrExcento;
	}

	public void setVlrExcento(Float vlrExcento) {
		VlrExcento = vlrExcento;
	}

	public boolean isIndLote() {
		return IndLote;
	}

	public void setIndLote(boolean indLote) {
		IndLote = indLote;
	}

	public String getBaseCobro() {
		return BaseCobro;
	}

	public void setBaseCobro(String baseCobro) {
		BaseCobro = baseCobro;
	}

	public String getBaseRangos() {
		return BaseRangos;
	}

	public void setBaseRangos(String baseRangos) {
		BaseRangos = baseRangos;
	}

	public boolean isIndResolucionSancion() {
		return IndResolucionSancion;
	}

	public void setIndResolucionSancion(boolean indResolucionSancion) {
		IndResolucionSancion = indResolucionSancion;
	}

	public Float getPorResolucionSancion() {
		return PorResolucionSancion;
	}

	public void setPorResolucionSancion(Float porResolucionSancion) {
		PorResolucionSancion = porResolucionSancion;
	}

	public String getBaseResolucionSancion() {
		return BaseResolucionSancion;
	}

	public void setBaseResolucionSancion(String baseResolucionSancion) {
		BaseResolucionSancion = baseResolucionSancion;
	}

	public String getEstratoOtrosCobros() {
		return estratoOtrosCobros;
	}

	public void setEstratoOtrosCobros(String estratoOtrosCobros) {
		this.estratoOtrosCobros = estratoOtrosCobros;
	}

	public Integer getId_Conceptos() {
		return Id_Conceptos;
	}

	public void setId_Conceptos(Integer id_Conceptos) {
		Id_Conceptos = id_Conceptos;
	}
    
    
}
