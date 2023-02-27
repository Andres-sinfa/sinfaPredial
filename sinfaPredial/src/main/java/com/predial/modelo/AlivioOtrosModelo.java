package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class AlivioOtrosModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 10)
    @NotNull(update = false)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @Size(since = 0 , until = 2)
    @NotNull(update = false)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 2)
    @NotNull(update = false)
    @FormParam("Concepto")
    private String Concepto;
    @Size(since = 0 , until = 100)
    @FormParam("Descripcion")
    private String Descripcion;
    @DateFormat
    @NotNull
    @FormParam("FechaInicio")
    private String FechaInicio;
    @DateFormat
    @NotNull
    @FormParam("FechaFinal")
    private String FechaFinal;
    @NotNull
    @FormParam("PorcDescto")
    private Float PorcDescto;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("AnoInicial")
    private Integer AnoInicial;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("AnoFinal")
    private Integer AnoFinal;
    @FormParam("Ind_Concepto")
    private boolean Ind_Concepto;
    @FormParam("Ind_Interes")
    private boolean Ind_Interes;
    @NotNull
    @FormParam("PorcDesctoAP")
    private Float PorcDesctoAP;
    @Size(since = 0 , until = 6)
    @FormParam("IdAlivio")
    private String IdAlivio;
    
    private Integer Id_AlivioOtros;

	public AlivioOtrosModelo(Integer ano, String nroAcuerdo, String codigo, String concepto, String descripcion,
			String fechaInicio, String fechaFinal, Float porcDescto, Integer anoInicial, Integer anoFinal,
			boolean ind_Concepto, boolean ind_Interes, Float porcDesctoAP, String idAlivio, Integer id_AlivioOtros) {
		super();
		Ano = ano;
		NroAcuerdo = nroAcuerdo;
		Codigo = codigo;
		Concepto = concepto;
		Descripcion = descripcion;
		FechaInicio = fechaInicio;
		FechaFinal = fechaFinal;
		PorcDescto = porcDescto;
		AnoInicial = anoInicial;
		AnoFinal = anoFinal;
		Ind_Concepto = ind_Concepto;
		Ind_Interes = ind_Interes;
		PorcDesctoAP = porcDesctoAP;
		IdAlivio = idAlivio;
		Id_AlivioOtros = id_AlivioOtros;
	}

	public AlivioOtrosModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return FechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		FechaFinal = fechaFinal;
	}

	public Float getPorcDescto() {
		return PorcDescto;
	}

	public void setPorcDescto(Float porcDescto) {
		PorcDescto = porcDescto;
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

	public boolean isInd_Concepto() {
		return Ind_Concepto;
	}

	public void setInd_Concepto(boolean ind_Concepto) {
		Ind_Concepto = ind_Concepto;
	}

	public boolean isInd_Interes() {
		return Ind_Interes;
	}

	public void setInd_Interes(boolean ind_Interes) {
		Ind_Interes = ind_Interes;
	}

	public Float getPorcDesctoAP() {
		return PorcDesctoAP;
	}

	public void setPorcDesctoAP(Float porcDesctoAP) {
		PorcDesctoAP = porcDesctoAP;
	}

	public String getIdAlivio() {
		return IdAlivio;
	}

	public void setIdAlivio(String idAlivio) {
		IdAlivio = idAlivio;
	}

	public Integer getId_AlivioOtros() {
		return Id_AlivioOtros;
	}

	public void setId_AlivioOtros(Integer id_AlivioOtros) {
		Id_AlivioOtros = id_AlivioOtros;
	}
    
}
