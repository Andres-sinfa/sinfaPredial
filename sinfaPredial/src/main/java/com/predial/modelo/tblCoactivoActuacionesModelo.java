package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("IdCoactivo")
public class tblCoactivoActuacionesModelo {
    @FormParam("IdCoactivo")
    @NotNull(update = false)
    private Integer IdCoactivo;
    @FormParam("IdActuacion")
    @NotNull(update = false)
    private Integer IdActuacion;
    @Size(since = 0 , until = 50)
    @FormParam("numeroActuacion")
    private String numeroActuacion;
    @FormParam("fechaActuacion")
    @DateFormat
    private String fechaActuacion;
    @FormParam("fechaNotificacion")
    @DateFormat
    private String fechaNotificacion;
    @NotNull
    @FormParam("formaNotificacion")
    private Integer formaNotificacion;
    @FormParam("fechaVencimiento")
    @DateFormat
    private String fechaVencimiento;
    @Size(since = 0 , until = 1000)
    @FormParam("observaciones")
    private String observaciones;
    @FormParam("IdDoc")
    private Long IdDoc;
    @Size(since = 0 , until = 50)
    @FormParam("usuario")
    private String usuario;
    @Size(since = 0 , until = 50)
    @FormParam("equipo")
    private String equipo;
    @NotNull
    @FormParam("estado")
    private Integer estado;

    private Integer Id_tblCoactivoActuaciones;

	public tblCoactivoActuacionesModelo() {
		super();
	}

	public tblCoactivoActuacionesModelo(Integer idCoactivo, Integer idActuacion, String numeroActuacion,
			String fechaActuacion, String fechaNotificacion, Integer formaNotificacion, String fechaVencimiento,
			String observaciones, Long idDoc, String usuario, String equipo, Integer estado,
			Integer id_tblCoactivoActuaciones) {
		super();
		IdCoactivo = idCoactivo;
		IdActuacion = idActuacion;
		this.numeroActuacion = numeroActuacion;
		this.fechaActuacion = fechaActuacion;
		this.fechaNotificacion = fechaNotificacion;
		this.formaNotificacion = formaNotificacion;
		this.fechaVencimiento = fechaVencimiento;
		this.observaciones = observaciones;
		IdDoc = idDoc;
		this.usuario = usuario;
		this.equipo = equipo;
		this.estado = estado;
		Id_tblCoactivoActuaciones = id_tblCoactivoActuaciones;
	}

	public Integer getIdCoactivo() {
		return IdCoactivo;
	}

	public void setIdCoactivo(Integer idCoactivo) {
		IdCoactivo = idCoactivo;
	}

	public Integer getIdActuacion() {
		return IdActuacion;
	}

	public void setIdActuacion(Integer idActuacion) {
		IdActuacion = idActuacion;
	}

	public String getNumeroActuacion() {
		return numeroActuacion;
	}

	public void setNumeroActuacion(String numeroActuacion) {
		this.numeroActuacion = numeroActuacion;
	}

	public String getFechaActuacion() {
		return fechaActuacion;
	}

	public void setFechaActuacion(String fechaActuacion) {
		this.fechaActuacion = fechaActuacion;
	}

	public String getFechaNotificacion() {
		return fechaNotificacion;
	}

	public void setFechaNotificacion(String fechaNotificacion) {
		this.fechaNotificacion = fechaNotificacion;
	}

	public Integer getFormaNotificacion() {
		return formaNotificacion;
	}

	public void setFormaNotificacion(Integer formaNotificacion) {
		this.formaNotificacion = formaNotificacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getIdDoc() {
		return IdDoc;
	}

	public void setIdDoc(Long idDoc) {
		IdDoc = idDoc;
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

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getId_tblCoactivoActuaciones() {
		return Id_tblCoactivoActuaciones;
	}

	public void setId_tblCoactivoActuaciones(Integer id_tblCoactivoActuaciones) {
		Id_tblCoactivoActuaciones = id_tblCoactivoActuaciones;
	}
    
    
}
