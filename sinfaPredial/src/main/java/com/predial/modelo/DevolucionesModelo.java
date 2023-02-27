package com.predial.modelo;

import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Nrocomprobante")
public class DevolucionesModelo {
	@NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("Nrocomprobante")
    private String Nrocomprobante;
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
    @NotNull
    @Size(since = 0 , until = 1)
    @FormParam("tipoRecaudo")
    private String tipoRecaudo;
    @FormParam("Avaluo")
    private Float Avaluo;
    @Size(since = 0 , until = 2)
    @FormParam("Tarifa")
    private String Tarifa;
    @Size(since = 0 , until = 2)
    @FormParam("rango")
    private String rango;
    @FormParam("vlrimpuesto")
    private Float vlrimpuesto;
    @FormParam("vlrinteres")
    private Float vlrinteres;
    @FormParam("vlrdescuento")
    private Float vlrdescuento;
    @FormParam("vlrsobretasa")
    private Float vlrsobretasa;
    @FormParam("vlrcar")
    private Float vlrcar;
    @FormParam("vlrinterescar")
    private Float vlrinterescar;
    @FormParam("vlrcredito")
    private Float vlrcredito;
    @FormParam("vlrcreditocar")
    private Float vlrcreditocar;
    @FormParam("ajuste")
    private Float ajuste;
    @FormParam("vlrotros")
    private Float vlrotros;
    @DateFormat
    @FormParam("f_pago")
    private String f_pago;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @FormParam("indpago")
    private boolean indpago;
    @DateFormat
    @FormParam("f_devolucion")
    private String f_devolucion;
    @NotNull
    @FormParam("VlrCAR_Contrib")
    private Float VlrCAR_Contrib;
    @NotNull
    @FormParam("VlrIntCar_COntrib")
    private Float VlrIntCar_COntrib;
    @Size(since = 0 , until = 100)
    @FormParam("UsuarioRegistroPago")
    private String UsuarioRegistroPago;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @FormParam("paquete")
    private Integer paquete;
    @NotNull
    @FormParam("DescuentoInteres")
    private Float DescuentoInteres;
    @NotNull
    @FormParam("vlrAbonos")
    private Float vlrAbonos;
    @Size(since = 0 , until = 100)
    @FormParam("bancodevolucion")
    private String bancodevolucion;
    @Size(since = 0 , until = 100)
    @FormParam("usuariodevolucion")
    private String usuariodevolucion;
    @Size(since = 0 , until = 100)
    @FormParam("equipodevolucion")
    private String equipodevolucion;
    @Size(since = 0 , until = 2)
    @FormParam("numEstrato")
    private String numEstrato;
    @FormParam("AC_vlrDctoPredial")
    private Float AC_vlrDctoPredial;
    @FormParam("AC_vlrDctoIntImp")
    private Float AC_vlrDctoIntImp;
    @FormParam("AC_vlrDctoCAR")
    private Float AC_vlrDctoCAR;
    @FormParam("AC_vlrDctoIntCAR")
    private Float AC_vlrDctoIntCAR;
    
    private Integer Id_Devoluciones;

	public DevolucionesModelo(String nrocomprobante, String codigocatastral, Integer ano, Integer cuota,
			String tipoRecaudo, Float avaluo, String tarifa, String rango, Float vlrimpuesto, Float vlrinteres,
			Float vlrdescuento, Float vlrsobretasa, Float vlrcar, Float vlrinterescar, Float vlrcredito,
			Float vlrcreditocar, Float ajuste, Float vlrotros, String f_pago, String banco, boolean indpago,
			String f_devolucion, Float vlrCAR_Contrib, Float vlrIntCar_COntrib, String usuarioRegistroPago,
			Integer anoBanco, Integer paquete, Float descuentoInteres, Float vlrAbonos, String bancodevolucion,
			String usuariodevolucion, String equipodevolucion, String numEstrato, Float aC_vlrDctoPredial,
			Float aC_vlrDctoIntImp, Float aC_vlrDctoCAR, Float aC_vlrDctoIntCAR, Integer id_Devoluciones) {
		super();
		Nrocomprobante = nrocomprobante;
		this.codigocatastral = codigocatastral;
		Ano = ano;
		Cuota = cuota;
		this.tipoRecaudo = tipoRecaudo;
		Avaluo = avaluo;
		Tarifa = tarifa;
		this.rango = rango;
		this.vlrimpuesto = vlrimpuesto;
		this.vlrinteres = vlrinteres;
		this.vlrdescuento = vlrdescuento;
		this.vlrsobretasa = vlrsobretasa;
		this.vlrcar = vlrcar;
		this.vlrinterescar = vlrinterescar;
		this.vlrcredito = vlrcredito;
		this.vlrcreditocar = vlrcreditocar;
		this.ajuste = ajuste;
		this.vlrotros = vlrotros;
		this.f_pago = f_pago;
		Banco = banco;
		this.indpago = indpago;
		this.f_devolucion = f_devolucion;
		VlrCAR_Contrib = vlrCAR_Contrib;
		VlrIntCar_COntrib = vlrIntCar_COntrib;
		UsuarioRegistroPago = usuarioRegistroPago;
		AnoBanco = anoBanco;
		this.paquete = paquete;
		DescuentoInteres = descuentoInteres;
		this.vlrAbonos = vlrAbonos;
		this.bancodevolucion = bancodevolucion;
		this.usuariodevolucion = usuariodevolucion;
		this.equipodevolucion = equipodevolucion;
		this.numEstrato = numEstrato;
		AC_vlrDctoPredial = aC_vlrDctoPredial;
		AC_vlrDctoIntImp = aC_vlrDctoIntImp;
		AC_vlrDctoCAR = aC_vlrDctoCAR;
		AC_vlrDctoIntCAR = aC_vlrDctoIntCAR;
		Id_Devoluciones = id_Devoluciones;
	}

	public DevolucionesModelo() {
		super();
	}

	public String getNrocomprobante() {
		return Nrocomprobante;
	}

	public void setNrocomprobante(String nrocomprobante) {
		Nrocomprobante = nrocomprobante;
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

	public String getTipoRecaudo() {
		return tipoRecaudo;
	}

	public void setTipoRecaudo(String tipoRecaudo) {
		this.tipoRecaudo = tipoRecaudo;
	}

	public Float getAvaluo() {
		return Avaluo;
	}

	public void setAvaluo(Float avaluo) {
		Avaluo = avaluo;
	}

	public String getTarifa() {
		return Tarifa;
	}

	public void setTarifa(String tarifa) {
		Tarifa = tarifa;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public Float getVlrimpuesto() {
		return vlrimpuesto;
	}

	public void setVlrimpuesto(Float vlrimpuesto) {
		this.vlrimpuesto = vlrimpuesto;
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

	public Float getVlrsobretasa() {
		return vlrsobretasa;
	}

	public void setVlrsobretasa(Float vlrsobretasa) {
		this.vlrsobretasa = vlrsobretasa;
	}

	public Float getVlrcar() {
		return vlrcar;
	}

	public void setVlrcar(Float vlrcar) {
		this.vlrcar = vlrcar;
	}

	public Float getVlrinterescar() {
		return vlrinterescar;
	}

	public void setVlrinterescar(Float vlrinterescar) {
		this.vlrinterescar = vlrinterescar;
	}

	public Float getVlrcredito() {
		return vlrcredito;
	}

	public void setVlrcredito(Float vlrcredito) {
		this.vlrcredito = vlrcredito;
	}

	public Float getVlrcreditocar() {
		return vlrcreditocar;
	}

	public void setVlrcreditocar(Float vlrcreditocar) {
		this.vlrcreditocar = vlrcreditocar;
	}

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
	}

	public Float getVlrotros() {
		return vlrotros;
	}

	public void setVlrotros(Float vlrotros) {
		this.vlrotros = vlrotros;
	}

	public String getF_pago() {
		return f_pago;
	}

	public void setF_pago(String f_pago) {
		this.f_pago = f_pago;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public boolean isIndpago() {
		return indpago;
	}

	public void setIndpago(boolean indpago) {
		this.indpago = indpago;
	}

	public String getF_devolucion() {
		return f_devolucion;
	}

	public void setF_devolucion(String f_devolucion) {
		this.f_devolucion = f_devolucion;
	}

	public Float getVlrCAR_Contrib() {
		return VlrCAR_Contrib;
	}

	public void setVlrCAR_Contrib(Float vlrCAR_Contrib) {
		VlrCAR_Contrib = vlrCAR_Contrib;
	}

	public Float getVlrIntCar_COntrib() {
		return VlrIntCar_COntrib;
	}

	public void setVlrIntCar_COntrib(Float vlrIntCar_COntrib) {
		VlrIntCar_COntrib = vlrIntCar_COntrib;
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

	public Float getDescuentoInteres() {
		return DescuentoInteres;
	}

	public void setDescuentoInteres(Float descuentoInteres) {
		DescuentoInteres = descuentoInteres;
	}

	public Float getVlrAbonos() {
		return vlrAbonos;
	}

	public void setVlrAbonos(Float vlrAbonos) {
		this.vlrAbonos = vlrAbonos;
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

	public String getNumEstrato() {
		return numEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		this.numEstrato = numEstrato;
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

	public Integer getId_Devoluciones() {
		return Id_Devoluciones;
	}

	public void setId_Devoluciones(Integer id_Devoluciones) {
		Id_Devoluciones = id_Devoluciones;
	}
    
}
