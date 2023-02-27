package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodNivel")
public class CGNENTIDADModelo {
	@Size(since = -32768, until = 32767)
    @FormParam("CodNivel")
    @NotNull(update = false)
    private Integer CodNivel;
    @Size(since = -32768, until = 32767)
    @FormParam("CodOrden")
    @NotNull(update = false)
    private Integer CodOrden;
    @Size(since = -32768, until = 32767)
    @FormParam("CodEntidad")
    @NotNull(update = false)
    private Integer CodEntidad;
    @Size(since = -32768, until = 32767)
    @FormParam("CodDepto")
    @NotNull(update = false)
    private Integer CodDepto;
    @Size(since = -32768, until = 32767)
    @FormParam("CodMunic")
    @NotNull(update = false)
    private Integer CodMunic;
    @Size(since = 0 , until = 9)
    @FormParam("CodUnion")
    @NotNull(update = false)
    private String CodUnion;
    @Size(since = 0 , until = 130)
    @FormParam("Nombre")
    private String Nombre;
    @Size(since = -32768, until = 32767)
    @FormParam("General")
    private Integer General;
    @Size(since = -32768, until = 32767)
    @FormParam("Especifica")
    private Integer Especifica;
    @Size(since = -32768, until = 32767)
    @FormParam("FServicio")
    private Integer FServicio;
    @Size(since = -32768, until = 32767)
    @FormParam("CodIndicaGrupo")
    private Integer CodIndicaGrupo;
    @Size(since = -32768, until = 32767)
    @FormParam("CodGrupo")
    private Integer CodGrupo;
    @Size(since = -32768, until = 32767)
    @FormParam("CodSubgrupo")
    private Integer CodSubgrupo;
    @DateFormat
    @FormParam("FechaDesde")
    private String FechaDesde;
    @DateFormat
    @FormParam("FechaHasta")
    private String FechaHasta;
    @Size(since = -32768, until = 32767)
    @FormParam("CodOrdenConsolidacion")
    private Integer CodOrdenConsolidacion;
    @Size(since = -32768, until = 32767)
    @FormParam("CodDeptoConsolidacion")
    private Integer CodDeptoConsolidacion;
    @Size(since = -32768, until = 32767)
    @FormParam("CodMunicConsolidacion")
    private Integer CodMunicConsolidacion;
    @FormParam("nit")
    private Integer nit;
    @Size(since = 0, until = 255)
    @FormParam("dv")
    private Integer dv;
    @Size(since = -32768, until = 32767)
    @FormParam("control")
    private Integer control;
    @Size(since = -32768, until = 32767)
    @FormParam("Muestra")
    private Integer Muestra;
    @FormParam("indica")
    private boolean indica;
    @FormParam("CodSup")
    private Float CodSup;
    @FormParam("CodSup1")
    private Float CodSup1;
    @FormParam("CodAgs")
    private Float CodAgs;
    @FormParam("CodAgs1")
    private Float CodAgs1;
    @FormParam("CodAgr")
    private Float CodAgr;
    @FormParam("CodAgr1")
    private Float CodAgr1;
    @Size(since = -32768, until = 32767)
    @FormParam("CodSec")
    private Integer CodSec;
    @FormParam("CodNiv")
    private Float CodNiv;
    @Size(since = -32768, until = 32767)
    @FormParam("CodDeptoConsolidacion1")
    private Integer CodDeptoConsolidacion1;
    @Size(since = -32768, until = 32767)
    @FormParam("CodMunicConsolidacion1")
    private Integer CodMunicConsolidacion1;
    @FormParam("CodActividad1")
    private Float CodActividad1;
    @FormParam("Muestra1")
    private Float Muestra1;
    @Size(since = 0 , until = 50)
    @FormParam("Email")
    private String Email;
    @Size(since = -32768, until = 32767)
    @FormParam("Salud")
    private Integer Salud;
    @DateFormat
    @FormParam("FechaCreacion")
    private String FechaCreacion;
    @DateFormat
    @FormParam("FechaLiquidacion")
    private String FechaLiquidacion;
    @DateFormat
    @FormParam("FechaCortePrimerEnvio")
    private String FechaCortePrimerEnvio;
    @FormParam("codagr2")
    private Float codagr2;
    @Size(since = 0 , until = 1)
    @FormParam("Tipest")
    private String Tipest;

    private Integer Id_CGNENTIDAD;

	public CGNENTIDADModelo(Integer codNivel, Integer codOrden, Integer codEntidad, Integer codDepto, Integer codMunic,
			String codUnion, String nombre, Integer general, Integer especifica, Integer fServicio,
			Integer codIndicaGrupo, Integer codGrupo, Integer codSubgrupo, String fechaDesde, String fechaHasta,
			Integer codOrdenConsolidacion, Integer codDeptoConsolidacion, Integer codMunicConsolidacion, Integer nit,
			Integer dv, Integer control, Integer muestra, boolean indica, Float codSup, Float codSup1, Float codAgs,
			Float codAgs1, Float codAgr, Float codAgr1, Integer codSec, Float codNiv, Integer codDeptoConsolidacion1,
			Integer codMunicConsolidacion1, Float codActividad1, Float muestra1, String email, Integer salud,
			String fechaCreacion, String fechaLiquidacion, String fechaCortePrimerEnvio, Float codagr2, String tipest,
			Integer id_CGNENTIDAD) {
		super();
		CodNivel = codNivel;
		CodOrden = codOrden;
		CodEntidad = codEntidad;
		CodDepto = codDepto;
		CodMunic = codMunic;
		CodUnion = codUnion;
		Nombre = nombre;
		General = general;
		Especifica = especifica;
		FServicio = fServicio;
		CodIndicaGrupo = codIndicaGrupo;
		CodGrupo = codGrupo;
		CodSubgrupo = codSubgrupo;
		FechaDesde = fechaDesde;
		FechaHasta = fechaHasta;
		CodOrdenConsolidacion = codOrdenConsolidacion;
		CodDeptoConsolidacion = codDeptoConsolidacion;
		CodMunicConsolidacion = codMunicConsolidacion;
		this.nit = nit;
		this.dv = dv;
		this.control = control;
		Muestra = muestra;
		this.indica = indica;
		CodSup = codSup;
		CodSup1 = codSup1;
		CodAgs = codAgs;
		CodAgs1 = codAgs1;
		CodAgr = codAgr;
		CodAgr1 = codAgr1;
		CodSec = codSec;
		CodNiv = codNiv;
		CodDeptoConsolidacion1 = codDeptoConsolidacion1;
		CodMunicConsolidacion1 = codMunicConsolidacion1;
		CodActividad1 = codActividad1;
		Muestra1 = muestra1;
		Email = email;
		Salud = salud;
		FechaCreacion = fechaCreacion;
		FechaLiquidacion = fechaLiquidacion;
		FechaCortePrimerEnvio = fechaCortePrimerEnvio;
		this.codagr2 = codagr2;
		Tipest = tipest;
		Id_CGNENTIDAD = id_CGNENTIDAD;
	}

	public CGNENTIDADModelo() {
		super();
	}

	public Integer getCodNivel() {
		return CodNivel;
	}

	public void setCodNivel(Integer codNivel) {
		CodNivel = codNivel;
	}

	public Integer getCodOrden() {
		return CodOrden;
	}

	public void setCodOrden(Integer codOrden) {
		CodOrden = codOrden;
	}

	public Integer getCodEntidad() {
		return CodEntidad;
	}

	public void setCodEntidad(Integer codEntidad) {
		CodEntidad = codEntidad;
	}

	public Integer getCodDepto() {
		return CodDepto;
	}

	public void setCodDepto(Integer codDepto) {
		CodDepto = codDepto;
	}

	public Integer getCodMunic() {
		return CodMunic;
	}

	public void setCodMunic(Integer codMunic) {
		CodMunic = codMunic;
	}

	public String getCodUnion() {
		return CodUnion;
	}

	public void setCodUnion(String codUnion) {
		CodUnion = codUnion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getGeneral() {
		return General;
	}

	public void setGeneral(Integer general) {
		General = general;
	}

	public Integer getEspecifica() {
		return Especifica;
	}

	public void setEspecifica(Integer especifica) {
		Especifica = especifica;
	}

	public Integer getFServicio() {
		return FServicio;
	}

	public void setFServicio(Integer fServicio) {
		FServicio = fServicio;
	}

	public Integer getCodIndicaGrupo() {
		return CodIndicaGrupo;
	}

	public void setCodIndicaGrupo(Integer codIndicaGrupo) {
		CodIndicaGrupo = codIndicaGrupo;
	}

	public Integer getCodGrupo() {
		return CodGrupo;
	}

	public void setCodGrupo(Integer codGrupo) {
		CodGrupo = codGrupo;
	}

	public Integer getCodSubgrupo() {
		return CodSubgrupo;
	}

	public void setCodSubgrupo(Integer codSubgrupo) {
		CodSubgrupo = codSubgrupo;
	}

	public String getFechaDesde() {
		return FechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		FechaDesde = fechaDesde;
	}

	public String getFechaHasta() {
		return FechaHasta;
	}

	public void setFechaHasta(String fechaHasta) {
		FechaHasta = fechaHasta;
	}

	public Integer getCodOrdenConsolidacion() {
		return CodOrdenConsolidacion;
	}

	public void setCodOrdenConsolidacion(Integer codOrdenConsolidacion) {
		CodOrdenConsolidacion = codOrdenConsolidacion;
	}

	public Integer getCodDeptoConsolidacion() {
		return CodDeptoConsolidacion;
	}

	public void setCodDeptoConsolidacion(Integer codDeptoConsolidacion) {
		CodDeptoConsolidacion = codDeptoConsolidacion;
	}

	public Integer getCodMunicConsolidacion() {
		return CodMunicConsolidacion;
	}

	public void setCodMunicConsolidacion(Integer codMunicConsolidacion) {
		CodMunicConsolidacion = codMunicConsolidacion;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

	public Integer getDv() {
		return dv;
	}

	public void setDv(Integer dv) {
		this.dv = dv;
	}

	public Integer getControl() {
		return control;
	}

	public void setControl(Integer control) {
		this.control = control;
	}

	public Integer getMuestra() {
		return Muestra;
	}

	public void setMuestra(Integer muestra) {
		Muestra = muestra;
	}

	public boolean isIndica() {
		return indica;
	}

	public void setIndica(boolean indica) {
		this.indica = indica;
	}

	public Float getCodSup() {
		return CodSup;
	}

	public void setCodSup(Float codSup) {
		CodSup = codSup;
	}

	public Float getCodSup1() {
		return CodSup1;
	}

	public void setCodSup1(Float codSup1) {
		CodSup1 = codSup1;
	}

	public Float getCodAgs() {
		return CodAgs;
	}

	public void setCodAgs(Float codAgs) {
		CodAgs = codAgs;
	}

	public Float getCodAgs1() {
		return CodAgs1;
	}

	public void setCodAgs1(Float codAgs1) {
		CodAgs1 = codAgs1;
	}

	public Float getCodAgr() {
		return CodAgr;
	}

	public void setCodAgr(Float codAgr) {
		CodAgr = codAgr;
	}

	public Float getCodAgr1() {
		return CodAgr1;
	}

	public void setCodAgr1(Float codAgr1) {
		CodAgr1 = codAgr1;
	}

	public Integer getCodSec() {
		return CodSec;
	}

	public void setCodSec(Integer codSec) {
		CodSec = codSec;
	}

	public Float getCodNiv() {
		return CodNiv;
	}

	public void setCodNiv(Float codNiv) {
		CodNiv = codNiv;
	}

	public Integer getCodDeptoConsolidacion1() {
		return CodDeptoConsolidacion1;
	}

	public void setCodDeptoConsolidacion1(Integer codDeptoConsolidacion1) {
		CodDeptoConsolidacion1 = codDeptoConsolidacion1;
	}

	public Integer getCodMunicConsolidacion1() {
		return CodMunicConsolidacion1;
	}

	public void setCodMunicConsolidacion1(Integer codMunicConsolidacion1) {
		CodMunicConsolidacion1 = codMunicConsolidacion1;
	}

	public Float getCodActividad1() {
		return CodActividad1;
	}

	public void setCodActividad1(Float codActividad1) {
		CodActividad1 = codActividad1;
	}

	public Float getMuestra1() {
		return Muestra1;
	}

	public void setMuestra1(Float muestra1) {
		Muestra1 = muestra1;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getSalud() {
		return Salud;
	}

	public void setSalud(Integer salud) {
		Salud = salud;
	}

	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public String getFechaLiquidacion() {
		return FechaLiquidacion;
	}

	public void setFechaLiquidacion(String fechaLiquidacion) {
		FechaLiquidacion = fechaLiquidacion;
	}

	public String getFechaCortePrimerEnvio() {
		return FechaCortePrimerEnvio;
	}

	public void setFechaCortePrimerEnvio(String fechaCortePrimerEnvio) {
		FechaCortePrimerEnvio = fechaCortePrimerEnvio;
	}

	public Float getCodagr2() {
		return codagr2;
	}

	public void setCodagr2(Float codagr2) {
		this.codagr2 = codagr2;
	}

	public String getTipest() {
		return Tipest;
	}

	public void setTipest(String tipest) {
		Tipest = tipest;
	}

	public Integer getId_CGNENTIDAD() {
		return Id_CGNENTIDAD;
	}

	public void setId_CGNENTIDAD(Integer id_CGNENTIDAD) {
		Id_CGNENTIDAD = id_CGNENTIDAD;
	}
    
}
