package com.predial.modelo;

import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;

import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class AbonosPredialModelo {
	@Size(since = 0 , until = 30)
    @NotNull(update = false)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @NotNull(update = false)
    @FormParam("Cuota")
    private Integer Cuota;
    @NotNull(update = false)
    @FormParam("Numero")
    private Integer Numero;
    @FormParam("VlrImpuesto")
    private Float VlrImpuesto;
    @FormParam("VlrInteres")
    private Float VlrInteres;
    @FormParam("VlrDescuento")
    private Float VlrDescuento;
    @FormParam("VlrSobretasa")
    private Float VlrSobretasa;
    @FormParam("VlrCAR")
    private Float VlrCAR;
    @FormParam("VlrInteresCar")
    private Float VlrInteresCar;
    @FormParam("VlrCredito")
    private Float VlrCredito;
    @FormParam("VlrCreditoCAR")
    private Float VlrCreditoCAR;
    @FormParam("ajuste")
    private Float ajuste;
    @FormParam("IndPago")
    private boolean IndPago;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String  NroComprobante;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String  Banco;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("Paquete")
    private Integer Paquete;
    @Size(since = 0 , until = 30)
    @FormParam("UsuarioRegistroPago")
    private String  UsuarioRegistroPago;
    @FormParam("VlrOtros")
    private Float VlrOtros;
    @FormParam("Ind_Declaracion")
    private boolean Ind_Declaracion;
    @Size(since = 0 , until = 100)
    @FormParam("EquipoRegistro")
    private String  EquipoRegistro;
    @NotNull
    @FormParam("vlrSaldoInteresImp")
    private Float vlrSaldoInteresImp;
    @NotNull
    @FormParam("vlrsaldoInteresCar")
    private Float vlrsaldoInteresCar;
    @Size(since = 0 , until = 10)
    @NotNull
    @FormParam("VlrCar_Contrib")
    private Float VlrCar_Contrib;
    @NotNull
    @FormParam("VlrIntCAR_Contrib")
    private Float VlrIntCAR_Contrib;
    @NotNull
    @FormParam("DescuentoIntereses")
    private Float DescuentoIntereses;
    @NotNull
    @FormParam("VlrAbonos")
    private Float VlrAbonos;
    @NotNull
    @FormParam("DescuentoInteres")
    private Float DescuentoInteres;
    @FormParam("Avaluo")
    private Float Avaluo;
    @DateFormat
    @FormParam("F_presentacion")
    private String F_presentacion;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String  CodUnicoCatastral;
    @Size(since = 0 , until = 3)
    @FormParam("Tarifa")
    private String  Tarifa;
    @Size(since = 0 , until = 3)
    @FormParam("rango")
    private String  rango;
    @Size(since = 0 , until = 2)
    @FormParam("numEstrato")
    private String  numEstrato;
    @FormParam("AC_vlrDctoPredial")
    private Float AC_vlrDctoPredial;
    @FormParam("AC_vlrDctoIntImp")
    private Float AC_vlrDctoIntImp;
    @FormParam("AC_vlrDctoCAR")
    private Float AC_vlrDctoCAR;
    @FormParam("AC_vlrDctoIntCAR")
    private Float AC_vlrDctoIntCAR;
    @FormParam("origenRegistroPago")
    private boolean origenRegistroPago;
    @Size(since = 0 , until = 20)
    @FormParam("NroConsignacion")
    private String  NroConsignacion;
    @DateFormat
    @FormParam("FechaConsignacion")
    private String FechaConsignacion;
    @Size(since = 0 , until = 20)
    @FormParam("BancoConsignacion")
    private String  BancoConsignacion;

    private Integer Id_AbonosPredial;

	public AbonosPredialModelo(String codigoCatastral, Integer ano, Integer cuota, Integer numero, Float vlrImpuesto,
			Float vlrInteres, Float vlrDescuento, Float vlrSobretasa, Float vlrCAR, Float vlrInteresCar,
			Float vlrCredito, Float vlrCreditoCAR, Float ajuste, boolean indPago, String f_Pago, String nroComprobante,
			String banco, Integer anoBanco, Integer paquete, String usuarioRegistroPago, Float vlrOtros,
			boolean ind_Declaracion, String equipoRegistro, Float vlrSaldoInteresImp, Float vlrsaldoInteresCar,
			Float vlrCar_Contrib, Float vlrIntCAR_Contrib, Float descuentoIntereses, Float vlrAbonos,
			Float descuentoInteres, Float avaluo, String f_presentacion, String codUnicoCatastral, String tarifa,
			String rango, String numEstrato, Float aC_vlrDctoPredial, Float aC_vlrDctoIntImp, Float aC_vlrDctoCAR,
			Float aC_vlrDctoIntCAR, boolean origenRegistroPago, String nroConsignacion, String fechaConsignacion,
			String bancoConsignacion, Integer id_AbonosPredial) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Cuota = cuota;
		Numero = numero;
		VlrImpuesto = vlrImpuesto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		VlrSobretasa = vlrSobretasa;
		VlrCAR = vlrCAR;
		VlrInteresCar = vlrInteresCar;
		VlrCredito = vlrCredito;
		VlrCreditoCAR = vlrCreditoCAR;
		this.ajuste = ajuste;
		IndPago = indPago;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		Banco = banco;
		AnoBanco = anoBanco;
		Paquete = paquete;
		UsuarioRegistroPago = usuarioRegistroPago;
		VlrOtros = vlrOtros;
		Ind_Declaracion = ind_Declaracion;
		EquipoRegistro = equipoRegistro;
		this.vlrSaldoInteresImp = vlrSaldoInteresImp;
		this.vlrsaldoInteresCar = vlrsaldoInteresCar;
		VlrCar_Contrib = vlrCar_Contrib;
		VlrIntCAR_Contrib = vlrIntCAR_Contrib;
		DescuentoIntereses = descuentoIntereses;
		VlrAbonos = vlrAbonos;
		DescuentoInteres = descuentoInteres;
		Avaluo = avaluo;
		F_presentacion = f_presentacion;
		CodUnicoCatastral = codUnicoCatastral;
		Tarifa = tarifa;
		this.rango = rango;
		this.numEstrato = numEstrato;
		AC_vlrDctoPredial = aC_vlrDctoPredial;
		AC_vlrDctoIntImp = aC_vlrDctoIntImp;
		AC_vlrDctoCAR = aC_vlrDctoCAR;
		AC_vlrDctoIntCAR = aC_vlrDctoIntCAR;
		this.origenRegistroPago = origenRegistroPago;
		NroConsignacion = nroConsignacion;
		FechaConsignacion = fechaConsignacion;
		BancoConsignacion = bancoConsignacion;
		Id_AbonosPredial = id_AbonosPredial;
	}

	public AbonosPredialModelo() {
		super();
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getCuota() {
		return Cuota;
	}

	public void setCuota(Integer cuota) {
		Cuota = cuota;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public Float getVlrImpuesto() {
		return VlrImpuesto;
	}

	public void setVlrImpuesto(Float vlrImpuesto) {
		VlrImpuesto = vlrImpuesto;
	}

	public Float getVlrInteres() {
		return VlrInteres;
	}

	public void setVlrInteres(Float vlrInteres) {
		VlrInteres = vlrInteres;
	}

	public Float getVlrDescuento() {
		return VlrDescuento;
	}

	public void setVlrDescuento(Float vlrDescuento) {
		VlrDescuento = vlrDescuento;
	}

	public Float getVlrSobretasa() {
		return VlrSobretasa;
	}

	public void setVlrSobretasa(Float vlrSobretasa) {
		VlrSobretasa = vlrSobretasa;
	}

	public Float getVlrCAR() {
		return VlrCAR;
	}

	public void setVlrCAR(Float vlrCAR) {
		VlrCAR = vlrCAR;
	}

	public Float getVlrInteresCar() {
		return VlrInteresCar;
	}

	public void setVlrInteresCar(Float vlrInteresCar) {
		VlrInteresCar = vlrInteresCar;
	}

	public Float getVlrCredito() {
		return VlrCredito;
	}

	public void setVlrCredito(Float vlrCredito) {
		VlrCredito = vlrCredito;
	}

	public Float getVlrCreditoCAR() {
		return VlrCreditoCAR;
	}

	public void setVlrCreditoCAR(Float vlrCreditoCAR) {
		VlrCreditoCAR = vlrCreditoCAR;
	}

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
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

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public Integer getPaquete() {
		return Paquete;
	}

	public void setPaquete(Integer paquete) {
		Paquete = paquete;
	}

	public String getUsuarioRegistroPago() {
		return UsuarioRegistroPago;
	}

	public void setUsuarioRegistroPago(String usuarioRegistroPago) {
		UsuarioRegistroPago = usuarioRegistroPago;
	}

	public Float getVlrOtros() {
		return VlrOtros;
	}

	public void setVlrOtros(Float vlrOtros) {
		VlrOtros = vlrOtros;
	}

	public boolean isInd_Declaracion() {
		return Ind_Declaracion;
	}

	public void setInd_Declaracion(boolean ind_Declaracion) {
		Ind_Declaracion = ind_Declaracion;
	}

	public String getEquipoRegistro() {
		return EquipoRegistro;
	}

	public void setEquipoRegistro(String equipoRegistro) {
		EquipoRegistro = equipoRegistro;
	}

	public Float getVlrSaldoInteresImp() {
		return vlrSaldoInteresImp;
	}

	public void setVlrSaldoInteresImp(Float vlrSaldoInteresImp) {
		this.vlrSaldoInteresImp = vlrSaldoInteresImp;
	}

	public Float getVlrsaldoInteresCar() {
		return vlrsaldoInteresCar;
	}

	public void setVlrsaldoInteresCar(Float vlrsaldoInteresCar) {
		this.vlrsaldoInteresCar = vlrsaldoInteresCar;
	}

	public Float getVlrCar_Contrib() {
		return VlrCar_Contrib;
	}

	public void setVlrCar_Contrib(Float vlrCar_Contrib) {
		VlrCar_Contrib = vlrCar_Contrib;
	}

	public Float getVlrIntCAR_Contrib() {
		return VlrIntCAR_Contrib;
	}

	public void setVlrIntCAR_Contrib(Float vlrIntCAR_Contrib) {
		VlrIntCAR_Contrib = vlrIntCAR_Contrib;
	}

	public Float getDescuentoIntereses() {
		return DescuentoIntereses;
	}

	public void setDescuentoIntereses(Float descuentoIntereses) {
		DescuentoIntereses = descuentoIntereses;
	}

	public Float getVlrAbonos() {
		return VlrAbonos;
	}

	public void setVlrAbonos(Float vlrAbonos) {
		VlrAbonos = vlrAbonos;
	}

	public Float getDescuentoInteres() {
		return DescuentoInteres;
	}

	public void setDescuentoInteres(Float descuentoInteres) {
		DescuentoInteres = descuentoInteres;
	}

	public Float getAvaluo() {
		return Avaluo;
	}

	public void setAvaluo(Float avaluo) {
		Avaluo = avaluo;
	}

	public String getF_presentacion() {
		return F_presentacion;
	}

	public void setF_presentacion(String f_presentacion) {
		F_presentacion = f_presentacion;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getTarifa() {
		return Tarifa;
	}

	public void setTarifa(String tarifa) {
		Tarifa = tarifa;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public String getNumEstrato() {
		return numEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		this.numEstrato = numEstrato;
	}

	public Float getAC_vlrDctoPredial() {
		return AC_vlrDctoPredial;
	}

	public void setAC_vlrDctoPredial(Float aC_vlrDctoPredial) {
		AC_vlrDctoPredial = aC_vlrDctoPredial;
	}

	public Float getAC_vlrDctoIntImp() {
		return AC_vlrDctoIntImp;
	}

	public void setAC_vlrDctoIntImp(Float aC_vlrDctoIntImp) {
		AC_vlrDctoIntImp = aC_vlrDctoIntImp;
	}

	public Float getAC_vlrDctoCAR() {
		return AC_vlrDctoCAR;
	}

	public void setAC_vlrDctoCAR(Float aC_vlrDctoCAR) {
		AC_vlrDctoCAR = aC_vlrDctoCAR;
	}

	public Float getAC_vlrDctoIntCAR() {
		return AC_vlrDctoIntCAR;
	}

	public void setAC_vlrDctoIntCAR(Float aC_vlrDctoIntCAR) {
		AC_vlrDctoIntCAR = aC_vlrDctoIntCAR;
	}

	public boolean isOrigenRegistroPago() {
		return origenRegistroPago;
	}

	public void setOrigenRegistroPago(boolean origenRegistroPago) {
		this.origenRegistroPago = origenRegistroPago;
	}

	public String getNroConsignacion() {
		return NroConsignacion;
	}

	public void setNroConsignacion(String nroConsignacion) {
		NroConsignacion = nroConsignacion;
	}

	public String getFechaConsignacion() {
		return FechaConsignacion;
	}

	public void setFechaConsignacion(String fechaConsignacion) {
		FechaConsignacion = fechaConsignacion;
	}

	public String getBancoConsignacion() {
		return BancoConsignacion;
	}

	public void setBancoConsignacion(String bancoConsignacion) {
		BancoConsignacion = bancoConsignacion;
	}

	public Integer getId_AbonosPredial() {
		return Id_AbonosPredial;
	}

	public void setId_AbonosPredial(Integer id_AbonosPredial) {
		Id_AbonosPredial = id_AbonosPredial;
	}
    
}
