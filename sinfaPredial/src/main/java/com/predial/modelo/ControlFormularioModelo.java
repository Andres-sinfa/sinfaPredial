package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Modulo")
public class ControlFormularioModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Modulo")
    private String Modulo;
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("Formulario")
    private String Formulario;
    @NotNull(update = false)
    @Size(since = 0 , until = 50)
    @FormParam("Control")
    private String Control;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 30)
    @FormParam("TipoDato")
    private String TipoDato;
    @NotNull
    @Size(since = 0 , until = 3)
    @FormParam("clase")
    private String clase;

    private Integer Id_ControlFormulario;

	public ControlFormularioModelo() {
		super();
	}

	public ControlFormularioModelo(String modulo, String formulario, String control, String descripcion,
			String tipoDato, String clase, Integer id_ControlFormulario) {
		super();
		Modulo = modulo;
		Formulario = formulario;
		Control = control;
		Descripcion = descripcion;
		TipoDato = tipoDato;
		this.clase = clase;
		Id_ControlFormulario = id_ControlFormulario;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public String getFormulario() {
		return Formulario;
	}

	public void setFormulario(String formulario) {
		Formulario = formulario;
	}

	public String getControl() {
		return Control;
	}

	public void setControl(String control) {
		Control = control;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getTipoDato() {
		return TipoDato;
	}

	public void setTipoDato(String tipoDato) {
		TipoDato = tipoDato;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Integer getId_ControlFormulario() {
		return Id_ControlFormulario;
	}

	public void setId_ControlFormulario(Integer id_ControlFormulario) {
		Id_ControlFormulario = id_ControlFormulario;
	}
    
    
}
