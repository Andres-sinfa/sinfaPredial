package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class otrosCobrosCuotaModelo {
    @Size(since = 0 , until = 30)
    @FormParam("codigoCatastral")
    @NotNull(update = false)
    private String codigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 3)
    @FormParam("concepto")
    @NotNull
    private String concepto;
    @Size(since = 0 , until = 3)
    @FormParam("tarifa")
    @NotNull
    private String tarifa;
    @Size(since = 0 , until = 3)
    @FormParam("rango")
    @NotNull
    private String rango;
    @FormParam("totalVlrConcepto")
    @NotNull
    private Float totalVlrConcepto;
    @FormParam("totalVlrInteres")
    @NotNull
    private Float totalVlrInteres;
    @FormParam("vlrconcepto")
    @NotNull
    private Float vlrconcepto;
    @FormParam("vlrDescuento")
    @NotNull
    private Float vlrDescuento;
    @FormParam("vlrInteres")
    @NotNull
    private Float vlrInteres;
    @FormParam("ajuste")
    @NotNull
    private Float ajuste;
    @DateFormat
    @FormParam("fechaCalculo")
    @NotNull
    private String fechaCalculo;
    @FormParam("cuotas")
    @NotNull
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
    @FormParam("estado")
    @NotNull
    private String estado;
    
    private Integer Id_otrosCobrosCuota;

	public otrosCobrosCuotaModelo() {
		super();
	}

	public otrosCobrosCuotaModelo(String codigoCatastral, Integer ano, String concepto, String tarifa, String rango,
			Float totalVlrConcepto, Float totalVlrInteres, Float vlrconcepto, Float vlrDescuento, Float vlrInteres,
			Float ajuste, String fechaCalculo, Integer cuotas, String fechaVencimiento, String usuario, String equipo,
			String fechaCreacion, String estado, Integer id_otrosCobrosCuota) {
		super();
		this.codigoCatastral = codigoCatastral;
		Ano = ano;
		this.concepto = concepto;
		this.tarifa = tarifa;
		this.rango = rango;
		this.totalVlrConcepto = totalVlrConcepto;
		this.totalVlrInteres = totalVlrInteres;
		this.vlrconcepto = vlrconcepto;
		this.vlrDescuento = vlrDescuento;
		this.vlrInteres = vlrInteres;
		this.ajuste = ajuste;
		this.fechaCalculo = fechaCalculo;
		this.cuotas = cuotas;
		this.fechaVencimiento = fechaVencimiento;
		this.usuario = usuario;
		this.equipo = equipo;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		Id_otrosCobrosCuota = id_otrosCobrosCuota;
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

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
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

	public Float getTotalVlrConcepto() {
		return totalVlrConcepto;
	}

	public void setTotalVlrConcepto(Float totalVlrConcepto) {
		this.totalVlrConcepto = totalVlrConcepto;
	}

	public Float getTotalVlrInteres() {
		return totalVlrInteres;
	}

	public void setTotalVlrInteres(Float totalVlrInteres) {
		this.totalVlrInteres = totalVlrInteres;
	}

	public Float getVlrconcepto() {
		return vlrconcepto;
	}

	public void setVlrconcepto(Float vlrconcepto) {
		this.vlrconcepto = vlrconcepto;
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

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
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

	public Integer getId_otrosCobrosCuota() {
		return Id_otrosCobrosCuota;
	}

	public void setId_otrosCobrosCuota(Integer id_otrosCobrosCuota) {
		Id_otrosCobrosCuota = id_otrosCobrosCuota;
	}
    
}
