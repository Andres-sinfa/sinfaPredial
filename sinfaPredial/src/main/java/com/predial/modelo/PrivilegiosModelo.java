package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Modulo")
public class PrivilegiosModelo {
    @Size(since = 0 , until = 10)
    @FormParam("Modulo")
    @NotNull(update = false)
    private String Modulo;
    @Size(since = 0 , until = 2)
    @FormParam("Grupo")
    @NotNull(update = false)
    private String Grupo;
    @Size(since = 0 , until = 3)
    @FormParam("Clase")
    @NotNull(update = false)
    private String Clase;
    @Size(since = 0 , until = 30)
    @FormParam("Formulario")
    @NotNull(update = false)
    private String Formulario;
    @FormParam("IndINSERT")
    private boolean IndINSERT;
    @FormParam("IndUPDATE")
    private boolean IndUPDATE;
    @FormParam("IndDELETE")
    private boolean IndDELETE;
    
    private Integer Id_Privilegios;

	public PrivilegiosModelo() {
		super();
	}

	public PrivilegiosModelo(String modulo, String grupo, String clase, String formulario, boolean indINSERT,
			boolean indUPDATE, boolean indDELETE, Integer id_Privilegios) {
		super();
		Modulo = modulo;
		Grupo = grupo;
		Clase = clase;
		Formulario = formulario;
		IndINSERT = indINSERT;
		IndUPDATE = indUPDATE;
		IndDELETE = indDELETE;
		Id_Privilegios = id_Privilegios;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public String getClase() {
		return Clase;
	}

	public void setClase(String clase) {
		Clase = clase;
	}

	public String getFormulario() {
		return Formulario;
	}

	public void setFormulario(String formulario) {
		Formulario = formulario;
	}

	public boolean isIndINSERT() {
		return IndINSERT;
	}

	public void setIndINSERT(boolean indINSERT) {
		IndINSERT = indINSERT;
	}

	public boolean isIndUPDATE() {
		return IndUPDATE;
	}

	public void setIndUPDATE(boolean indUPDATE) {
		IndUPDATE = indUPDATE;
	}

	public boolean isIndDELETE() {
		return IndDELETE;
	}

	public void setIndDELETE(boolean indDELETE) {
		IndDELETE = indDELETE;
	}

	public Integer getId_Privilegios() {
		return Id_Privilegios;
	}

	public void setId_Privilegios(Integer id_Privilegios) {
		Id_Privilegios = id_Privilegios;
	}
    
    
}
