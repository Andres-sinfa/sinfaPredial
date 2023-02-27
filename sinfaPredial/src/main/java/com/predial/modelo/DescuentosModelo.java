package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class DescuentosModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer   Ano;
    @Size(since = -32768, until = 32767)
    @FormParam("MesCorte")
    @NotNull(update = false)
    private Integer   MesCorte;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    @NotNull(update = false)
    private String Rango;
    @FormParam("Avaluo")
    private Float Avaluo;
    @Size(since = -32768, until = 32767)
    @FormParam("MesCobroInteres")
    private Integer   MesCobroInteres;
    @FormParam("DescuentoImpuesto")
    private Float DescuentoImpuesto;
    @Size(since = -32768, until = 32767)
    @FormParam("DescuentoInteres")
    private Integer   DescuentoInteres;
    @Size(since = -32768, until = 32767)
    @FormParam("MesCorteInteres")
    private Integer   MesCorteInteres;
    @FormParam("IndDescuentoImp")
    private boolean IndDescuentoImp;
    @FormParam("IndDescuentoOtros")
    private boolean IndDescuentoOtros;
    @FormParam("IndDescuentoCAR")
    private boolean IndDescuentoCAR;
    @FormParam("DescuentoImpuestoMorosos")
    private Float DescuentoImpuestoMorosos;
    @FormParam("AvaluoInicial")
    private Float AvaluoInicial;
    @DateFormat
    @FormParam("Vencimiento")
    private String Vencimiento;
    @NotNull
    @FormParam("DescuentoCAR")
    private Float DescuentoCAR;
    @Size(since = 0 , until = 5)
    @FormParam("tarifa")
    private String tarifa;
    @DateFormat
    @FormParam("fechaPazYSalvo")
    private String fechaPazYSalvo;

    private Integer Id_Descuentos;

	public DescuentosModelo() {
		super();
	}

	public DescuentosModelo(Integer ano, Integer mesCorte, String rango, Float avaluo, Integer mesCobroInteres,
			Float descuentoImpuesto, Integer descuentoInteres, Integer mesCorteInteres, boolean indDescuentoImp,
			boolean indDescuentoOtros, boolean indDescuentoCAR, Float descuentoImpuestoMorosos, Float avaluoInicial,
			String vencimiento, Float descuentoCAR, String tarifa, String fechaPazYSalvo, Integer id_Descuentos) {
		super();
		Ano = ano;
		MesCorte = mesCorte;
		Rango = rango;
		Avaluo = avaluo;
		MesCobroInteres = mesCobroInteres;
		DescuentoImpuesto = descuentoImpuesto;
		DescuentoInteres = descuentoInteres;
		MesCorteInteres = mesCorteInteres;
		IndDescuentoImp = indDescuentoImp;
		IndDescuentoOtros = indDescuentoOtros;
		IndDescuentoCAR = indDescuentoCAR;
		DescuentoImpuestoMorosos = descuentoImpuestoMorosos;
		AvaluoInicial = avaluoInicial;
		Vencimiento = vencimiento;
		DescuentoCAR = descuentoCAR;
		this.tarifa = tarifa;
		this.fechaPazYSalvo = fechaPazYSalvo;
		Id_Descuentos = id_Descuentos;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getMesCorte() {
		return MesCorte;
	}

	public void setMesCorte(Integer mesCorte) {
		MesCorte = mesCorte;
	}

	public String getRango() {
		return Rango;
	}

	public void setRango(String rango) {
		Rango = rango;
	}

	public Float getAvaluo() {
		return Avaluo;
	}

	public void setAvaluo(Float avaluo) {
		Avaluo = avaluo;
	}

	public Integer getMesCobroInteres() {
		return MesCobroInteres;
	}

	public void setMesCobroInteres(Integer mesCobroInteres) {
		MesCobroInteres = mesCobroInteres;
	}

	public Float getDescuentoImpuesto() {
		return DescuentoImpuesto;
	}

	public void setDescuentoImpuesto(Float descuentoImpuesto) {
		DescuentoImpuesto = descuentoImpuesto;
	}

	public Integer getDescuentoInteres() {
		return DescuentoInteres;
	}

	public void setDescuentoInteres(Integer descuentoInteres) {
		DescuentoInteres = descuentoInteres;
	}

	public Integer getMesCorteInteres() {
		return MesCorteInteres;
	}

	public void setMesCorteInteres(Integer mesCorteInteres) {
		MesCorteInteres = mesCorteInteres;
	}

	public boolean isIndDescuentoImp() {
		return IndDescuentoImp;
	}

	public void setIndDescuentoImp(boolean indDescuentoImp) {
		IndDescuentoImp = indDescuentoImp;
	}

	public boolean isIndDescuentoOtros() {
		return IndDescuentoOtros;
	}

	public void setIndDescuentoOtros(boolean indDescuentoOtros) {
		IndDescuentoOtros = indDescuentoOtros;
	}

	public boolean isIndDescuentoCAR() {
		return IndDescuentoCAR;
	}

	public void setIndDescuentoCAR(boolean indDescuentoCAR) {
		IndDescuentoCAR = indDescuentoCAR;
	}

	public Float getDescuentoImpuestoMorosos() {
		return DescuentoImpuestoMorosos;
	}

	public void setDescuentoImpuestoMorosos(Float descuentoImpuestoMorosos) {
		DescuentoImpuestoMorosos = descuentoImpuestoMorosos;
	}

	public Float getAvaluoInicial() {
		return AvaluoInicial;
	}

	public void setAvaluoInicial(Float avaluoInicial) {
		AvaluoInicial = avaluoInicial;
	}

	public String getVencimiento() {
		return Vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		Vencimiento = vencimiento;
	}

	public Float getDescuentoCAR() {
		return DescuentoCAR;
	}

	public void setDescuentoCAR(Float descuentoCAR) {
		DescuentoCAR = descuentoCAR;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getFechaPazYSalvo() {
		return fechaPazYSalvo;
	}

	public void setFechaPazYSalvo(String fechaPazYSalvo) {
		this.fechaPazYSalvo = fechaPazYSalvo;
	}

	public Integer getId_Descuentos() {
		return Id_Descuentos;
	}

	public void setId_Descuentos(Integer id_Descuentos) {
		Id_Descuentos = id_Descuentos;
	}

}
