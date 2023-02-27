package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Periodo")
public class Car_CarteraGeneral_OtrosModelo {
    @Size(since = 0 , until = 6)
    @FormParam("Periodo")
    @NotNull(update = false)
    private String Periodo;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    @NotNull(update = false)
    private Integer ano;
    @Size(since = 0 , until = 10)
    @FormParam("Concepto")
    @NotNull(update = false)
    private String Concepto;
    @Size(since = -32768, until = 32767)
    @FormParam("cuota")
    private Integer cuota;
    @FormParam("vlrConcepto")
    private Float vlrConcepto;
    @FormParam("vlrInteres")
    private Float vlrInteres;
    @FormParam("vlrDescuento")
    private Float vlrDescuento;
    @DateFormat
    @FormParam("f_Pago")
    private String f_Pago;
    @Size(since = 0 , until = 20)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @FormParam("IndPago")
    private boolean IndPago;
    @Size(since = 0 , until = 100)
    @FormParam("Banco")
    private String Banco;
    @Size(since = 0 , until = 5)
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 5)
    @FormParam("rango")
    private String rango;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_Car_CarteraGeneral_Otros;

	public Car_CarteraGeneral_OtrosModelo(String periodo, String codigoCatastral, Integer ano, String concepto,
			Integer cuota, Float vlrConcepto, Float vlrInteres, Float vlrDescuento, String f_Pago,
			String nroComprobante, boolean indPago, String banco, String tarifa, String rango, String codUnicoCatastral,
			Integer id_Car_CarteraGeneral_Otros) {
		super();
		Periodo = periodo;
		CodigoCatastral = codigoCatastral;
		this.ano = ano;
		Concepto = concepto;
		this.cuota = cuota;
		this.vlrConcepto = vlrConcepto;
		this.vlrInteres = vlrInteres;
		this.vlrDescuento = vlrDescuento;
		this.f_Pago = f_Pago;
		NroComprobante = nroComprobante;
		IndPago = indPago;
		Banco = banco;
		this.tarifa = tarifa;
		this.rango = rango;
		CodUnicoCatastral = codUnicoCatastral;
		Id_Car_CarteraGeneral_Otros = id_Car_CarteraGeneral_Otros;
	}

	public Car_CarteraGeneral_OtrosModelo() {
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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public Float getVlrConcepto() {
		return vlrConcepto;
	}

	public void setVlrConcepto(Float vlrConcepto) {
		this.vlrConcepto = vlrConcepto;
	}

	public Float getVlrInteres() {
		return vlrInteres;
	}

	public void setVlrInteres(Float vlrInteres) {
		this.vlrInteres = vlrInteres;
	}

	public Float getVlrDescuento() {
		return vlrDescuento;
	}

	public void setVlrDescuento(Float vlrDescuento) {
		this.vlrDescuento = vlrDescuento;
	}

	public String getF_Pago() {
		return f_Pago;
	}

	public void setF_Pago(String f_Pago) {
		this.f_Pago = f_Pago;
	}

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public boolean isIndPago() {
		return IndPago;
	}

	public void setIndPago(boolean indPago) {
		IndPago = indPago;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
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

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_Car_CarteraGeneral_Otros() {
		return Id_Car_CarteraGeneral_Otros;
	}

	public void setId_Car_CarteraGeneral_Otros(Integer id_Car_CarteraGeneral_Otros) {
		Id_Car_CarteraGeneral_Otros = id_Car_CarteraGeneral_Otros;
	}
    
}
