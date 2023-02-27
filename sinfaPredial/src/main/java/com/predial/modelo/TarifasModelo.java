package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class TarifasModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    @NotNull(update = false)
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    @NotNull(update = false)
    private String Rango;
    @FormParam("IndFormacion")
    private boolean IndFormacion;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @FormParam("LimiteInferior")
    private Float LimiteInferior;
    @FormParam("LimiteSuperior")
    private Float LimiteSuperior;
    @FormParam("Incremento")
    private Float Incremento;
    @FormParam("Impuesto")
    private Float Impuesto;
    @FormParam("Sobretasa")
    private Float Sobretasa;
    @Size(since = 0 , until = 2)
    @FormParam("BaseCAR")
    private String BaseCAR;
    @FormParam("CAR")
    private Float CAR;
    @FormParam("IncrementoRural")
    private Float IncrementoRural;
    @FormParam("BaseImp")
    private Float BaseImp;
    @FormParam("VlrImpuestoMinimo")
    private Float VlrImpuestoMinimo;
    @FormParam("IndMinimo")
    private boolean IndMinimo;
    @Size(since = 0 , until = 200)
    @FormParam("Acuerdo")
    private String Acuerdo;
    @DateFormat
    @FormParam("F_acuerdo")
    private String F_acuerdo;
    @Size(since = 0 , until = 200)
    @FormParam("Observaciones")
    private String Observaciones;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBase")
    private Integer AnoBase;
    @FormParam("PorIncremento")
    private Float PorIncremento;
    @NotNull
    @Size(since = 0 , until = 1)
    @FormParam("BaseRango")
    private String BaseRango;
    @FormParam("ImpuestoRural")
    private Float ImpuestoRural;
    @FormParam("PorMaximo")
    private Float PorMaximo;
    @Size(since = 0 , until = 2)
    @FormParam("Ley44")
    @NotNull
    private String Ley44;
    @FormParam("CAR_Recaudo")
    @NotNull
    private Float CAR_Recaudo;
    @Size(since = 0 , until = 2)
    @FormParam("DestinoEconomico")
    private String DestinoEconomico;
    @FormParam("IncAreaLey44")
    private Float IncAreaLey44;
    @Size(since = 0 , until = 10)
    @FormParam("CambioTarifa")
    private String CambioTarifa;
    @DateFormat
    @FormParam("FechaLimite")
    private String FechaLimite;
    @FormParam("estrato1")
    @NotNull
    private Float estrato1;
    @FormParam("estrato2")
    @NotNull
    private Float estrato2;
    @FormParam("estrato3")
    @NotNull
    private Float estrato3;
    @FormParam("estrato4")
    @NotNull
    private Float estrato4;
    @FormParam("estrato5")
    @NotNull
    private Float estrato5;
    @FormParam("estrato6")
    @NotNull
    private Float estrato6;
    
    private Integer Id_Tarifas;

	public TarifasModelo() {
		super();
	}

	public TarifasModelo(Integer ano, String tarifa, String rango, boolean indFormacion, String descripcion,
			Float limiteInferior, Float limiteSuperior, Float incremento, Float impuesto, Float sobretasa,
			String baseCAR, Float cAR, Float incrementoRural, Float baseImp, Float vlrImpuestoMinimo, boolean indMinimo,
			String acuerdo, String f_acuerdo, String observaciones, Integer anoBase, Float porIncremento,
			String baseRango, Float impuestoRural, Float porMaximo, String ley44, Float cAR_Recaudo,
			String destinoEconomico, Float incAreaLey44, String cambioTarifa, String fechaLimite, Float estrato1,
			Float estrato2, Float estrato3, Float estrato4, Float estrato5, Float estrato6, Integer id_Tarifas) {
		super();
		Ano = ano;
		Tarifa = tarifa;
		Rango = rango;
		IndFormacion = indFormacion;
		Descripcion = descripcion;
		LimiteInferior = limiteInferior;
		LimiteSuperior = limiteSuperior;
		Incremento = incremento;
		Impuesto = impuesto;
		Sobretasa = sobretasa;
		BaseCAR = baseCAR;
		CAR = cAR;
		IncrementoRural = incrementoRural;
		BaseImp = baseImp;
		VlrImpuestoMinimo = vlrImpuestoMinimo;
		IndMinimo = indMinimo;
		Acuerdo = acuerdo;
		F_acuerdo = f_acuerdo;
		Observaciones = observaciones;
		AnoBase = anoBase;
		PorIncremento = porIncremento;
		BaseRango = baseRango;
		ImpuestoRural = impuestoRural;
		PorMaximo = porMaximo;
		Ley44 = ley44;
		CAR_Recaudo = cAR_Recaudo;
		DestinoEconomico = destinoEconomico;
		IncAreaLey44 = incAreaLey44;
		CambioTarifa = cambioTarifa;
		FechaLimite = fechaLimite;
		this.estrato1 = estrato1;
		this.estrato2 = estrato2;
		this.estrato3 = estrato3;
		this.estrato4 = estrato4;
		this.estrato5 = estrato5;
		this.estrato6 = estrato6;
		Id_Tarifas = id_Tarifas;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getTarifa() {
		return Tarifa;
	}

	public void setTarifa(String tarifa) {
		Tarifa = tarifa;
	}

	public String getRango() {
		return Rango;
	}

	public void setRango(String rango) {
		Rango = rango;
	}

	public boolean isIndFormacion() {
		return IndFormacion;
	}

	public void setIndFormacion(boolean indFormacion) {
		IndFormacion = indFormacion;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Float getLimiteInferior() {
		return LimiteInferior;
	}

	public void setLimiteInferior(Float limiteInferior) {
		LimiteInferior = limiteInferior;
	}

	public Float getLimiteSuperior() {
		return LimiteSuperior;
	}

	public void setLimiteSuperior(Float limiteSuperior) {
		LimiteSuperior = limiteSuperior;
	}

	public Float getIncremento() {
		return Incremento;
	}

	public void setIncremento(Float incremento) {
		Incremento = incremento;
	}

	public Float getImpuesto() {
		return Impuesto;
	}

	public void setImpuesto(Float impuesto) {
		Impuesto = impuesto;
	}

	public Float getSobretasa() {
		return Sobretasa;
	}

	public void setSobretasa(Float sobretasa) {
		Sobretasa = sobretasa;
	}

	public String getBaseCAR() {
		return BaseCAR;
	}

	public void setBaseCAR(String baseCAR) {
		BaseCAR = baseCAR;
	}

	public Float getCAR() {
		return CAR;
	}

	public void setCAR(Float cAR) {
		CAR = cAR;
	}

	public Float getIncrementoRural() {
		return IncrementoRural;
	}

	public void setIncrementoRural(Float incrementoRural) {
		IncrementoRural = incrementoRural;
	}

	public Float getBaseImp() {
		return BaseImp;
	}

	public void setBaseImp(Float baseImp) {
		BaseImp = baseImp;
	}

	public Float getVlrImpuestoMinimo() {
		return VlrImpuestoMinimo;
	}

	public void setVlrImpuestoMinimo(Float vlrImpuestoMinimo) {
		VlrImpuestoMinimo = vlrImpuestoMinimo;
	}

	public boolean isIndMinimo() {
		return IndMinimo;
	}

	public void setIndMinimo(boolean indMinimo) {
		IndMinimo = indMinimo;
	}

	public String getAcuerdo() {
		return Acuerdo;
	}

	public void setAcuerdo(String acuerdo) {
		Acuerdo = acuerdo;
	}

	public String getF_acuerdo() {
		return F_acuerdo;
	}

	public void setF_acuerdo(String f_acuerdo) {
		F_acuerdo = f_acuerdo;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public Integer getAnoBase() {
		return AnoBase;
	}

	public void setAnoBase(Integer anoBase) {
		AnoBase = anoBase;
	}

	public Float getPorIncremento() {
		return PorIncremento;
	}

	public void setPorIncremento(Float porIncremento) {
		PorIncremento = porIncremento;
	}

	public String getBaseRango() {
		return BaseRango;
	}

	public void setBaseRango(String baseRango) {
		BaseRango = baseRango;
	}

	public Float getImpuestoRural() {
		return ImpuestoRural;
	}

	public void setImpuestoRural(Float impuestoRural) {
		ImpuestoRural = impuestoRural;
	}

	public Float getPorMaximo() {
		return PorMaximo;
	}

	public void setPorMaximo(Float porMaximo) {
		PorMaximo = porMaximo;
	}

	public String getLey44() {
		return Ley44;
	}

	public void setLey44(String ley44) {
		Ley44 = ley44;
	}

	public Float getCAR_Recaudo() {
		return CAR_Recaudo;
	}

	public void setCAR_Recaudo(Float cAR_Recaudo) {
		CAR_Recaudo = cAR_Recaudo;
	}

	public String getDestinoEconomico() {
		return DestinoEconomico;
	}

	public void setDestinoEconomico(String destinoEconomico) {
		DestinoEconomico = destinoEconomico;
	}

	public Float getIncAreaLey44() {
		return IncAreaLey44;
	}

	public void setIncAreaLey44(Float incAreaLey44) {
		IncAreaLey44 = incAreaLey44;
	}

	public String getCambioTarifa() {
		return CambioTarifa;
	}

	public void setCambioTarifa(String cambioTarifa) {
		CambioTarifa = cambioTarifa;
	}

	public String getFechaLimite() {
		return FechaLimite;
	}

	public void setFechaLimite(String fechaLimite) {
		FechaLimite = fechaLimite;
	}

	public Float getEstrato1() {
		return estrato1;
	}

	public void setEstrato1(Float estrato1) {
		this.estrato1 = estrato1;
	}

	public Float getEstrato2() {
		return estrato2;
	}

	public void setEstrato2(Float estrato2) {
		this.estrato2 = estrato2;
	}

	public Float getEstrato3() {
		return estrato3;
	}

	public void setEstrato3(Float estrato3) {
		this.estrato3 = estrato3;
	}

	public Float getEstrato4() {
		return estrato4;
	}

	public void setEstrato4(Float estrato4) {
		this.estrato4 = estrato4;
	}

	public Float getEstrato5() {
		return estrato5;
	}

	public void setEstrato5(Float estrato5) {
		this.estrato5 = estrato5;
	}

	public Float getEstrato6() {
		return estrato6;
	}

	public void setEstrato6(Float estrato6) {
		this.estrato6 = estrato6;
	}

	public Integer getId_Tarifas() {
		return Id_Tarifas;
	}

	public void setId_Tarifas(Integer id_Tarifas) {
		Id_Tarifas = id_Tarifas;
	}
    
    
}
