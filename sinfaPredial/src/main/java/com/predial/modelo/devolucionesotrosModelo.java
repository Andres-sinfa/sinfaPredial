package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("nrocomprobante")
public class devolucionesotrosModelo {
    @Size(since = 0 , until = 10)
    @FormParam("nrocomprobante")
    @NotNull(update = false)
    private String nrocomprobante;
    @Size(since = 0 , until = 30)
    @FormParam("codigocatastral")
    @NotNull(update = false)
    private String codigocatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @FormParam("Cuota")
    @NotNull(update = false)
    private Integer Cuota;
    @Size(since = 0 , until = 2)
    @FormParam("concepto")
    @NotNull(update = false)
    private String concepto;
    @Size(since = 0 , until = 2)
    @FormParam("tarifa")
    private String tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("rango")
    private String rango;
    @NotNull
    @Size(since = 0 , until = 1)
    @FormParam("tipoRecaudo")
    private String tipoRecaudo;
    @FormParam("vlrconcepto")
    private Float vlrconcepto;
    @FormParam("vlrinteres")
    private Float vlrinteres;
    @FormParam("vlrdescuento")
    private Float vlrdescuento;
    @FormParam("ajuste")
    private Float ajuste;
    @FormParam("indpago")
    private boolean indpago;
    @Size(since = 0 , until = 16)
    @FormParam("banco")
    private String banco;
    @DateFormat
    @FormParam("f_devolucion")
    private String f_devolucion;
    @DateFormat    
    @FormParam("f_pago")
    private String f_pago;
    @Size(since = 0 , until = 100)
    @FormParam("UsuarioRegistroPago")
    private String UsuarioRegistroPago;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("paquete")
    private Integer paquete;
    @Size(since = 0 , until = 100)
    @FormParam("bancodevolucion")
    private String bancodevolucion;
    @Size(since = 0 , until = 100)
    @FormParam("usuariodevolucion")
    private String usuariodevolucion;
    @Size(since = 0 , until = 100)
    @FormParam("equipodevolucion")
    private String equipodevolucion;

    private Integer Id_devolucionesotros;

	public devolucionesotrosModelo() {
		super();
	}

	public devolucionesotrosModelo(String nrocomprobante, String codigocatastral, Integer ano, Integer cuota,
			String concepto, String tarifa, String rango, String tipoRecaudo, Float vlrconcepto, Float vlrinteres,
			Float vlrdescuento, Float ajuste, boolean indpago, String banco, String f_devolucion, String f_pago,
			String usuarioRegistroPago, Integer anoBanco, Integer paquete, String bancodevolucion,
			String usuariodevolucion, String equipodevolucion, Integer id_devolucionesotros) {
		super();
		this.nrocomprobante = nrocomprobante;
		this.codigocatastral = codigocatastral;
		Ano = ano;
		Cuota = cuota;
		this.concepto = concepto;
		this.tarifa = tarifa;
		this.rango = rango;
		this.tipoRecaudo = tipoRecaudo;
		this.vlrconcepto = vlrconcepto;
		this.vlrinteres = vlrinteres;
		this.vlrdescuento = vlrdescuento;
		this.ajuste = ajuste;
		this.indpago = indpago;
		this.banco = banco;
		this.f_devolucion = f_devolucion;
		this.f_pago = f_pago;
		UsuarioRegistroPago = usuarioRegistroPago;
		AnoBanco = anoBanco;
		this.paquete = paquete;
		this.bancodevolucion = bancodevolucion;
		this.usuariodevolucion = usuariodevolucion;
		this.equipodevolucion = equipodevolucion;
		Id_devolucionesotros = id_devolucionesotros;
	}

	public String getNrocomprobante() {
		return nrocomprobante;
	}

	public void setNrocomprobante(String nrocomprobante) {
		this.nrocomprobante = nrocomprobante;
	}

	public String getCodigocatastral() {
		return codigocatastral;
	}

	public void setCodigocatastral(String codigocatastral) {
		this.codigocatastral = codigocatastral;
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
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
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

	public String getTipoRecaudo() {
		return tipoRecaudo;
	}

	public void setTipoRecaudo(String tipoRecaudo) {
		this.tipoRecaudo = tipoRecaudo;
	}

	public Float getVlrconcepto() {
		return vlrconcepto;
	}

	public void setVlrconcepto(Float vlrconcepto) {
		this.vlrconcepto = vlrconcepto;
	}

	public Float getVlrinteres() {
		return vlrinteres;
	}

	public void setVlrinteres(Float vlrinteres) {
		this.vlrinteres = vlrinteres;
	}

	public Float getVlrdescuento() {
		return vlrdescuento;
	}

	public void setVlrdescuento(Float vlrdescuento) {
		this.vlrdescuento = vlrdescuento;
	}

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
	}

	public boolean isIndpago() {
		return indpago;
	}

	public void setIndpago(boolean indpago) {
		this.indpago = indpago;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getF_devolucion() {
		return f_devolucion;
	}

	public void setF_devolucion(String f_devolucion) {
		this.f_devolucion = f_devolucion;
	}

	public String getF_pago() {
		return f_pago;
	}

	public void setF_pago(String f_pago) {
		this.f_pago = f_pago;
	}

	public String getUsuarioRegistroPago() {
		return UsuarioRegistroPago;
	}

	public void setUsuarioRegistroPago(String usuarioRegistroPago) {
		UsuarioRegistroPago = usuarioRegistroPago;
	}

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public Integer getPaquete() {
		return paquete;
	}

	public void setPaquete(Integer paquete) {
		this.paquete = paquete;
	}

	public String getBancodevolucion() {
		return bancodevolucion;
	}

	public void setBancodevolucion(String bancodevolucion) {
		this.bancodevolucion = bancodevolucion;
	}

	public String getUsuariodevolucion() {
		return usuariodevolucion;
	}

	public void setUsuariodevolucion(String usuariodevolucion) {
		this.usuariodevolucion = usuariodevolucion;
	}

	public String getEquipodevolucion() {
		return equipodevolucion;
	}

	public void setEquipodevolucion(String equipodevolucion) {
		this.equipodevolucion = equipodevolucion;
	}

	public Integer getId_devolucionesotros() {
		return Id_devolucionesotros;
	}

	public void setId_devolucionesotros(Integer id_devolucionesotros) {
		Id_devolucionesotros = id_devolucionesotros;
	}
    
    
}
