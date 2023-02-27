package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Grupo")
public class GruposFormularioModelo {
    @Size(since = 0 , until = 2)
    @FormParam("Grupo")
    @NotNull(update = false)
    private String Grupo;
    @Size(since = 0 , until = 30)
    @FormParam("Formulario")
    @NotNull(update = false)
    private String Formulario;
    @Size(since = 0 , until = 30)
    @FormParam("Control")
    @NotNull(update = false)
    private String Control;
    @FormParam("Bloqueado")
    private boolean Bloqueado;
    @Size(since = 0 , until = 3)
    @FormParam("Modulo")
    @NotNull
    private String Modulo;
    @Size(since = 0 , until = 3)
    @FormParam("clase")
    @NotNull
    private String clase;
    @Size(since = 0 , until = 30)
    @FormParam("TipoDato")
    private String TipoDato;

    private Integer Id_GruposFormulario;

	public GruposFormularioModelo(String grupo, String formulario, String control, boolean bloqueado, String modulo,
			String clase, String tipoDato, Integer id_GruposFormulario) {
		super();
		Grupo = grupo;
		Formulario = formulario;
		Control = control;
		Bloqueado = bloqueado;
		Modulo = modulo;
		this.clase = clase;
		TipoDato = tipoDato;
		Id_GruposFormulario = id_GruposFormulario;
	}

	public GruposFormularioModelo() {
		super();
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
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

	public boolean isBloqueado() {
		return Bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		Bloqueado = bloqueado;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTipoDato() {
		return TipoDato;
	}

	public void setTipoDato(String tipoDato) {
		TipoDato = tipoDato;
	}

	public Integer getId_GruposFormulario() {
		return Id_GruposFormulario;
	}

	public void setId_GruposFormulario(Integer id_GruposFormulario) {
		Id_GruposFormulario = id_GruposFormulario;
	}
    
}
