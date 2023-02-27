package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("F_Corte")
public class BDME5Modelo {
    @Size(since = 0 , until = 8)
    @FormParam("F_Corte")
    @NotNull(update = false)
    private String  F_Corte;
    @Size(since = 0 , until = 1)
    @FormParam("TipoReporte")
    @NotNull(update = false)
    private String  TipoReporte;
    @Size(since = 0 , until = 7)
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private String  Consecutivo;
    @Size(since = 0 , until = 2)
    @FormParam("TipoRegistro")
    private String  TipoRegistro;
    @Size(since = 0 , until = 2)
    @FormParam("TipoIdentificacion")
    private String  TipoIdentificacion;
    @Size(since = 0 , until = 21)
    @FormParam("NroIdentificacion")
    private String  NroIdentificacion;
    @Size(since = 0 , until = 20)
    @FormParam("NroObligacion")
    private String  NroObligacion;
    @Size(since = 0 , until = 100)
    @FormParam("RazonSocial")
    private String  RazonSocial;
    @Size(since = 0 , until = 15)
    @FormParam("Sigla")
    private String  Sigla;
    @Size(since = 0 , until = 2)
    @FormParam("TipoDeudor")
    private String  TipoDeudor;
    @Size(since = 0 , until = 6)
    @FormParam("ConceptoObligacion")
    private String  ConceptoObligacion;
    @FormParam("VlrObligacion")
    private float VlrObligacion;
    @Size(since = 0 , until = 8)
    @FormParam("F_Vencimiento")
    private String  F_Vencimiento;
    @Size(since = 0 , until = 3)
    @FormParam("TerminoObligacion")
    private String  TerminoObligacion;
    @Size(since = 0 , until = 66)
    @FormParam("Filler")
    private String  Filler;

    private Integer Id_BDME5;

	public BDME5Modelo(String f_Corte, String tipoReporte, String consecutivo, String tipoRegistro,
			String tipoIdentificacion, String nroIdentificacion, String nroObligacion, String razonSocial, String sigla,
			String tipoDeudor, String conceptoObligacion, float vlrObligacion, String f_Vencimiento,
			String terminoObligacion, String filler, Integer id_BDME5) {
		super();
		F_Corte = f_Corte;
		TipoReporte = tipoReporte;
		Consecutivo = consecutivo;
		TipoRegistro = tipoRegistro;
		TipoIdentificacion = tipoIdentificacion;
		NroIdentificacion = nroIdentificacion;
		NroObligacion = nroObligacion;
		RazonSocial = razonSocial;
		Sigla = sigla;
		TipoDeudor = tipoDeudor;
		ConceptoObligacion = conceptoObligacion;
		VlrObligacion = vlrObligacion;
		F_Vencimiento = f_Vencimiento;
		TerminoObligacion = terminoObligacion;
		Filler = filler;
		Id_BDME5 = id_BDME5;
	}

	public BDME5Modelo() {
		super();
	}

	public String getF_Corte() {
		return F_Corte;
	}

	public void setF_Corte(String f_Corte) {
		F_Corte = f_Corte;
	}

	public String getTipoReporte() {
		return TipoReporte;
	}

	public void setTipoReporte(String tipoReporte) {
		TipoReporte = tipoReporte;
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

	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}

	public String getNroIdentificacion() {
		return NroIdentificacion;
	}

	public void setNroIdentificacion(String nroIdentificacion) {
		NroIdentificacion = nroIdentificacion;
	}

	public String getNroObligacion() {
		return NroObligacion;
	}

	public void setNroObligacion(String nroObligacion) {
		NroObligacion = nroObligacion;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getSigla() {
		return Sigla;
	}

	public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public String getTipoDeudor() {
		return TipoDeudor;
	}

	public void setTipoDeudor(String tipoDeudor) {
		TipoDeudor = tipoDeudor;
	}

	public String getConceptoObligacion() {
		return ConceptoObligacion;
	}

	public void setConceptoObligacion(String conceptoObligacion) {
		ConceptoObligacion = conceptoObligacion;
	}

	public float getVlrObligacion() {
		return VlrObligacion;
	}

	public void setVlrObligacion(float vlrObligacion) {
		VlrObligacion = vlrObligacion;
	}

	public String getF_Vencimiento() {
		return F_Vencimiento;
	}

	public void setF_Vencimiento(String f_Vencimiento) {
		F_Vencimiento = f_Vencimiento;
	}

	public String getTerminoObligacion() {
		return TerminoObligacion;
	}

	public void setTerminoObligacion(String terminoObligacion) {
		TerminoObligacion = terminoObligacion;
	}

	public String getFiller() {
		return Filler;
	}

	public void setFiller(String filler) {
		Filler = filler;
	}

	public Integer getId_BDME5() {
		return Id_BDME5;
	}

	public void setId_BDME5(Integer id_BDME5) {
		Id_BDME5 = id_BDME5;
	}
    
}
