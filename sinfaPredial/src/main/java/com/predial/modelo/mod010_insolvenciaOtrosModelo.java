package com.predial.modelo;
import java.math.BigDecimal;

import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("resolucion")
public class mod010_insolvenciaOtrosModelo {
    @Size(since = 0 , until = 20)
    @FormParam("resolucion")
    @NotNull(update = false)
    private String resolucion;
    @Size(since = 0 , until = 30)
    @FormParam("codigoCatastral")
    @NotNull(update = false)
    private String codigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    @NotNull(update = false)
    private Integer ano;
    @FormParam("cuota")
    @NotNull(update = false)
    private Integer cuota;
    @Size(since = 0 , until = 3)
    @FormParam("concepto")
    @NotNull(update = false)
    private String concepto;
    @NotNull
    @DateFormat
    @FormParam("fechaResolucion")
    private String fechaResolucion;
    @Size(since = 0 , until = 3)
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 3)
    @FormParam("rango")
    private String rango;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("totalVlrConcepto")
    @NotNull
    private BigDecimal totalVlrConcepto;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("totalVlrInteres")
    @NotNull
    private BigDecimal totalVlrInteres;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrConcepto")
    @NotNull
    private BigDecimal vlrConcepto;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrInteres")
    @NotNull
    private BigDecimal vlrInteres;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("ajuste")
    @NotNull
    private BigDecimal ajuste;
    @NotNull
    @Size(since = 0 , until = 1)
    @FormParam("estado")
    private String estado;
    @DateFormat
    @FormParam("fLiquidacion")
    private String fLiquidacion;
    @Size(since = -999.99, until = 999.99)
    @FormParam("porImpuesto")
    @NotNull
    private BigDecimal porImpuesto;
    @Size(since = -999.99, until = 999.99)
    @FormParam("porInteres")
    @NotNull
    private BigDecimal porInteres;
    @Size(since = 0 , until = 255)
    @FormParam("usuario")
    private String usuario;
    @FormParam("idUsuario")
    private Integer idUsuario;
    @Size(since = 0 , until = 200)
    @FormParam("direccionIp")
    private String direccionIp;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;

    private Long id;

	public mod010_insolvenciaOtrosModelo() {
		super();
	}

	public mod010_insolvenciaOtrosModelo(String resolucion, String codigoCatastral, Integer ano, Integer cuota,
			String concepto, String fechaResolucion, String tarifa, String rango, BigDecimal totalVlrConcepto,
			BigDecimal totalVlrInteres, BigDecimal vlrConcepto, BigDecimal vlrInteres, BigDecimal ajuste, String estado,
			String fLiquidacion, BigDecimal porImpuesto, BigDecimal porInteres, String usuario, Integer idUsuario,
			String direccionIp, String fechaCreacion, Long id) {
		super();
		this.resolucion = resolucion;
		this.codigoCatastral = codigoCatastral;
		this.ano = ano;
		this.cuota = cuota;
		this.concepto = concepto;
		this.fechaResolucion = fechaResolucion;
		this.tarifa = tarifa;
		this.rango = rango;
		this.totalVlrConcepto = totalVlrConcepto;
		this.totalVlrInteres = totalVlrInteres;
		this.vlrConcepto = vlrConcepto;
		this.vlrInteres = vlrInteres;
		this.ajuste = ajuste;
		this.estado = estado;
		this.fLiquidacion = fLiquidacion;
		this.porImpuesto = porImpuesto;
		this.porInteres = porInteres;
		this.usuario = usuario;
		this.idUsuario = idUsuario;
		this.direccionIp = direccionIp;
		this.fechaCreacion = fechaCreacion;
		this.id = id;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getCodigoCatastral() {
		return codigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		this.codigoCatastral = codigoCatastral;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(String fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
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

	public BigDecimal getTotalVlrConcepto() {
		return totalVlrConcepto;
	}

	public void setTotalVlrConcepto(BigDecimal totalVlrConcepto) {
		this.totalVlrConcepto = totalVlrConcepto;
	}

	public BigDecimal getTotalVlrInteres() {
		return totalVlrInteres;
	}

	public void setTotalVlrInteres(BigDecimal totalVlrInteres) {
		this.totalVlrInteres = totalVlrInteres;
	}

	public BigDecimal getVlrConcepto() {
		return vlrConcepto;
	}

	public void setVlrConcepto(BigDecimal vlrConcepto) {
		this.vlrConcepto = vlrConcepto;
	}

	public BigDecimal getVlrInteres() {
		return vlrInteres;
	}

	public void setVlrInteres(BigDecimal vlrInteres) {
		this.vlrInteres = vlrInteres;
	}

	public BigDecimal getAjuste() {
		return ajuste;
	}

	public void setAjuste(BigDecimal ajuste) {
		this.ajuste = ajuste;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getfLiquidacion() {
		return fLiquidacion;
	}

	public void setfLiquidacion(String fLiquidacion) {
		this.fLiquidacion = fLiquidacion;
	}

	public BigDecimal getPorImpuesto() {
		return porImpuesto;
	}

	public void setPorImpuesto(BigDecimal porImpuesto) {
		this.porImpuesto = porImpuesto;
	}

	public BigDecimal getPorInteres() {
		return porInteres;
	}

	public void setPorInteres(BigDecimal porInteres) {
		this.porInteres = porInteres;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDireccionIp() {
		return direccionIp;
	}

	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


    
}
