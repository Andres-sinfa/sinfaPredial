package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Tabla")
public class VariablesModelo {
    @Size(since = 0 , until = 50)
    @FormParam("Tabla")
    @NotNull(update = false)
    private String Tabla;
    @Size(since = 0 , until = 50)
    @FormParam("NombreCampo")
    @NotNull(update = false)
    private String NombreCampo;
    @FormParam("id_codigo")
    private Integer id_codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Campo")
    private String Campo;
    @Size(since = 0 , until = 200)
    @FormParam("Descripcion")
    private String Descripcion;
    @FormParam("TipoNumerico")
    private boolean TipoNumerico;
    
    private Integer Id_Variables;

	public VariablesModelo(String tabla, String nombreCampo, Integer id_codigo, String campo, String descripcion,
			boolean tipoNumerico, Integer id_Variables) {
		super();
		Tabla = tabla;
		NombreCampo = nombreCampo;
		this.id_codigo = id_codigo;
		Campo = campo;
		Descripcion = descripcion;
		TipoNumerico = tipoNumerico;
		Id_Variables = id_Variables;
	}

	public VariablesModelo() {
		super();
	}

	public String getTabla() {
		return Tabla;
	}

	public void setTabla(String tabla) {
		Tabla = tabla;
	}

	public String getNombreCampo() {
		return NombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		NombreCampo = nombreCampo;
	}

	public Integer getId_codigo() {
		return id_codigo;
	}

	public void setId_codigo(Integer id_codigo) {
		this.id_codigo = id_codigo;
	}

	public String getCampo() {
		return Campo;
	}

	public void setCampo(String campo) {
		Campo = campo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public boolean isTipoNumerico() {
		return TipoNumerico;
	}

	public void setTipoNumerico(boolean tipoNumerico) {
		TipoNumerico = tipoNumerico;
	}

	public Integer getId_Variables() {
		return Id_Variables;
	}

	public void setId_Variables(Integer id_Variables) {
		Id_Variables = id_Variables;
	}
    
    
}
