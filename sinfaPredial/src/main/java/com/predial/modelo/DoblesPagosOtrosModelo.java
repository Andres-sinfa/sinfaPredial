package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class DoblesPagosOtrosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    private Integer Ano;
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Concepto")
    private String Concepto;
    @FormParam("VlrConcepto")
    private Float VlrConcepto;
    @FormParam("VlrInteres")
    private Float VlrInteres;
    @FormParam("VlrDescuento")
    private Float VlrDescuento;
    @FormParam("IndDoblePago")
    private boolean IndDoblePago;
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @FormParam("VlrTotal")
    private Float VlrTotal;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("Paquete")
    private Integer Paquete;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    
    private Integer Id_DoblesPagosOtros;

	public DoblesPagosOtrosModelo() {
		super();
	}

	public DoblesPagosOtrosModelo(String codigoCatastral, Integer ano, String concepto, Float vlrConcepto,
			Float vlrInteres, Float vlrDescuento, boolean indDoblePago, String f_Pago, String nroComprobante,
			String banco, Float vlrTotal, Integer anoBanco, Integer paquete, String codUnicoCatastral,
			Integer id_DoblesPagosOtros) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Concepto = concepto;
		VlrConcepto = vlrConcepto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		IndDoblePago = indDoblePago;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		Banco = banco;
		VlrTotal = vlrTotal;
		AnoBanco = anoBanco;
		Paquete = paquete;
		CodUnicoCatastral = codUnicoCatastral;
		Id_DoblesPagosOtros = id_DoblesPagosOtros;
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

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
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

	public boolean isIndDoblePago() {
		return IndDoblePago;
	}

	public void setIndDoblePago(boolean indDoblePago) {
		IndDoblePago = indDoblePago;
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

	public Float getVlrTotal() {
		return VlrTotal;
	}

	public void setVlrTotal(Float vlrTotal) {
		VlrTotal = vlrTotal;
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

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_DoblesPagosOtros() {
		return Id_DoblesPagosOtros;
	}

	public void setId_DoblesPagosOtros(Integer id_DoblesPagosOtros) {
		Id_DoblesPagosOtros = id_DoblesPagosOtros;
	}
    
}
