package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("resolucion")
public class mod010_insolvenciaModelo {
    @Size(since = 0 , until = 20)
    @FormParam("resolucion")
    @NotNull(update = false)
    private String resolucion;
    @Size(since = 0 , until = 30)
    @FormParam("codigoCatastral")
    @NotNull(update = false)
    private String codigoCatastral;
    @DateFormat
    @FormParam("fechaResolucion")
    @NotNull
    private String fechaResolucion;
    @Size(since = 0 , until = 2000)
    @FormParam("observaciones")
    private String observaciones;
    @Size(since = 0 , until = 1)
    @FormParam("estado")
    @NotNull
    private String estado;
    @DateFormat
    @FormParam("fLiquidacion")
    private String fLiquidacion;
    @FormParam("porImpuesto")
    @NotNull
    private Float porImpuesto;
    @FormParam("porInteres")
    @NotNull
    private Float porInteres;
    @FormParam("porCar")
    @NotNull
    private Float porCar;
    @FormParam("porInteresCar")
    @NotNull
    private Float porInteresCar;
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

	public mod010_insolvenciaModelo() {
		super();
	}

	public mod010_insolvenciaModelo(String resolucion, String codigoCatastral, String fechaResolucion,
			String observaciones, String estado, String fLiquidacion, Float porImpuesto, Float porInteres, Float porCar,
			Float porInteresCar, String usuario, Integer idUsuario, String direccionIp, String fechaCreacion, Long id) {
		super();
		this.resolucion = resolucion;
		this.codigoCatastral = codigoCatastral;
		this.fechaResolucion = fechaResolucion;
		this.observaciones = observaciones;
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

	public String getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(String fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public Float getPorImpuesto() {
		return porImpuesto;
	}

	public void setPorImpuesto(Float porImpuesto) {
		this.porImpuesto = porImpuesto;
	}

	public Float getPorInteres() {
		return porInteres;
	}

	public void setPorInteres(Float porInteres) {
		this.porInteres = porInteres;
	}

	public Float getPorCar() {
		return porCar;
	}

	public void setPorCar(Float porCar) {
		this.porCar = porCar;
	}

	public Float getPorInteresCar() {
		return porInteresCar;
	}

	public void setPorInteresCar(Float porInteresCar) {
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
