package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class OtrosCobrosModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @FormParam("Cuota")
    @NotNull(update = false)
    private Integer Cuota;
    @Size(since = 0 , until = 2)
    @FormParam("Concepto")
    @NotNull(update = false)
    private String Concepto;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    private String Rango;
    @FormParam("VlrConcepto")
    private Float VlrConcepto;
    @FormParam("VlrInteres")
    private Float VlrInteres;
    @FormParam("VlrDescuento")
    private Float VlrDescuento;
    @FormParam("IndPago")
    private boolean IndPago;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
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
    @Size(since = 0 , until = 20)
    @FormParam("UsuarioRegistroPago")
    private String UsuarioRegistroPago;
    @FormParam("VlrConcepto2")
    private Float VlrConcepto2;
    @FormParam("VlrConcepto3")
    private Float VlrConcepto3;
    @FormParam("VlrConcepto4")
    private Float VlrConcepto4;
    @FormParam("Ajuste2")
    private Float Ajuste2;
    @FormParam("Ajuste3")
    private Float Ajuste3;
    @FormParam("Ajuste4")
    private Float Ajuste4;
    @FormParam("VlrInteres2")
    private Float VlrInteres2;
    @FormParam("VlrInteres3")
    private Float VlrInteres3;
    @FormParam("VlrInteres4")
    private Float VlrInteres4;
    @FormParam("abVlrConcepto")
    @NotNull
    private Float abVlrConcepto;
    @FormParam("AbvlrInteres")
    @NotNull
    private Float AbvlrInteres;
    @DateFormat
    @FormParam("FechaRegistro")
    private String FechaRegistro;
    @FormParam("TotalVlrConcepto")
    private Float TotalVlrConcepto;
    @FormParam("TotalVlrInteres")
    private Float TotalVlrInteres;
    @FormParam("VlrDtoLey1066")
    private Float VlrDtoLey1066;
    @FormParam("IndAcuerdoPago")
    private boolean IndAcuerdoPago;
    @DateFormat
    @FormParam("F_AcuerdoPago")
    private String F_AcuerdoPago;
    @FormParam("IndCartera")
    private boolean IndCartera;
    @DateFormat
    private String F_cartera;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @FormParam("AnoAcuerdo")
    private Float AnoAcuerdo;
    @FormParam("AC_VlrDctoConcepto")
    private Float AC_VlrDctoConcepto;
    @FormParam("AC_VlrDctoInteres")
    private Float AC_VlrDctoInteres;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoAlivio")
    private Integer AnoAlivio;
    @Size(since = -32768, until = 32767)
    @FormParam("CodigoAlivio")
    private Integer CodigoAlivio;
    @Size(since = 0 , until = 10)
    @FormParam("NroAlivio")
    private String NroAlivio;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @Size(since = 0 , until = 5)
    @FormParam("estratoOtrosCobros")
    private String estratoOtrosCobros;
    @FormParam("origenRegistroPago")
    private boolean origenRegistroPago;
    
    private Integer Id_OtrosCobros;

	public OtrosCobrosModelo() {
		super();
	}

	public OtrosCobrosModelo(String codigoCatastral, Integer ano, Integer cuota, String concepto, String tarifa,
			String rango, Float vlrConcepto, Float vlrInteres, Float vlrDescuento, boolean indPago, String f_Pago,
			String nroComprobante, String banco, Integer anoBanco, Integer paquete, String tipoPago, Float ajuste,
			String usuarioRegistroPago, Float vlrConcepto2, Float vlrConcepto3, Float vlrConcepto4, Float ajuste2,
			Float ajuste3, Float ajuste4, Float vlrInteres2, Float vlrInteres3, Float vlrInteres4, Float abVlrConcepto,
			Float abvlrInteres, String fechaRegistro, Float totalVlrConcepto, Float totalVlrInteres,
			Float vlrDtoLey1066, boolean indAcuerdoPago, String f_AcuerdoPago, boolean indCartera, String f_cartera,
			String nroAcuerdo, Float anoAcuerdo, Float aC_VlrDctoConcepto, Float aC_VlrDctoInteres, Integer anoAlivio,
			Integer codigoAlivio, String nroAlivio, String codUnicoCatastral, String fechaCreacion,
			String estratoOtrosCobros, boolean origenRegistroPago, Integer id_OtrosCobros) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Cuota = cuota;
		Concepto = concepto;
		Tarifa = tarifa;
		Rango = rango;
		VlrConcepto = vlrConcepto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		IndPago = indPago;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		Banco = banco;
		AnoBanco = anoBanco;
		Paquete = paquete;
		TipoPago = tipoPago;
		this.ajuste = ajuste;
		UsuarioRegistroPago = usuarioRegistroPago;
		VlrConcepto2 = vlrConcepto2;
		VlrConcepto3 = vlrConcepto3;
		VlrConcepto4 = vlrConcepto4;
		Ajuste2 = ajuste2;
		Ajuste3 = ajuste3;
		Ajuste4 = ajuste4;
		VlrInteres2 = vlrInteres2;
		VlrInteres3 = vlrInteres3;
		VlrInteres4 = vlrInteres4;
		this.abVlrConcepto = abVlrConcepto;
		AbvlrInteres = abvlrInteres;
		FechaRegistro = fechaRegistro;
		TotalVlrConcepto = totalVlrConcepto;
		TotalVlrInteres = totalVlrInteres;
		VlrDtoLey1066 = vlrDtoLey1066;
		IndAcuerdoPago = indAcuerdoPago;
		F_AcuerdoPago = f_AcuerdoPago;
		IndCartera = indCartera;
		F_cartera = f_cartera;
		NroAcuerdo = nroAcuerdo;
		AnoAcuerdo = anoAcuerdo;
		AC_VlrDctoConcepto = aC_VlrDctoConcepto;
		AC_VlrDctoInteres = aC_VlrDctoInteres;
		AnoAlivio = anoAlivio;
		CodigoAlivio = codigoAlivio;
		NroAlivio = nroAlivio;
		CodUnicoCatastral = codUnicoCatastral;
		this.fechaCreacion = fechaCreacion;
		this.estratoOtrosCobros = estratoOtrosCobros;
		this.origenRegistroPago = origenRegistroPago;
		Id_OtrosCobros = id_OtrosCobros;
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

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
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

	public Float getVlrConcepto() {
		return VlrConcepto;
	}

	public void setVlrConcepto(Float vlrConcepto) {
		VlrConcepto = vlrConcepto;
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

	public String getUsuarioRegistroPago() {
		return UsuarioRegistroPago;
	}

	public void setUsuarioRegistroPago(String usuarioRegistroPago) {
		UsuarioRegistroPago = usuarioRegistroPago;
	}

	public Float getVlrConcepto2() {
		return VlrConcepto2;
	}

	public void setVlrConcepto2(Float vlrConcepto2) {
		VlrConcepto2 = vlrConcepto2;
	}

	public Float getVlrConcepto3() {
		return VlrConcepto3;
	}

	public void setVlrConcepto3(Float vlrConcepto3) {
		VlrConcepto3 = vlrConcepto3;
	}

	public Float getVlrConcepto4() {
		return VlrConcepto4;
	}

	public void setVlrConcepto4(Float vlrConcepto4) {
		VlrConcepto4 = vlrConcepto4;
	}

	public Float getAjuste2() {
		return Ajuste2;
	}

	public void setAjuste2(Float ajuste2) {
		Ajuste2 = ajuste2;
	}

	public Float getAjuste3() {
		return Ajuste3;
	}

	public void setAjuste3(Float ajuste3) {
		Ajuste3 = ajuste3;
	}

	public Float getAjuste4() {
		return Ajuste4;
	}

	public void setAjuste4(Float ajuste4) {
		Ajuste4 = ajuste4;
	}

	public Float getVlrInteres2() {
		return VlrInteres2;
	}

	public void setVlrInteres2(Float vlrInteres2) {
		VlrInteres2 = vlrInteres2;
	}

	public Float getVlrInteres3() {
		return VlrInteres3;
	}

	public void setVlrInteres3(Float vlrInteres3) {
		VlrInteres3 = vlrInteres3;
	}

	public Float getVlrInteres4() {
		return VlrInteres4;
	}

	public void setVlrInteres4(Float vlrInteres4) {
		VlrInteres4 = vlrInteres4;
	}

	public Float getAbVlrConcepto() {
		return abVlrConcepto;
	}

	public void setAbVlrConcepto(Float abVlrConcepto) {
		this.abVlrConcepto = abVlrConcepto;
	}

	public Float getAbvlrInteres() {
		return AbvlrInteres;
	}

	public void setAbvlrInteres(Float abvlrInteres) {
		AbvlrInteres = abvlrInteres;
	}

	public String getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	public Float getTotalVlrConcepto() {
		return TotalVlrConcepto;
	}

	public void setTotalVlrConcepto(Float totalVlrConcepto) {
		TotalVlrConcepto = totalVlrConcepto;
	}

	public Float getTotalVlrInteres() {
		return TotalVlrInteres;
	}

	public void setTotalVlrInteres(Float totalVlrInteres) {
		TotalVlrInteres = totalVlrInteres;
	}

	public Float getVlrDtoLey1066() {
		return VlrDtoLey1066;
	}

	public void setVlrDtoLey1066(Float vlrDtoLey1066) {
		VlrDtoLey1066 = vlrDtoLey1066;
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

	public Float getAC_VlrDctoConcepto() {
		return AC_VlrDctoConcepto;
	}

	public void setAC_VlrDctoConcepto(Float aC_VlrDctoConcepto) {
		AC_VlrDctoConcepto = aC_VlrDctoConcepto;
	}

	public Float getAC_VlrDctoInteres() {
		return AC_VlrDctoInteres;
	}

	public void setAC_VlrDctoInteres(Float aC_VlrDctoInteres) {
		AC_VlrDctoInteres = aC_VlrDctoInteres;
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

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getEstratoOtrosCobros() {
		return estratoOtrosCobros;
	}

	public void setEstratoOtrosCobros(String estratoOtrosCobros) {
		this.estratoOtrosCobros = estratoOtrosCobros;
	}

	public boolean isOrigenRegistroPago() {
		return origenRegistroPago;
	}

	public void setOrigenRegistroPago(boolean origenRegistroPago) {
		this.origenRegistroPago = origenRegistroPago;
	}

	public Integer getId_OtrosCobros() {
		return Id_OtrosCobros;
	}

	public void setId_OtrosCobros(Integer id_OtrosCobros) {
		Id_OtrosCobros = id_OtrosCobros;
	}
    
}
