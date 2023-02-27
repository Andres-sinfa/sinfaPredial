package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class mod010_recaudosAvaluosModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 15)
    @FormParam("TipoRecaudo")
    @NotNull(update = false)
    private String TipoRecaudo;
    @Size(since = 0 , until = 15)
    @FormParam("Numero")
    @NotNull(update = false)
    private String Numero;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @FormParam("Cuota")
    @NotNull(update = false)
    private Integer Cuota;
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
    @FormParam("VlrCredito")
    private Float VlrCredito;
    @DateFormat
    @FormParam("F_Pago")
    @NotNull
    private String F_Pago;
    @FormParam("IndPago")
    private boolean IndPago;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    @NotNull
    private String Banco;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("VlrCreditoCAR")
    private Float VlrCreditoCAR;
    @FormParam("VlrOtros")
    private Float VlrOtros;
    @FormParam("VlrAbonos")
    private Float VlrAbonos;
    @FormParam("Ajuste")
    private Float Ajuste;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @FormParam("AC_vlrDctoPredial")
    private Float AC_vlrDctoPredial;
    @FormParam("AC_vlrDctoIntImp")
    private Float AC_vlrDctoIntImp;
    @FormParam("AC_vlrDctoCAR")
    private Float AC_vlrDctoCAR;
    @FormParam("AC_vlrDctoIntCAR")
    private Float AC_vlrDctoIntCAR;

    private Integer Id_mod010_recaudosAvaluos;

	public mod010_recaudosAvaluosModelo() {
		super();
	}

	public mod010_recaudosAvaluosModelo(String codigoCatastral, String tipoRecaudo, String numero, Integer ano,
			Integer cuota, Float vlrImpuesto, Float vlrInteres, Float vlrDescuento, Float vlrSobretasa, Float vlrCAR,
			Float vlrInteresCar, Float vlrCredito, String f_Pago, boolean indPago, String banco, Integer anoBanco,
			Float vlrCreditoCAR, Float vlrOtros, Float vlrAbonos, Float ajuste, String nroComprobante,
			String codUnicoCatastral, Float aC_vlrDctoPredial, Float aC_vlrDctoIntImp, Float aC_vlrDctoCAR,
			Float aC_vlrDctoIntCAR, Integer id_mod010_recaudosAvaluos) {
		super();
		CodigoCatastral = codigoCatastral;
		TipoRecaudo = tipoRecaudo;
		Numero = numero;
		Ano = ano;
		Cuota = cuota;
		VlrImpuesto = vlrImpuesto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		VlrSobretasa = vlrSobretasa;
		VlrCAR = vlrCAR;
		VlrInteresCar = vlrInteresCar;
		VlrCredito = vlrCredito;
		F_Pago = f_Pago;
		IndPago = indPago;
		Banco = banco;
		AnoBanco = anoBanco;
		VlrCreditoCAR = vlrCreditoCAR;
		VlrOtros = vlrOtros;
		VlrAbonos = vlrAbonos;
		Ajuste = ajuste;
		NroComprobante = nroComprobante;
		CodUnicoCatastral = codUnicoCatastral;
		AC_vlrDctoPredial = aC_vlrDctoPredial;
		AC_vlrDctoIntImp = aC_vlrDctoIntImp;
		AC_vlrDctoCAR = aC_vlrDctoCAR;
		AC_vlrDctoIntCAR = aC_vlrDctoIntCAR;
		Id_mod010_recaudosAvaluos = id_mod010_recaudosAvaluos;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getTipoRecaudo() {
		return TipoRecaudo;
	}

	public void setTipoRecaudo(String tipoRecaudo) {
		TipoRecaudo = tipoRecaudo;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
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

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public Float getVlrCreditoCAR() {
		return VlrCreditoCAR;
	}

	public void setVlrCreditoCAR(Float vlrCreditoCAR) {
		VlrCreditoCAR = vlrCreditoCAR;
	}

	public Float getVlrOtros() {
		return VlrOtros;
	}

	public void setVlrOtros(Float vlrOtros) {
		VlrOtros = vlrOtros;
	}

	public Float getVlrAbonos() {
		return VlrAbonos;
	}

	public void setVlrAbonos(Float vlrAbonos) {
		VlrAbonos = vlrAbonos;
	}

	public Float getAjuste() {
		return Ajuste;
	}

	public void setAjuste(Float ajuste) {
		Ajuste = ajuste;
	}

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Float getAC_vlrDctoPredial() {
		return AC_vlrDctoPredial;
	}

	public void setAC_vlrDctoPredial(Float aC_vlrDctoPredial) {
		AC_vlrDctoPredial = aC_vlrDctoPredial;
	}

	public Float getAC_vlrDctoIntImp() {
		return AC_vlrDctoIntImp;
	}

	public void setAC_vlrDctoIntImp(Float aC_vlrDctoIntImp) {
		AC_vlrDctoIntImp = aC_vlrDctoIntImp;
	}

	public Float getAC_vlrDctoCAR() {
		return AC_vlrDctoCAR;
	}

	public void setAC_vlrDctoCAR(Float aC_vlrDctoCAR) {
		AC_vlrDctoCAR = aC_vlrDctoCAR;
	}

	public Float getAC_vlrDctoIntCAR() {
		return AC_vlrDctoIntCAR;
	}

	public void setAC_vlrDctoIntCAR(Float aC_vlrDctoIntCAR) {
		AC_vlrDctoIntCAR = aC_vlrDctoIntCAR;
	}

	public Integer getId_mod010_recaudosAvaluos() {
		return Id_mod010_recaudosAvaluos;
	}

	public void setId_mod010_recaudosAvaluos(Integer id_mod010_recaudosAvaluos) {
		Id_mod010_recaudosAvaluos = id_mod010_recaudosAvaluos;
	}
    
    
}
