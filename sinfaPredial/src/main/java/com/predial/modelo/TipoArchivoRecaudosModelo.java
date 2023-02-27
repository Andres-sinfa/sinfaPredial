package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class TipoArchivoRecaudosModelo {
	@NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 30)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 3)
    @FormParam("IdInicioArch")
    private String IdInicioArchivo;
    @FormParam("InicioFecha")
    private Integer InicioFecha;
    @FormParam("LenFecha")
    private Integer LenFecha;
    @Size(since = 0 , until = 3)
    @FormParam("idPaquete")
    private String idPaquete;
    @FormParam("InicioPa")
    private Integer InicioPaquete;
    @FormParam("Lenpaquete")
    private Integer Lenpaquete;
    @Size(since = 0 , until = 3)
    @FormParam("IDRecaudo")
    private String IDRecaudo;
    @FormParam("InicioCo")
    private Integer InicioCodigo;
    @FormParam("LenCodigo")
    private Integer LenCodigo;
    @FormParam("InicioFac")
    private Integer InicioFacura;
    @FormParam("LenFactura")
    private Integer LenFactura;
    @FormParam("InicioAnop")
    private Integer InicioAnopago;
    @Size(since = 0 , until = 3)
    @FormParam("LenAnopago")
    private String LenAnopago;
    @FormParam("InicioVal")
    private Integer InicioValor;
    @FormParam("LenValor")
    private Integer LenValor;
    @Size(since = 0 , until = 3)
    @FormParam("IdFinalLote")
    private String IdFinalLote;
    @FormParam("InicioValorReportado")
    private Integer InicioValorReportado;
    @FormParam("LenValorReportado")
    private Integer LenValorReportado;
    @FormParam("InicioCupones")
    private Integer InicioCupones;
    @FormParam("LenCupones")
    private Integer LenCupones;
    @Size(since = 0 , until = 50)
    @FormParam("IdFinal")
    private String IdFinal;
    @FormParam("Inicio")
    private Integer InicioTipoPago;
    @FormParam("LenTipoPago")
    private Integer LenTipoPago;
    @FormParam("IndDigContr")
    private boolean IndDigControl;
    
    private Integer Id_TipoArchivoRecaudos;

	public TipoArchivoRecaudosModelo() {
		super();
	}

	public TipoArchivoRecaudosModelo(String codigo, String descripcion, String idInicioArchivo, Integer inicioFecha,
			Integer lenFecha, String idPaquete, Integer inicioPaquete, Integer lenpaquete, String iDRecaudo,
			Integer inicioCodigo, Integer lenCodigo, Integer inicioFacura, Integer lenFactura, Integer inicioAnopago,
			String lenAnopago, Integer inicioValor, Integer lenValor, String idFinalLote, Integer inicioValorReportado,
			Integer lenValorReportado, Integer inicioCupones, Integer lenCupones, String idFinal,
			Integer inicioTipoPago, Integer lenTipoPago, boolean indDigControl, Integer id_TipoArchivoRecaudos) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		IdInicioArchivo = idInicioArchivo;
		InicioFecha = inicioFecha;
		LenFecha = lenFecha;
		this.idPaquete = idPaquete;
		InicioPaquete = inicioPaquete;
		Lenpaquete = lenpaquete;
		IDRecaudo = iDRecaudo;
		InicioCodigo = inicioCodigo;
		LenCodigo = lenCodigo;
		InicioFacura = inicioFacura;
		LenFactura = lenFactura;
		InicioAnopago = inicioAnopago;
		LenAnopago = lenAnopago;
		InicioValor = inicioValor;
		LenValor = lenValor;
		IdFinalLote = idFinalLote;
		InicioValorReportado = inicioValorReportado;
		LenValorReportado = lenValorReportado;
		InicioCupones = inicioCupones;
		LenCupones = lenCupones;
		IdFinal = idFinal;
		InicioTipoPago = inicioTipoPago;
		LenTipoPago = lenTipoPago;
		IndDigControl = indDigControl;
		Id_TipoArchivoRecaudos = id_TipoArchivoRecaudos;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getIdInicioArchivo() {
		return IdInicioArchivo;
	}

	public void setIdInicioArchivo(String idInicioArchivo) {
		IdInicioArchivo = idInicioArchivo;
	}

	public Integer getInicioFecha() {
		return InicioFecha;
	}

	public void setInicioFecha(Integer inicioFecha) {
		InicioFecha = inicioFecha;
	}

	public Integer getLenFecha() {
		return LenFecha;
	}

	public void setLenFecha(Integer lenFecha) {
		LenFecha = lenFecha;
	}

	public String getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}

	public Integer getInicioPaquete() {
		return InicioPaquete;
	}

	public void setInicioPaquete(Integer inicioPaquete) {
		InicioPaquete = inicioPaquete;
	}

	public Integer getLenpaquete() {
		return Lenpaquete;
	}

	public void setLenpaquete(Integer lenpaquete) {
		Lenpaquete = lenpaquete;
	}

	public String getIDRecaudo() {
		return IDRecaudo;
	}

	public void setIDRecaudo(String iDRecaudo) {
		IDRecaudo = iDRecaudo;
	}

	public Integer getInicioCodigo() {
		return InicioCodigo;
	}

	public void setInicioCodigo(Integer inicioCodigo) {
		InicioCodigo = inicioCodigo;
	}

	public Integer getLenCodigo() {
		return LenCodigo;
	}

	public void setLenCodigo(Integer lenCodigo) {
		LenCodigo = lenCodigo;
	}

	public Integer getInicioFacura() {
		return InicioFacura;
	}

	public void setInicioFacura(Integer inicioFacura) {
		InicioFacura = inicioFacura;
	}

	public Integer getLenFactura() {
		return LenFactura;
	}

	public void setLenFactura(Integer lenFactura) {
		LenFactura = lenFactura;
	}

	public Integer getInicioAnopago() {
		return InicioAnopago;
	}

	public void setInicioAnopago(Integer inicioAnopago) {
		InicioAnopago = inicioAnopago;
	}

	public String getLenAnopago() {
		return LenAnopago;
	}

	public void setLenAnopago(String lenAnopago) {
		LenAnopago = lenAnopago;
	}

	public Integer getInicioValor() {
		return InicioValor;
	}

	public void setInicioValor(Integer inicioValor) {
		InicioValor = inicioValor;
	}

	public Integer getLenValor() {
		return LenValor;
	}

	public void setLenValor(Integer lenValor) {
		LenValor = lenValor;
	}

	public String getIdFinalLote() {
		return IdFinalLote;
	}

	public void setIdFinalLote(String idFinalLote) {
		IdFinalLote = idFinalLote;
	}

	public Integer getInicioValorReportado() {
		return InicioValorReportado;
	}

	public void setInicioValorReportado(Integer inicioValorReportado) {
		InicioValorReportado = inicioValorReportado;
	}

	public Integer getLenValorReportado() {
		return LenValorReportado;
	}

	public void setLenValorReportado(Integer lenValorReportado) {
		LenValorReportado = lenValorReportado;
	}

	public Integer getInicioCupones() {
		return InicioCupones;
	}

	public void setInicioCupones(Integer inicioCupones) {
		InicioCupones = inicioCupones;
	}

	public Integer getLenCupones() {
		return LenCupones;
	}

	public void setLenCupones(Integer lenCupones) {
		LenCupones = lenCupones;
	}

	public String getIdFinal() {
		return IdFinal;
	}

	public void setIdFinal(String idFinal) {
		IdFinal = idFinal;
	}

	public Integer getInicioTipoPago() {
		return InicioTipoPago;
	}

	public void setInicioTipoPago(Integer inicioTipoPago) {
		InicioTipoPago = inicioTipoPago;
	}

	public Integer getLenTipoPago() {
		return LenTipoPago;
	}

	public void setLenTipoPago(Integer lenTipoPago) {
		LenTipoPago = lenTipoPago;
	}

	public boolean isIndDigControl() {
		return IndDigControl;
	}

	public void setIndDigControl(boolean indDigControl) {
		IndDigControl = indDigControl;
	}

	public Integer getId_TipoArchivoRecaudos() {
		return Id_TipoArchivoRecaudos;
	}

	public void setId_TipoArchivoRecaudos(Integer id_TipoArchivoRecaudos) {
		Id_TipoArchivoRecaudos = id_TipoArchivoRecaudos;
	}
    
}
