package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Codigo")
public class GruposModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 30)
    @FormParam("Descripcion")
    private String Descripcion;
    
    private Integer Id_Grupos;

	public GruposModelo(String codigo, String descripcion, Integer id_Grupos) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		Id_Grupos = id_Grupos;
	}

	public GruposModelo() {
		super();
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getId_Grupos() {
		return Id_Grupos;
	}

	public void setId_Grupos(Integer id_Grupos) {
		Id_Grupos = id_Grupos;
	}
    
}
