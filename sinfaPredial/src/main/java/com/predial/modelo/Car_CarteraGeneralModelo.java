package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Periodo")
public class Car_CarteraGeneralModelo {
    @Size(since = 0 , until = 6)
    @FormParam("Periodo")
    @NotNull(update = false)
    private String Periodo;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 20)
    @FormParam("Nit")
    @NotNull
    private String Nit;
    @Size(since = 0 , until = 300)
    @FormParam("Nombres")
    @NotNull
    private String Nombres;
    @Size(since = 0 , until = 50)
    @FormParam("CorreoElectronico")
    private String CorreoElectronico;
    @Size(since = -32768, until = 32767)
    @FormParam("CountAnos")
    private Integer CountAnos;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoInicial")
    @NotNull
    private Integer AnoInicial;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoFinal")
    @NotNull
    private Integer AnoFinal;
    @FormParam("VlrTotalDeuda")
    @NotNull
    private Float VlrTotalDeuda;
    @DateFormat
    @FormParam("Fecha")
    @NotNull
    private String Fecha;
    @FormParam("PagosAbonos")
    @NotNull
    private Float PagosAbonos;
    @DateFormat
    @FormParam("F_UltimoPago")
    private String F_UltimoPago;
    @FormParam("Cal_Cuantia")
    @NotNull
    private Float Cal_Cuantia;
    @FormParam("Cal_Edades")
    @NotNull
    private Float Cal_Edades;
    @FormParam("Cal_Obligaciones")
    @NotNull
    private Float Cal_Obligaciones;
    @Size(since = 0 , until = 3)
    @FormParam("Clas_Deudor")
    private String Clas_Deudor;
    @Size(since = 0 , until = 2)
    @FormParam("Estado")
    private String Estado;
    @FormParam("AreaHectareas")
    private Float AreaHectareas;
    @FormParam("AreaMetros")
    private Float AreaMetros;
    @Size(since = 0 , until = 10)
    @FormParam("TipoIdentificacion")
    private String TipoIdentificacion;
    @Size(since = 0 , until = 200)
    @FormParam("DireccionPredio")
    private String DireccionPredio;
    @Size(since = 0 , until = 100)
    @FormParam("DcasadaViuda")
    private String DcasadaViuda;
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    private Integer ano;
    @Size(since = -32768, until = 32767)
    @FormParam("anoPago")
    private Integer anoPago;
    @FormParam("DebeDesde")
    private Integer DebeDesde;
    @Size(since = 0 , until = 2)
    @FormParam("NumEstrato")
    private String NumEstrato;
    @Size(since = 0 , until = 5)
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 5)
    @FormParam("rango")
    private String rango;
    @Size(since = 0 , until = 4000)
    @FormParam("observaciones")
    private String observaciones;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_Car_CarteraGeneral;

	public Car_CarteraGeneralModelo(String periodo, String codigoCatastral, String nit, String nombres,
			String correoElectronico, Integer countAnos, Integer anoInicial, Integer anoFinal, Float vlrTotalDeuda,
			String fecha, Float pagosAbonos, String f_UltimoPago, Float cal_Cuantia, Float cal_Edades,
			Float cal_Obligaciones, String clas_Deudor, String estado, Float areaHectareas, Float areaMetros,
			String tipoIdentificacion, String direccionPredio, String dcasadaViuda, Integer ano, Integer anoPago,
			Integer debeDesde, String numEstrato, String tarifa, String rango, String observaciones,
			String codUnicoCatastral, Integer id_Car_CarteraGeneral) {
		super();
		Periodo = periodo;
		CodigoCatastral = codigoCatastral;
		Nit = nit;
		Nombres = nombres;
		CorreoElectronico = correoElectronico;
		CountAnos = countAnos;
		AnoInicial = anoInicial;
		AnoFinal = anoFinal;
		VlrTotalDeuda = vlrTotalDeuda;
		Fecha = fecha;
		PagosAbonos = pagosAbonos;
		F_UltimoPago = f_UltimoPago;
		Cal_Cuantia = cal_Cuantia;
		Cal_Edades = cal_Edades;
		Cal_Obligaciones = cal_Obligaciones;
		Clas_Deudor = clas_Deudor;
		Estado = estado;
		AreaHectareas = areaHectareas;
		AreaMetros = areaMetros;
		TipoIdentificacion = tipoIdentificacion;
		DireccionPredio = direccionPredio;
		DcasadaViuda = dcasadaViuda;
		this.ano = ano;
		this.anoPago = anoPago;
		DebeDesde = debeDesde;
		NumEstrato = numEstrato;
		this.tarifa = tarifa;
		this.rango = rango;
		this.observaciones = observaciones;
		CodUnicoCatastral = codUnicoCatastral;
		Id_Car_CarteraGeneral = id_Car_CarteraGeneral;
	}

	public Car_CarteraGeneralModelo() {
		super();
	}

	public String getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}

	public Integer getCountAnos() {
		return CountAnos;
	}

	public void setCountAnos(Integer countAnos) {
		CountAnos = countAnos;
	}

	public Integer getAnoInicial() {
		return AnoInicial;
	}

	public void setAnoInicial(Integer anoInicial) {
		AnoInicial = anoInicial;
	}

	public Integer getAnoFinal() {
		return AnoFinal;
	}

	public void setAnoFinal(Integer anoFinal) {
		AnoFinal = anoFinal;
	}

	public Float getVlrTotalDeuda() {
		return VlrTotalDeuda;
	}

	public void setVlrTotalDeuda(Float vlrTotalDeuda) {
		VlrTotalDeuda = vlrTotalDeuda;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Float getPagosAbonos() {
		return PagosAbonos;
	}

	public void setPagosAbonos(Float pagosAbonos) {
		PagosAbonos = pagosAbonos;
	}

	public String getF_UltimoPago() {
		return F_UltimoPago;
	}

	public void setF_UltimoPago(String f_UltimoPago) {
		F_UltimoPago = f_UltimoPago;
	}

	public Float getCal_Cuantia() {
		return Cal_Cuantia;
	}

	public void setCal_Cuantia(Float cal_Cuantia) {
		Cal_Cuantia = cal_Cuantia;
	}

	public Float getCal_Edades() {
		return Cal_Edades;
	}

	public void setCal_Edades(Float cal_Edades) {
		Cal_Edades = cal_Edades;
	}

	public Float getCal_Obligaciones() {
		return Cal_Obligaciones;
	}

	public void setCal_Obligaciones(Float cal_Obligaciones) {
		Cal_Obligaciones = cal_Obligaciones;
	}

	public String getClas_Deudor() {
		return Clas_Deudor;
	}

	public void setClas_Deudor(String clas_Deudor) {
		Clas_Deudor = clas_Deudor;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
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

	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}

	public String getDireccionPredio() {
		return DireccionPredio;
	}

	public void setDireccionPredio(String direccionPredio) {
		DireccionPredio = direccionPredio;
	}

	public String getDcasadaViuda() {
		return DcasadaViuda;
	}

	public void setDcasadaViuda(String dcasadaViuda) {
		DcasadaViuda = dcasadaViuda;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAnoPago() {
		return anoPago;
	}

	public void setAnoPago(Integer anoPago) {
		this.anoPago = anoPago;
	}

	public Integer getDebeDesde() {
		return DebeDesde;
	}

	public void setDebeDesde(Integer debeDesde) {
		DebeDesde = debeDesde;
	}

	public String getNumEstrato() {
		return NumEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		NumEstrato = numEstrato;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_Car_CarteraGeneral() {
		return Id_Car_CarteraGeneral;
	}

	public void setId_Car_CarteraGeneral(Integer id_Car_CarteraGeneral) {
		Id_Car_CarteraGeneral = id_Car_CarteraGeneral;
	}
    
}
