package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Departamento")
public class IGACModelo {
	 @Size(since = 0 , until = 2)
	    @FormParam("Departamento")
	    @NotNull
	    private String Departamento;
	    @Size(since = 0 , until = 3)
	    @FormParam("Municipio")
	    @NotNull
	    private String Municipio;
	    @Size(since = -32768, until = 32767)
	    @FormParam("Ano")
	    @NotNull(update = false)
	    private Integer Ano;
	    @Size(since = 0 , until = 30)
	    @FormParam("CodigoCatastral")
	    @NotNull(update = false)
	    private String CodigoCatastral;
	    @Size(since = 0 , until = 3)
	    @FormParam("Propietario")
	    @NotNull(update = false)
	    private String Propietario;
	    @Size(since = 0 , until = 1)
	    @FormParam("TipoRegistro")
	    private String TipoRegistro;
	    @Size(since = 0 , until = 3)
	    @FormParam("NroRegistros")
	    private String NroRegistros;
	    @Size(since = 0 , until = 100)
	    @FormParam("Nombres")
	    private String Nombres;
	    @Size(since = 0 , until = 1)
	    @FormParam("DcasadaViuda")
	    private String DcasadaViuda;
	    @Size(since = 0 , until = 1)
	    @FormParam("TipoNit")
	    private String TipoNit;
	    @Size(since = 0 , until = 13)
	    @FormParam("Nit")
	    private String Nit;
	    @Size(since = 0 , until = 100)
	    @FormParam("NombrePredio")
	    private String NombrePredio;
	    @Size(since = 0 , until = 2)
	    @FormParam("DestinoEconomico")
	    private String DestinoEconomico;
	    @FormParam("AreaHectareas")
	    private Float AreaHectareas;
	    @FormParam("AreaMetros")
	    private Float AreaMetros;
	    @FormParam("AreaConstruida")
	    private Float AreaConstruida;
	    @FormParam("Avaluo")
	    private Float Avaluo;
	    @Size(since = 0 , until = 1)
	    @FormParam("CondicionTributaria")
	    private String CondicionTributaria;
	    @DateFormat
	    @FormParam("F_proceso")
	    private String F_proceso;
	    @Size(since = -32768, until = 32767)
	    @FormParam("AnoTarifa")
	    private Integer AnoTarifa;
	    @Size(since = 0 , until = 100)
	    @FormParam("DireccionPredio")
	    private String DireccionPredio;
	    @Size(since = 0 , until = 1)
	    @FormParam("Comuna")
	    private String Comuna;
	    @Size(since = 0 , until = 30)
	    @FormParam("CodUnicoCatastral")
	    private String CodUnicoCatastral;
	    @Size(since = 0 , until = 15)
	    @FormParam("CodigoCatastral_15")
	    private String CodigoCatastral_15;
	    @Size(since = 0 , until = 50)
	    @FormParam("matricula")
	    private String matricula;

	    private Integer Id_IGAC;

		public IGACModelo() {
			super();
		}

		public IGACModelo(String departamento, String municipio, Integer ano, String codigoCatastral,
				String propietario, String tipoRegistro, String nroRegistros, String nombres, String dcasadaViuda,
				String tipoNit, String nit, String nombrePredio, String destinoEconomico, Float areaHectareas,
				Float areaMetros, Float areaConstruida, Float avaluo, String condicionTributaria, String f_proceso,
				Integer anoTarifa, String direccionPredio, String comuna, String codUnicoCatastral,
				String codigoCatastral_15, String matricula, Integer id_IGAC) {
			super();
			Departamento = departamento;
			Municipio = municipio;
			Ano = ano;
			CodigoCatastral = codigoCatastral;
			Propietario = propietario;
			TipoRegistro = tipoRegistro;
			NroRegistros = nroRegistros;
			Nombres = nombres;
			DcasadaViuda = dcasadaViuda;
			TipoNit = tipoNit;
			Nit = nit;
			NombrePredio = nombrePredio;
			DestinoEconomico = destinoEconomico;
			AreaHectareas = areaHectareas;
			AreaMetros = areaMetros;
			AreaConstruida = areaConstruida;
			Avaluo = avaluo;
			CondicionTributaria = condicionTributaria;
			F_proceso = f_proceso;
			AnoTarifa = anoTarifa;
			DireccionPredio = direccionPredio;
			Comuna = comuna;
			CodUnicoCatastral = codUnicoCatastral;
			CodigoCatastral_15 = codigoCatastral_15;
			this.matricula = matricula;
			Id_IGAC = id_IGAC;
		}

		public String getDepartamento() {
			return Departamento;
		}

		public void setDepartamento(String departamento) {
			Departamento = departamento;
		}

		public String getMunicipio() {
			return Municipio;
		}

		public void setMunicipio(String municipio) {
			Municipio = municipio;
		}

		public Integer getAno() {
			return Ano;
		}

		public void setAno(Integer ano) {
			Ano = ano;
		}

		public String getCodigoCatastral() {
			return CodigoCatastral;
		}

		public void setCodigoCatastral(String codigoCatastral) {
			CodigoCatastral = codigoCatastral;
		}

		public String getPropietario() {
			return Propietario;
		}

		public void setPropietario(String propietario) {
			Propietario = propietario;
		}

		public String getTipoRegistro() {
			return TipoRegistro;
		}

		public void setTipoRegistro(String tipoRegistro) {
			TipoRegistro = tipoRegistro;
		}

		public String getNroRegistros() {
			return NroRegistros;
		}

		public void setNroRegistros(String nroRegistros) {
			NroRegistros = nroRegistros;
		}

		public String getNombres() {
			return Nombres;
		}

		public void setNombres(String nombres) {
			Nombres = nombres;
		}

		public String getDcasadaViuda() {
			return DcasadaViuda;
		}

		public void setDcasadaViuda(String dcasadaViuda) {
			DcasadaViuda = dcasadaViuda;
		}

		public String getTipoNit() {
			return TipoNit;
		}

		public void setTipoNit(String tipoNit) {
			TipoNit = tipoNit;
		}

		public String getNit() {
			return Nit;
		}

		public void setNit(String nit) {
			Nit = nit;
		}

		public String getNombrePredio() {
			return NombrePredio;
		}

		public void setNombrePredio(String nombrePredio) {
			NombrePredio = nombrePredio;
		}

		public String getDestinoEconomico() {
			return DestinoEconomico;
		}

		public void setDestinoEconomico(String destinoEconomico) {
			DestinoEconomico = destinoEconomico;
		}

		public Float getAreaHectareas() {
			return AreaHectareas;
		}

		public void setAreaHectareas(Float areaHectareas) {
			AreaHectareas = areaHectareas;
		}

		public Float getAreaMetros() {
			return AreaMetros;
		}

		public void setAreaMetros(Float areaMetros) {
			AreaMetros = areaMetros;
		}

		public Float getAreaConstruida() {
			return AreaConstruida;
		}

		public void setAreaConstruida(Float areaConstruida) {
			AreaConstruida = areaConstruida;
		}

		public Float getAvaluo() {
			return Avaluo;
		}

		public void setAvaluo(Float avaluo) {
			Avaluo = avaluo;
		}

		public String getCondicionTributaria() {
			return CondicionTributaria;
		}

		public void setCondicionTributaria(String condicionTributaria) {
			CondicionTributaria = condicionTributaria;
		}

		public String getF_proceso() {
			return F_proceso;
		}

		public void setF_proceso(String f_proceso) {
			F_proceso = f_proceso;
		}

		public Integer getAnoTarifa() {
			return AnoTarifa;
		}

		public void setAnoTarifa(Integer anoTarifa) {
			AnoTarifa = anoTarifa;
		}

		public String getDireccionPredio() {
			return DireccionPredio;
		}

		public void setDireccionPredio(String direccionPredio) {
			DireccionPredio = direccionPredio;
		}

		public String getComuna() {
			return Comuna;
		}

		public void setComuna(String comuna) {
			Comuna = comuna;
		}

		public String getCodUnicoCatastral() {
			return CodUnicoCatastral;
		}

		public void setCodUnicoCatastral(String codUnicoCatastral) {
			CodUnicoCatastral = codUnicoCatastral;
		}

		public String getCodigoCatastral_15() {
			return CodigoCatastral_15;
		}

		public void setCodigoCatastral_15(String codigoCatastral_15) {
			CodigoCatastral_15 = codigoCatastral_15;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public Integer getId_IGAC() {
			return Id_IGAC;
		}

		public void setId_IGAC(Integer id_IGAC) {
			Id_IGAC = id_IGAC;
		}
	    
}
