package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class AvaluosModelo {
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
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    private String Rango;
    @FormParam("Avaluo")
    private Float Avaluo;
    @FormParam("IndManual")
    private boolean IndManual;
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
    @FormParam("IndPago")
    private boolean IndPago;
    @FormParam("IndCalculo")
    private boolean IndCalculo;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @DateFormat
    @FormParam("F_Credito")
    private String F_Credito;
    @Size(since = 0 , until = 10)
    @FormParam("ComprobanteCredito")
    private String ComprobanteCredito;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @Size(since = 0 , until = 20)
    @FormParam("Resolucion")
    private String Resolucion;
    @DateFormat
    @FormParam("F_Resolucion")
    private String F_Resolucion;
    @FormParam("IndResolucion")
    private boolean IndResolucion;
    @FormParam("DtoAdicional")
    private Integer DtoAdicional;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("Paquete")
    private Integer Paquete;
    @Size(since = 0 , until = 2)
    @FormParam("TipoPago")
    private String TipoPago;
    @FormParam("ajuste")
    private Float ajuste;
    @FormParam("AreaHectareas")
    private Float AreaHectareas;
    @FormParam("AreaMetros")
    private Float AreaMetros;
    @FormParam("AreaConstruida")
    private Float AreaConstruida;
    @FormParam("VlrCreditoCAR")
    private Float VlrCreditoCAR;
    @Size(since = 0 , until = 20)
    @FormParam("UsuarioRegistroPago")
    private String UsuarioRegistroPago;
    @Size(since = 0 , until = 1)
    @FormParam("Estado")
    private String Estado;
    @FormParam("VlrOtros")
    private Float VlrOtros;
    @FormParam("AbVlrSobretasa")
    private Float AbVlrSobretasa;
    @FormParam("vlrDctoLey1066otros")
    private Float vlrDctoLey1066otros;
    @DateFormat
    @FormParam("F_Declaracion")
    private String F_Declaracion;
    @Size(since = 0 , until = 1)
    @FormParam("PagoParcial")
    private String PagoParcial;
    @FormParam("VlrAbonos")
    private Float VlrAbonos;
    @FormParam("AvaluoAnual")
    private Float AvaluoAnual;
    @Size(since = 0 , until = 100)
    @FormParam("EquipoRegistro")
    private String EquipoRegistro;
    @DateFormat
    @FormParam("FechaRegistro")
    private String FechaRegistro;
    @FormParam("abVlrImpuesto")
    private Float abVlrImpuesto;
    @FormParam("abVlrCAR")
    private Float abVlrCAR;
    @FormParam("abVlrInteres")
    private Float abVlrInteres;
    @FormParam("abVlrIntCAR")
    private Float abVlrIntCAR;
    @FormParam("abVlrOtros")
    private Float abVlrOtros;
    @FormParam("TotalVlrImpuesto")
    private Float TotalVlrImpuesto;
    @FormParam("TotalVlrCAR")
    private Float TotalVlrCAR;
    @FormParam("TotalVlrInteres")
    private Float TotalVlrInteres;
    @FormParam("TotalVlrIntCAR")
    private Float TotalVlrIntCAR;
    @FormParam("TotalVlrOtros")
    private Float TotalVlrOtros;
    @FormParam("TotalVlrSobretasa")
    private Float TotalVlrSobretasa;
    @FormParam("VlrDtoLey1066IMP")
    private Float VlrDtoLey1066IMP;
    @FormParam("VlrDtoLey1066CAR")
    private Float VlrDtoLey1066CAR;
    @FormParam("IndAcuerdoPago")
    private boolean IndAcuerdoPago;
    @DateFormat
    @FormParam("F_AcuerdoPago")
    private String F_AcuerdoPago;
    @FormParam("IndAnoUrbano")
    private boolean IndAnoUrbano;
    @FormParam("AutoAvaluo")
    private Float AutoAvaluo;
    @NotNull
    @FormParam("TarifaAdicional")
    private Float TarifaAdicional;
    @FormParam("IndCartera")
    private boolean IndCartera;
    @DateFormat
    @FormParam("F_cartera")
    private String F_cartera;
    @FormParam("DescuentoInteres")
    private Float DescuentoInteres;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @FormParam("AnoAcuerdo")
    private Float AnoAcuerdo;
    @FormParam("VlrCAR_Recaudo")
    private Float VlrCAR_Recaudo;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoAlivio")
    private Integer AnoAlivio;
    @Size(since = -32768, until = 32767)
    @FormParam("CodigoAlivio")
    private Integer CodigoAlivio;
    @Size(since = 0 , until = 10)
    @FormParam("NroAlivio")
    private String NroAlivio;
    @FormParam("AC_VlrDctoPredial")
    private Float AC_VlrDctoPredial;
    @FormParam("AC_VlrDctoIntImp")
    private Float AC_VlrDctoIntImp;
    @FormParam("AC_VlrDctoCAR")
    private Float AC_VlrDctoCAR;
    @FormParam("AC_VlrDctoIntCAR")
    private Float AC_VlrDctoIntCAR;
    @FormParam("VlrDescuento1")
    private Float VlrDescuento1;
    @FormParam("VlrDescuento2")
    private Float VlrDescuento2;
    @FormParam("VlrDescuento3")
    private Float VlrDescuento3;
    @FormParam("VlrDescuento4")
    private Float VlrDescuento4;
    @DateFormat
    @FormParam("f_ResDeudorMoroso")
    private String f_ResDeudorMoroso;
    @Size(since = 0 , until = 50)
    @FormParam("NroResDeudorMoroso")
    private String NroResDeudorMoroso;
    @NotNull
    @FormParam("VlrCar_Contrib")
    private Float VlrCar_Contrib;
    @NotNull
    @FormParam("VlrIntCar_Contrib")
    private Float VlrIntCar_Contrib;
    @NotNull
    @FormParam("VlrExcPredial")
    private Float VlrExcPredial;
    @FormParam("PorMaximo")
    private Float PorMaximo;
    @Size(since = 0 , until = 3)
    @FormParam("TarifaOtros")
    private String TarifaOtros;
    @Size(since = 0 , until = 3)
    @FormParam("RangoOtros")
    private String RangoOtros;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 2)
    @FormParam("PagoPSE")
    private String PagoPSE;
    @FormParam("avaluoIGAC")
    private Float avaluoIGAC;
    @FormParam("vlrAporteVol")
    private Float vlrAporteVol;
    @Size(since = 0 , until = 20)
    @FormParam("NroConsignacion")
    private String NroConsignacion;
    @DateFormat
    @FormParam("FechaConsignacion")
    private String FechaConsignacion;
    @Size(since = 0 , until = 20)
    @FormParam("BancoConsignacion")
    private String BancoConsignacion;
    @FormParam("IndMalDeclarado")
    private boolean IndMalDeclarado;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @Size(since = 0 , until = 3)
    @FormParam("tarifaCalculo")
    private String tarifaCalculo;
    @Size(since = 0 , until = 3)
    @FormParam("rangoCalculo")
    private String rangoCalculo;
    @FormParam("porTarifa")
    private Float porTarifa;
    @FormParam("GeneraCoactivo")
    private boolean GeneraCoactivo;
    @FormParam("aplicaAlivio")
    private boolean aplicaAlivio;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("Estadocartera")
    private String Estadocartera;
    @DateFormat
    @FormParam("FechaCoactivo")
    private String FechaCoactivo;
    @Size(since = 0 , until = 20)
    @FormParam("NroResCoactivo")
    private String NroResCoactivo;
    @Size(since = 0 , until = 300)
    @FormParam("Observaciones")
    private String Observaciones;
    @NotNull
    @FormParam("IdCoactivo")
    private Long IdCoactivo;
    @Size(since = 0 , until = 2)
    @FormParam("numEstrato")
    private String numEstrato;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCancelado")
    private String CodigoCancelado;
    @FormParam("BaseCar")
    private Float BaseCar;
    @FormParam("pagoPorCuotas")
    private Integer pagoPorCuotas;
    @FormParam("origenRegistroPago")
    private boolean origenRegistroPago;
    @DateFormat
    @FormParam("fechaLimitePagoAno")
    private String fechaLimitePagoAno;
    @NotNull
    @Size(since = 0 , until = 7)
    @FormParam("secuenciaPago")
    private String secuenciaPago;
    @FormParam("mod010_idPorMaximo")
    private Integer mod010_idPorMaximo;

    private Integer Id_Avaluos;

	public AvaluosModelo() {
		super();
	}

	public AvaluosModelo(String codigoCatastral, Integer ano, Integer cuota, String tarifa, String rango, Float avaluo,
			boolean indManual, Float vlrImpuesto, Float vlrInteres, Float vlrDescuento, Float vlrSobretasa,
			Float vlrCAR, Float vlrInteresCar, Float vlrCredito, boolean indPago, boolean indCalculo, String f_Pago,
			String nroComprobante, String f_Credito, String comprobanteCredito, String banco, String resolucion,
			String f_Resolucion, boolean indResolucion, Integer dtoAdicional, Integer anoBanco, Integer paquete,
			String tipoPago, Float ajuste, Float areaHectareas, Float areaMetros, Float areaConstruida,
			Float vlrCreditoCAR, String usuarioRegistroPago, String estado, Float vlrOtros, Float abVlrSobretasa,
			Float vlrDctoLey1066otros, String f_Declaracion, String pagoParcial, Float vlrAbonos, Float avaluoAnual,
			String equipoRegistro, String fechaRegistro, Float abVlrImpuesto, Float abVlrCAR, Float abVlrInteres,
			Float abVlrIntCAR, Float abVlrOtros, Float totalVlrImpuesto, Float totalVlrCAR, Float totalVlrInteres,
			Float totalVlrIntCAR, Float totalVlrOtros, Float totalVlrSobretasa, Float vlrDtoLey1066IMP,
			Float vlrDtoLey1066CAR, boolean indAcuerdoPago, String f_AcuerdoPago, boolean indAnoUrbano,
			Float autoAvaluo, Float tarifaAdicional, boolean indCartera, String f_cartera, Float descuentoInteres,
			String nroAcuerdo, Float anoAcuerdo, Float vlrCAR_Recaudo, Integer anoAlivio, Integer codigoAlivio,
			String nroAlivio, Float aC_VlrDctoPredial, Float aC_VlrDctoIntImp, Float aC_VlrDctoCAR,
			Float aC_VlrDctoIntCAR, Float vlrDescuento1, Float vlrDescuento2, Float vlrDescuento3, Float vlrDescuento4,
			String f_ResDeudorMoroso, String nroResDeudorMoroso, Float vlrCar_Contrib, Float vlrIntCar_Contrib,
			Float vlrExcPredial, Float porMaximo, String tarifaOtros, String rangoOtros, String codUnicoCatastral,
			String pagoPSE, Float avaluoIGAC, Float vlrAporteVol, String nroConsignacion, String fechaConsignacion,
			String bancoConsignacion, boolean indMalDeclarado, String fechaCreacion, String tarifaCalculo,
			String rangoCalculo, Float porTarifa, boolean generaCoactivo, boolean aplicaAlivio, String estadocartera,
			String fechaCoactivo, String nroResCoactivo, String observaciones, Long idCoactivo, String numEstrato,
			String codigoCancelado, Float baseCar, Integer pagoPorCuotas, boolean origenRegistroPago,
			String fechaLimitePagoAno, String secuenciaPago, Integer mod010_idPorMaximo, Integer id_Avaluos) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Cuota = cuota;
		Tarifa = tarifa;
		Rango = rango;
		Avaluo = avaluo;
		IndManual = indManual;
		VlrImpuesto = vlrImpuesto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		VlrSobretasa = vlrSobretasa;
		VlrCAR = vlrCAR;
		VlrInteresCar = vlrInteresCar;
		VlrCredito = vlrCredito;
		IndPago = indPago;
		IndCalculo = indCalculo;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		F_Credito = f_Credito;
		ComprobanteCredito = comprobanteCredito;
		Banco = banco;
		Resolucion = resolucion;
		F_Resolucion = f_Resolucion;
		IndResolucion = indResolucion;
		DtoAdicional = dtoAdicional;
		AnoBanco = anoBanco;
		Paquete = paquete;
		TipoPago = tipoPago;
		this.ajuste = ajuste;
		AreaHectareas = areaHectareas;
		AreaMetros = areaMetros;
		AreaConstruida = areaConstruida;
		VlrCreditoCAR = vlrCreditoCAR;
		UsuarioRegistroPago = usuarioRegistroPago;
		Estado = estado;
		VlrOtros = vlrOtros;
		AbVlrSobretasa = abVlrSobretasa;
		this.vlrDctoLey1066otros = vlrDctoLey1066otros;
		F_Declaracion = f_Declaracion;
		PagoParcial = pagoParcial;
		VlrAbonos = vlrAbonos;
		AvaluoAnual = avaluoAnual;
		EquipoRegistro = equipoRegistro;
		FechaRegistro = fechaRegistro;
		this.abVlrImpuesto = abVlrImpuesto;
		this.abVlrCAR = abVlrCAR;
		this.abVlrInteres = abVlrInteres;
		this.abVlrIntCAR = abVlrIntCAR;
		this.abVlrOtros = abVlrOtros;
		TotalVlrImpuesto = totalVlrImpuesto;
		TotalVlrCAR = totalVlrCAR;
		TotalVlrInteres = totalVlrInteres;
		TotalVlrIntCAR = totalVlrIntCAR;
		TotalVlrOtros = totalVlrOtros;
		TotalVlrSobretasa = totalVlrSobretasa;
		VlrDtoLey1066IMP = vlrDtoLey1066IMP;
		VlrDtoLey1066CAR = vlrDtoLey1066CAR;
		IndAcuerdoPago = indAcuerdoPago;
		F_AcuerdoPago = f_AcuerdoPago;
		IndAnoUrbano = indAnoUrbano;
		AutoAvaluo = autoAvaluo;
		TarifaAdicional = tarifaAdicional;
		IndCartera = indCartera;
		F_cartera = f_cartera;
		DescuentoInteres = descuentoInteres;
		NroAcuerdo = nroAcuerdo;
		AnoAcuerdo = anoAcuerdo;
		VlrCAR_Recaudo = vlrCAR_Recaudo;
		AnoAlivio = anoAlivio;
		CodigoAlivio = codigoAlivio;
		NroAlivio = nroAlivio;
		AC_VlrDctoPredial = aC_VlrDctoPredial;
		AC_VlrDctoIntImp = aC_VlrDctoIntImp;
		AC_VlrDctoCAR = aC_VlrDctoCAR;
		AC_VlrDctoIntCAR = aC_VlrDctoIntCAR;
		VlrDescuento1 = vlrDescuento1;
		VlrDescuento2 = vlrDescuento2;
		VlrDescuento3 = vlrDescuento3;
		VlrDescuento4 = vlrDescuento4;
		this.f_ResDeudorMoroso = f_ResDeudorMoroso;
		NroResDeudorMoroso = nroResDeudorMoroso;
		VlrCar_Contrib = vlrCar_Contrib;
		VlrIntCar_Contrib = vlrIntCar_Contrib;
		VlrExcPredial = vlrExcPredial;
		PorMaximo = porMaximo;
		TarifaOtros = tarifaOtros;
		RangoOtros = rangoOtros;
		CodUnicoCatastral = codUnicoCatastral;
		PagoPSE = pagoPSE;
		this.avaluoIGAC = avaluoIGAC;
		this.vlrAporteVol = vlrAporteVol;
		NroConsignacion = nroConsignacion;
		FechaConsignacion = fechaConsignacion;
		BancoConsignacion = bancoConsignacion;
		IndMalDeclarado = indMalDeclarado;
		this.fechaCreacion = fechaCreacion;
		this.tarifaCalculo = tarifaCalculo;
		this.rangoCalculo = rangoCalculo;
		this.porTarifa = porTarifa;
		GeneraCoactivo = generaCoactivo;
		this.aplicaAlivio = aplicaAlivio;
		Estadocartera = estadocartera;
		FechaCoactivo = fechaCoactivo;
		NroResCoactivo = nroResCoactivo;
		Observaciones = observaciones;
		IdCoactivo = idCoactivo;
		this.numEstrato = numEstrato;
		CodigoCancelado = codigoCancelado;
		BaseCar = baseCar;
		this.pagoPorCuotas = pagoPorCuotas;
		this.origenRegistroPago = origenRegistroPago;
		this.fechaLimitePagoAno = fechaLimitePagoAno;
		this.secuenciaPago = secuenciaPago;
		this.mod010_idPorMaximo = mod010_idPorMaximo;
		Id_Avaluos = id_Avaluos;
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

	public Float getAvaluo() {
		return Avaluo;
	}

	public void setAvaluo(Float avaluo) {
		Avaluo = avaluo;
	}

	public boolean isIndManual() {
		return IndManual;
	}

	public void setIndManual(boolean indManual) {
		IndManual = indManual;
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

	public boolean isIndPago() {
		return IndPago;
	}

	public void setIndPago(boolean indPago) {
		IndPago = indPago;
	}

	public boolean isIndCalculo() {
		return IndCalculo;
	}

	public void setIndCalculo(boolean indCalculo) {
		IndCalculo = indCalculo;
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

	public String getF_Credito() {
		return F_Credito;
	}

	public void setF_Credito(String f_Credito) {
		F_Credito = f_Credito;
	}

	public String getComprobanteCredito() {
		return ComprobanteCredito;
	}

	public void setComprobanteCredito(String comprobanteCredito) {
		ComprobanteCredito = comprobanteCredito;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getF_Resolucion() {
		return F_Resolucion;
	}

	public void setF_Resolucion(String f_Resolucion) {
		F_Resolucion = f_Resolucion;
	}

	public boolean isIndResolucion() {
		return IndResolucion;
	}

	public void setIndResolucion(boolean indResolucion) {
		IndResolucion = indResolucion;
	}

	public Integer getDtoAdicional() {
		return DtoAdicional;
	}

	public void setDtoAdicional(Integer dtoAdicional) {
		DtoAdicional = dtoAdicional;
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

	public String getTipoPago() {
		return TipoPago;
	}

	public void setTipoPago(String tipoPago) {
		TipoPago = tipoPago;
	}

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
	}

	public Float getAreaHectareas() {
		return AreaHectareas;
	}

	public void setAreaHectareas(Float areaHectareas) {
		AreaHectareas = areaHectareas;
	}

	public Float getAreaMetros() {
		return AreaMetros;
	}

	public void setAreaMetros(Float areaMetros) {
		AreaMetros = areaMetros;
	}

	public Float getAreaConstruida() {
		return AreaConstruida;
	}

	public void setAreaConstruida(Float areaConstruida) {
		AreaConstruida = areaConstruida;
	}

	public Float getVlrCreditoCAR() {
		return VlrCreditoCAR;
	}

	public void setVlrCreditoCAR(Float vlrCreditoCAR) {
		VlrCreditoCAR = vlrCreditoCAR;
	}

	public String getUsuarioRegistroPago() {
		return UsuarioRegistroPago;
	}

	public void setUsuarioRegistroPago(String usuarioRegistroPago) {
		UsuarioRegistroPago = usuarioRegistroPago;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Float getVlrOtros() {
		return VlrOtros;
	}

	public void setVlrOtros(Float vlrOtros) {
		VlrOtros = vlrOtros;
	}

	public Float getAbVlrSobretasa() {
		return AbVlrSobretasa;
	}

	public void setAbVlrSobretasa(Float abVlrSobretasa) {
		AbVlrSobretasa = abVlrSobretasa;
	}

	public Float getVlrDctoLey1066otros() {
		return vlrDctoLey1066otros;
	}

	public void setVlrDctoLey1066otros(Float vlrDctoLey1066otros) {
		this.vlrDctoLey1066otros = vlrDctoLey1066otros;
	}

	public String getF_Declaracion() {
		return F_Declaracion;
	}

	public void setF_Declaracion(String f_Declaracion) {
		F_Declaracion = f_Declaracion;
	}

	public String getPagoParcial() {
		return PagoParcial;
	}

	public void setPagoParcial(String pagoParcial) {
		PagoParcial = pagoParcial;
	}

	public Float getVlrAbonos() {
		return VlrAbonos;
	}

	public void setVlrAbonos(Float vlrAbonos) {
		VlrAbonos = vlrAbonos;
	}

	public Float getAvaluoAnual() {
		return AvaluoAnual;
	}

	public void setAvaluoAnual(Float avaluoAnual) {
		AvaluoAnual = avaluoAnual;
	}

	public String getEquipoRegistro() {
		return EquipoRegistro;
	}

	public void setEquipoRegistro(String equipoRegistro) {
		EquipoRegistro = equipoRegistro;
	}

	public String getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	public Float getAbVlrImpuesto() {
		return abVlrImpuesto;
	}

	public void setAbVlrImpuesto(Float abVlrImpuesto) {
		this.abVlrImpuesto = abVlrImpuesto;
	}

	public Float getAbVlrCAR() {
		return abVlrCAR;
	}

	public void setAbVlrCAR(Float abVlrCAR) {
		this.abVlrCAR = abVlrCAR;
	}

	public Float getAbVlrInteres() {
		return abVlrInteres;
	}

	public void setAbVlrInteres(Float abVlrInteres) {
		this.abVlrInteres = abVlrInteres;
	}

	public Float getAbVlrIntCAR() {
		return abVlrIntCAR;
	}

	public void setAbVlrIntCAR(Float abVlrIntCAR) {
		this.abVlrIntCAR = abVlrIntCAR;
	}

	public Float getAbVlrOtros() {
		return abVlrOtros;
	}

	public void setAbVlrOtros(Float abVlrOtros) {
		this.abVlrOtros = abVlrOtros;
	}

	public Float getTotalVlrImpuesto() {
		return TotalVlrImpuesto;
	}

	public void setTotalVlrImpuesto(Float totalVlrImpuesto) {
		TotalVlrImpuesto = totalVlrImpuesto;
	}

	public Float getTotalVlrCAR() {
		return TotalVlrCAR;
	}

	public void setTotalVlrCAR(Float totalVlrCAR) {
		TotalVlrCAR = totalVlrCAR;
	}

	public Float getTotalVlrInteres() {
		return TotalVlrInteres;
	}

	public void setTotalVlrInteres(Float totalVlrInteres) {
		TotalVlrInteres = totalVlrInteres;
	}

	public Float getTotalVlrIntCAR() {
		return TotalVlrIntCAR;
	}

	public void setTotalVlrIntCAR(Float totalVlrIntCAR) {
		TotalVlrIntCAR = totalVlrIntCAR;
	}

	public Float getTotalVlrOtros() {
		return TotalVlrOtros;
	}

	public void setTotalVlrOtros(Float totalVlrOtros) {
		TotalVlrOtros = totalVlrOtros;
	}

	public Float getTotalVlrSobretasa() {
		return TotalVlrSobretasa;
	}

	public void setTotalVlrSobretasa(Float totalVlrSobretasa) {
		TotalVlrSobretasa = totalVlrSobretasa;
	}

	public Float getVlrDtoLey1066IMP() {
		return VlrDtoLey1066IMP;
	}

	public void setVlrDtoLey1066IMP(Float vlrDtoLey1066IMP) {
		VlrDtoLey1066IMP = vlrDtoLey1066IMP;
	}

	public Float getVlrDtoLey1066CAR() {
		return VlrDtoLey1066CAR;
	}

	public void setVlrDtoLey1066CAR(Float vlrDtoLey1066CAR) {
		VlrDtoLey1066CAR = vlrDtoLey1066CAR;
	}

	public boolean isIndAcuerdoPago() {
		return IndAcuerdoPago;
	}

	public void setIndAcuerdoPago(boolean indAcuerdoPago) {
		IndAcuerdoPago = indAcuerdoPago;
	}

	public String getF_AcuerdoPago() {
		return F_AcuerdoPago;
	}

	public void setF_AcuerdoPago(String f_AcuerdoPago) {
		F_AcuerdoPago = f_AcuerdoPago;
	}

	public boolean isIndAnoUrbano() {
		return IndAnoUrbano;
	}

	public void setIndAnoUrbano(boolean indAnoUrbano) {
		IndAnoUrbano = indAnoUrbano;
	}

	public Float getAutoAvaluo() {
		return AutoAvaluo;
	}

	public void setAutoAvaluo(Float autoAvaluo) {
		AutoAvaluo = autoAvaluo;
	}

	public Float getTarifaAdicional() {
		return TarifaAdicional;
	}

	public void setTarifaAdicional(Float tarifaAdicional) {
		TarifaAdicional = tarifaAdicional;
	}

	public boolean isIndCartera() {
		return IndCartera;
	}

	public void setIndCartera(boolean indCartera) {
		IndCartera = indCartera;
	}

	public String getF_cartera() {
		return F_cartera;
	}

	public void setF_cartera(String f_cartera) {
		F_cartera = f_cartera;
	}

	public Float getDescuentoInteres() {
		return DescuentoInteres;
	}

	public void setDescuentoInteres(Float descuentoInteres) {
		DescuentoInteres = descuentoInteres;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public Float getAnoAcuerdo() {
		return AnoAcuerdo;
	}

	public void setAnoAcuerdo(Float anoAcuerdo) {
		AnoAcuerdo = anoAcuerdo;
	}

	public Float getVlrCAR_Recaudo() {
		return VlrCAR_Recaudo;
	}

	public void setVlrCAR_Recaudo(Float vlrCAR_Recaudo) {
		VlrCAR_Recaudo = vlrCAR_Recaudo;
	}

	public Integer getAnoAlivio() {
		return AnoAlivio;
	}

	public void setAnoAlivio(Integer anoAlivio) {
		AnoAlivio = anoAlivio;
	}

	public Integer getCodigoAlivio() {
		return CodigoAlivio;
	}

	public void setCodigoAlivio(Integer codigoAlivio) {
		CodigoAlivio = codigoAlivio;
	}

	public String getNroAlivio() {
		return NroAlivio;
	}

	public void setNroAlivio(String nroAlivio) {
		NroAlivio = nroAlivio;
	}

	public Float getAC_VlrDctoPredial() {
		return AC_VlrDctoPredial;
	}

	public void setAC_VlrDctoPredial(Float aC_VlrDctoPredial) {
		AC_VlrDctoPredial = aC_VlrDctoPredial;
	}

	public Float getAC_VlrDctoIntImp() {
		return AC_VlrDctoIntImp;
	}

	public void setAC_VlrDctoIntImp(Float aC_VlrDctoIntImp) {
		AC_VlrDctoIntImp = aC_VlrDctoIntImp;
	}

	public Float getAC_VlrDctoCAR() {
		return AC_VlrDctoCAR;
	}

	public void setAC_VlrDctoCAR(Float aC_VlrDctoCAR) {
		AC_VlrDctoCAR = aC_VlrDctoCAR;
	}

	public Float getAC_VlrDctoIntCAR() {
		return AC_VlrDctoIntCAR;
	}

	public void setAC_VlrDctoIntCAR(Float aC_VlrDctoIntCAR) {
		AC_VlrDctoIntCAR = aC_VlrDctoIntCAR;
	}

	public Float getVlrDescuento1() {
		return VlrDescuento1;
	}

	public void setVlrDescuento1(Float vlrDescuento1) {
		VlrDescuento1 = vlrDescuento1;
	}

	public Float getVlrDescuento2() {
		return VlrDescuento2;
	}

	public void setVlrDescuento2(Float vlrDescuento2) {
		VlrDescuento2 = vlrDescuento2;
	}

	public Float getVlrDescuento3() {
		return VlrDescuento3;
	}

	public void setVlrDescuento3(Float vlrDescuento3) {
		VlrDescuento3 = vlrDescuento3;
	}

	public Float getVlrDescuento4() {
		return VlrDescuento4;
	}

	public void setVlrDescuento4(Float vlrDescuento4) {
		VlrDescuento4 = vlrDescuento4;
	}

	public String getF_ResDeudorMoroso() {
		return f_ResDeudorMoroso;
	}

	public void setF_ResDeudorMoroso(String f_ResDeudorMoroso) {
		this.f_ResDeudorMoroso = f_ResDeudorMoroso;
	}

	public String getNroResDeudorMoroso() {
		return NroResDeudorMoroso;
	}

	public void setNroResDeudorMoroso(String nroResDeudorMoroso) {
		NroResDeudorMoroso = nroResDeudorMoroso;
	}

	public Float getVlrCar_Contrib() {
		return VlrCar_Contrib;
	}

	public void setVlrCar_Contrib(Float vlrCar_Contrib) {
		VlrCar_Contrib = vlrCar_Contrib;
	}

	public Float getVlrIntCar_Contrib() {
		return VlrIntCar_Contrib;
	}

	public void setVlrIntCar_Contrib(Float vlrIntCar_Contrib) {
		VlrIntCar_Contrib = vlrIntCar_Contrib;
	}

	public Float getVlrExcPredial() {
		return VlrExcPredial;
	}

	public void setVlrExcPredial(Float vlrExcPredial) {
		VlrExcPredial = vlrExcPredial;
	}

	public Float getPorMaximo() {
		return PorMaximo;
	}

	public void setPorMaximo(Float porMaximo) {
		PorMaximo = porMaximo;
	}

	public String getTarifaOtros() {
		return TarifaOtros;
	}

	public void setTarifaOtros(String tarifaOtros) {
		TarifaOtros = tarifaOtros;
	}

	public String getRangoOtros() {
		return RangoOtros;
	}

	public void setRangoOtros(String rangoOtros) {
		RangoOtros = rangoOtros;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getPagoPSE() {
		return PagoPSE;
	}

	public void setPagoPSE(String pagoPSE) {
		PagoPSE = pagoPSE;
	}

	public Float getAvaluoIGAC() {
		return avaluoIGAC;
	}

	public void setAvaluoIGAC(Float avaluoIGAC) {
		this.avaluoIGAC = avaluoIGAC;
	}

	public Float getVlrAporteVol() {
		return vlrAporteVol;
	}

	public void setVlrAporteVol(Float vlrAporteVol) {
		this.vlrAporteVol = vlrAporteVol;
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

	public boolean isIndMalDeclarado() {
		return IndMalDeclarado;
	}

	public void setIndMalDeclarado(boolean indMalDeclarado) {
		IndMalDeclarado = indMalDeclarado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTarifaCalculo() {
		return tarifaCalculo;
	}

	public void setTarifaCalculo(String tarifaCalculo) {
		this.tarifaCalculo = tarifaCalculo;
	}

	public String getRangoCalculo() {
		return rangoCalculo;
	}

	public void setRangoCalculo(String rangoCalculo) {
		this.rangoCalculo = rangoCalculo;
	}

	public Float getPorTarifa() {
		return porTarifa;
	}

	public void setPorTarifa(Float porTarifa) {
		this.porTarifa = porTarifa;
	}

	public boolean isGeneraCoactivo() {
		return GeneraCoactivo;
	}

	public void setGeneraCoactivo(boolean generaCoactivo) {
		GeneraCoactivo = generaCoactivo;
	}

	public boolean isAplicaAlivio() {
		return aplicaAlivio;
	}

	public void setAplicaAlivio(boolean aplicaAlivio) {
		this.aplicaAlivio = aplicaAlivio;
	}

	public String getEstadocartera() {
		return Estadocartera;
	}

	public void setEstadocartera(String estadocartera) {
		Estadocartera = estadocartera;
	}

	public String getFechaCoactivo() {
		return FechaCoactivo;
	}

	public void setFechaCoactivo(String fechaCoactivo) {
		FechaCoactivo = fechaCoactivo;
	}

	public String getNroResCoactivo() {
		return NroResCoactivo;
	}

	public void setNroResCoactivo(String nroResCoactivo) {
		NroResCoactivo = nroResCoactivo;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public Long getIdCoactivo() {
		return IdCoactivo;
	}

	public void setIdCoactivo(Long idCoactivo) {
		IdCoactivo = idCoactivo;
	}

	public String getNumEstrato() {
		return numEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		this.numEstrato = numEstrato;
	}

	public String getCodigoCancelado() {
		return CodigoCancelado;
	}

	public void setCodigoCancelado(String codigoCancelado) {
		CodigoCancelado = codigoCancelado;
	}

	public Float getBaseCar() {
		return BaseCar;
	}

	public void setBaseCar(Float baseCar) {
		BaseCar = baseCar;
	}

	public Integer getPagoPorCuotas() {
		return pagoPorCuotas;
	}

	public void setPagoPorCuotas(Integer pagoPorCuotas) {
		this.pagoPorCuotas = pagoPorCuotas;
	}

	public boolean isOrigenRegistroPago() {
		return origenRegistroPago;
	}

	public void setOrigenRegistroPago(boolean origenRegistroPago) {
		this.origenRegistroPago = origenRegistroPago;
	}

	public String getFechaLimitePagoAno() {
		return fechaLimitePagoAno;
	}

	public void setFechaLimitePagoAno(String fechaLimitePagoAno) {
		this.fechaLimitePagoAno = fechaLimitePagoAno;
	}

	public String getSecuenciaPago() {
		return secuenciaPago;
	}

	public void setSecuenciaPago(String secuenciaPago) {
		this.secuenciaPago = secuenciaPago;
	}

	public Integer getMod010_idPorMaximo() {
		return mod010_idPorMaximo;
	}

	public void setMod010_idPorMaximo(Integer mod010_idPorMaximo) {
		this.mod010_idPorMaximo = mod010_idPorMaximo;
	}

	public Integer getId_Avaluos() {
		return Id_Avaluos;
	}

	public void setId_Avaluos(Integer id_Avaluos) {
		Id_Avaluos = id_Avaluos;
	}
    
}
