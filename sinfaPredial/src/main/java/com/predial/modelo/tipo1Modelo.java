package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class tipo1Modelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 3)
    @FormParam("Propietario")
    @NotNull(update = false)
    private String Propietario;
    @Size(since = 0 , until = 25)
    @FormParam("Resolucion")
    @NotNull(update = false)
    private String Resolucion;
    @Size(since = 0 , until = 2)
    @FormParam("Estado")
    @NotNull(update = false)
    private String Estado;
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private Float Consecutivo;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoTarifa")
    private Integer AnoTarifa;
    @FormParam("Avaluo")
    private Float Avaluo;
    @Size(since = 0 , until = 100)
    @FormParam("Nombres")
    private String Nombres;
    @Size(since = 0 , until = 13)
    @FormParam("Nit")
    private String Nit;
    @Size(since = 0 , until = 100)
    @FormParam("DireccionPredio")
    private String DireccionPredio;
    @FormParam("AreaMetros")
    private Float  AreaMetros;
    @FormParam("AreaConstruida")
    private Float  AreaConstruida;
    @Size(since = 0 , until = 1)
    @FormParam("TipoNit")
    private String TipoNit;
    @Size(since = 0 , until = 3)
    @FormParam("NroRegistros")
    private String NroRegistros;
    @Size(since = 0 , until = 2)
    @FormParam("Departamento")
    private String Departamento;
    @Size(since = 0 , until = 3)
    @FormParam("Municipio")
    private String Municipio;
    @Size(since = 0 , until = 1)
    @FormParam("TipoRegistro")
    private String TipoRegistro;
    @Size(since = 0 , until = 2)
    @FormParam("DestinoEconomico")
    private String DestinoEconomico;
    @Size(since = 0 , until = 1)
    @FormParam("CondicionTributaria")
    private String CondicionTributaria;
    @Size(since = 0 , until = 5)
    @FormParam("radicacion")
    private String radicacion;
    @Size(since = 0 , until = 2)
    @FormParam("mutacion")
    private String mutacion;
    @Size(since = 0 , until = 1)
    @FormParam("DcasadaViuda")
    private String DcasadaViuda;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCancelado")
    private String CodigoCancelado;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    private String Rango;
    @FormParam("AnoPago")
    private Float AnoPago;
    @FormParam("AreaMetrosAnt")
    private Float AreaMetrosAnt;
    @FormParam("AreaConstrAnt")
    private Float AreaConstrAnt;
    @FormParam("AvaluoAnterior")
    private Float AvaluoAnterior;
    @FormParam("Ind_PorRevisar")
    private boolean Ind_PorRevisar;
    @FormParam("Ind_Cargado")
    private boolean Ind_Cargado;
    @Size(since = 0 , until = 1000)
    @FormParam("Detalle")
    private String Detalle;
    @FormParam("AvaluoAnoAnterior")
    private Float AvaluoAnoAnterior;
    @FormParam("AvaluoSistema")
    private Float AvaluoSistema;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoInicial")
    private Integer AnoInicial;
    @Size(since = -32768, until = 32767)
    @FormParam("CuotaInicial")
    private Integer CuotaInicial;
    @FormParam("IndLoteAnt")
    private boolean IndLoteAnt;
    @FormParam("Ind_incorporar")
    private boolean Ind_incorporar;
    @FormParam("VlrDeuda")
    private Float VlrDeuda;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 8)
    @FormParam("vigencia")
    private String vigencia;
    @Size(since = 0 , until = 50)
    @FormParam("matricula")
    private String matricula;

    private Integer Id_tipo1;

	public tipo1Modelo(String codigoCatastral, String propietario, String resolucion, String estado, Float consecutivo,
			Integer ano, Integer anoTarifa, Float avaluo, String nombres, String nit, String direccionPredio,
			Float areaMetros, Float areaConstruida, String tipoNit, String nroRegistros, String departamento,
			String municipio, String tipoRegistro, String destinoEconomico, String condicionTributaria,
			String radicacion, String mutacion, String dcasadaViuda, String codigoCancelado, String tarifa,
			String rango, Float anoPago, Float areaMetrosAnt, Float areaConstrAnt, Float avaluoAnterior,
			boolean ind_PorRevisar, boolean ind_Cargado, String detalle, Float avaluoAnoAnterior, Float avaluoSistema,
			Integer anoInicial, Integer cuotaInicial, boolean indLoteAnt, boolean ind_incorporar, Float vlrDeuda,
			String codUnicoCatastral, String vigencia, String matricula, Integer id_tipo1) {
		super();
		CodigoCatastral = codigoCatastral;
		Propietario = propietario;
		Resolucion = resolucion;
		Estado = estado;
		Consecutivo = consecutivo;
		Ano = ano;
		AnoTarifa = anoTarifa;
		Avaluo = avaluo;
		Nombres = nombres;
		Nit = nit;
		DireccionPredio = direccionPredio;
		AreaMetros = areaMetros;
		AreaConstruida = areaConstruida;
		TipoNit = tipoNit;
		NroRegistros = nroRegistros;
		Departamento = departamento;
		Municipio = municipio;
		TipoRegistro = tipoRegistro;
		DestinoEconomico = destinoEconomico;
		CondicionTributaria = condicionTributaria;
		this.radicacion = radicacion;
		this.mutacion = mutacion;
		DcasadaViuda = dcasadaViuda;
		CodigoCancelado = codigoCancelado;
		Tarifa = tarifa;
		Rango = rango;
		AnoPago = anoPago;
		AreaMetrosAnt = areaMetrosAnt;
		AreaConstrAnt = areaConstrAnt;
		AvaluoAnterior = avaluoAnterior;
		Ind_PorRevisar = ind_PorRevisar;
		Ind_Cargado = ind_Cargado;
		Detalle = detalle;
		AvaluoAnoAnterior = avaluoAnoAnterior;
		AvaluoSistema = avaluoSistema;
		AnoInicial = anoInicial;
		CuotaInicial = cuotaInicial;
		IndLoteAnt = indLoteAnt;
		Ind_incorporar = ind_incorporar;
		VlrDeuda = vlrDeuda;
		CodUnicoCatastral = codUnicoCatastral;
		this.vigencia = vigencia;
		this.matricula = matricula;
		Id_tipo1 = id_tipo1;
	}

	public tipo1Modelo() {
		super();
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

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Float getConsecutivo() {
		return Consecutivo;
	}

	public void setConsecutivo(Float consecutivo) {
		Consecutivo = consecutivo;
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

	public Float getAvaluo() {
		return Avaluo;
	}

	public void setAvaluo(Float avaluo) {
		Avaluo = avaluo;
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

	public String getDireccionPredio() {
		return DireccionPredio;
	}

	public void setDireccionPredio(String direccionPredio) {
		DireccionPredio = direccionPredio;
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

	public String getRadicacion() {
		return radicacion;
	}

	public void setRadicacion(String radicacion) {
		this.radicacion = radicacion;
	}

	public String getMutacion() {
		return mutacion;
	}

	public void setMutacion(String mutacion) {
		this.mutacion = mutacion;
	}

	public String getDcasadaViuda() {
		return DcasadaViuda;
	}

	public void setDcasadaViuda(String dcasadaViuda) {
		DcasadaViuda = dcasadaViuda;
	}

	public String getCodigoCancelado() {
		return CodigoCancelado;
	}

	public void setCodigoCancelado(String codigoCancelado) {
		CodigoCancelado = codigoCancelado;
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

	public Float getAnoPago() {
		return AnoPago;
	}

	public void setAnoPago(Float anoPago) {
		AnoPago = anoPago;
	}

	public Float getAreaMetrosAnt() {
		return AreaMetrosAnt;
	}

	public void setAreaMetrosAnt(Float areaMetrosAnt) {
		AreaMetrosAnt = areaMetrosAnt;
	}

	public Float getAreaConstrAnt() {
		return AreaConstrAnt;
	}

	public void setAreaConstrAnt(Float areaConstrAnt) {
		AreaConstrAnt = areaConstrAnt;
	}

	public Float getAvaluoAnterior() {
		return AvaluoAnterior;
	}

	public void setAvaluoAnterior(Float avaluoAnterior) {
		AvaluoAnterior = avaluoAnterior;
	}

	public boolean isInd_PorRevisar() {
		return Ind_PorRevisar;
	}

	public void setInd_PorRevisar(boolean ind_PorRevisar) {
		Ind_PorRevisar = ind_PorRevisar;
	}

	public boolean isInd_Cargado() {
		return Ind_Cargado;
	}

	public void setInd_Cargado(boolean ind_Cargado) {
		Ind_Cargado = ind_Cargado;
	}

	public String getDetalle() {
		return Detalle;
	}

	public void setDetalle(String detalle) {
		Detalle = detalle;
	}

	public Float getAvaluoAnoAnterior() {
		return AvaluoAnoAnterior;
	}

	public void setAvaluoAnoAnterior(Float avaluoAnoAnterior) {
		AvaluoAnoAnterior = avaluoAnoAnterior;
	}

	public Float getAvaluoSistema() {
		return AvaluoSistema;
	}

	public void setAvaluoSistema(Float avaluoSistema) {
		AvaluoSistema = avaluoSistema;
	}

	public Integer getAnoInicial() {
		return AnoInicial;
	}

	public void setAnoInicial(Integer anoInicial) {
		AnoInicial = anoInicial;
	}

	public Integer getCuotaInicial() {
		return CuotaInicial;
	}

	public void setCuotaInicial(Integer cuotaInicial) {
		CuotaInicial = cuotaInicial;
	}

	public boolean isIndLoteAnt() {
		return IndLoteAnt;
	}

	public void setIndLoteAnt(boolean indLoteAnt) {
		IndLoteAnt = indLoteAnt;
	}

	public boolean isInd_incorporar() {
		return Ind_incorporar;
	}

	public void setInd_incorporar(boolean ind_incorporar) {
		Ind_incorporar = ind_incorporar;
	}

	public Float getVlrDeuda() {
		return VlrDeuda;
	}

	public void setVlrDeuda(Float vlrDeuda) {
		VlrDeuda = vlrDeuda;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getId_tipo1() {
		return Id_tipo1;
	}

	public void setId_tipo1(Integer id_tipo1) {
		Id_tipo1 = id_tipo1;
	}
    
}
