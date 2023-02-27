package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class avaluosCuotaModelo {
	@Size(since = 0 , until = 30)
    @NotNull(update = false)
    @FormParam("codigoCatastral")
    private String codigoCatastral;
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 3)
    @NotNull
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 3)
    @NotNull
    @FormParam("rango")
    private String rango;
    @NotNull
    @FormParam("avaluo")
    private Float avaluo;
    @NotNull
    @FormParam("vlrTotalImpuesto")
    private Float vlrTotalImpuesto;
    @NotNull
    @FormParam("vlrTotalCAR")
    private Float vlrTotalCAR;
    @NotNull
    @FormParam("vlrImpuesto")
    private Float vlrImpuesto;
    @NotNull
    @FormParam("vlrDescuento")
    private Float vlrDescuento;
    @NotNull
    @FormParam("vlrInteres")
    private Float vlrInteres;
    @NotNull
    @FormParam("vlrCAR")
    private Float vlrCAR;
    @NotNull
    @FormParam("vlrInteresCAR")
    private Float vlrInteresCAR;
    @NotNull
    @FormParam("vlrCredito")
    private Float vlrCredito;
    @NotNull
    @FormParam("vlrCreditoCAR")
    private Float vlrCreditoCAR;
    @NotNull
    @FormParam("vlrSobretasa")
    private Float vlrSobretasa;
    @NotNull
    @FormParam("vlrOtros")
    private Float vlrOtros;
    @NotNull
    @FormParam("ajuste")
    private Float ajuste;
    @NotNull
    @FormParam("porImpuesto")
    private Float porImpuesto;
    @DateFormat
    @NotNull
    @FormParam("fechaCalculo")
    private String fechaCalculo;
    @NotNull
    @FormParam("ncuotas")
    private Integer cuotas;
    @DateFormat
    @FormParam("fechaVencimiento")
    private String fechaVencimiento;
    @Size(since = 0 , until = 200)
    @FormParam("usuario")
    private String usuario;
    @Size(since = 0 , until = 200)
    @FormParam("equipo")
    private String equipo;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @Size(since = 0 , until = 1)
    @NotNull
    @FormParam("estado")
    private String estado;

    private Integer Id_avaluosCuota;

	public avaluosCuotaModelo(String codigoCatastral, Integer ano, String tarifa, String rango, Float avaluo,
			Float vlrTotalImpuesto, Float vlrTotalCAR, Float vlrImpuesto, Float vlrDescuento, Float vlrInteres,
			Float vlrCAR, Float vlrInteresCAR, Float vlrCredito, Float vlrCreditoCAR, Float vlrSobretasa,
			Float vlrOtros, Float ajuste, Float porImpuesto, String fechaCalculo, Integer cuotas,
			String fechaVencimiento, String usuario, String equipo, String fechaCreacion, String estado,
			Integer id_avaluosCuota) {
		super();
		this.codigoCatastral = codigoCatastral;
		Ano = ano;
		this.tarifa = tarifa;
		this.rango = rango;
		this.avaluo = avaluo;
		this.vlrTotalImpuesto = vlrTotalImpuesto;
		this.vlrTotalCAR = vlrTotalCAR;
		this.vlrImpuesto = vlrImpuesto;
		this.vlrDescuento = vlrDescuento;
		this.vlrInteres = vlrInteres;
		this.vlrCAR = vlrCAR;
		this.vlrInteresCAR = vlrInteresCAR;
		this.vlrCredito = vlrCredito;
		this.vlrCreditoCAR = vlrCreditoCAR;
		this.vlrSobretasa = vlrSobretasa;
		this.vlrOtros = vlrOtros;
		this.ajuste = ajuste;
		this.porImpuesto = porImpuesto;
		this.fechaCalculo = fechaCalculo;
		this.cuotas = cuotas;
		this.fechaVencimiento = fechaVencimiento;
		this.usuario = usuario;
		this.equipo = equipo;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		Id_avaluosCuota = id_avaluosCuota;
	}

	public avaluosCuotaModelo() {
		super();
	}

	public String getCodigoCatastral() {
		return codigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		this.codigoCatastral = codigoCatastral;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public Float getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(Float avaluo) {
		this.avaluo = avaluo;
	}

	public Float getVlrTotalImpuesto() {
		return vlrTotalImpuesto;
	}

	public void setVlrTotalImpuesto(Float vlrTotalImpuesto) {
		this.vlrTotalImpuesto = vlrTotalImpuesto;
	}

	public Float getVlrTotalCAR() {
		return vlrTotalCAR;
	}

	public void setVlrTotalCAR(Float vlrTotalCAR) {
		this.vlrTotalCAR = vlrTotalCAR;
	}

	public Float getVlrImpuesto() {
		return vlrImpuesto;
	}

	public void setVlrImpuesto(Float vlrImpuesto) {
		this.vlrImpuesto = vlrImpuesto;
	}

	public Float getVlrDescuento() {
		return vlrDescuento;
	}

	public void setVlrDescuento(Float vlrDescuento) {
		this.vlrDescuento = vlrDescuento;
	}

	public Float getVlrInteres() {
		return vlrInteres;
	}

	public void setVlrInteres(Float vlrInteres) {
		this.vlrInteres = vlrInteres;
	}

	public Float getVlrCAR() {
		return vlrCAR;
	}

	public void setVlrCAR(Float vlrCAR) {
		this.vlrCAR = vlrCAR;
	}

	public Float getVlrInteresCAR() {
		return vlrInteresCAR;
	}

	public void setVlrInteresCAR(Float vlrInteresCAR) {
		this.vlrInteresCAR = vlrInteresCAR;
	}

	public Float getVlrCredito() {
		return vlrCredito;
	}

	public void setVlrCredito(Float vlrCredito) {
		this.vlrCredito = vlrCredito;
	}

	public Float getVlrCreditoCAR() {
		return vlrCreditoCAR;
	}

	public void setVlrCreditoCAR(Float vlrCreditoCAR) {
		this.vlrCreditoCAR = vlrCreditoCAR;
	}

	public Float getVlrSobretasa() {
		return vlrSobretasa;
	}

	public void setVlrSobretasa(Float vlrSobretasa) {
		this.vlrSobretasa = vlrSobretasa;
	}

	public Float getVlrOtros() {
		return vlrOtros;
	}

	public void setVlrOtros(Float vlrOtros) {
		this.vlrOtros = vlrOtros;
	}

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
	}

	public Float getPorImpuesto() {
		return porImpuesto;
	}

	public void setPorImpuesto(Float porImpuesto) {
		this.porImpuesto = porImpuesto;
	}

	public String getFechaCalculo() {
		return fechaCalculo;
	}

	public void setFechaCalculo(String fechaCalculo) {
		this.fechaCalculo = fechaCalculo;
	}

	public Integer getCuotas() {
		return cuotas;
	}

	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getId_avaluosCuota() {
		return Id_avaluosCuota;
	}

	public void setId_avaluosCuota(Integer id_avaluosCuota) {
		Id_avaluosCuota = id_avaluosCuota;
	}
    
}
