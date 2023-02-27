package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class CuotasModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    @NotNull(update = false)
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("Rango")
    @NotNull(update = false)
    private String Rango;
    @Size(since = -32768, until = 32767)
    @FormParam("Cuota")
    @NotNull(update = false)
    private Integer Cuota;
    @Size(since = -32768, until = 32767)
    @FormParam("MesPago")
    private Integer MesPago;
    @FormParam("VlrCuota")
    private Float VlrCuota;
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
    @FormParam("IndPago")
    private boolean IndPago;
    @FormParam("VlrCredito")
    private Float VlrCredito;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @DateFormat
    @FormParam("F_Credito")
    private String F_Credito;
    @Size(since = 0 , until = 10)
    @FormParam("ComprobanteCredito")
    private String ComprobanteCredito;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_Cuotas;

	public CuotasModelo() {
		super();
	}
	
	

	public CuotasModelo(String codigoCatastral, Integer ano, String tarifa, String rango, Integer cuota,
			Integer mesPago, Float vlrCuota, Float vlrImpuesto, Float vlrInteres, Float vlrDescuento,
			Float vlrSobretasa, Float vlrCAR, Float vlrInteresCar, boolean indPago, Float vlrCredito, String f_Pago,
			String nroComprobante, String banco, String f_Credito, String comprobanteCredito, Integer anoBanco,
			String codUnicoCatastral, Integer id_Cuotas) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Tarifa = tarifa;
		Rango = rango;
		Cuota = cuota;
		MesPago = mesPago;
		VlrCuota = vlrCuota;
		VlrImpuesto = vlrImpuesto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		VlrSobretasa = vlrSobretasa;
		VlrCAR = vlrCAR;
		VlrInteresCar = vlrInteresCar;
		IndPago = indPago;
		VlrCredito = vlrCredito;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		Banco = banco;
		F_Credito = f_Credito;
		ComprobanteCredito = comprobanteCredito;
		AnoBanco = anoBanco;
		CodUnicoCatastral = codUnicoCatastral;
		Id_Cuotas = id_Cuotas;
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

	public Integer getCuota() {
		return Cuota;
	}

	public void setCuota(Integer cuota) {
		Cuota = cuota;
	}

	public Integer getMesPago() {
		return MesPago;
	}

	public void setMesPago(Integer mesPago) {
		MesPago = mesPago;
	}

	public Float getVlrCuota() {
		return VlrCuota;
	}

	public void setVlrCuota(Float vlrCuota) {
		VlrCuota = vlrCuota;
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

	public boolean isIndPago() {
		return IndPago;
	}

	public void setIndPago(boolean indPago) {
		IndPago = indPago;
	}

	public Float getVlrCredito() {
		return VlrCredito;
	}

	public void setVlrCredito(Float vlrCredito) {
		VlrCredito = vlrCredito;
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

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_Cuotas() {
		return Id_Cuotas;
	}

	public void setId_Cuotas(Integer id_Cuotas) {
		Id_Cuotas = id_Cuotas;
	}
    
    
}
