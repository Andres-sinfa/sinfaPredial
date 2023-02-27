package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("codigo")
public class TipoObservacionModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("codigo")
    private String codigo;
    @NotNull
    @Size(since = 0 , until = 100)
    @FormParam("descripcion")
    private String descripcion;

    private Integer Id_TipoObservacion;

	public TipoObservacionModelo(String codigo, String descripcion, Integer id_TipoObservacion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		Id_TipoObservacion = id_TipoObservacion;
	}

	public TipoObservacionModelo() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId_TipoObservacion() {
		return Id_TipoObservacion;
	}

	public void setId_TipoObservacion(Integer id_TipoObservacion) {
		Id_TipoObservacion = id_TipoObservacion;
	}
    
    
}
