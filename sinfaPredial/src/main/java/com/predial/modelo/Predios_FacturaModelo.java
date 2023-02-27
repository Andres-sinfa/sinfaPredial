package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class Predios_FacturaModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 2)
    @FormParam("TipoDocumento")
    @NotNull(update = false)
    private String TipoDocumento;
    @Size(since = 0 , until = 10)
    @FormParam("NoDocumento")
    @NotNull(update = false)
    private String NoDocumento;
    @FormParam("AnoPago")
    @NotNull
    private Float AnoPago;
    @Size(since = 0 , until = 2)
    @FormParam("TipoPago")
    @NotNull
    private String TipoPago;
    @DateFormat
    @FormParam("Fecha")
    private String Fecha;
    @Size(since = 0 , until = 30)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 30)
    @FormParam("Equipo")
    private String Equipo;
    @FormParam("IndRegistroPago")
    private boolean IndRegistroPago;
    @FormParam("NumeroAbono")
    private Integer NumeroAbono;
    @DateFormat
    @FormParam("FechaAcuerdo")
    private String FechaAcuerdo;
    @FormParam("Cuota")
    private Integer Cuota;
    @DateFormat
    @FormParam("FechaCuota")
    private String FechaCuota;
    @FormParam("IndSinDesctoINT")
    private boolean IndSinDesctoINT;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @FormParam("indModificada")
    private boolean indModificada;
    @FormParam("vlrFactura1")
    @NotNull
    private Float vlrFactura1;
    @FormParam("vlrFactura2")
    @NotNull
    private Float vlrFactura2;
    @FormParam("vlrFactura3")
    @NotNull
    private Float vlrFactura3;
    @FormParam("vlrFactura4")
    @NotNull
    private Float vlrFactura4;
    @FormParam("vlrRegistrado")
    private Float vlrRegistrado;
    @Size(since = 0 , until = 20)
    @FormParam("Banco")
    private String Banco;
    @DateFormat
    @FormParam("f_pago")
    private String f_pago;
    @Size(since = 0 , until = 20)
    @FormParam("BancoAv")
    private String BancoAv;
    @DateFormat
    @FormParam("f_pagoAv")
    private String f_pagoAv;
    @FormParam("incRegistro")
    private Float incRegistro;
    @FormParam("AnoPagoInicial")
    private Float AnoPagoInicial;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @DateFormat
    @FormParam("vencimiento1")
    private String vencimiento1;
    @DateFormat
    @FormParam("vencimiento2")
    private String vencimiento2;
    @DateFormat
    @FormParam("vencimiento3")
    private String vencimiento3;
    @DateFormat
    @FormParam("vencimiento4")
    private String vencimiento4;
    @FormParam("IndWebVigencia")
    private boolean IndWebVigencia;
    
    private Integer Id_Predios_Factura;

	public Predios_FacturaModelo() {
		super();
	}

	public Predios_FacturaModelo(String codigoCatastral, String tipoDocumento, String noDocumento, Float anoPago,
			String tipoPago, String fecha, String usuario, String equipo, boolean indRegistroPago, Integer numeroAbono,
			String fechaAcuerdo, Integer cuota, String fechaCuota, boolean indSinDesctoINT, String nroAcuerdo,
			boolean indModificada, Float vlrFactura1, Float vlrFactura2, Float vlrFactura3, Float vlrFactura4,
			Float vlrRegistrado, String banco, String f_pago, String bancoAv, String f_pagoAv, Float incRegistro,
			Float anoPagoInicial, String codUnicoCatastral, String vencimiento1, String vencimiento2,
			String vencimiento3, String vencimiento4, boolean indWebVigencia, Integer id_Predios_Factura) {
		super();
		CodigoCatastral = codigoCatastral;
		TipoDocumento = tipoDocumento;
		NoDocumento = noDocumento;
		AnoPago = anoPago;
		TipoPago = tipoPago;
		Fecha = fecha;
		Usuario = usuario;
		Equipo = equipo;
		IndRegistroPago = indRegistroPago;
		NumeroAbono = numeroAbono;
		FechaAcuerdo = fechaAcuerdo;
		Cuota = cuota;
		FechaCuota = fechaCuota;
		IndSinDesctoINT = indSinDesctoINT;
		NroAcuerdo = nroAcuerdo;
		this.indModificada = indModificada;
		this.vlrFactura1 = vlrFactura1;
		this.vlrFactura2 = vlrFactura2;
		this.vlrFactura3 = vlrFactura3;
		this.vlrFactura4 = vlrFactura4;
		this.vlrRegistrado = vlrRegistrado;
		Banco = banco;
		this.f_pago = f_pago;
		BancoAv = bancoAv;
		this.f_pagoAv = f_pagoAv;
		this.incRegistro = incRegistro;
		AnoPagoInicial = anoPagoInicial;
		CodUnicoCatastral = codUnicoCatastral;
		this.vencimiento1 = vencimiento1;
		this.vencimiento2 = vencimiento2;
		this.vencimiento3 = vencimiento3;
		this.vencimiento4 = vencimiento4;
		IndWebVigencia = indWebVigencia;
		Id_Predios_Factura = id_Predios_Factura;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public String getNoDocumento() {
		return NoDocumento;
	}

	public void setNoDocumento(String noDocumento) {
		NoDocumento = noDocumento;
	}

	public Float getAnoPago() {
		return AnoPago;
	}

	public void setAnoPago(Float anoPago) {
		AnoPago = anoPago;
	}

	public String getTipoPago() {
		return TipoPago;
	}

	public void setTipoPago(String tipoPago) {
		TipoPago = tipoPago;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public boolean isIndRegistroPago() {
		return IndRegistroPago;
	}

	public void setIndRegistroPago(boolean indRegistroPago) {
		IndRegistroPago = indRegistroPago;
	}

	public Integer getNumeroAbono() {
		return NumeroAbono;
	}

	public void setNumeroAbono(Integer numeroAbono) {
		NumeroAbono = numeroAbono;
	}

	public String getFechaAcuerdo() {
		return FechaAcuerdo;
	}

	public void setFechaAcuerdo(String fechaAcuerdo) {
		FechaAcuerdo = fechaAcuerdo;
	}

	public Integer getCuota() {
		return Cuota;
	}

	public void setCuota(Integer cuota) {
		Cuota = cuota;
	}

	public String getFechaCuota() {
		return FechaCuota;
	}

	public void setFechaCuota(String fechaCuota) {
		FechaCuota = fechaCuota;
	}

	public boolean isIndSinDesctoINT() {
		return IndSinDesctoINT;
	}

	public void setIndSinDesctoINT(boolean indSinDesctoINT) {
		IndSinDesctoINT = indSinDesctoINT;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public boolean isIndModificada() {
		return indModificada;
	}

	public void setIndModificada(boolean indModificada) {
		this.indModificada = indModificada;
	}

	public Float getVlrFactura1() {
		return vlrFactura1;
	}

	public void setVlrFactura1(Float vlrFactura1) {
		this.vlrFactura1 = vlrFactura1;
	}

	public Float getVlrFactura2() {
		return vlrFactura2;
	}

	public void setVlrFactura2(Float vlrFactura2) {
		this.vlrFactura2 = vlrFactura2;
	}

	public Float getVlrFactura3() {
		return vlrFactura3;
	}

	public void setVlrFactura3(Float vlrFactura3) {
		this.vlrFactura3 = vlrFactura3;
	}

	public Float getVlrFactura4() {
		return vlrFactura4;
	}

	public void setVlrFactura4(Float vlrFactura4) {
		this.vlrFactura4 = vlrFactura4;
	}

	public Float getVlrRegistrado() {
		return vlrRegistrado;
	}

	public void setVlrRegistrado(Float vlrRegistrado) {
		this.vlrRegistrado = vlrRegistrado;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getF_pago() {
		return f_pago;
	}

	public void setF_pago(String f_pago) {
		this.f_pago = f_pago;
	}

	public String getBancoAv() {
		return BancoAv;
	}

	public void setBancoAv(String bancoAv) {
		BancoAv = bancoAv;
	}

	public String getF_pagoAv() {
		return f_pagoAv;
	}

	public void setF_pagoAv(String f_pagoAv) {
		this.f_pagoAv = f_pagoAv;
	}

	public Float getIncRegistro() {
		return incRegistro;
	}

	public void setIncRegistro(Float incRegistro) {
		this.incRegistro = incRegistro;
	}

	public Float getAnoPagoInicial() {
		return AnoPagoInicial;
	}

	public void setAnoPagoInicial(Float anoPagoInicial) {
		AnoPagoInicial = anoPagoInicial;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getVencimiento1() {
		return vencimiento1;
	}

	public void setVencimiento1(String vencimiento1) {
		this.vencimiento1 = vencimiento1;
	}

	public String getVencimiento2() {
		return vencimiento2;
	}

	public void setVencimiento2(String vencimiento2) {
		this.vencimiento2 = vencimiento2;
	}

	public String getVencimiento3() {
		return vencimiento3;
	}

	public void setVencimiento3(String vencimiento3) {
		this.vencimiento3 = vencimiento3;
	}

	public String getVencimiento4() {
		return vencimiento4;
	}

	public void setVencimiento4(String vencimiento4) {
		this.vencimiento4 = vencimiento4;
	}

	public boolean isIndWebVigencia() {
		return IndWebVigencia;
	}

	public void setIndWebVigencia(boolean indWebVigencia) {
		IndWebVigencia = indWebVigencia;
	}

	public Integer getId_Predios_Factura() {
		return Id_Predios_Factura;
	}

	public void setId_Predios_Factura(Integer id_Predios_Factura) {
		Id_Predios_Factura = id_Predios_Factura;
	}

}
