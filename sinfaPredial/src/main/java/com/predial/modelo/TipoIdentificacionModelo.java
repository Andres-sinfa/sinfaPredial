package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("IdTipo")
public class TipoIdentificacionModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("IdTipo")
    private String IdTipo;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    
    private Integer Id_TipoIdentificacion;

	public TipoIdentificacionModelo() {
		super();
	}

	public TipoIdentificacionModelo(String idTipo, String descripcion, Integer id_TipoIdentificacion) {
		super();
		IdTipo = idTipo;
		Descripcion = descripcion;
		Id_TipoIdentificacion = id_TipoIdentificacion;
	}

	public String getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(String idTipo) {
		IdTipo = idTipo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getId_TipoIdentificacion() {
		return Id_TipoIdentificacion;
	}

	public void setId_TipoIdentificacion(Integer id_TipoIdentificacion) {
		Id_TipoIdentificacion = id_TipoIdentificacion;
	}
    
    
}
