package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class DoblesPagosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @NotNull(update = false)
    @DateFormat
    @FormParam("F_Pago")
    private String F_Pago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @FormParam("IndDoblePago")
    private boolean IndDoblePago;
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
    @FormParam("VlrOtros")
    private Float VlrOtros;
    @FormParam("VlrTotal")
    private Float VlrTotal;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("Paquete")
    private Integer Paquete;
    @FormParam("IndAbonado")
    private boolean IndAbonado;
    @NotNull
    @FormParam("VlrAbonado")
    private Float VlrAbonado;
    @NotNull
    @FormParam("Vlrsaldo")
    private Float Vlrsaldo;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 30)
    @FormParam("usuario")
    private String usuario;
    @DateFormat
    @FormParam("fechaExceso")
    private String fechaExceso;
    @FormParam("indPagoExceso")
    private boolean indPagoExceso;
    
    private Integer Id_DoblesPagos;

	public DoblesPagosModelo() {
		super();
	}

	public DoblesPagosModelo(String codigoCatastral, String f_Pago, String nroComprobante, String banco,
			boolean indDoblePago, Float vlrImpuesto, Float vlrInteres, Float vlrDescuento, Float vlrSobretasa,
			Float vlrCAR, Float vlrInteresCar, Float vlrCredito, Float vlrOtros, Float vlrTotal, Integer anoBanco,
			Integer paquete, boolean indAbonado, Float vlrAbonado, Float vlrsaldo, String codUnicoCatastral,
			String usuario, String fechaExceso, boolean indPagoExceso, Integer id_DoblesPagos) {
		super();
		CodigoCatastral = codigoCatastral;
		F_Pago = f_Pago;
		NroComprobante = nroComprobante;
		Banco = banco;
		IndDoblePago = indDoblePago;
		VlrImpuesto = vlrImpuesto;
		VlrInteres = vlrInteres;
		VlrDescuento = vlrDescuento;
		VlrSobretasa = vlrSobretasa;
		VlrCAR = vlrCAR;
		VlrInteresCar = vlrInteresCar;
		VlrCredito = vlrCredito;
		VlrOtros = vlrOtros;
		VlrTotal = vlrTotal;
		AnoBanco = anoBanco;
		Paquete = paquete;
		IndAbonado = indAbonado;
		VlrAbonado = vlrAbonado;
		Vlrsaldo = vlrsaldo;
		CodUnicoCatastral = codUnicoCatastral;
		this.usuario = usuario;
		this.fechaExceso = fechaExceso;
		this.indPagoExceso = indPagoExceso;
		Id_DoblesPagos = id_DoblesPagos;
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

	public boolean isIndDoblePago() {
		return IndDoblePago;
	}

	public void setIndDoblePago(boolean indDoblePago) {
		IndDoblePago = indDoblePago;
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

	public Float getVlrOtros() {
		return VlrOtros;
	}

	public void setVlrOtros(Float vlrOtros) {
		VlrOtros = vlrOtros;
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

	public boolean isIndAbonado() {
		return IndAbonado;
	}

	public void setIndAbonado(boolean indAbonado) {
		IndAbonado = indAbonado;
	}

	public Float getVlrAbonado() {
		return VlrAbonado;
	}

	public void setVlrAbonado(Float vlrAbonado) {
		VlrAbonado = vlrAbonado;
	}

	public Float getVlrsaldo() {
		return Vlrsaldo;
	}

	public void setVlrsaldo(Float vlrsaldo) {
		Vlrsaldo = vlrsaldo;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFechaExceso() {
		return fechaExceso;
	}

	public void setFechaExceso(String fechaExceso) {
		this.fechaExceso = fechaExceso;
	}

	public boolean isIndPagoExceso() {
		return indPagoExceso;
	}

	public void setIndPagoExceso(boolean indPagoExceso) {
		this.indPagoExceso = indPagoExceso;
	}

	public Integer getId_DoblesPagos() {
		return Id_DoblesPagos;
	}

	public void setId_DoblesPagos(Integer id_DoblesPagos) {
		Id_DoblesPagos = id_DoblesPagos;
	}
    
}
