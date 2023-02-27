package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("F_Corte")
public class BDME4Modelo {
	 @Size(since = 0 , until = 8)
	    @FormParam("F_Corte")
	    @NotNull(update = false)
	    private String F_Corte;
	    @Size(since = 0 , until = 1)
	    @FormParam("TipoReporte")
	    @NotNull(update = false)
	    private String TipoReporte;
	    @Size(since = 0 , until = 7)
	    @FormParam("Consecutivo")
	    @NotNull(update = false)
	    private String Consecutivo;
	    @Size(since = 0 , until = 2)
	    @FormParam("TipoRegistro")
	    private String TipoRegistro;
	    @Size(since = 0 , until = 2)
	    @FormParam("TipoIdentificacion")
	    private String TipoIdentificacion;
	    @Size(since = 0 , until = 20)
	    @FormParam("NroIdentificacion")
	    private String NroIdentificacion;
	    @Size(since = 0 , until = 20)
	    @FormParam("NroObligacion")
	    private String NroObligacion;
	    @Size(since = 0 , until = 25)
	    @FormParam("PrimerNombre")
	    private String PrimerNombre;
	    @Size(since = 0 , until = 25)
	    @FormParam("SegundoNombre")
	    private String SegundoNombre;
	    @Size(since = 0 , until = 25)
	    @FormParam("PrimerApellido")
	    private String PrimerApellido;
	    @Size(since = 0 , until = 25)
	    @FormParam("SegundoApellido")
	    private String SegundoApellido;
	    @Size(since = 0 , until = 10)
	    @FormParam("Conector")
	    private String Conector;
	    @Size(since = 0 , until = 2)
	    @FormParam("TipoDeudor")
	    private String TipoDeudor;
	    @Size(since = 0 , until = 6)
	    @FormParam("ConceptoObligacion")
	    private String ConceptoObligacion;
	    private Float VlrObligacion;
	    @Size(since = 0 , until = 8)
	    @FormParam("F_Vencimiento")
	    private String F_Vencimiento;
	    @Size(since = 0 , until = 3)
	    @FormParam("TerminoObligacion")
	    private String TerminoObligacion;
	    @Size(since = 0 , until = 72)
	    @FormParam("Filler")
	    private String Filler;

	    private Integer Id_BDME4;

		public BDME4Modelo() {
			super();
		}

		public BDME4Modelo(String f_Corte, String tipoReporte, String consecutivo, String tipoRegistro,
				String tipoIdentificacion, String nroIdentificacion, String nroObligacion, String primerNombre,
				String segundoNombre, String primerApellido, String segundoApellido, String conector, String tipoDeudor,
				String conceptoObligacion, Float vlrObligacion, String f_Vencimiento, String terminoObligacion,
				String filler, Integer id_BDME4) {
			super();
			F_Corte = f_Corte;
			TipoReporte = tipoReporte;
			Consecutivo = consecutivo;
			TipoRegistro = tipoRegistro;
			TipoIdentificacion = tipoIdentificacion;
			NroIdentificacion = nroIdentificacion;
			NroObligacion = nroObligacion;
			PrimerNombre = primerNombre;
			SegundoNombre = segundoNombre;
			PrimerApellido = primerApellido;
			SegundoApellido = segundoApellido;
			Conector = conector;
			TipoDeudor = tipoDeudor;
			ConceptoObligacion = conceptoObligacion;
			VlrObligacion = vlrObligacion;
			F_Vencimiento = f_Vencimiento;
			TerminoObligacion = terminoObligacion;
			Filler = filler;
			Id_BDME4 = id_BDME4;
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

		public String getPrimerNombre() {
			return PrimerNombre;
		}

		public void setPrimerNombre(String primerNombre) {
			PrimerNombre = primerNombre;
		}

		public String getSegundoNombre() {
			return SegundoNombre;
		}

		public void setSegundoNombre(String segundoNombre) {
			SegundoNombre = segundoNombre;
		}

		public String getPrimerApellido() {
			return PrimerApellido;
		}

		public void setPrimerApellido(String primerApellido) {
			PrimerApellido = primerApellido;
		}

		public String getSegundoApellido() {
			return SegundoApellido;
		}

		public void setSegundoApellido(String segundoApellido) {
			SegundoApellido = segundoApellido;
		}

		public String getConector() {
			return Conector;
		}

		public void setConector(String conector) {
			Conector = conector;
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

		public Float getVlrObligacion() {
			return VlrObligacion;
		}

		public void setVlrObligacion(Float vlrObligacion) {
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

		public Integer getId_BDME4() {
			return Id_BDME4;
		}

		public void setId_BDME4(Integer id_BDME4) {
			Id_BDME4 = id_BDME4;
		}
	    
}
