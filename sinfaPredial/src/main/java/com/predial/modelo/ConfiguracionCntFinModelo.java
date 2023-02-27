package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("ano")
public class ConfiguracionCntFinModelo {
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    private Integer ano;
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 60)
    @FormParam("CntActual")
    private String CntActual;
    @Size(since = 0 , until = 60)
    @FormParam("CntAnterior")
    private String CntAnterior;
    @Size(since = 0 , until = 60)
    @FormParam("CntExpirada")
    private String CntExpirada;
    @Size(since = 0 , until = 60)
    @FormParam("CntIntereses")
    private String CntIntereses;
    @Size(since = 0 , until = 80)
    @FormParam("PptActual")
    private String PptActual;
    @Size(since = 0 , until = 80)
    @FormParam("PptAnterior")
    private String PptAnterior;
    @Size(since = 0 , until = 60)
    @FormParam("PptExpirada")
    private String PptExpirada;
    @Size(since = 0 , until = 80)
    @FormParam("PptIntereses")
    private String PptIntereses;
    @Size(since = 0 , until = 100)
    @FormParam("CntActualRur")
    private String CntActualRur;
    @Size(since = 0 , until = 100)
    @FormParam("CntAnteriorRur")
    private String CntAnteriorRur;
    @Size(since = 0 , until = 100)
    @FormParam("CntInteresesRur")
    private String CntInteresesRur;
    @Size(since = 0 , until = 80)
    @FormParam("PptActualRur")
    private String PptActualRur;
    @Size(since = 0 , until = 80)
    @FormParam("PptAnteriorRur")
    private String PptAnteriorRur;
    @Size(since = 0 , until = 80)
    @FormParam("PptInteresesRur")
    private String PptInteresesRur;
    
    private Integer Id_ConfiguracionCntFin;

	public ConfiguracionCntFinModelo() {
		super();
	}

	public ConfiguracionCntFinModelo(Integer ano, String codigo, String cntActual, String cntAnterior,
			String cntExpirada, String cntIntereses, String pptActual, String pptAnterior, String pptExpirada,
			String pptIntereses, String cntActualRur, String cntAnteriorRur, String cntInteresesRur,
			String pptActualRur, String pptAnteriorRur, String pptInteresesRur, Integer id_ConfiguracionCntFin) {
		super();
		this.ano = ano;
		Codigo = codigo;
		CntActual = cntActual;
		CntAnterior = cntAnterior;
		CntExpirada = cntExpirada;
		CntIntereses = cntIntereses;
		PptActual = pptActual;
		PptAnterior = pptAnterior;
		PptExpirada = pptExpirada;
		PptIntereses = pptIntereses;
		CntActualRur = cntActualRur;
		CntAnteriorRur = cntAnteriorRur;
		CntInteresesRur = cntInteresesRur;
		PptActualRur = pptActualRur;
		PptAnteriorRur = pptAnteriorRur;
		PptInteresesRur = pptInteresesRur;
		Id_ConfiguracionCntFin = id_ConfiguracionCntFin;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getCntActual() {
		return CntActual;
	}

	public void setCntActual(String cntActual) {
		CntActual = cntActual;
	}

	public String getCntAnterior() {
		return CntAnterior;
	}

	public void setCntAnterior(String cntAnterior) {
		CntAnterior = cntAnterior;
	}

	public String getCntExpirada() {
		return CntExpirada;
	}

	public void setCntExpirada(String cntExpirada) {
		CntExpirada = cntExpirada;
	}

	public String getCntIntereses() {
		return CntIntereses;
	}

	public void setCntIntereses(String cntIntereses) {
		CntIntereses = cntIntereses;
	}

	public String getPptActual() {
		return PptActual;
	}

	public void setPptActual(String pptActual) {
		PptActual = pptActual;
	}

	public String getPptAnterior() {
		return PptAnterior;
	}

	public void setPptAnterior(String pptAnterior) {
		PptAnterior = pptAnterior;
	}

	public String getPptExpirada() {
		return PptExpirada;
	}

	public void setPptExpirada(String pptExpirada) {
		PptExpirada = pptExpirada;
	}

	public String getPptIntereses() {
		return PptIntereses;
	}

	public void setPptIntereses(String pptIntereses) {
		PptIntereses = pptIntereses;
	}

	public String getCntActualRur() {
		return CntActualRur;
	}

	public void setCntActualRur(String cntActualRur) {
		CntActualRur = cntActualRur;
	}

	public String getCntAnteriorRur() {
		return CntAnteriorRur;
	}

	public void setCntAnteriorRur(String cntAnteriorRur) {
		CntAnteriorRur = cntAnteriorRur;
	}

	public String getCntInteresesRur() {
		return CntInteresesRur;
	}

	public void setCntInteresesRur(String cntInteresesRur) {
		CntInteresesRur = cntInteresesRur;
	}

	public String getPptActualRur() {
		return PptActualRur;
	}

	public void setPptActualRur(String pptActualRur) {
		PptActualRur = pptActualRur;
	}

	public String getPptAnteriorRur() {
		return PptAnteriorRur;
	}

	public void setPptAnteriorRur(String pptAnteriorRur) {
		PptAnteriorRur = pptAnteriorRur;
	}

	public String getPptInteresesRur() {
		return PptInteresesRur;
	}

	public void setPptInteresesRur(String pptInteresesRur) {
		PptInteresesRur = pptInteresesRur;
	}

	public Integer getId_ConfiguracionCntFin() {
		return Id_ConfiguracionCntFin;
	}

	public void setId_ConfiguracionCntFin(Integer id_ConfiguracionCntFin) {
		Id_ConfiguracionCntFin = id_ConfiguracionCntFin;
	}
    
}
