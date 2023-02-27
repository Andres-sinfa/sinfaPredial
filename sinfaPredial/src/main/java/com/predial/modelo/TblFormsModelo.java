package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Modulo")
public class TblFormsModelo {
    @Size(since = 0 , until = 2)
    @FormParam("Modulo")
    @NotNull(update = false)
    private String Modulo;
    @Size(since = 0 , until = 30)
    @FormParam("Nombre")
    @NotNull(update = false)
    private String Nombre;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;

    private Integer Id_TblForms;

	public TblFormsModelo() {
		super();
	}

	public TblFormsModelo(String modulo, String nombre, String descripcion, Integer id_TblForms) {
		super();
		Modulo = modulo;
		Nombre = nombre;
		Descripcion = descripcion;
		Id_TblForms = id_TblForms;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getId_TblForms() {
		return Id_TblForms;
	}

	public void setId_TblForms(Integer id_TblForms) {
		Id_TblForms = id_TblForms;
	}
    
    
}
