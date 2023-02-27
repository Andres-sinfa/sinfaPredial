package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class Car_CarteraGeneral_aval_ajusteModelo {
    @Size(since = 0 , until = 6)
    @FormParam("Periodo")
    @NotNull(update = false)
    private String Periodo;
    @NotNull
    @Size(since = 0 , until = 6)
    @FormParam("periodoAjuste")
    private String periodoAjuste;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    @NotNull(update = false)
    private Integer ano;
    @Size(since = -32768, until = 32767)
    @FormParam("cuota")
    private Integer cuota;
    @NotNull
    @FormParam("avaluo")
    private Float avaluo;
    @FormParam("vlrImpuesto")
    private Float vlrImpuesto;
    @FormParam("vlrInteres")
    private Float vlrInteres;
    @FormParam("vlrCar")
    private Float vlrCar;
    @FormParam("vlrInteresCar")
    private Float vlrInteresCar;
    @FormParam("vlrSobretasa")
    private Float vlrSobretasa;
    @FormParam("vlrDescuento")
    private Float vlrDescuento;
    @FormParam("vlrCredito")
    private Float vlrCredito;
    @FormParam("vlrcreditoCar")
    private Float vlrcreditoCar;
    @FormParam("vlrOtros")
    private Float vlrOtros;
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
    @FormParam("IndAcuerdoPago")
    private boolean IndAcuerdoPago;
    @FormParam("Ajuste")
    private Float Ajuste;
    @FormParam("VlrAbonos")
    private Float VlrAbonos;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @FormParam("vlrintcar_contrib")
    private Float vlrintcar_contrib;
    @FormParam("vlrcar_contrib")
    private Float vlrcar_contrib;
    @Size(since = 0 , until = 5)
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 5)
    @FormParam("rango")
    private String rango;
    @Size(since = 0 , until = 2)
    @FormParam("numEstrato")
    private String numEstrato;

    private Integer Id_Car_CarteraGeneral_aval_ajuste;

	public Car_CarteraGeneral_aval_ajusteModelo() {
		super();
	}

	public Car_CarteraGeneral_aval_ajusteModelo(String periodo, String periodoAjuste, String codigoCatastral,
			Integer ano, Integer cuota, Float avaluo, Float vlrImpuesto, Float vlrInteres, Float vlrCar,
			Float vlrInteresCar, Float vlrSobretasa, Float vlrDescuento, Float vlrCredito, Float vlrcreditoCar,
			Float vlrOtros, String f_Pago, String nroComprobante, boolean indPago, String banco, boolean indAcuerdoPago,
			Float ajuste, Float vlrAbonos, String codUnicoCatastral, Float vlrintcar_contrib, Float vlrcar_contrib,
			String tarifa, String rango, String numEstrato, Integer id_Car_CarteraGeneral_aval_ajuste) {
		super();
		Periodo = periodo;
		this.periodoAjuste = periodoAjuste;
		CodigoCatastral = codigoCatastral;
		this.ano = ano;
		this.cuota = cuota;
		this.avaluo = avaluo;
		this.vlrImpuesto = vlrImpuesto;
		this.vlrInteres = vlrInteres;
		this.vlrCar = vlrCar;
		this.vlrInteresCar = vlrInteresCar;
		this.vlrSobretasa = vlrSobretasa;
		this.vlrDescuento = vlrDescuento;
		this.vlrCredito = vlrCredito;
		this.vlrcreditoCar = vlrcreditoCar;
		this.vlrOtros = vlrOtros;
		this.f_Pago = f_Pago;
		NroComprobante = nroComprobante;
		IndPago = indPago;
		Banco = banco;
		IndAcuerdoPago = indAcuerdoPago;
		Ajuste = ajuste;
		VlrAbonos = vlrAbonos;
		CodUnicoCatastral = codUnicoCatastral;
		this.vlrintcar_contrib = vlrintcar_contrib;
		this.vlrcar_contrib = vlrcar_contrib;
		this.tarifa = tarifa;
		this.rango = rango;
		this.numEstrato = numEstrato;
		Id_Car_CarteraGeneral_aval_ajuste = id_Car_CarteraGeneral_aval_ajuste;
	}

	public String getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}

	public String getPeriodoAjuste() {
		return periodoAjuste;
	}

	public void setPeriodoAjuste(String periodoAjuste) {
		this.periodoAjuste = periodoAjuste;
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

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public Float getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(Float avaluo) {
		this.avaluo = avaluo;
	}

	public Float getVlrImpuesto() {
		return vlrImpuesto;
	}

	public void setVlrImpuesto(Float vlrImpuesto) {
		this.vlrImpuesto = vlrImpuesto;
	}

	public Float getVlrInteres() {
		return vlrInteres;
	}

	public void setVlrInteres(Float vlrInteres) {
		this.vlrInteres = vlrInteres;
	}

	public Float getVlrCar() {
		return vlrCar;
	}

	public void setVlrCar(Float vlrCar) {
		this.vlrCar = vlrCar;
	}

	public Float getVlrInteresCar() {
		return vlrInteresCar;
	}

	public void setVlrInteresCar(Float vlrInteresCar) {
		this.vlrInteresCar = vlrInteresCar;
	}

	public Float getVlrSobretasa() {
		return vlrSobretasa;
	}

	public void setVlrSobretasa(Float vlrSobretasa) {
		this.vlrSobretasa = vlrSobretasa;
	}

	public Float getVlrDescuento() {
		return vlrDescuento;
	}

	public void setVlrDescuento(Float vlrDescuento) {
		this.vlrDescuento = vlrDescuento;
	}

	public Float getVlrCredito() {
		return vlrCredito;
	}

	public void setVlrCredito(Float vlrCredito) {
		this.vlrCredito = vlrCredito;
	}

	public Float getVlrcreditoCar() {
		return vlrcreditoCar;
	}

	public void setVlrcreditoCar(Float vlrcreditoCar) {
		this.vlrcreditoCar = vlrcreditoCar;
	}

	public Float getVlrOtros() {
		return vlrOtros;
	}

	public void setVlrOtros(Float vlrOtros) {
		this.vlrOtros = vlrOtros;
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

	public boolean isIndAcuerdoPago() {
		return IndAcuerdoPago;
	}

	public void setIndAcuerdoPago(boolean indAcuerdoPago) {
		IndAcuerdoPago = indAcuerdoPago;
	}

	public Float getAjuste() {
		return Ajuste;
	}

	public void setAjuste(Float ajuste) {
		Ajuste = ajuste;
	}

	public Float getVlrAbonos() {
		return VlrAbonos;
	}

	public void setVlrAbonos(Float vlrAbonos) {
		VlrAbonos = vlrAbonos;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Float getVlrintcar_contrib() {
		return vlrintcar_contrib;
	}

	public void setVlrintcar_contrib(Float vlrintcar_contrib) {
		this.vlrintcar_contrib = vlrintcar_contrib;
	}

	public Float getVlrcar_contrib() {
		return vlrcar_contrib;
	}

	public void setVlrcar_contrib(Float vlrcar_contrib) {
		this.vlrcar_contrib = vlrcar_contrib;
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

	public String getNumEstrato() {
		return numEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		this.numEstrato = numEstrato;
	}

	public Integer getId_Car_CarteraGeneral_aval_ajuste() {
		return Id_Car_CarteraGeneral_aval_ajuste;
	}

	public void setId_Car_CarteraGeneral_aval_ajuste(Integer id_Car_CarteraGeneral_aval_ajuste) {
		Id_Car_CarteraGeneral_aval_ajuste = id_Car_CarteraGeneral_aval_ajuste;
	}
    
}
