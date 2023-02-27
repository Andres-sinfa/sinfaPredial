package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class FinanciablesModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    @NotNull(update = false)
    private String NroAcuerdo;
    @DateFormat
    @FormParam("Fecha")
    @NotNull
    private String Fecha;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull
    private String CodigoCatastral;
    @FormParam("VlrDeuda")
    private float   VlrDeuda;
    @Size(since = -32768, until = 32767)
    @FormParam("Cuotas")
    private Integer Cuotas;
    @FormParam("VlrCuota")
    private float   VlrCuota;
    @FormParam("VlrSaldo")
    private float   VlrSaldo;
    @Size(since = -32768, until = 32767)
    @FormParam("SaldoCuotas")
    private Integer SaldoCuotas;
    @Size(since = 0 , until = 1)
    @FormParam("Periodo")
    private String Periodo;
    @Size(since = 0 , until = 10)
    @FormParam("Comprobante")
    private String Comprobante;
    @DateFormat
    @FormParam("F_Comprobante")
    private String F_Comprobante;
    @FormParam("IndIguales")
    private boolean IndIguales;
    @FormParam("IndPago")
    private boolean IndPago;
    @FormParam("IndAnulado")
    private boolean IndAnulado;
    @FormParam("UltimoAno")
    private Integer UltimoAno;
    @FormParam("PorInteres")
    private float   PorInteres;
    @NotNull
    @Size(since = 0 , until = 1)
    @FormParam("Metodo")
    private String Metodo;
    @FormParam("PorCuotaInicial")
    private float   PorCuotaInicial;
    @FormParam("IndCuotaFinMes")
    private boolean IndCuotaFinMes;
    @Size(since = 0 , until = 1000)
    @FormParam("Notas")
    private String Notas;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("Estado")
    private String Estado;
    @FormParam("IndBDME")
    private boolean IndBDME;
    @FormParam("IndCapInicial")
    private boolean IndCapInicial;
    @Size(since = 0 , until = 20)
    @FormParam("NumeroInterno")
    private String NumeroInterno;
    @FormParam("IndDiario")
    private boolean IndDiario;
    @FormParam("IndIntPrimeraCuota")
    private boolean IndIntPrimeraCuota;
    @FormParam("IndIntCapital")
    private boolean IndIntCapital;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 2)
    @FormParam("Alivio")
    private String Alivio;
    @FormParam("IndContribCAR")
    private boolean IndContribCAR;
    @Size(since = 0 , until = 50)
    @FormParam("NitDeudor")
    private String NitDeudor;
    @Size(since = 0 , until = 100)
    @FormParam("NombreDeudor")
    private String NombreDeudor;
    @Size(since = 0 , until = 100)
    @FormParam("DireccionDeudor")
    private String DireccionDeudor;
    @Size(since = 0 , until = 50)
    @FormParam("emailDeudor")
    private String emailDeudor;
    @Size(since = 0 , until = 50)
    @FormParam("TelefonoDeudor")
    private String TelefonoDeudor;
    @Size(since = 0 , until = 3)
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 3)
    @FormParam("rango")
    private String rango;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @FormParam("telefonoCelular")
    private Long telefonoCelular;
    
    private Integer Id_Financiables;

	public FinanciablesModelo() {
		super();
	}

	public FinanciablesModelo(Integer ano, String nroAcuerdo, String fecha, String codigoCatastral, float vlrDeuda,
			Integer cuotas, float vlrCuota, float vlrSaldo, Integer saldoCuotas, String periodo, String comprobante,
			String f_Comprobante, boolean indIguales, boolean indPago, boolean indAnulado, Integer ultimoAno,
			float porInteres, String metodo, float porCuotaInicial, boolean indCuotaFinMes, String notas, String estado,
			boolean indBDME, boolean indCapInicial, String numeroInterno, boolean indDiario, boolean indIntPrimeraCuota,
			boolean indIntCapital, String codUnicoCatastral, String alivio, boolean indContribCAR, String nitDeudor,
			String nombreDeudor, String direccionDeudor, String emailDeudor, String telefonoDeudor, String tarifa,
			String rango, String fechaCreacion, Long telefonoCelular, Integer id_Financiables) {
		super();
		Ano = ano;
		NroAcuerdo = nroAcuerdo;
		Fecha = fecha;
		CodigoCatastral = codigoCatastral;
		VlrDeuda = vlrDeuda;
		Cuotas = cuotas;
		VlrCuota = vlrCuota;
		VlrSaldo = vlrSaldo;
		SaldoCuotas = saldoCuotas;
		Periodo = periodo;
		Comprobante = comprobante;
		F_Comprobante = f_Comprobante;
		IndIguales = indIguales;
		IndPago = indPago;
		IndAnulado = indAnulado;
		UltimoAno = ultimoAno;
		PorInteres = porInteres;
		Metodo = metodo;
		PorCuotaInicial = porCuotaInicial;
		IndCuotaFinMes = indCuotaFinMes;
		Notas = notas;
		Estado = estado;
		IndBDME = indBDME;
		IndCapInicial = indCapInicial;
		NumeroInterno = numeroInterno;
		IndDiario = indDiario;
		IndIntPrimeraCuota = indIntPrimeraCuota;
		IndIntCapital = indIntCapital;
		CodUnicoCatastral = codUnicoCatastral;
		Alivio = alivio;
		IndContribCAR = indContribCAR;
		NitDeudor = nitDeudor;
		NombreDeudor = nombreDeudor;
		DireccionDeudor = direccionDeudor;
		this.emailDeudor = emailDeudor;
		TelefonoDeudor = telefonoDeudor;
		this.tarifa = tarifa;
		this.rango = rango;
		this.fechaCreacion = fechaCreacion;
		this.telefonoCelular = telefonoCelular;
		Id_Financiables = id_Financiables;
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

	public float getVlrDeuda() {
		return VlrDeuda;
	}

	public void setVlrDeuda(float vlrDeuda) {
		VlrDeuda = vlrDeuda;
	}

	public Integer getCuotas() {
		return Cuotas;
	}

	public void setCuotas(Integer cuotas) {
		Cuotas = cuotas;
	}

	public float getVlrCuota() {
		return VlrCuota;
	}

	public void setVlrCuota(float vlrCuota) {
		VlrCuota = vlrCuota;
	}

	public float getVlrSaldo() {
		return VlrSaldo;
	}

	public void setVlrSaldo(float vlrSaldo) {
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

	public String getComprobante() {
		return Comprobante;
	}

	public void setComprobante(String comprobante) {
		Comprobante = comprobante;
	}

	public String getF_Comprobante() {
		return F_Comprobante;
	}

	public void setF_Comprobante(String f_Comprobante) {
		F_Comprobante = f_Comprobante;
	}

	public boolean isIndIguales() {
		return IndIguales;
	}

	public void setIndIguales(boolean indIguales) {
		IndIguales = indIguales;
	}

	public boolean isIndPago() {
		return IndPago;
	}

	public void setIndPago(boolean indPago) {
		IndPago = indPago;
	}

	public boolean isIndAnulado() {
		return IndAnulado;
	}

	public void setIndAnulado(boolean indAnulado) {
		IndAnulado = indAnulado;
	}

	public Integer getUltimoAno() {
		return UltimoAno;
	}

	public void setUltimoAno(Integer ultimoAno) {
		UltimoAno = ultimoAno;
	}

	public float getPorInteres() {
		return PorInteres;
	}

	public void setPorInteres(float porInteres) {
		PorInteres = porInteres;
	}

	public String getMetodo() {
		return Metodo;
	}

	public void setMetodo(String metodo) {
		Metodo = metodo;
	}

	public float getPorCuotaInicial() {
		return PorCuotaInicial;
	}

	public void setPorCuotaInicial(float porCuotaInicial) {
		PorCuotaInicial = porCuotaInicial;
	}

	public boolean isIndCuotaFinMes() {
		return IndCuotaFinMes;
	}

	public void setIndCuotaFinMes(boolean indCuotaFinMes) {
		IndCuotaFinMes = indCuotaFinMes;
	}

	public String getNotas() {
		return Notas;
	}

	public void setNotas(String notas) {
		Notas = notas;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public boolean isIndBDME() {
		return IndBDME;
	}

	public void setIndBDME(boolean indBDME) {
		IndBDME = indBDME;
	}

	public boolean isIndCapInicial() {
		return IndCapInicial;
	}

	public void setIndCapInicial(boolean indCapInicial) {
		IndCapInicial = indCapInicial;
	}

	public String getNumeroInterno() {
		return NumeroInterno;
	}

	public void setNumeroInterno(String numeroInterno) {
		NumeroInterno = numeroInterno;
	}

	public boolean isIndDiario() {
		return IndDiario;
	}

	public void setIndDiario(boolean indDiario) {
		IndDiario = indDiario;
	}

	public boolean isIndIntPrimeraCuota() {
		return IndIntPrimeraCuota;
	}

	public void setIndIntPrimeraCuota(boolean indIntPrimeraCuota) {
		IndIntPrimeraCuota = indIntPrimeraCuota;
	}

	public boolean isIndIntCapital() {
		return IndIntCapital;
	}

	public void setIndIntCapital(boolean indIntCapital) {
		IndIntCapital = indIntCapital;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getAlivio() {
		return Alivio;
	}

	public void setAlivio(String alivio) {
		Alivio = alivio;
	}

	public boolean isIndContribCAR() {
		return IndContribCAR;
	}

	public void setIndContribCAR(boolean indContribCAR) {
		IndContribCAR = indContribCAR;
	}

	public String getNitDeudor() {
		return NitDeudor;
	}

	public void setNitDeudor(String nitDeudor) {
		NitDeudor = nitDeudor;
	}

	public String getNombreDeudor() {
		return NombreDeudor;
	}

	public void setNombreDeudor(String nombreDeudor) {
		NombreDeudor = nombreDeudor;
	}

	public String getDireccionDeudor() {
		return DireccionDeudor;
	}

	public void setDireccionDeudor(String direccionDeudor) {
		DireccionDeudor = direccionDeudor;
	}

	public String getEmailDeudor() {
		return emailDeudor;
	}

	public void setEmailDeudor(String emailDeudor) {
		this.emailDeudor = emailDeudor;
	}

	public String getTelefonoDeudor() {
		return TelefonoDeudor;
	}

	public void setTelefonoDeudor(String telefonoDeudor) {
		TelefonoDeudor = telefonoDeudor;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Long getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(Long telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public Integer getId_Financiables() {
		return Id_Financiables;
	}

	public void setId_Financiables(Integer id_Financiables) {
		Id_Financiables = id_Financiables;
	}
    
}
