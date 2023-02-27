package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Resolucion")
public class Det_ResolucionModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 50)
    @FormParam("Resolucion")
    private String Resolucion;
    @NotNull(update = false)
    @Size(since = 0 , until = 50)
    @FormParam("Nombre")
    private String Nombre;
    @NotNull
    @Size(since = 0 , until = 50)
    @FormParam("Variable")
    private String Variable;
    @Size(since = 0 , until = 100)
    @FormParam("Vlr_constante")
    private String Vlr_constante;
    @Size(since = 0 , until = 50)
    @FormParam("Formato")
    private String Formato;

    private Integer Id_Det_Resolucion;

	public Det_ResolucionModelo() {
		super();
	}

	public Det_ResolucionModelo(String resolucion, String nombre, String variable, String vlr_constante, String formato,
			Integer id_Det_Resolucion) {
		super();
		Resolucion = resolucion;
		Nombre = nombre;
		Variable = variable;
		Vlr_constante = vlr_constante;
		Formato = formato;
		Id_Det_Resolucion = id_Det_Resolucion;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getVariable() {
		return Variable;
	}

	public void setVariable(String variable) {
		Variable = variable;
	}

	public String getVlr_constante() {
		return Vlr_constante;
	}

	public void setVlr_constante(String vlr_constante) {
		Vlr_constante = vlr_constante;
	}

	public String getFormato() {
		return Formato;
	}

	public void setFormato(String formato) {
		Formato = formato;
	}

	public Integer getId_Det_Resolucion() {
		return Id_Det_Resolucion;
	}

	public void setId_Det_Resolucion(Integer id_Det_Resolucion) {
		Id_Det_Resolucion = id_Det_Resolucion;
	}
    
    
    
}
