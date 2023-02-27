package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Fecha")
public class RecaudosModelo {
    @FormParam("Fecha")
    @DateFormat
    @NotNull(update = false)
    private String Fecha;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    @NotNull(update = false)
    private Integer AnoBanco;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    @NotNull(update = false)
    private String Banco;
    @Size(since = 0 , until = 3)
    @FormParam("Paquete")
    @NotNull(update = false)
    private String Paquete;
    @FormParam("VlrReportado")
    private Float VlrReportado;
    @FormParam("CuponesReportados")
    private Float CuponesReportados;
    @FormParam("VlrAcumulado")
    private Float VlrAcumulado;
    @FormParam("CuponesAcumulados")
    private Float CuponesAcumulados;
    @FormParam("VlrDiferencia")
    private Float VlrDiferencia;
    @FormParam("DiferenciaCupones")
    private Float DiferenciaCupones;
    @FormParam("VlrFinanciables")
    private Float VlrFinanciables;
    @FormParam("VlrAjustes")
    private Float VlrAjustes;
    @FormParam("VlrPagosDobles")
    private Float VlrPagosDobles;

    private Integer Id_Recaudos;

	public RecaudosModelo() {
		super();
	}

	public RecaudosModelo(String fecha, Integer anoBanco, String banco, String paquete, Float vlrReportado,
			Float cuponesReportados, Float vlrAcumulado, Float cuponesAcumulados, Float vlrDiferencia,
			Float diferenciaCupones, Float vlrFinanciables, Float vlrAjustes, Float vlrPagosDobles,
			Integer id_Recaudos) {
		super();
		Fecha = fecha;
		AnoBanco = anoBanco;
		Banco = banco;
		Paquete = paquete;
		VlrReportado = vlrReportado;
		CuponesReportados = cuponesReportados;
		VlrAcumulado = vlrAcumulado;
		CuponesAcumulados = cuponesAcumulados;
		VlrDiferencia = vlrDiferencia;
		DiferenciaCupones = diferenciaCupones;
		VlrFinanciables = vlrFinanciables;
		VlrAjustes = vlrAjustes;
		VlrPagosDobles = vlrPagosDobles;
		Id_Recaudos = id_Recaudos;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getPaquete() {
		return Paquete;
	}

	public void setPaquete(String paquete) {
		Paquete = paquete;
	}

	public Float getVlrReportado() {
		return VlrReportado;
	}

	public void setVlrReportado(Float vlrReportado) {
		VlrReportado = vlrReportado;
	}

	public Float getCuponesReportados() {
		return CuponesReportados;
	}

	public void setCuponesReportados(Float cuponesReportados) {
		CuponesReportados = cuponesReportados;
	}

	public Float getVlrAcumulado() {
		return VlrAcumulado;
	}

	public void setVlrAcumulado(Float vlrAcumulado) {
		VlrAcumulado = vlrAcumulado;
	}

	public Float getCuponesAcumulados() {
		return CuponesAcumulados;
	}

	public void setCuponesAcumulados(Float cuponesAcumulados) {
		CuponesAcumulados = cuponesAcumulados;
	}

	public Float getVlrDiferencia() {
		return VlrDiferencia;
	}

	public void setVlrDiferencia(Float vlrDiferencia) {
		VlrDiferencia = vlrDiferencia;
	}

	public Float getDiferenciaCupones() {
		return DiferenciaCupones;
	}

	public void setDiferenciaCupones(Float diferenciaCupones) {
		DiferenciaCupones = diferenciaCupones;
	}

	public Float getVlrFinanciables() {
		return VlrFinanciables;
	}

	public void setVlrFinanciables(Float vlrFinanciables) {
		VlrFinanciables = vlrFinanciables;
	}

	public Float getVlrAjustes() {
		return VlrAjustes;
	}

	public void setVlrAjustes(Float vlrAjustes) {
		VlrAjustes = vlrAjustes;
	}

	public Float getVlrPagosDobles() {
		return VlrPagosDobles;
	}

	public void setVlrPagosDobles(Float vlrPagosDobles) {
		VlrPagosDobles = vlrPagosDobles;
	}

	public Integer getId_Recaudos() {
		return Id_Recaudos;
	}

	public void setId_Recaudos(Integer id_Recaudos) {
		Id_Recaudos = id_Recaudos;
	}
    
    
    
}
