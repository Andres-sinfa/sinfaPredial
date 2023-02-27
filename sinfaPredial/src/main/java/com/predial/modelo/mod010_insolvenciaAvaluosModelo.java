package com.predial.modelo;
import java.math.BigDecimal;

import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("resolucion")
public class mod010_insolvenciaAvaluosModelo {
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
    @DateFormat
    @FormParam("fechaResolucion")
    @NotNull
    private String fechaResolucion;
    @Size(since = 0 , until = 3)
    @FormParam("tarifa")
    @NotNull
    private String tarifa;
    @Size(since = 0 , until = 3)
    @FormParam("rango")
    @NotNull
    private String rango;
    @FormParam("porTarifa")
    @NotNull
    private float   porTarifa;
    @FormParam("porMaximo")
    @NotNull
    private float   porMaximo;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("totalVlrImpuesto")
    @NotNull
    private BigDecimal totalVlrImpuesto;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("totalVlrCar")
    @NotNull
    private BigDecimal totalVlrCar;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrImpuesto")
    @NotNull
    private BigDecimal vlrImpuesto;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrDescuento")
    @NotNull
    private BigDecimal vlrDescuento;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrCredito")
    @NotNull
    private BigDecimal vlrCredito;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrInteres")
    @NotNull
    private BigDecimal vlrInteres;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrCar")
    @NotNull
    private BigDecimal vlrCar;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrInteresCar")
    @NotNull
    private BigDecimal vlrInteresCar;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrCreditoCar")
    @NotNull
    private BigDecimal vlrCreditoCar;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrSobretasa")
    @NotNull
    private BigDecimal vlrSobretasa;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("vlrOtros")
    @NotNull
    private BigDecimal vlrOtros;
    @Size(since = -999999999999999.99, until = 999999999999999.99)
    @FormParam("ajuste")
    @NotNull
    private BigDecimal ajuste;
    @Size(since = 0 , until = 1)
    @FormParam("estado")
    @NotNull
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
    @Size(since = -999.99, until = 999.99)
    @FormParam("porCar")
    @NotNull
    private BigDecimal porCar;
    @Size(since = -999.99, until = 999.99)
    @FormParam("porInteresCar")
    @NotNull
    private BigDecimal porInteresCar;
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

	public mod010_insolvenciaAvaluosModelo() {
		super();
	}

	public mod010_insolvenciaAvaluosModelo(String resolucion, String codigoCatastral, Integer ano, Integer cuota,
			String fechaResolucion, String tarifa, String rango, float porTarifa, float porMaximo,
			BigDecimal totalVlrImpuesto, BigDecimal totalVlrCar, BigDecimal vlrImpuesto, BigDecimal vlrDescuento,
			BigDecimal vlrCredito, BigDecimal vlrInteres, BigDecimal vlrCar, BigDecimal vlrInteresCar,
			BigDecimal vlrCreditoCar, BigDecimal vlrSobretasa, BigDecimal vlrOtros, BigDecimal ajuste, String estado,
			String fLiquidacion, BigDecimal porImpuesto, BigDecimal porInteres, BigDecimal porCar,
			BigDecimal porInteresCar, String usuario, Integer idUsuario, String direccionIp, String fechaCreacion,
			Long id) {
		super();
		this.resolucion = resolucion;
		this.codigoCatastral = codigoCatastral;
		this.ano = ano;
		this.cuota = cuota;
		this.fechaResolucion = fechaResolucion;
		this.tarifa = tarifa;
		this.rango = rango;
		this.porTarifa = porTarifa;
		this.porMaximo = porMaximo;
		this.totalVlrImpuesto = totalVlrImpuesto;
		this.totalVlrCar = totalVlrCar;
		this.vlrImpuesto = vlrImpuesto;
		this.vlrDescuento = vlrDescuento;
		this.vlrCredito = vlrCredito;
		this.vlrInteres = vlrInteres;
		this.vlrCar = vlrCar;
		this.vlrInteresCar = vlrInteresCar;
		this.vlrCreditoCar = vlrCreditoCar;
		this.vlrSobretasa = vlrSobretasa;
		this.vlrOtros = vlrOtros;
		this.ajuste = ajuste;
		this.estado = estado;
		this.fLiquidacion = fLiquidacion;
		this.porImpuesto = porImpuesto;
		this.porInteres = porInteres;
		this.porCar = porCar;
		this.porInteresCar = porInteresCar;
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

	public float getPorTarifa() {
		return porTarifa;
	}

	public void setPorTarifa(float porTarifa) {
		this.porTarifa = porTarifa;
	}

	public float getPorMaximo() {
		return porMaximo;
	}

	public void setPorMaximo(float porMaximo) {
		this.porMaximo = porMaximo;
	}

	public BigDecimal getTotalVlrImpuesto() {
		return totalVlrImpuesto;
	}

	public void setTotalVlrImpuesto(BigDecimal totalVlrImpuesto) {
		this.totalVlrImpuesto = totalVlrImpuesto;
	}

	public BigDecimal getTotalVlrCar() {
		return totalVlrCar;
	}

	public void setTotalVlrCar(BigDecimal totalVlrCar) {
		this.totalVlrCar = totalVlrCar;
	}

	public BigDecimal getVlrImpuesto() {
		return vlrImpuesto;
	}

	public void setVlrImpuesto(BigDecimal vlrImpuesto) {
		this.vlrImpuesto = vlrImpuesto;
	}

	public BigDecimal getVlrDescuento() {
		return vlrDescuento;
	}

	public void setVlrDescuento(BigDecimal vlrDescuento) {
		this.vlrDescuento = vlrDescuento;
	}

	public BigDecimal getVlrCredito() {
		return vlrCredito;
	}

	public void setVlrCredito(BigDecimal vlrCredito) {
		this.vlrCredito = vlrCredito;
	}

	public BigDecimal getVlrInteres() {
		return vlrInteres;
	}

	public void setVlrInteres(BigDecimal vlrInteres) {
		this.vlrInteres = vlrInteres;
	}

	public BigDecimal getVlrCar() {
		return vlrCar;
	}

	public void setVlrCar(BigDecimal vlrCar) {
		this.vlrCar = vlrCar;
	}

	public BigDecimal getVlrInteresCar() {
		return vlrInteresCar;
	}

	public void setVlrInteresCar(BigDecimal vlrInteresCar) {
		this.vlrInteresCar = vlrInteresCar;
	}

	public BigDecimal getVlrCreditoCar() {
		return vlrCreditoCar;
	}

	public void setVlrCreditoCar(BigDecimal vlrCreditoCar) {
		this.vlrCreditoCar = vlrCreditoCar;
	}

	public BigDecimal getVlrSobretasa() {
		return vlrSobretasa;
	}

	public void setVlrSobretasa(BigDecimal vlrSobretasa) {
		this.vlrSobretasa = vlrSobretasa;
	}

	public BigDecimal getVlrOtros() {
		return vlrOtros;
	}

	public void setVlrOtros(BigDecimal vlrOtros) {
		this.vlrOtros = vlrOtros;
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

	public String getFLiquidacion() {
		return fLiquidacion;
	}

	public void setFLiquidacion(String fLiquidacion) {
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

	public BigDecimal getPorCar() {
		return porCar;
	}

	public void setPorCar(BigDecimal porCar) {
		this.porCar = porCar;
	}

	public BigDecimal getPorInteresCar() {
		return porInteresCar;
	}

	public void setPorInteresCar(BigDecimal porInteresCar) {
		this.porInteresCar = porInteresCar;
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
