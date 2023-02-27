package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class SubFinanciablesModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    @NotNull(update = false)
    private String NroAcuerdo;
    @Size(since = 0 , until = 2)
    @FormParam("Concepto")
    @NotNull(update = false)
    private String Concepto;
    @DateFormat
    @FormParam("Fecha")
    @NotNull
    private String Fecha;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull
    private String CodigoCatastral;
    @FormParam("VlrActual")
    private Float VlrActual;
    @FormParam("VlrAnterior")
    private Float VlrAnterior;
    @FormParam("VlrExpirada")
    private Float VlrExpirada;
    @FormParam("VlrInteres")
    private Float VlrInteres;
    @FormParam("VlrDeuda")
    private Float VlrDeuda;
    @FormParam("TotalDeuda")
    private Float TotalDeuda;
    @Size(since = -32768, until = 32767)
    @FormParam("Cuotas")
    private Integer Cuotas;
    @FormParam("VlrCuota")
    private Float VlrCuota;
    @FormParam("VlrSaldo")
    private Float VlrSaldo;
    @Size(since = -32768, until = 32767)
    @FormParam("SaldoCuotas")
    private Integer SaldoCuotas;
    @Size(since = 0 , until = 1)
    @FormParam("Periodo")
    private String Periodo;
    @FormParam("AbonoInteres")
    private Float AbonoInteres;
    @FormParam("SaldoInteres")
    private Float SaldoInteres;
    @FormParam("VlrCAR_Contrib")
    @NotNull
    private Float VlrCAR_Contrib;
    @FormParam("VlrIntCAR_Contrib")
    @NotNull
    private Float VlrIntCAR_Contrib;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_SubFinanciables;

	public SubFinanciablesModelo() {
		super();
	}

	public SubFinanciablesModelo(Integer ano, String nroAcuerdo, String concepto, String fecha, String codigoCatastral,
			Float vlrActual, Float vlrAnterior, Float vlrExpirada, Float vlrInteres, Float vlrDeuda, Float totalDeuda,
			Integer cuotas, Float vlrCuota, Float vlrSaldo, Integer saldoCuotas, String periodo, Float abonoInteres,
			Float saldoInteres, Float vlrCAR_Contrib, Float vlrIntCAR_Contrib, String codUnicoCatastral,
			Integer id_SubFinanciables) {
		super();
		Ano = ano;
		NroAcuerdo = nroAcuerdo;
		Concepto = concepto;
		Fecha = fecha;
		CodigoCatastral = codigoCatastral;
		VlrActual = vlrActual;
		VlrAnterior = vlrAnterior;
		VlrExpirada = vlrExpirada;
		VlrInteres = vlrInteres;
		VlrDeuda = vlrDeuda;
		TotalDeuda = totalDeuda;
		Cuotas = cuotas;
		VlrCuota = vlrCuota;
		VlrSaldo = vlrSaldo;
		SaldoCuotas = saldoCuotas;
		Periodo = periodo;
		AbonoInteres = abonoInteres;
		SaldoInteres = saldoInteres;
		VlrCAR_Contrib = vlrCAR_Contrib;
		VlrIntCAR_Contrib = vlrIntCAR_Contrib;
		CodUnicoCatastral = codUnicoCatastral;
		Id_SubFinanciables = id_SubFinanciables;
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

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public Float getVlrActual() {
		return VlrActual;
	}

	public void setVlrActual(Float vlrActual) {
		VlrActual = vlrActual;
	}

	public Float getVlrAnterior() {
		return VlrAnterior;
	}

	public void setVlrAnterior(Float vlrAnterior) {
		VlrAnterior = vlrAnterior;
	}

	public Float getVlrExpirada() {
		return VlrExpirada;
	}

	public void setVlrExpirada(Float vlrExpirada) {
		VlrExpirada = vlrExpirada;
	}

	public Float getVlrInteres() {
		return VlrInteres;
	}

	public void setVlrInteres(Float vlrInteres) {
		VlrInteres = vlrInteres;
	}

	public Float getVlrDeuda() {
		return VlrDeuda;
	}

	public void setVlrDeuda(Float vlrDeuda) {
		VlrDeuda = vlrDeuda;
	}

	public Float getTotalDeuda() {
		return TotalDeuda;
	}

	public void setTotalDeuda(Float totalDeuda) {
		TotalDeuda = totalDeuda;
	}

	public Integer getCuotas() {
		return Cuotas;
	}

	public void setCuotas(Integer cuotas) {
		Cuotas = cuotas;
	}

	public Float getVlrCuota() {
		return VlrCuota;
	}

	public void setVlrCuota(Float vlrCuota) {
		VlrCuota = vlrCuota;
	}

	public Float getVlrSaldo() {
		return VlrSaldo;
	}

	public void setVlrSaldo(Float vlrSaldo) {
		VlrSaldo = vlrSaldo;
	}

	public Integer getSaldoCuotas() {
		return SaldoCuotas;
	}

	public void setSaldoCuotas(Integer saldoCuotas) {
		SaldoCuotas = saldoCuotas;
	}

	public String getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}

	public Float getAbonoInteres() {
		return AbonoInteres;
	}

	public void setAbonoInteres(Float abonoInteres) {
		AbonoInteres = abonoInteres;
	}

	public Float getSaldoInteres() {
		return SaldoInteres;
	}

	public void setSaldoInteres(Float saldoInteres) {
		SaldoInteres = saldoInteres;
	}

	public Float getVlrCAR_Contrib() {
		return VlrCAR_Contrib;
	}

	public void setVlrCAR_Contrib(Float vlrCAR_Contrib) {
		VlrCAR_Contrib = vlrCAR_Contrib;
	}

	public Float getVlrIntCAR_Contrib() {
		return VlrIntCAR_Contrib;
	}

	public void setVlrIntCAR_Contrib(Float vlrIntCAR_Contrib) {
		VlrIntCAR_Contrib = vlrIntCAR_Contrib;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_SubFinanciables() {
		return Id_SubFinanciables;
	}

	public void setId_SubFinanciables(Integer id_SubFinanciables) {
		Id_SubFinanciables = id_SubFinanciables;
	}
    
}
