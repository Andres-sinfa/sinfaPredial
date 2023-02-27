package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("ano")
public class mod010_tarifasOtrosCobrosModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    @NotNull(update = false)
    private Integer ano;
    @Size(since = 0 , until = 2)
    @FormParam("concepto")
    @NotNull(update = false)
    private String concepto;
    @Size(since = 0 , until = 2)
    @FormParam("estratoOtros")
    @NotNull(update = false)
    private String estratoOtros;
    @Size(since = 0 , until = 3)
    @FormParam("rango")
    @NotNull(update = false)
    private String rango;
    @Size(since = 0 , until = 5)
    @FormParam("baseLimites")
    @NotNull
    private String baseLimites;
    @FormParam("limiteInferior")
    @NotNull
    private Float limiteInferior;
    @FormParam("limiteSuperior")
    @NotNull
    private Float limiteSuperior;
    @Size(since = 0 , until = 5)
    @FormParam("baseCobro")
    @NotNull
    private String baseCobro;
    @FormParam("valorTarifa")
    @NotNull
    private Float valorTarifa;
    @FormParam("valorMinimo")
    @NotNull
    private Float valorMinimo;
    @FormParam("idUsuario")
    private Integer idUsuario;
    @Size(since = 0 , until = 200)
    @FormParam("nombreUsuario")
    private String nombreUsuario;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @Size(since = 0 , until = 50)
    @FormParam("ip")
    private String ip;
    
    private Integer Id_mod010_tarifasOtrosCobros;

	public mod010_tarifasOtrosCobrosModelo() {
		super();
	}

	public mod010_tarifasOtrosCobrosModelo(Integer ano, String concepto, String estratoOtros, String rango,
			String baseLimites, Float limiteInferior, Float limiteSuperior, String baseCobro, Float valorTarifa,
			Float valorMinimo, Integer idUsuario, String nombreUsuario, String fechaCreacion, String ip,
			Integer id_mod010_tarifasOtrosCobros) {
		super();
		this.ano = ano;
		this.concepto = concepto;
		this.estratoOtros = estratoOtros;
		this.rango = rango;
		this.baseLimites = baseLimites;
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
		this.baseCobro = baseCobro;
		this.valorTarifa = valorTarifa;
		this.valorMinimo = valorMinimo;
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.fechaCreacion = fechaCreacion;
		this.ip = ip;
		Id_mod010_tarifasOtrosCobros = id_mod010_tarifasOtrosCobros;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getEstratoOtros() {
		return estratoOtros;
	}

	public void setEstratoOtros(String estratoOtros) {
		this.estratoOtros = estratoOtros;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public String getBaseLimites() {
		return baseLimites;
	}

	public void setBaseLimites(String baseLimites) {
		this.baseLimites = baseLimites;
	}

	public Float getLimiteInferior() {
		return limiteInferior;
	}

	public void setLimiteInferior(Float limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public Float getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteSuperior(Float limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	public String getBaseCobro() {
		return baseCobro;
	}

	public void setBaseCobro(String baseCobro) {
		this.baseCobro = baseCobro;
	}

	public Float getValorTarifa() {
		return valorTarifa;
	}

	public void setValorTarifa(Float valorTarifa) {
		this.valorTarifa = valorTarifa;
	}

	public Float getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(Float valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getId_mod010_tarifasOtrosCobros() {
		return Id_mod010_tarifasOtrosCobros;
	}

	public void setId_mod010_tarifasOtrosCobros(Integer id_mod010_tarifasOtrosCobros) {
		Id_mod010_tarifasOtrosCobros = id_mod010_tarifasOtrosCobros;
	}
    
    
}
