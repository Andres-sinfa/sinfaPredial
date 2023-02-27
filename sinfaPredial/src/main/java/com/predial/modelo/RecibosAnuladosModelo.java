package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class RecibosAnuladosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @Size(since = 0 , until = 10)
    @FormParam("Banco")
    private String Banco;
    @FormParam("ValorRecibo")
    private Float ValorRecibo;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoPago")
    private Integer AnoPago;
    @DateFormat
    @FormParam("F_Anulacion")
    private String F_Anulacion;
    @DateFormat
    @FormParam("Hora")
    private String Hora;
    @Size(since = 0 , until = 10)
    @FormParam("Usuario")
    private String Usuario;
    @FormParam("Observaciones")
    private String Observaciones;
    @Size(since = 0 , until = 10)
    @FormParam("EquipoRegistro")
    private String EquipoRegistro;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    @NotNull(update = false)
    private String NroComprobante;
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private Float Consecutivo;
    @FormParam("AnoPagoInicial")
    private Float AnoPagoInicial;
    @FormParam("AnoPagoFinal")
    private Float AnoPagoFinal;
    @FormParam("RECIBO")
    private Float RECIBO;
    @Size(since = 0 , until = 10)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    
    private Integer Id_RecibosAnulados;

	public RecibosAnuladosModelo() {
		super();
	}

	public RecibosAnuladosModelo(String codigoCatastral, String f_Pago, Integer anoBanco, String banco,
			Float valorRecibo, Integer anoPago, String f_Anulacion, String hora, String usuario, String observaciones,
			String equipoRegistro, String nroComprobante, Float consecutivo, Float anoPagoInicial, Float anoPagoFinal,
			Float rECIBO, String codUnicoCatastral, Integer id_RecibosAnulados) {
		super();
		CodigoCatastral = codigoCatastral;
		F_Pago = f_Pago;
		AnoBanco = anoBanco;
		Banco = banco;
		ValorRecibo = valorRecibo;
		AnoPago = anoPago;
		F_Anulacion = f_Anulacion;
		Hora = hora;
		Usuario = usuario;
		Observaciones = observaciones;
		EquipoRegistro = equipoRegistro;
		NroComprobante = nroComprobante;
		Consecutivo = consecutivo;
		AnoPagoInicial = anoPagoInicial;
		AnoPagoFinal = anoPagoFinal;
		RECIBO = rECIBO;
		CodUnicoCatastral = codUnicoCatastral;
		Id_RecibosAnulados = id_RecibosAnulados;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getF_Pago() {
		return F_Pago;
	}

	public void setF_Pago(String f_Pago) {
		F_Pago = f_Pago;
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

	public Float getValorRecibo() {
		return ValorRecibo;
	}

	public void setValorRecibo(Float valorRecibo) {
		ValorRecibo = valorRecibo;
	}

	public Integer getAnoPago() {
		return AnoPago;
	}

	public void setAnoPago(Integer anoPago) {
		AnoPago = anoPago;
	}

	public String getF_Anulacion() {
		return F_Anulacion;
	}

	public void setF_Anulacion(String f_Anulacion) {
		F_Anulacion = f_Anulacion;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public String getEquipoRegistro() {
		return EquipoRegistro;
	}

	public void setEquipoRegistro(String equipoRegistro) {
		EquipoRegistro = equipoRegistro;
	}

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public Float getConsecutivo() {
		return Consecutivo;
	}

	public void setConsecutivo(Float consecutivo) {
		Consecutivo = consecutivo;
	}

	public Float getAnoPagoInicial() {
		return AnoPagoInicial;
	}

	public void setAnoPagoInicial(Float anoPagoInicial) {
		AnoPagoInicial = anoPagoInicial;
	}

	public Float getAnoPagoFinal() {
		return AnoPagoFinal;
	}

	public void setAnoPagoFinal(Float anoPagoFinal) {
		AnoPagoFinal = anoPagoFinal;
	}

	public Float getRECIBO() {
		return RECIBO;
	}

	public void setRECIBO(Float rECIBO) {
		RECIBO = rECIBO;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_RecibosAnulados() {
		return Id_RecibosAnulados;
	}

	public void setId_RecibosAnulados(Integer id_RecibosAnulados) {
		Id_RecibosAnulados = id_RecibosAnulados;
	}
    
}
