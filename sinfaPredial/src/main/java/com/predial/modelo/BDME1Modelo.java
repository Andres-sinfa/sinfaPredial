package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Consecutivo")
public class BDME1Modelo {
    @Size(since = 0 , until = 7)
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private String Consecutivo;
    @Size(since = 0 , until = 2)
    @FormParam("TipoRegistro")
    @NotNull(update = false)
    private String TipoRegistro;
    @Size(since = 0 , until = 1)
    @FormParam("TipoReporte")
    @NotNull(update = false)
    private String TipoReporte;
    @Size(since = 0 , until = 9)
    @FormParam("CodigoEntidad")
    @NotNull(update = false)
    private String CodigoEntidad;
    @Size(since = 0 , until = 8)
    @FormParam("F_Corte")
    @NotNull(update = false)
    private String F_Corte;
    @Size(since = 0 , until = 15)
    @FormParam("CantidadNaturales")
    private String CantidadNaturales;
    @Size(since = 0 , until = 20)
    @FormParam("VlrNaturales")
    private String VlrNaturales;
    @Size(since = 0 , until = 15)
    @FormParam("CantidadJuridicas")
    private String CantidadJuridicas;
    @Size(since = 0 , until = 20)
    @FormParam("VlrJuridicas")
    private String VlrJuridicas;
    @Size(since = 0 , until = 153)
    @FormParam("Filler")
    private String Filler;
    
    private Integer Id_BDME1;

	public BDME1Modelo(String consecutivo, String tipoRegistro, String tipoReporte, String codigoEntidad,
			String f_Corte, String cantidadNaturales, String vlrNaturales, String cantidadJuridicas,
			String vlrJuridicas, String filler, Integer id_BDME1) {
		super();
		Consecutivo = consecutivo;
		TipoRegistro = tipoRegistro;
		TipoReporte = tipoReporte;
		CodigoEntidad = codigoEntidad;
		F_Corte = f_Corte;
		CantidadNaturales = cantidadNaturales;
		VlrNaturales = vlrNaturales;
		CantidadJuridicas = cantidadJuridicas;
		VlrJuridicas = vlrJuridicas;
		Filler = filler;
		Id_BDME1 = id_BDME1;
	}

	public BDME1Modelo() {
		super();
	}

	public String getConsecutivo() {
		return Consecutivo;
	}

	public void setConsecutivo(String consecutivo) {
		Consecutivo = consecutivo;
	}

	public String getTipoRegistro() {
		return TipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		TipoRegistro = tipoRegistro;
	}

	public String getTipoReporte() {
		return TipoReporte;
	}

	public void setTipoReporte(String tipoReporte) {
		TipoReporte = tipoReporte;
	}

	public String getCodigoEntidad() {
		return CodigoEntidad;
	}

	public void setCodigoEntidad(String codigoEntidad) {
		CodigoEntidad = codigoEntidad;
	}

	public String getF_Corte() {
		return F_Corte;
	}

	public void setF_Corte(String f_Corte) {
		F_Corte = f_Corte;
	}

	public String getCantidadNaturales() {
		return CantidadNaturales;
	}

	public void setCantidadNaturales(String cantidadNaturales) {
		CantidadNaturales = cantidadNaturales;
	}

	public String getVlrNaturales() {
		return VlrNaturales;
	}

	public void setVlrNaturales(String vlrNaturales) {
		VlrNaturales = vlrNaturales;
	}

	public String getCantidadJuridicas() {
		return CantidadJuridicas;
	}

	public void setCantidadJuridicas(String cantidadJuridicas) {
		CantidadJuridicas = cantidadJuridicas;
	}

	public String getVlrJuridicas() {
		return VlrJuridicas;
	}

	public void setVlrJuridicas(String vlrJuridicas) {
		VlrJuridicas = vlrJuridicas;
	}

	public String getFiller() {
		return Filler;
	}

	public void setFiller(String filler) {
		Filler = filler;
	}

	public Integer getId_BDME1() {
		return Id_BDME1;
	}

	public void setId_BDME1(Integer id_BDME1) {
		Id_BDME1 = id_BDME1;
	}
    
    
    
}
