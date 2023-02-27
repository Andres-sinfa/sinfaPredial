package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Rango")
public class InteresesPorAnosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    private String Rango;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoInicial")
    private Integer AnoInicial;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoFinal")
    private Integer AnoFinal;
    @FormParam("IntAnual")
    private Float IntAnual;
    @FormParam("IntMensual")
    private Float IntMensual;
    @DateFormat
    @FormParam("F_limite")
    private String F_limite;
    @FormParam("IndTodos")
    private boolean IndTodos;
    @FormParam("Observaciones")
    private String Observaciones;
    
    private Integer Id_InteresesPorAnos;

	public InteresesPorAnosModelo() {
		super();
	}

	public InteresesPorAnosModelo(String rango, Integer anoInicial, Integer anoFinal, Float intAnual, Float intMensual,
			String f_limite, boolean indTodos, String observaciones, Integer id_InteresesPorAnos) {
		super();
		Rango = rango;
		AnoInicial = anoInicial;
		AnoFinal = anoFinal;
		IntAnual = intAnual;
		IntMensual = intMensual;
		F_limite = f_limite;
		IndTodos = indTodos;
		Observaciones = observaciones;
		Id_InteresesPorAnos = id_InteresesPorAnos;
	}

	public String getRango() {
		return Rango;
	}

	public void setRango(String rango) {
		Rango = rango;
	}

	public Integer getAnoInicial() {
		return AnoInicial;
	}

	public void setAnoInicial(Integer anoInicial) {
		AnoInicial = anoInicial;
	}

	public Integer getAnoFinal() {
		return AnoFinal;
	}

	public void setAnoFinal(Integer anoFinal) {
		AnoFinal = anoFinal;
	}

	public Float getIntAnual() {
		return IntAnual;
	}

	public void setIntAnual(Float intAnual) {
		IntAnual = intAnual;
	}

	public Float getIntMensual() {
		return IntMensual;
	}

	public void setIntMensual(Float intMensual) {
		IntMensual = intMensual;
	}

	public String getF_limite() {
		return F_limite;
	}

	public void setF_limite(String f_limite) {
		F_limite = f_limite;
	}

	public boolean isIndTodos() {
		return IndTodos;
	}

	public void setIndTodos(boolean indTodos) {
		IndTodos = indTodos;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public Integer getId_InteresesPorAnos() {
		return Id_InteresesPorAnos;
	}

	public void setId_InteresesPorAnos(Integer id_InteresesPorAnos) {
		Id_InteresesPorAnos = id_InteresesPorAnos;
	}
    
    
}
