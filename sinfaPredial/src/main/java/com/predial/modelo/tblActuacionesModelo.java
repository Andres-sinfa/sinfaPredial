package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("IdActuacion")
public class tblActuacionesModelo {
    @FormParam("IdActuacion")
    @NotNull(update = false)
    private Integer IdActuacion;
    @Size(since = 0 , until = 100)
    @FormParam("descripcion")
    private String descripcion;
    @FormParam("meses")
    private Integer meses;
    @FormParam("dias")
    private Integer dias;
    @FormParam("antecesor")
    private Integer antecesor;
    @FormParam("orden")
    private Integer orden;

    private Integer Id_tblActuaciones;

	public tblActuacionesModelo() {
		super();
	}

	public tblActuacionesModelo(Integer idActuacion, String descripcion, Integer meses, Integer dias, Integer antecesor,
			Integer orden, Integer id_tblActuaciones) {
		super();
		IdActuacion = idActuacion;
		this.descripcion = descripcion;
		this.meses = meses;
		this.dias = dias;
		this.antecesor = antecesor;
		this.orden = orden;
		Id_tblActuaciones = id_tblActuaciones;
	}

	public Integer getIdActuacion() {
		return IdActuacion;
	}

	public void setIdActuacion(Integer idActuacion) {
		IdActuacion = idActuacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Integer getAntecesor() {
		return antecesor;
	}

	public void setAntecesor(Integer antecesor) {
		this.antecesor = antecesor;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public Integer getId_tblActuaciones() {
		return Id_tblActuaciones;
	}

	public void setId_tblActuaciones(Integer id_tblActuaciones) {
		Id_tblActuaciones = id_tblActuaciones;
	}
    
    
}
