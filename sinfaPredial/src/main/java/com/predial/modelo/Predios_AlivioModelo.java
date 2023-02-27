package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class Predios_AlivioModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 6)
    @FormParam("IdAlivio")
    @NotNull(update = false)
    private String IdAlivio;
    @DateFormat
    @FormParam("fechaRegistro")
    private String fechaRegistro;
    @Size(since = 0 , until = 50)
    @FormParam("Resolucion")
    private String Resolucion;
    @Size(since = 0 , until = 500)
    @FormParam("observaciones")
    private String observaciones;
    @Size(since = 0 , until = 50)
    @FormParam("usuario")
    private String usuario;
    @Size(since = 0 , until = 50)
    @FormParam("equipo")
    private String equipo;
    
    private Integer Id_Predios_Alivio;

	public Predios_AlivioModelo() {
		super();
	}

	public Predios_AlivioModelo(String codigoCatastral, String idAlivio, String fechaRegistro, String resolucion,
			String observaciones, String usuario, String equipo, Integer id_Predios_Alivio) {
		super();
		CodigoCatastral = codigoCatastral;
		IdAlivio = idAlivio;
		this.fechaRegistro = fechaRegistro;
		Resolucion = resolucion;
		this.observaciones = observaciones;
		this.usuario = usuario;
		this.equipo = equipo;
		Id_Predios_Alivio = id_Predios_Alivio;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getIdAlivio() {
		return IdAlivio;
	}

	public void setIdAlivio(String idAlivio) {
		IdAlivio = idAlivio;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public Integer getId_Predios_Alivio() {
		return Id_Predios_Alivio;
	}

	public void setId_Predios_Alivio(Integer id_Predios_Alivio) {
		Id_Predios_Alivio = id_Predios_Alivio;
	}
    
    
}
