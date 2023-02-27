package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class PrediosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoTarifa")
    private Integer AnoTarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    private String Rango;
    @FormParam("Avaluo")
    private Float Avaluo;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoAnterior")
    private Integer AnoAnterior;
    @FormParam("AvaluoAnterior")
    private Float AvaluoAnterior;
    @FormParam("AnoPago")
    private Integer AnoPago;
    @FormParam("VlrPagado")
    private Float VlrPagado;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @FormParam("VlrPagadoAnterior")
    private Float VlrPagadoAnterior;
    @DateFormat
    @FormParam("F_PagoAnterior")
    private String F_PagoAnterior;
    @Size(since = 0 , until = 10)
    @FormParam("NroFacturaAnterior")
    private String NroFacturaAnterior;
    @Size(since = 0 , until = 13)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @FormParam("AnoPagoFactura")
    private Integer AnoPagoFactura;
    @FormParam("VlrComprobante")
    private Float VlrComprobante;
    @Size(since = 0 , until = 100)
    @FormParam("Nombres")
    private String Nombres;
    @Size(since = 0 , until = 13)
    @FormParam("Nit")
    private String Nit;
    @Size(since = 0 , until = 100)
    @FormParam("NombrePredio")
    private String NombrePredio;
    @Size(since = 0 , until = 50)
    @FormParam("Barrio")
    private String Barrio;
    @Size(since = 0 , until = 100)
    @FormParam("DireccionPredio")
    private String DireccionPredio;
    @Size(since = 0 , until = 100)
    @FormParam("DireccionCorrespondencia")
    private String DireccionCorrespondencia;
    @FormParam("AreaHectareas")
    private Float AreaHectareas;
    @FormParam("AreaMetros")
    private Float AreaMetros;
    @FormParam("AreaConstruida")
    private Float AreaConstruida;
    @FormParam("AreaHectareas1")
    private Float AreaHectareas1;
    @FormParam("AreaMetros1")
    private Float AreaMetros1;
    @FormParam("AreaConstruida1")
    private Float AreaConstruida1;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoConstruccion")
    private Integer AnoConstruccion;
    @FormParam("ExcImpuesto")
    private boolean ExcImpuesto;
    @FormParam("ExcCAR")
    private boolean ExcCAR;
    @FormParam("ExcSobretasa")
    private boolean ExcSobretasa;
    @FormParam("ExcOtros")
    private boolean ExcOtros;
    @FormParam("ExcLey44")
    private boolean ExcLey44;
    @Size(since = 0 , until = 25)
    @FormParam("Resolucion")
    private String Resolucion;
    @Size(since = 0 , until = 255)
    @FormParam("Observaciones")
    private String Observaciones;
    @Size(since = 0 , until = 1)
    @FormParam("TipoNit")
    private String TipoNit;
    @Size(since = 0 , until = 3)
    @FormParam("NroRegistros")
    private String NroRegistros;
    @FormParam("IndUrbano")
    private boolean IndUrbano;
    @Size(since = -32768, until = 32767)
    private Integer AnoInicial;
    @Size(since = 0 , until = 50)
    @FormParam("Matricula")
    private String Matricula;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @Size(since = 0 , until = 2)
    @FormParam("Departamento")
    private String Departamento;
    @Size(since = 0 , until = 3)
    @FormParam("Municipio")
    private String Municipio;
    @Size(since = 0 , until = 1)
    @FormParam("TipoRegistro")
    private String TipoRegistro;
    @Size(since = 0 , until = 3)
    @FormParam("Propietario")
    private String Propietario;
    @Size(since = 0 , until = 1)
    @FormParam("DcasadaViuda")
    private String DcasadaViuda;
    @Size(since = 0 , until = 2)
    @FormParam("DestinoEconomico")
    private String DestinoEconomico;
    @Size(since = 0 , until = 1)
    @FormParam("CondicionTributaria")
    private String CondicionTributaria;
    @DateFormat
    @FormParam("F_proceso")
    private String F_proceso;
    @Size(since = 0 , until = 2)
    @FormParam("Estado")
    private String Estado;
    @FormParam("VlrComprobante1")
    private Float VlrComprobante1;
    @FormParam("AnoPago1")
    private Integer AnoPago1;
    @Size(since = 0 , until = 20)
    @FormParam("NroComprobante1")
    private String NroComprobante1;
    @DateFormat
    @FormParam("F_Pago1")
    private String F_Pago1;
    @FormParam("VlrPagado1")
    private Float VlrPagado1;
    @Size(since = 0 , until = 10)
    @FormParam("NroFactura")
    private String NroFactura;
    @Size(since = 0 , until = 20)
    @FormParam("InscripcionCatastral")
    private String InscripcionCatastral;
    @DateFormat
    private String F_InscripcionCatastral;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCancelado")
    private String CodigoCancelado;
    @FormParam("AnoInicialCAR")
    private Integer AnoInicialCAR;
    @FormParam("VlrDeuda")
    private Float VlrDeuda;
    @DateFormat
    @FormParam("F_Deuda")
    private String F_Deuda;
    @DateFormat
    @FormParam("F_Factura")
    private String F_Factura;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("Paquete")
    private Integer Paquete;
    @FormParam("IndFacturaImpresa")
    private boolean IndFacturaImpresa;
    @Size(since = 0 , until = 2)
    @FormParam("TipoPago")
    private String TipoPago;
    @FormParam("IndLey633")
    private boolean IndLey633;
    @FormParam("TotalPagar1")
    private Float TotalPagar1;
    @FormParam("TotalPagar2")
    private Float TotalPagar2;
    @FormParam("TotalPagar3")
    private Float TotalPagar3;
    @FormParam("TotalPagar4")
    private Float TotalPagar4;
    @DateFormat
    @FormParam("Vencimiento1")
    private String Vencimiento1;
    @DateFormat
    @FormParam("Vencimiento2")
    private String Vencimiento2;
    @DateFormat
    @FormParam("Vencimiento3")
    private String Vencimiento3;
    @DateFormat
    @FormParam("Vencimiento4")
    private String Vencimiento4;
    @FormParam("InteresImp1")
    private Float InteresImp1;
    @FormParam("InteresImp2")
    private Float InteresImp2;
    @FormParam("InteresImp3")
    private Float InteresImp3;
    @FormParam("InteresImp4")
    private Float InteresImp4;
    @FormParam("InteresCAR1")
    private Float InteresCAR1;
    @FormParam("InteresCAR2")
    private Float InteresCAR2;
    @FormParam("InteresCAR3")
    private Float InteresCAR3;
    @FormParam("InteresCAR4")
    private Float InteresCAR4;
    @FormParam("Predial")
    private Float Predial;
    @FormParam("CAR")
    private Float CAR;
    @FormParam("Descuento1")
    private Float Descuento1;
    @FormParam("Descuento2")
    private Float Descuento2;
    @FormParam("Descuento3")
    private Float Descuento3;
    @FormParam("Descuento4")
    private Float Descuento4;
    @FormParam("Otros1")
    private Float Otros1;
    @FormParam("Otros2")
    private Float Otros2;
    @FormParam("Otros3")
    private Float Otros3;
    @FormParam("Otros4")
    private Float Otros4;
    @FormParam("Predial1")
    private Float Predial1;
    @FormParam("Predial2")
    private Float Predial2;
    @FormParam("Predial3")
    private Float Predial3;
    @FormParam("Predial4")
    private Float Predial4;
    @FormParam("CAR1")
    private Float CAR1;
    @FormParam("CAR2")
    private Float CAR2;
    @FormParam("CAR3")
    private Float CAR3;
    @FormParam("CAR4")
    private Float CAR4;
    @FormParam("IndEjido")
    private boolean IndEjido;
    @Size(since = 0 , until = 50)
    @FormParam("Telefono")
    private String Telefono;
    @Size(since = 0 , until = 7)
    @FormParam("DigControl")
    private String DigControl;
    @FormParam("CuotaInicial")
    @NotNull
    private Integer CuotaInicial;
    @FormParam("CuotaPago")
    @NotNull
    private Integer CuotaPago;
    @FormParam("DebeDesde")
    private Integer DebeDesde;
    @Size(since = 0 , until = 2)
    @FormParam("TipoIdentificacion")
    private String TipoIdentificacion;
    @Size(since = 0 , until = 100)
    @FormParam("DIRALTERNA")
    private String DIRALTERNA;
    @FormParam("vlrperiodoactual")
    @NotNull
    private Float vlrperiodoactual;
    @FormParam("vlrLey1066")
    private Float vlrLey1066;
    @FormParam("AvaluoPeriodo")
    private Float AvaluoPeriodo;
    @FormParam("PeriodoAvaluo")
    private Float PeriodoAvaluo;
    @FormParam("PorcDctoInteres")
    private Float PorcDctoInteres;
    @Size(since = 0 , until = 2)
    @FormParam("EstratoSocioEconomico")
    private String EstratoSocioEconomico;
    @FormParam("IndLey1066")
    private boolean IndLey1066;
    @NotNull
    @FormParam("Cuota")
    private Float Cuota;
    @FormParam("IndPagoRestringido")
    private boolean IndPagoRestringido;
    @Size(since = 0 , until = 30)
    @FormParam("CODIGONUEVO")
    private String CODIGONUEVO;
    @Size(since = 0 , until = 1)
    @FormParam("Comuna")
    private String Comuna;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("EstadoCartera")
    private String EstadoCartera;
    @FormParam("Ind_AcuerdoAlivio")
    private boolean Ind_AcuerdoAlivio;
    @FormParam("TotalSinOtros1")
    private Float TotalSinOtros1;
    @FormParam("TotalSinOtros2")
    private Float TotalSinOtros2;
    @FormParam("TotalSinOtros3")
    private Float TotalSinOtros3;
    @FormParam("TotalSinOtros4")
    private Float TotalSinOtros4;
    @Size(since = 0 , until = 2)
    @FormParam("NumEstrato")
    private String NumEstrato;
    @FormParam("IndAutoAvaluo")
    private boolean IndAutoAvaluo;
    @FormParam("VlrAutoAvaluo")
    private Float VlrAutoAvaluo;
    @DateFormat
    private String F_AutoAvaluo;
    @Size(since = 0 , until = 20)
    @FormParam("AutoFormulario")
    private String AutoFormulario;
    @FormParam("VlrDeudaValoriz")
    private Float VlrDeudaValoriz;
    @FormParam("VlrDeudaValorizCap")
    private Float VlrDeudaValorizCap;
    @FormParam("VlrDeudaValorizInt")
    private Float VlrDeudaValorizInt;
    @FormParam("VlrAvaluoIGAC")
    private Float VlrAvaluoIGAC;
    @Size(since = 0 , until = 3)
    @FormParam("TarifaOtros")
    private String TarifaOtros;
    @Size(since = 0 , until = 3)
    @FormParam("RangoOtros")
    private String RangoOtros;
    @Size(since = 0 , until = 30)
    @FormParam("Codigo_Postal")
    private String Codigo_Postal;
    @Size(since = 0 , until = 30)
    @FormParam("NombreContacto")
    private String NombreContacto;
    @Size(since = 0 , until = 10)
    @FormParam("TelefonoFijo")
    private String TelefonoFijo;
    @Size(since = 0 , until = 10)
    @FormParam("TelefonoMovil")
    private String TelefonoMovil;
    @Size(since = 0 , until = 100)
    @FormParam("DireccionNotificacion")
    private String DireccionNotificacion;
    @Size(since = 0 , until = 50)
    @FormParam("CiudadNotificacion")
    private String CiudadNotificacion;
    @Size(since = 0 , until = 60)
    @FormParam("Email")
    private String Email;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 15)
    @FormParam("CodigoCatastral_15")
    private String CodigoCatastral_15;
    @FormParam("OrdenImpresion")
    private Float OrdenImpresion;
    @FormParam("ExcCobroAlivios")
    private boolean ExcCobroAlivios;
    @Size(since = 0 , until = 13)
    @FormParam("nit_dbl")
    private String nit_dbl;
    @FormParam("TotalVlrAporteVol")
    private Float TotalVlrAporteVol;
    @FormParam("indExcAporteVol")
    private boolean indExcAporteVol;
    @FormParam("indImpuestoMaximo")
    private boolean indImpuestoMaximo;
    @FormParam("IndReciprocas")
    private boolean IndReciprocas;
    @FormParam("paquetepdf")
    private Float paquetepdf;
    @FormParam("imprimefactura")
    private boolean imprimefactura;
    @FormParam("IndGaraje")
    private boolean IndGaraje;
    @FormParam("impuestoAnterior")
    private Float impuestoAnterior;
    @FormParam("porTarifAnterior")
    private Float porTarifAnterior;
    @FormParam("porCobroAnterior")
    private Float porCobroAnterior;
    @Size(since = 0 , until = 3)
    @FormParam("tarifaAnterior")
    private String tarifaAnterior;
    @Size(since = 0 , until = 3)
    @FormParam("rangoAnterior")
    private String rangoAnterior;
    @FormParam("porMaximoAnterior")
    private Float porMaximoAnterior;
    @FormParam("impuestoActual")
    private Float impuestoActual;
    @FormParam("porTarifActual")
    private Float porTarifActual;
    @FormParam("porCobroActual")
    private Float porCobroActual;
    @FormParam("porMaximoActual")
    private Float porMaximoActual;
    @FormParam("porRevisar")
    private Integer porRevisar;
    @FormParam("variacion")
    private Float variacion;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @NotNull
    @FormParam("restringeMasivo")
    private Integer restringeMasivo;
    @Size(since = 0 , until = 100)
    @FormParam("Reciproca")
    private String Reciproca;
    @FormParam("IndMunicipio")
    private boolean IndMunicipio;
    @Size(since = 0 , until = 20)
    @FormParam("UsoMunicipio")
    private String UsoMunicipio;
    
    private Integer Id_Predios;

	public PrediosModelo() {
		super();
	}

	public PrediosModelo(String codigoCatastral, Integer ano, Integer anoTarifa, String tarifa, String rango,
			Float avaluo, Integer anoAnterior, Float avaluoAnterior, Integer anoPago, Float vlrPagado, String f_Pago,
			Float vlrPagadoAnterior, String f_PagoAnterior, String nroFacturaAnterior, String nroComprobante,
			Integer anoPagoFactura, Float vlrComprobante, String nombres, String nit, String nombrePredio,
			String barrio, String direccionPredio, String direccionCorrespondencia, Float areaHectareas,
			Float areaMetros, Float areaConstruida, Float areaHectareas1, Float areaMetros1, Float areaConstruida1,
			Integer anoConstruccion, boolean excImpuesto, boolean excCAR, boolean excSobretasa, boolean excOtros,
			boolean excLey44, String resolucion, String observaciones, String tipoNit, String nroRegistros,
			boolean indUrbano, Integer anoInicial, String matricula, String banco, String departamento,
			String municipio, String tipoRegistro, String propietario, String dcasadaViuda, String destinoEconomico,
			String condicionTributaria, String f_proceso, String estado, Float vlrComprobante1, Integer anoPago1,
			String nroComprobante1, String f_Pago1, Float vlrPagado1, String nroFactura, String inscripcionCatastral,
			String f_InscripcionCatastral, String codigoCancelado, Integer anoInicialCAR, Float vlrDeuda,
			String f_Deuda, String f_Factura, Integer anoBanco, Integer paquete, boolean indFacturaImpresa,
			String tipoPago, boolean indLey633, Float totalPagar1, Float totalPagar2, Float totalPagar3,
			Float totalPagar4, String vencimiento1, String vencimiento2, String vencimiento3, String vencimiento4,
			Float interesImp1, Float interesImp2, Float interesImp3, Float interesImp4, Float interesCAR1,
			Float interesCAR2, Float interesCAR3, Float interesCAR4, Float predial, Float cAR, Float descuento1,
			Float descuento2, Float descuento3, Float descuento4, Float otros1, Float otros2, Float otros3,
			Float otros4, Float predial1, Float predial2, Float predial3, Float predial4, Float cAR1, Float cAR2,
			Float cAR3, Float cAR4, boolean indEjido, String telefono, String digControl, Integer cuotaInicial,
			Integer cuotaPago, Integer debeDesde, String tipoIdentificacion, String dIRALTERNA, Float vlrperiodoactual,
			Float vlrLey1066, Float avaluoPeriodo, Float periodoAvaluo, Float porcDctoInteres,
			String estratoSocioEconomico, boolean indLey1066, Float cuota, boolean indPagoRestringido,
			String cODIGONUEVO, String comuna, String estadoCartera, boolean ind_AcuerdoAlivio, Float totalSinOtros1,
			Float totalSinOtros2, Float totalSinOtros3, Float totalSinOtros4, String numEstrato, boolean indAutoAvaluo,
			Float vlrAutoAvaluo, String f_AutoAvaluo, String autoFormulario, Float vlrDeudaValoriz,
			Float vlrDeudaValorizCap, Float vlrDeudaValorizInt, Float vlrAvaluoIGAC, String tarifaOtros,
			String rangoOtros, String codigo_Postal, String nombreContacto, String telefonoFijo, String telefonoMovil,
			String direccionNotificacion, String ciudadNotificacion, String email, String codUnicoCatastral,
			String codigoCatastral_15, Float ordenImpresion, boolean excCobroAlivios, String nit_dbl,
			Float totalVlrAporteVol, boolean indExcAporteVol, boolean indImpuestoMaximo, boolean indReciprocas,
			Float paquetepdf, boolean imprimefactura, boolean indGaraje, Float impuestoAnterior, Float porTarifAnterior,
			Float porCobroAnterior, String tarifaAnterior, String rangoAnterior, Float porMaximoAnterior,
			Float impuestoActual, Float porTarifActual, Float porCobroActual, Float porMaximoActual, Integer porRevisar,
			Float variacion, String fechaCreacion, Integer restringeMasivo, String reciproca, boolean indMunicipio,
			String usoMunicipio, Integer id_Predios) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		AnoTarifa = anoTarifa;
		Tarifa = tarifa;
		Rango = rango;
		Avaluo = avaluo;
		AnoAnterior = anoAnterior;
		AvaluoAnterior = avaluoAnterior;
		AnoPago = anoPago;
		VlrPagado = vlrPagado;
		F_Pago = f_Pago;
		VlrPagadoAnterior = vlrPagadoAnterior;
		F_PagoAnterior = f_PagoAnterior;
		NroFacturaAnterior = nroFacturaAnterior;
		NroComprobante = nroComprobante;
		AnoPagoFactura = anoPagoFactura;
		VlrComprobante = vlrComprobante;
		Nombres = nombres;
		Nit = nit;
		NombrePredio = nombrePredio;
		Barrio = barrio;
		DireccionPredio = direccionPredio;
		DireccionCorrespondencia = direccionCorrespondencia;
		AreaHectareas = areaHectareas;
		AreaMetros = areaMetros;
		AreaConstruida = areaConstruida;
		AreaHectareas1 = areaHectareas1;
		AreaMetros1 = areaMetros1;
		AreaConstruida1 = areaConstruida1;
		AnoConstruccion = anoConstruccion;
		ExcImpuesto = excImpuesto;
		ExcCAR = excCAR;
		ExcSobretasa = excSobretasa;
		ExcOtros = excOtros;
		ExcLey44 = excLey44;
		Resolucion = resolucion;
		Observaciones = observaciones;
		TipoNit = tipoNit;
		NroRegistros = nroRegistros;
		IndUrbano = indUrbano;
		AnoInicial = anoInicial;
		Matricula = matricula;
		Banco = banco;
		Departamento = departamento;
		Municipio = municipio;
		TipoRegistro = tipoRegistro;
		Propietario = propietario;
		DcasadaViuda = dcasadaViuda;
		DestinoEconomico = destinoEconomico;
		CondicionTributaria = condicionTributaria;
		F_proceso = f_proceso;
		Estado = estado;
		VlrComprobante1 = vlrComprobante1;
		AnoPago1 = anoPago1;
		NroComprobante1 = nroComprobante1;
		F_Pago1 = f_Pago1;
		VlrPagado1 = vlrPagado1;
		NroFactura = nroFactura;
		InscripcionCatastral = inscripcionCatastral;
		F_InscripcionCatastral = f_InscripcionCatastral;
		CodigoCancelado = codigoCancelado;
		AnoInicialCAR = anoInicialCAR;
		VlrDeuda = vlrDeuda;
		F_Deuda = f_Deuda;
		F_Factura = f_Factura;
		AnoBanco = anoBanco;
		Paquete = paquete;
		IndFacturaImpresa = indFacturaImpresa;
		TipoPago = tipoPago;
		IndLey633 = indLey633;
		TotalPagar1 = totalPagar1;
		TotalPagar2 = totalPagar2;
		TotalPagar3 = totalPagar3;
		TotalPagar4 = totalPagar4;
		Vencimiento1 = vencimiento1;
		Vencimiento2 = vencimiento2;
		Vencimiento3 = vencimiento3;
		Vencimiento4 = vencimiento4;
		InteresImp1 = interesImp1;
		InteresImp2 = interesImp2;
		InteresImp3 = interesImp3;
		InteresImp4 = interesImp4;
		InteresCAR1 = interesCAR1;
		InteresCAR2 = interesCAR2;
		InteresCAR3 = interesCAR3;
		InteresCAR4 = interesCAR4;
		Predial = predial;
		CAR = cAR;
		Descuento1 = descuento1;
		Descuento2 = descuento2;
		Descuento3 = descuento3;
		Descuento4 = descuento4;
		Otros1 = otros1;
		Otros2 = otros2;
		Otros3 = otros3;
		Otros4 = otros4;
		Predial1 = predial1;
		Predial2 = predial2;
		Predial3 = predial3;
		Predial4 = predial4;
		CAR1 = cAR1;
		CAR2 = cAR2;
		CAR3 = cAR3;
		CAR4 = cAR4;
		IndEjido = indEjido;
		Telefono = telefono;
		DigControl = digControl;
		CuotaInicial = cuotaInicial;
		CuotaPago = cuotaPago;
		DebeDesde = debeDesde;
		TipoIdentificacion = tipoIdentificacion;
		DIRALTERNA = dIRALTERNA;
		this.vlrperiodoactual = vlrperiodoactual;
		this.vlrLey1066 = vlrLey1066;
		AvaluoPeriodo = avaluoPeriodo;
		PeriodoAvaluo = periodoAvaluo;
		PorcDctoInteres = porcDctoInteres;
		EstratoSocioEconomico = estratoSocioEconomico;
		IndLey1066 = indLey1066;
		Cuota = cuota;
		IndPagoRestringido = indPagoRestringido;
		CODIGONUEVO = cODIGONUEVO;
		Comuna = comuna;
		EstadoCartera = estadoCartera;
		Ind_AcuerdoAlivio = ind_AcuerdoAlivio;
		TotalSinOtros1 = totalSinOtros1;
		TotalSinOtros2 = totalSinOtros2;
		TotalSinOtros3 = totalSinOtros3;
		TotalSinOtros4 = totalSinOtros4;
		NumEstrato = numEstrato;
		IndAutoAvaluo = indAutoAvaluo;
		VlrAutoAvaluo = vlrAutoAvaluo;
		F_AutoAvaluo = f_AutoAvaluo;
		AutoFormulario = autoFormulario;
		VlrDeudaValoriz = vlrDeudaValoriz;
		VlrDeudaValorizCap = vlrDeudaValorizCap;
		VlrDeudaValorizInt = vlrDeudaValorizInt;
		VlrAvaluoIGAC = vlrAvaluoIGAC;
		TarifaOtros = tarifaOtros;
		RangoOtros = rangoOtros;
		Codigo_Postal = codigo_Postal;
		NombreContacto = nombreContacto;
		TelefonoFijo = telefonoFijo;
		TelefonoMovil = telefonoMovil;
		DireccionNotificacion = direccionNotificacion;
		CiudadNotificacion = ciudadNotificacion;
		Email = email;
		CodUnicoCatastral = codUnicoCatastral;
		CodigoCatastral_15 = codigoCatastral_15;
		OrdenImpresion = ordenImpresion;
		ExcCobroAlivios = excCobroAlivios;
		this.nit_dbl = nit_dbl;
		TotalVlrAporteVol = totalVlrAporteVol;
		this.indExcAporteVol = indExcAporteVol;
		this.indImpuestoMaximo = indImpuestoMaximo;
		IndReciprocas = indReciprocas;
		this.paquetepdf = paquetepdf;
		this.imprimefactura = imprimefactura;
		IndGaraje = indGaraje;
		this.impuestoAnterior = impuestoAnterior;
		this.porTarifAnterior = porTarifAnterior;
		this.porCobroAnterior = porCobroAnterior;
		this.tarifaAnterior = tarifaAnterior;
		this.rangoAnterior = rangoAnterior;
		this.porMaximoAnterior = porMaximoAnterior;
		this.impuestoActual = impuestoActual;
		this.porTarifActual = porTarifActual;
		this.porCobroActual = porCobroActual;
		this.porMaximoActual = porMaximoActual;
		this.porRevisar = porRevisar;
		this.variacion = variacion;
		this.fechaCreacion = fechaCreacion;
		this.restringeMasivo = restringeMasivo;
		Reciproca = reciproca;
		IndMunicipio = indMunicipio;
		UsoMunicipio = usoMunicipio;
		Id_Predios = id_Predios;
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

	public Integer getAnoTarifa() {
		return AnoTarifa;
	}

	public void setAnoTarifa(Integer anoTarifa) {
		AnoTarifa = anoTarifa;
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

	public Integer getAnoAnterior() {
		return AnoAnterior;
	}

	public void setAnoAnterior(Integer anoAnterior) {
		AnoAnterior = anoAnterior;
	}

	public Float getAvaluoAnterior() {
		return AvaluoAnterior;
	}

	public void setAvaluoAnterior(Float avaluoAnterior) {
		AvaluoAnterior = avaluoAnterior;
	}

	public Integer getAnoPago() {
		return AnoPago;
	}

	public void setAnoPago(Integer anoPago) {
		AnoPago = anoPago;
	}

	public Float getVlrPagado() {
		return VlrPagado;
	}

	public void setVlrPagado(Float vlrPagado) {
		VlrPagado = vlrPagado;
	}

	public String getF_Pago() {
		return F_Pago;
	}

	public void setF_Pago(String f_Pago) {
		F_Pago = f_Pago;
	}

	public Float getVlrPagadoAnterior() {
		return VlrPagadoAnterior;
	}

	public void setVlrPagadoAnterior(Float vlrPagadoAnterior) {
		VlrPagadoAnterior = vlrPagadoAnterior;
	}

	public String getF_PagoAnterior() {
		return F_PagoAnterior;
	}

	public void setF_PagoAnterior(String f_PagoAnterior) {
		F_PagoAnterior = f_PagoAnterior;
	}

	public String getNroFacturaAnterior() {
		return NroFacturaAnterior;
	}

	public void setNroFacturaAnterior(String nroFacturaAnterior) {
		NroFacturaAnterior = nroFacturaAnterior;
	}

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public Integer getAnoPagoFactura() {
		return AnoPagoFactura;
	}

	public void setAnoPagoFactura(Integer anoPagoFactura) {
		AnoPagoFactura = anoPagoFactura;
	}

	public Float getVlrComprobante() {
		return VlrComprobante;
	}

	public void setVlrComprobante(Float vlrComprobante) {
		VlrComprobante = vlrComprobante;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public String getNombrePredio() {
		return NombrePredio;
	}

	public void setNombrePredio(String nombrePredio) {
		NombrePredio = nombrePredio;
	}

	public String getBarrio() {
		return Barrio;
	}

	public void setBarrio(String barrio) {
		Barrio = barrio;
	}

	public String getDireccionPredio() {
		return DireccionPredio;
	}

	public void setDireccionPredio(String direccionPredio) {
		DireccionPredio = direccionPredio;
	}

	public String getDireccionCorrespondencia() {
		return DireccionCorrespondencia;
	}

	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		DireccionCorrespondencia = direccionCorrespondencia;
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

	public Float getAreaHectareas1() {
		return AreaHectareas1;
	}

	public void setAreaHectareas1(Float areaHectareas1) {
		AreaHectareas1 = areaHectareas1;
	}

	public Float getAreaMetros1() {
		return AreaMetros1;
	}

	public void setAreaMetros1(Float areaMetros1) {
		AreaMetros1 = areaMetros1;
	}

	public Float getAreaConstruida1() {
		return AreaConstruida1;
	}

	public void setAreaConstruida1(Float areaConstruida1) {
		AreaConstruida1 = areaConstruida1;
	}

	public Integer getAnoConstruccion() {
		return AnoConstruccion;
	}

	public void setAnoConstruccion(Integer anoConstruccion) {
		AnoConstruccion = anoConstruccion;
	}

	public boolean isExcImpuesto() {
		return ExcImpuesto;
	}

	public void setExcImpuesto(boolean excImpuesto) {
		ExcImpuesto = excImpuesto;
	}

	public boolean isExcCAR() {
		return ExcCAR;
	}

	public void setExcCAR(boolean excCAR) {
		ExcCAR = excCAR;
	}

	public boolean isExcSobretasa() {
		return ExcSobretasa;
	}

	public void setExcSobretasa(boolean excSobretasa) {
		ExcSobretasa = excSobretasa;
	}

	public boolean isExcOtros() {
		return ExcOtros;
	}

	public void setExcOtros(boolean excOtros) {
		ExcOtros = excOtros;
	}

	public boolean isExcLey44() {
		return ExcLey44;
	}

	public void setExcLey44(boolean excLey44) {
		ExcLey44 = excLey44;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public String getTipoNit() {
		return TipoNit;
	}

	public void setTipoNit(String tipoNit) {
		TipoNit = tipoNit;
	}

	public String getNroRegistros() {
		return NroRegistros;
	}

	public void setNroRegistros(String nroRegistros) {
		NroRegistros = nroRegistros;
	}

	public boolean isIndUrbano() {
		return IndUrbano;
	}

	public void setIndUrbano(boolean indUrbano) {
		IndUrbano = indUrbano;
	}

	public Integer getAnoInicial() {
		return AnoInicial;
	}

	public void setAnoInicial(Integer anoInicial) {
		AnoInicial = anoInicial;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getTipoRegistro() {
		return TipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		TipoRegistro = tipoRegistro;
	}

	public String getPropietario() {
		return Propietario;
	}

	public void setPropietario(String propietario) {
		Propietario = propietario;
	}

	public String getDcasadaViuda() {
		return DcasadaViuda;
	}

	public void setDcasadaViuda(String dcasadaViuda) {
		DcasadaViuda = dcasadaViuda;
	}

	public String getDestinoEconomico() {
		return DestinoEconomico;
	}

	public void setDestinoEconomico(String destinoEconomico) {
		DestinoEconomico = destinoEconomico;
	}

	public String getCondicionTributaria() {
		return CondicionTributaria;
	}

	public void setCondicionTributaria(String condicionTributaria) {
		CondicionTributaria = condicionTributaria;
	}

	public String getF_proceso() {
		return F_proceso;
	}

	public void setF_proceso(String f_proceso) {
		F_proceso = f_proceso;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Float getVlrComprobante1() {
		return VlrComprobante1;
	}

	public void setVlrComprobante1(Float vlrComprobante1) {
		VlrComprobante1 = vlrComprobante1;
	}

	public Integer getAnoPago1() {
		return AnoPago1;
	}

	public void setAnoPago1(Integer anoPago1) {
		AnoPago1 = anoPago1;
	}

	public String getNroComprobante1() {
		return NroComprobante1;
	}

	public void setNroComprobante1(String nroComprobante1) {
		NroComprobante1 = nroComprobante1;
	}

	public String getF_Pago1() {
		return F_Pago1;
	}

	public void setF_Pago1(String f_Pago1) {
		F_Pago1 = f_Pago1;
	}

	public Float getVlrPagado1() {
		return VlrPagado1;
	}

	public void setVlrPagado1(Float vlrPagado1) {
		VlrPagado1 = vlrPagado1;
	}

	public String getNroFactura() {
		return NroFactura;
	}

	public void setNroFactura(String nroFactura) {
		NroFactura = nroFactura;
	}

	public String getInscripcionCatastral() {
		return InscripcionCatastral;
	}

	public void setInscripcionCatastral(String inscripcionCatastral) {
		InscripcionCatastral = inscripcionCatastral;
	}

	public String getF_InscripcionCatastral() {
		return F_InscripcionCatastral;
	}

	public void setF_InscripcionCatastral(String f_InscripcionCatastral) {
		F_InscripcionCatastral = f_InscripcionCatastral;
	}

	public String getCodigoCancelado() {
		return CodigoCancelado;
	}

	public void setCodigoCancelado(String codigoCancelado) {
		CodigoCancelado = codigoCancelado;
	}

	public Integer getAnoInicialCAR() {
		return AnoInicialCAR;
	}

	public void setAnoInicialCAR(Integer anoInicialCAR) {
		AnoInicialCAR = anoInicialCAR;
	}

	public Float getVlrDeuda() {
		return VlrDeuda;
	}

	public void setVlrDeuda(Float vlrDeuda) {
		VlrDeuda = vlrDeuda;
	}

	public String getF_Deuda() {
		return F_Deuda;
	}

	public void setF_Deuda(String f_Deuda) {
		F_Deuda = f_Deuda;
	}

	public String getF_Factura() {
		return F_Factura;
	}

	public void setF_Factura(String f_Factura) {
		F_Factura = f_Factura;
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

	public boolean isIndFacturaImpresa() {
		return IndFacturaImpresa;
	}

	public void setIndFacturaImpresa(boolean indFacturaImpresa) {
		IndFacturaImpresa = indFacturaImpresa;
	}

	public String getTipoPago() {
		return TipoPago;
	}

	public void setTipoPago(String tipoPago) {
		TipoPago = tipoPago;
	}

	public boolean isIndLey633() {
		return IndLey633;
	}

	public void setIndLey633(boolean indLey633) {
		IndLey633 = indLey633;
	}

	public Float getTotalPagar1() {
		return TotalPagar1;
	}

	public void setTotalPagar1(Float totalPagar1) {
		TotalPagar1 = totalPagar1;
	}

	public Float getTotalPagar2() {
		return TotalPagar2;
	}

	public void setTotalPagar2(Float totalPagar2) {
		TotalPagar2 = totalPagar2;
	}

	public Float getTotalPagar3() {
		return TotalPagar3;
	}

	public void setTotalPagar3(Float totalPagar3) {
		TotalPagar3 = totalPagar3;
	}

	public Float getTotalPagar4() {
		return TotalPagar4;
	}

	public void setTotalPagar4(Float totalPagar4) {
		TotalPagar4 = totalPagar4;
	}

	public String getVencimiento1() {
		return Vencimiento1;
	}

	public void setVencimiento1(String vencimiento1) {
		Vencimiento1 = vencimiento1;
	}

	public String getVencimiento2() {
		return Vencimiento2;
	}

	public void setVencimiento2(String vencimiento2) {
		Vencimiento2 = vencimiento2;
	}

	public String getVencimiento3() {
		return Vencimiento3;
	}

	public void setVencimiento3(String vencimiento3) {
		Vencimiento3 = vencimiento3;
	}

	public String getVencimiento4() {
		return Vencimiento4;
	}

	public void setVencimiento4(String vencimiento4) {
		Vencimiento4 = vencimiento4;
	}

	public Float getInteresImp1() {
		return InteresImp1;
	}

	public void setInteresImp1(Float interesImp1) {
		InteresImp1 = interesImp1;
	}

	public Float getInteresImp2() {
		return InteresImp2;
	}

	public void setInteresImp2(Float interesImp2) {
		InteresImp2 = interesImp2;
	}

	public Float getInteresImp3() {
		return InteresImp3;
	}

	public void setInteresImp3(Float interesImp3) {
		InteresImp3 = interesImp3;
	}

	public Float getInteresImp4() {
		return InteresImp4;
	}

	public void setInteresImp4(Float interesImp4) {
		InteresImp4 = interesImp4;
	}

	public Float getInteresCAR1() {
		return InteresCAR1;
	}

	public void setInteresCAR1(Float interesCAR1) {
		InteresCAR1 = interesCAR1;
	}

	public Float getInteresCAR2() {
		return InteresCAR2;
	}

	public void setInteresCAR2(Float interesCAR2) {
		InteresCAR2 = interesCAR2;
	}

	public Float getInteresCAR3() {
		return InteresCAR3;
	}

	public void setInteresCAR3(Float interesCAR3) {
		InteresCAR3 = interesCAR3;
	}

	public Float getInteresCAR4() {
		return InteresCAR4;
	}

	public void setInteresCAR4(Float interesCAR4) {
		InteresCAR4 = interesCAR4;
	}

	public Float getPredial() {
		return Predial;
	}

	public void setPredial(Float predial) {
		Predial = predial;
	}

	public Float getCAR() {
		return CAR;
	}

	public void setCAR(Float cAR) {
		CAR = cAR;
	}

	public Float getDescuento1() {
		return Descuento1;
	}

	public void setDescuento1(Float descuento1) {
		Descuento1 = descuento1;
	}

	public Float getDescuento2() {
		return Descuento2;
	}

	public void setDescuento2(Float descuento2) {
		Descuento2 = descuento2;
	}

	public Float getDescuento3() {
		return Descuento3;
	}

	public void setDescuento3(Float descuento3) {
		Descuento3 = descuento3;
	}

	public Float getDescuento4() {
		return Descuento4;
	}

	public void setDescuento4(Float descuento4) {
		Descuento4 = descuento4;
	}

	public Float getOtros1() {
		return Otros1;
	}

	public void setOtros1(Float otros1) {
		Otros1 = otros1;
	}

	public Float getOtros2() {
		return Otros2;
	}

	public void setOtros2(Float otros2) {
		Otros2 = otros2;
	}

	public Float getOtros3() {
		return Otros3;
	}

	public void setOtros3(Float otros3) {
		Otros3 = otros3;
	}

	public Float getOtros4() {
		return Otros4;
	}

	public void setOtros4(Float otros4) {
		Otros4 = otros4;
	}

	public Float getPredial1() {
		return Predial1;
	}

	public void setPredial1(Float predial1) {
		Predial1 = predial1;
	}

	public Float getPredial2() {
		return Predial2;
	}

	public void setPredial2(Float predial2) {
		Predial2 = predial2;
	}

	public Float getPredial3() {
		return Predial3;
	}

	public void setPredial3(Float predial3) {
		Predial3 = predial3;
	}

	public Float getPredial4() {
		return Predial4;
	}

	public void setPredial4(Float predial4) {
		Predial4 = predial4;
	}

	public Float getCAR1() {
		return CAR1;
	}

	public void setCAR1(Float cAR1) {
		CAR1 = cAR1;
	}

	public Float getCAR2() {
		return CAR2;
	}

	public void setCAR2(Float cAR2) {
		CAR2 = cAR2;
	}

	public Float getCAR3() {
		return CAR3;
	}

	public void setCAR3(Float cAR3) {
		CAR3 = cAR3;
	}

	public Float getCAR4() {
		return CAR4;
	}

	public void setCAR4(Float cAR4) {
		CAR4 = cAR4;
	}

	public boolean isIndEjido() {
		return IndEjido;
	}

	public void setIndEjido(boolean indEjido) {
		IndEjido = indEjido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDigControl() {
		return DigControl;
	}

	public void setDigControl(String digControl) {
		DigControl = digControl;
	}

	public Integer getCuotaInicial() {
		return CuotaInicial;
	}

	public void setCuotaInicial(Integer cuotaInicial) {
		CuotaInicial = cuotaInicial;
	}

	public Integer getCuotaPago() {
		return CuotaPago;
	}

	public void setCuotaPago(Integer cuotaPago) {
		CuotaPago = cuotaPago;
	}

	public Integer getDebeDesde() {
		return DebeDesde;
	}

	public void setDebeDesde(Integer debeDesde) {
		DebeDesde = debeDesde;
	}

	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}

	public String getDIRALTERNA() {
		return DIRALTERNA;
	}

	public void setDIRALTERNA(String dIRALTERNA) {
		DIRALTERNA = dIRALTERNA;
	}

	public Float getVlrperiodoactual() {
		return vlrperiodoactual;
	}

	public void setVlrperiodoactual(Float vlrperiodoactual) {
		this.vlrperiodoactual = vlrperiodoactual;
	}

	public Float getVlrLey1066() {
		return vlrLey1066;
	}

	public void setVlrLey1066(Float vlrLey1066) {
		this.vlrLey1066 = vlrLey1066;
	}

	public Float getAvaluoPeriodo() {
		return AvaluoPeriodo;
	}

	public void setAvaluoPeriodo(Float avaluoPeriodo) {
		AvaluoPeriodo = avaluoPeriodo;
	}

	public Float getPeriodoAvaluo() {
		return PeriodoAvaluo;
	}

	public void setPeriodoAvaluo(Float periodoAvaluo) {
		PeriodoAvaluo = periodoAvaluo;
	}

	public Float getPorcDctoInteres() {
		return PorcDctoInteres;
	}

	public void setPorcDctoInteres(Float porcDctoInteres) {
		PorcDctoInteres = porcDctoInteres;
	}

	public String getEstratoSocioEconomico() {
		return EstratoSocioEconomico;
	}

	public void setEstratoSocioEconomico(String estratoSocioEconomico) {
		EstratoSocioEconomico = estratoSocioEconomico;
	}

	public boolean isIndLey1066() {
		return IndLey1066;
	}

	public void setIndLey1066(boolean indLey1066) {
		IndLey1066 = indLey1066;
	}

	public Float getCuota() {
		return Cuota;
	}

	public void setCuota(Float cuota) {
		Cuota = cuota;
	}

	public boolean isIndPagoRestringido() {
		return IndPagoRestringido;
	}

	public void setIndPagoRestringido(boolean indPagoRestringido) {
		IndPagoRestringido = indPagoRestringido;
	}

	public String getCODIGONUEVO() {
		return CODIGONUEVO;
	}

	public void setCODIGONUEVO(String cODIGONUEVO) {
		CODIGONUEVO = cODIGONUEVO;
	}

	public String getComuna() {
		return Comuna;
	}

	public void setComuna(String comuna) {
		Comuna = comuna;
	}

	public String getEstadoCartera() {
		return EstadoCartera;
	}

	public void setEstadoCartera(String estadoCartera) {
		EstadoCartera = estadoCartera;
	}

	public boolean isInd_AcuerdoAlivio() {
		return Ind_AcuerdoAlivio;
	}

	public void setInd_AcuerdoAlivio(boolean ind_AcuerdoAlivio) {
		Ind_AcuerdoAlivio = ind_AcuerdoAlivio;
	}

	public Float getTotalSinOtros1() {
		return TotalSinOtros1;
	}

	public void setTotalSinOtros1(Float totalSinOtros1) {
		TotalSinOtros1 = totalSinOtros1;
	}

	public Float getTotalSinOtros2() {
		return TotalSinOtros2;
	}

	public void setTotalSinOtros2(Float totalSinOtros2) {
		TotalSinOtros2 = totalSinOtros2;
	}

	public Float getTotalSinOtros3() {
		return TotalSinOtros3;
	}

	public void setTotalSinOtros3(Float totalSinOtros3) {
		TotalSinOtros3 = totalSinOtros3;
	}

	public Float getTotalSinOtros4() {
		return TotalSinOtros4;
	}

	public void setTotalSinOtros4(Float totalSinOtros4) {
		TotalSinOtros4 = totalSinOtros4;
	}

	public String getNumEstrato() {
		return NumEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		NumEstrato = numEstrato;
	}

	public boolean isIndAutoAvaluo() {
		return IndAutoAvaluo;
	}

	public void setIndAutoAvaluo(boolean indAutoAvaluo) {
		IndAutoAvaluo = indAutoAvaluo;
	}

	public Float getVlrAutoAvaluo() {
		return VlrAutoAvaluo;
	}

	public void setVlrAutoAvaluo(Float vlrAutoAvaluo) {
		VlrAutoAvaluo = vlrAutoAvaluo;
	}

	public String getF_AutoAvaluo() {
		return F_AutoAvaluo;
	}

	public void setF_AutoAvaluo(String f_AutoAvaluo) {
		F_AutoAvaluo = f_AutoAvaluo;
	}

	public String getAutoFormulario() {
		return AutoFormulario;
	}

	public void setAutoFormulario(String autoFormulario) {
		AutoFormulario = autoFormulario;
	}

	public Float getVlrDeudaValoriz() {
		return VlrDeudaValoriz;
	}

	public void setVlrDeudaValoriz(Float vlrDeudaValoriz) {
		VlrDeudaValoriz = vlrDeudaValoriz;
	}

	public Float getVlrDeudaValorizCap() {
		return VlrDeudaValorizCap;
	}

	public void setVlrDeudaValorizCap(Float vlrDeudaValorizCap) {
		VlrDeudaValorizCap = vlrDeudaValorizCap;
	}

	public Float getVlrDeudaValorizInt() {
		return VlrDeudaValorizInt;
	}

	public void setVlrDeudaValorizInt(Float vlrDeudaValorizInt) {
		VlrDeudaValorizInt = vlrDeudaValorizInt;
	}

	public Float getVlrAvaluoIGAC() {
		return VlrAvaluoIGAC;
	}

	public void setVlrAvaluoIGAC(Float vlrAvaluoIGAC) {
		VlrAvaluoIGAC = vlrAvaluoIGAC;
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

	public String getCodigo_Postal() {
		return Codigo_Postal;
	}

	public void setCodigo_Postal(String codigo_Postal) {
		Codigo_Postal = codigo_Postal;
	}

	public String getNombreContacto() {
		return NombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		NombreContacto = nombreContacto;
	}

	public String getTelefonoFijo() {
		return TelefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		TelefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return TelefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		TelefonoMovil = telefonoMovil;
	}

	public String getDireccionNotificacion() {
		return DireccionNotificacion;
	}

	public void setDireccionNotificacion(String direccionNotificacion) {
		DireccionNotificacion = direccionNotificacion;
	}

	public String getCiudadNotificacion() {
		return CiudadNotificacion;
	}

	public void setCiudadNotificacion(String ciudadNotificacion) {
		CiudadNotificacion = ciudadNotificacion;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getCodigoCatastral_15() {
		return CodigoCatastral_15;
	}

	public void setCodigoCatastral_15(String codigoCatastral_15) {
		CodigoCatastral_15 = codigoCatastral_15;
	}

	public Float getOrdenImpresion() {
		return OrdenImpresion;
	}

	public void setOrdenImpresion(Float ordenImpresion) {
		OrdenImpresion = ordenImpresion;
	}

	public boolean isExcCobroAlivios() {
		return ExcCobroAlivios;
	}

	public void setExcCobroAlivios(boolean excCobroAlivios) {
		ExcCobroAlivios = excCobroAlivios;
	}

	public String getNit_dbl() {
		return nit_dbl;
	}

	public void setNit_dbl(String nit_dbl) {
		this.nit_dbl = nit_dbl;
	}

	public Float getTotalVlrAporteVol() {
		return TotalVlrAporteVol;
	}

	public void setTotalVlrAporteVol(Float totalVlrAporteVol) {
		TotalVlrAporteVol = totalVlrAporteVol;
	}

	public boolean isIndExcAporteVol() {
		return indExcAporteVol;
	}

	public void setIndExcAporteVol(boolean indExcAporteVol) {
		this.indExcAporteVol = indExcAporteVol;
	}

	public boolean isIndImpuestoMaximo() {
		return indImpuestoMaximo;
	}

	public void setIndImpuestoMaximo(boolean indImpuestoMaximo) {
		this.indImpuestoMaximo = indImpuestoMaximo;
	}

	public boolean isIndReciprocas() {
		return IndReciprocas;
	}

	public void setIndReciprocas(boolean indReciprocas) {
		IndReciprocas = indReciprocas;
	}

	public Float getPaquetepdf() {
		return paquetepdf;
	}

	public void setPaquetepdf(Float paquetepdf) {
		this.paquetepdf = paquetepdf;
	}

	public boolean isImprimefactura() {
		return imprimefactura;
	}

	public void setImprimefactura(boolean imprimefactura) {
		this.imprimefactura = imprimefactura;
	}

	public boolean isIndGaraje() {
		return IndGaraje;
	}

	public void setIndGaraje(boolean indGaraje) {
		IndGaraje = indGaraje;
	}

	public Float getImpuestoAnterior() {
		return impuestoAnterior;
	}

	public void setImpuestoAnterior(Float impuestoAnterior) {
		this.impuestoAnterior = impuestoAnterior;
	}

	public Float getPorTarifAnterior() {
		return porTarifAnterior;
	}

	public void setPorTarifAnterior(Float porTarifAnterior) {
		this.porTarifAnterior = porTarifAnterior;
	}

	public Float getPorCobroAnterior() {
		return porCobroAnterior;
	}

	public void setPorCobroAnterior(Float porCobroAnterior) {
		this.porCobroAnterior = porCobroAnterior;
	}

	public String getTarifaAnterior() {
		return tarifaAnterior;
	}

	public void setTarifaAnterior(String tarifaAnterior) {
		this.tarifaAnterior = tarifaAnterior;
	}

	public String getRangoAnterior() {
		return rangoAnterior;
	}

	public void setRangoAnterior(String rangoAnterior) {
		this.rangoAnterior = rangoAnterior;
	}

	public Float getPorMaximoAnterior() {
		return porMaximoAnterior;
	}

	public void setPorMaximoAnterior(Float porMaximoAnterior) {
		this.porMaximoAnterior = porMaximoAnterior;
	}

	public Float getImpuestoActual() {
		return impuestoActual;
	}

	public void setImpuestoActual(Float impuestoActual) {
		this.impuestoActual = impuestoActual;
	}

	public Float getPorTarifActual() {
		return porTarifActual;
	}

	public void setPorTarifActual(Float porTarifActual) {
		this.porTarifActual = porTarifActual;
	}

	public Float getPorCobroActual() {
		return porCobroActual;
	}

	public void setPorCobroActual(Float porCobroActual) {
		this.porCobroActual = porCobroActual;
	}

	public Float getPorMaximoActual() {
		return porMaximoActual;
	}

	public void setPorMaximoActual(Float porMaximoActual) {
		this.porMaximoActual = porMaximoActual;
	}

	public Integer getPorRevisar() {
		return porRevisar;
	}

	public void setPorRevisar(Integer porRevisar) {
		this.porRevisar = porRevisar;
	}

	public Float getVariacion() {
		return variacion;
	}

	public void setVariacion(Float variacion) {
		this.variacion = variacion;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getRestringeMasivo() {
		return restringeMasivo;
	}

	public void setRestringeMasivo(Integer restringeMasivo) {
		this.restringeMasivo = restringeMasivo;
	}

	public String getReciproca() {
		return Reciproca;
	}

	public void setReciproca(String reciproca) {
		Reciproca = reciproca;
	}

	public boolean isIndMunicipio() {
		return IndMunicipio;
	}

	public void setIndMunicipio(boolean indMunicipio) {
		IndMunicipio = indMunicipio;
	}

	public String getUsoMunicipio() {
		return UsoMunicipio;
	}

	public void setUsoMunicipio(String usoMunicipio) {
		UsoMunicipio = usoMunicipio;
	}

	public Integer getId_Predios() {
		return Id_Predios;
	}

	public void setId_Predios(Integer id_Predios) {
		Id_Predios = id_Predios;
	}
    
    
}
