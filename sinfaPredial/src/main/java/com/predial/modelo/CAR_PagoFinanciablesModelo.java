package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("PeriodoCartera")
public class CAR_PagoFinanciablesModelo {
    @Size(since = 0 , until = 6)
    @FormParam("PeriodoCartera")
    @NotNull(update = false)
    private String PeriodoCartera;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    @NotNull(update = false)
    private String NroAcuerdo;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 2)
    @FormParam("Concepto")
    @NotNull(update = false)
    private String Concepto;
    @Size(since = -32768, until = 32767)
    @FormParam("Cuota")
    @NotNull(update = false)
    private Integer Cuota;
    @DateFormat
    @FormParam("Fecha")
    @NotNull
    private String Fecha;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull
    private String CodigoCatastral;
    @FormParam("VlrCuota")
    private Float VlrCuota;
    @FormParam("VlrActual")
    private Float VlrActual;
    @FormParam("VlrAnterior")
    private Float VlrAnterior;
    @FormParam("VlrExpirada")
    private Float VlrExpirada;
    @FormParam("VlrDeuda")
    private Float VlrDeuda;
    @FormParam("VlrSaldo")
    private Float VlrSaldo;
    @Size(since = -32768, until = 32767)
    @FormParam("SaldoCuotas")
    private Integer SaldoCuotas;
    @Size(since = 0 , until = 1)
    @FormParam("Periodo")
    private String Periodo;
    @FormParam("IndPago")
    private boolean IndPago;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("Comprobante")
    private String Comprobante;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @DateFormat
    @FormParam("F_Vencimiento")
    private String F_Vencimiento;
    @FormParam("AbonoDeuda")
    private Float AbonoDeuda;
    @FormParam("SaldoDeuda")
    private Float SaldoDeuda;
    @FormParam("VlrInteres")
    private Float VlrInteres;
    @FormParam("IntCuota")
    private Float IntCuota;
    @FormParam("TotalInteres")
    private Float TotalInteres;
    @FormParam("SaldoInteres")
    private Float SaldoInteres;
    @FormParam("TotalDeuda")
    private Float TotalDeuda;
    @FormParam("Paquete")
    private Integer Paquete;
    @FormParam("AbonoInteres")
    private Float AbonoInteres;
    @FormParam("DeudaInteres")
    private Float DeudaInteres;
    @Size(since = 0 , until = 8)
    @FormParam("anoinicial")
    private String anoinicial;
    @Size(since = 0 , until = 8)
    @FormParam("anofinal")
    private String anofinal;
    @FormParam("indIncumplido")
    private boolean indIncumplido;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @FormParam("VlrCAR_Contrib")
    private Float VlrCAR_Contrib;
    @FormParam("VlrIntCAR_Contrib")
    private Float VlrIntCAR_Contrib;

    private Integer Id_CAR_PagoFinanciables;

	public CAR_PagoFinanciablesModelo() {
		super();
	}

	public CAR_PagoFinanciablesModelo(String periodoCartera, String nroAcuerdo, Integer ano, String concepto,
			Integer cuota, String fecha, String codigoCatastral, Float vlrCuota, Float vlrActual, Float vlrAnterior,
			Float vlrExpirada, Float vlrDeuda, Float vlrSaldo, Integer saldoCuotas, String periodo, boolean indPago,
			String f_Pago, String comprobante, Integer anoBanco, String banco, String f_Vencimiento, Float abonoDeuda,
			Float saldoDeuda, Float vlrInteres, Float intCuota, Float totalInteres, Float saldoInteres,
			Float totalDeuda, Integer paquete, Float abonoInteres, Float deudaInteres, String anoinicial,
			String anofinal, boolean indIncumplido, String codUnicoCatastral, Float vlrCAR_Contrib,
			Float vlrIntCAR_Contrib, Integer id_CAR_PagoFinanciables) {
		super();
		PeriodoCartera = periodoCartera;
		NroAcuerdo = nroAcuerdo;
		Ano = ano;
		Concepto = concepto;
		Cuota = cuota;
		Fecha = fecha;
		CodigoCatastral = codigoCatastral;
		VlrCuota = vlrCuota;
		VlrActual = vlrActual;
		VlrAnterior = vlrAnterior;
		VlrExpirada = vlrExpirada;
		VlrDeuda = vlrDeuda;
		VlrSaldo = vlrSaldo;
		SaldoCuotas = saldoCuotas;
		Periodo = periodo;
		IndPago = indPago;
		F_Pago = f_Pago;
		Comprobante = comprobante;
		AnoBanco = anoBanco;
		Banco = banco;
		F_Vencimiento = f_Vencimiento;
		AbonoDeuda = abonoDeuda;
		SaldoDeuda = saldoDeuda;
		VlrInteres = vlrInteres;
		IntCuota = intCuota;
		TotalInteres = totalInteres;
		SaldoInteres = saldoInteres;
		TotalDeuda = totalDeuda;
		Paquete = paquete;
		AbonoInteres = abonoInteres;
		DeudaInteres = deudaInteres;
		this.anoinicial = anoinicial;
		this.anofinal = anofinal;
		this.indIncumplido = indIncumplido;
		CodUnicoCatastral = codUnicoCatastral;
		VlrCAR_Contrib = vlrCAR_Contrib;
		VlrIntCAR_Contrib = vlrIntCAR_Contrib;
		Id_CAR_PagoFinanciables = id_CAR_PagoFinanciables;
	}

	public String getPeriodoCartera() {
		return PeriodoCartera;
	}

	public void setPeriodoCartera(String periodoCartera) {
		PeriodoCartera = periodoCartera;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public Integer getCuota() {
		return Cuota;
	}

	public void setCuota(Integer cuota) {
		Cuota = cuota;
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

	public Float getVlrCuota() {
		return VlrCuota;
	}

	public void setVlrCuota(Float vlrCuota) {
		VlrCuota = vlrCuota;
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

	public Float getVlrDeuda() {
		return VlrDeuda;
	}

	public void setVlrDeuda(Float vlrDeuda) {
		VlrDeuda = vlrDeuda;
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

	public boolean isIndPago() {
		return IndPago;
	}

	public void setIndPago(boolean indPago) {
		IndPago = indPago;
	}

	public String getF_Pago() {
		return F_Pago;
	}

	public void setF_Pago(String f_Pago) {
		F_Pago = f_Pago;
	}

	public String getComprobante() {
		return Comprobante;
	}

	public void setComprobante(String comprobante) {
		Comprobante = comprobante;
	}

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getF_Vencimiento() {
		return F_Vencimiento;
	}

	public void setF_Vencimiento(String f_Vencimiento) {
		F_Vencimiento = f_Vencimiento;
	}

	public Float getAbonoDeuda() {
		return AbonoDeuda;
	}

	public void setAbonoDeuda(Float abonoDeuda) {
		AbonoDeuda = abonoDeuda;
	}

	public Float getSaldoDeuda() {
		return SaldoDeuda;
	}

	public void setSaldoDeuda(Float saldoDeuda) {
		SaldoDeuda = saldoDeuda;
	}

	public Float getVlrInteres() {
		return VlrInteres;
	}

	public void setVlrInteres(Float vlrInteres) {
		VlrInteres = vlrInteres;
	}

	public Float getIntCuota() {
		return IntCuota;
	}

	public void setIntCuota(Float intCuota) {
		IntCuota = intCuota;
	}

	public Float getTotalInteres() {
		return TotalInteres;
	}

	public void setTotalInteres(Float totalInteres) {
		TotalInteres = totalInteres;
	}

	public Float getSaldoInteres() {
		return SaldoInteres;
	}

	public void setSaldoInteres(Float saldoInteres) {
		SaldoInteres = saldoInteres;
	}

	public Float getTotalDeuda() {
		return TotalDeuda;
	}

	public void setTotalDeuda(Float totalDeuda) {
		TotalDeuda = totalDeuda;
	}

	public Integer getPaquete() {
		return Paquete;
	}

	public void setPaquete(Integer paquete) {
		Paquete = paquete;
	}

	public Float getAbonoInteres() {
		return AbonoInteres;
	}

	public void setAbonoInteres(Float abonoInteres) {
		AbonoInteres = abonoInteres;
	}

	public Float getDeudaInteres() {
		return DeudaInteres;
	}

	public void setDeudaInteres(Float deudaInteres) {
		DeudaInteres = deudaInteres;
	}

	public String getAnoinicial() {
		return anoinicial;
	}

	public void setAnoinicial(String anoinicial) {
		this.anoinicial = anoinicial;
	}

	public String getAnofinal() {
		return anofinal;
	}

	public void setAnofinal(String anofinal) {
		this.anofinal = anofinal;
	}

	public boolean isIndIncumplido() {
		return indIncumplido;
	}

	public void setIndIncumplido(boolean indIncumplido) {
		this.indIncumplido = indIncumplido;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
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

	public Integer getId_CAR_PagoFinanciables() {
		return Id_CAR_PagoFinanciables;
	}

	public void setId_CAR_PagoFinanciables(Integer id_CAR_PagoFinanciables) {
		Id_CAR_PagoFinanciables = id_CAR_PagoFinanciables;
	}
    
}
