package com.predial.modelo;

import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;

import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class AbonosOtrosModelo {
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
    @Size(since = 0 , until = 2)
    @NotNull(update = false)
    @FormParam("Concepto")
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
    @FormParam("ajuste")
    private Float ajuste;
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
    @Size(since = 0 , until = 30)
    @FormParam("UsuarioRegistroPago")
    private String UsuarioRegistroPago;
    @NotNull
    @FormParam("vlrSaldoInteres")
    private Float vlrSaldoInteres;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @DateFormat
    @FormParam("f_presentacion")
    private String f_presentacion;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @FormParam("origenRegistroPago")
    private boolean origenRegistroPago;

    private Integer Id_AbonosOtros;

	public AbonosOtrosModelo(String codigoCatastral, Integer ano, Integer cuota, Integer numero, String concepto,
			String tarifa, String rango, Float vlrConcepto, Float vlrInteres, Float vlrDescuento, Float ajuste,
			boolean indPago, String f_Pago, String nroComprobante, String banco, Integer anoBanco, Integer paquete,
			String usuarioRegistroPago, Float vlrSaldoInteres, String nroAcuerdo, String f_presentacion,
			String codUnicoCatastral, String fechaCreacion, boolean origenRegistroPago, Integer id_AbonosOtros) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Cuota = cuota;
		Numero = numero;
		Concepto = concepto;
		Tarifa = tarifa;
		Rango = rango;
		VlrConcepto = vlrConcepto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		this.ajuste = ajuste;
		IndPago = indPago;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		Banco = banco;
		AnoBanco = anoBanco;
		Paquete = paquete;
		UsuarioRegistroPago = usuarioRegistroPago;
		this.vlrSaldoInteres = vlrSaldoInteres;
		NroAcuerdo = nroAcuerdo;
		this.f_presentacion = f_presentacion;
		CodUnicoCatastral = codUnicoCatastral;
		this.fechaCreacion = fechaCreacion;
		this.origenRegistroPago = origenRegistroPago;
		Id_AbonosOtros = id_AbonosOtros;
	}

	public AbonosOtrosModelo() {
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

	public Float getVlrSaldoInteres() {
		return vlrSaldoInteres;
	}

	public void setVlrSaldoInteres(Float vlrSaldoInteres) {
		this.vlrSaldoInteres = vlrSaldoInteres;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public String getF_presentacion() {
		return f_presentacion;
	}

	public void setF_presentacion(String f_presentacion) {
		this.f_presentacion = f_presentacion;
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

	public boolean isOrigenRegistroPago() {
		return origenRegistroPago;
	}

	public void setOrigenRegistroPago(boolean origenRegistroPago) {
		this.origenRegistroPago = origenRegistroPago;
	}

	public Integer getId_AbonosOtros() {
		return Id_AbonosOtros;
	}

	public void setId_AbonosOtros(Integer id_AbonosOtros) {
		Id_AbonosOtros = id_AbonosOtros;
	}
    
}
