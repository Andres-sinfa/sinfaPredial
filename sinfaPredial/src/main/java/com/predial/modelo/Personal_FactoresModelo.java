package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Cedula")
public class Personal_FactoresModelo {
    @Size(since = 0 , until = 13)
    @FormParam("Cedula")
    @NotNull(update = false)
    private String Cedula;
    @Size(since = 0 , until = 3)
    @FormParam("Concepto")
    @NotNull(update = false)
    private String Concepto;
    @DateFormat
    @FormParam("FechaInicial")
    @NotNull(update = false)
    private String FechaInicial;
    @DateFormat
    @FormParam("FechaFinal")
    @NotNull(update = false)
    private String FechaFinal;
    @FormParam("Valor_Concepto")
    @NotNull
    private Float Valor_Concepto;
    @FormParam("Doceava")
    @NotNull
    private Float Doceava;
    
    private Integer Id_Personal_Factores;

	public Personal_FactoresModelo() {
		super();
	}

	public Personal_FactoresModelo(String cedula, String concepto, String fechaInicial, String fechaFinal,
			Float valor_Concepto, Float doceava, Integer id_Personal_Factores) {
		super();
		Cedula = cedula;
		Concepto = concepto;
		FechaInicial = fechaInicial;
		FechaFinal = fechaFinal;
		Valor_Concepto = valor_Concepto;
		Doceava = doceava;
		Id_Personal_Factores = id_Personal_Factores;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getFechaInicial() {
		return FechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		FechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return FechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		FechaFinal = fechaFinal;
	}

	public Float getValor_Concepto() {
		return Valor_Concepto;
	}

	public void setValor_Concepto(Float valor_Concepto) {
		Valor_Concepto = valor_Concepto;
	}

	public Float getDoceava() {
		return Doceava;
	}

	public void setDoceava(Float doceava) {
		Doceava = doceava;
	}

	public Integer getId_Personal_Factores() {
		return Id_Personal_Factores;
	}

	public void setId_Personal_Factores(Integer id_Personal_Factores) {
		Id_Personal_Factores = id_Personal_Factores;
	}

}
