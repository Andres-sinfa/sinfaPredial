package com.predial.modelo;
import java.math.BigDecimal;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("ano")
public class mod010_porMaximoModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    @NotNull
    private Integer ano;
    @Size(since = 0 , until = 2)
    @FormParam("estrato")
    @NotNull
    private String estrato;
    @Size(since = -999999999, until = 999999999)
    @FormParam("limiteInferior")
    private Long limiteInferior;
    @Size(since = -999999999, until = 999999999)
    @FormParam("limiteSuperior")
    private Long limiteSuperior;
    @NotNull
    @Size(since = -999.99, until = 999.99)
    @FormParam("porMaximo")
    private BigDecimal porMaximo;
    @Size(since = 0 , until = 200)
    @FormParam("descripcion")
    private String descripcion;

    private Integer id;

	public mod010_porMaximoModelo() {
		super();
	}

	public mod010_porMaximoModelo(Integer ano, String estrato, Long limiteInferior, Long limiteSuperior,
			BigDecimal porMaximo, String descripcion, Integer id) {
		super();
		this.ano = ano;
		this.estrato = estrato;
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
		this.porMaximo = porMaximo;
		this.descripcion = descripcion;
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public Long getLimiteInferior() {
		return limiteInferior;
	}

	public void setLimiteInferior(Long limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public Long getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteSuperior(Long limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	public BigDecimal getPorMaximo() {
		return porMaximo;
	}

	public void setPorMaximo(BigDecimal porMaximo) {
		this.porMaximo = porMaximo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
    
}
