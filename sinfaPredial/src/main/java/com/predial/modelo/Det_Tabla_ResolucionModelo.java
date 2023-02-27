package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Resolucion")
public class Det_Tabla_ResolucionModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Resolucion")
    private String Resolucion;
    @Size(since = 0 , until = 50)
    @FormParam("MarcadorTabla")
    @NotNull(update = false)
    private String MarcadorTabla;
    @Size(since = 0 , until = 50)
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private String Consecutivo;
    @Size(since = 0 , until = 50)
    @FormParam("Nombre")
    @NotNull
    private String Nombre;
    @Size(since = 0 , until = 50)
    @FormParam("Variable")
    @NotNull
    private String Variable;
    @Size(since = 0 , until = 100)
    @FormParam("Vlr_constante")
    private String Vlr_constante;
    @Size(since = 0 , until = 50)
    @FormParam("Formato")
    private String Formato;
    @FormParam("Totaliza")
    private boolean Totaliza;
    @FormParam("Alinear")
    private Integer Alinear;
    @FormParam("Ancho")
    private Float Ancho;
    @FormParam("Width")
    @NotNull
    private Float Width;
    @Size(since = 0 , until = 1)
    @FormParam("Operador")
    private String Operador;

    private Integer Id_Det_Tabla_Resolucion;

	public Det_Tabla_ResolucionModelo() {
		super();
	}

	public Det_Tabla_ResolucionModelo(String resolucion, String marcadorTabla, String consecutivo, String nombre,
			String variable, String vlr_constante, String formato, boolean totaliza, Integer alinear, Float ancho,
			Float width, String operador, Integer id_Det_Tabla_Resolucion) {
		super();
		Resolucion = resolucion;
		MarcadorTabla = marcadorTabla;
		Consecutivo = consecutivo;
		Nombre = nombre;
		Variable = variable;
		Vlr_constante = vlr_constante;
		Formato = formato;
		Totaliza = totaliza;
		Alinear = alinear;
		Ancho = ancho;
		Width = width;
		Operador = operador;
		Id_Det_Tabla_Resolucion = id_Det_Tabla_Resolucion;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getMarcadorTabla() {
		return MarcadorTabla;
	}

	public void setMarcadorTabla(String marcadorTabla) {
		MarcadorTabla = marcadorTabla;
	}

	public String getConsecutivo() {
		return Consecutivo;
	}

	public void setConsecutivo(String consecutivo) {
		Consecutivo = consecutivo;
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

	public boolean isTotaliza() {
		return Totaliza;
	}

	public void setTotaliza(boolean totaliza) {
		Totaliza = totaliza;
	}

	public Integer getAlinear() {
		return Alinear;
	}

	public void setAlinear(Integer alinear) {
		Alinear = alinear;
	}

	public Float getAncho() {
		return Ancho;
	}

	public void setAncho(Float ancho) {
		Ancho = ancho;
	}

	public Float getWidth() {
		return Width;
	}

	public void setWidth(Float width) {
		Width = width;
	}

	public String getOperador() {
		return Operador;
	}

	public void setOperador(String operador) {
		Operador = operador;
	}

	public Integer getId_Det_Tabla_Resolucion() {
		return Id_Det_Tabla_Resolucion;
	}

	public void setId_Det_Tabla_Resolucion(Integer id_Det_Tabla_Resolucion) {
		Id_Det_Tabla_Resolucion = id_Det_Tabla_Resolucion;
	}
    
    
}
