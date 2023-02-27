package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class NuevosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @NotNull(update = false)
    @Size(since = 0 , until = 3)
    @FormParam("Propietario")
    private String Propietario;
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
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
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
    @Size(since = 0 , until = 1)
    @FormParam("Comuna")
    private String Comuna;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    
    private Integer Id_Nuevos;

	public NuevosModelo() {
		super();
	}

	public NuevosModelo(String codigoCatastral, String propietario, Integer ano, Integer anoTarifa, String tarifa,
			String rango, Float avaluo, Integer anoAnterior, Float avaluoAnterior, Integer anoPago, Float vlrPagado,
			String f_Pago, Float vlrPagadoAnterior, String f_PagoAnterior, String nroFacturaAnterior,
			String nroComprobante, String nombres, String nit, String nombrePredio, String barrio,
			String direccionPredio, String direccionCorrespondencia, Float areaHectareas, Float areaMetros,
			Float areaConstruida, Integer anoConstruccion, boolean excImpuesto, boolean excCAR, boolean excSobretasa,
			boolean excOtros, String resolucion, String observaciones, String tipoNit, String nroRegistros,
			boolean indUrbano, Integer anoInicial, String matricula, String banco, String departamento,
			String municipio, String tipoRegistro, String dcasadaViuda, String destinoEconomico,
			String condicionTributaria, String f_proceso, String estado, String comuna, String codUnicoCatastral,
			Integer id_Nuevos) {
		super();
		CodigoCatastral = codigoCatastral;
		Propietario = propietario;
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
		Nombres = nombres;
		Nit = nit;
		NombrePredio = nombrePredio;
		Barrio = barrio;
		DireccionPredio = direccionPredio;
		DireccionCorrespondencia = direccionCorrespondencia;
		AreaHectareas = areaHectareas;
		AreaMetros = areaMetros;
		AreaConstruida = areaConstruida;
		AnoConstruccion = anoConstruccion;
		ExcImpuesto = excImpuesto;
		ExcCAR = excCAR;
		ExcSobretasa = excSobretasa;
		ExcOtros = excOtros;
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
		DcasadaViuda = dcasadaViuda;
		DestinoEconomico = destinoEconomico;
		CondicionTributaria = condicionTributaria;
		F_proceso = f_proceso;
		Estado = estado;
		Comuna = comuna;
		CodUnicoCatastral = codUnicoCatastral;
		Id_Nuevos = id_Nuevos;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getPropietario() {
		return Propietario;
	}

	public void setPropietario(String propietario) {
		Propietario = propietario;
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

	public String getComuna() {
		return Comuna;
	}

	public void setComuna(String comuna) {
		Comuna = comuna;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_Nuevos() {
		return Id_Nuevos;
	}

	public void setId_Nuevos(Integer id_Nuevos) {
		Id_Nuevos = id_Nuevos;
	}
    
    
}
