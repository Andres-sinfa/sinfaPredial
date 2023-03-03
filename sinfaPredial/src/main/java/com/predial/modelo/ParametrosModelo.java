package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("id")
public class ParametrosModelo {
    @NotNull(update = false)
    @FormParam("id")
    private Integer id;
    @FormParam("Ley44")
    private boolean Ley44;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoInicialLey44")
    private Integer AnoInicialLey44;
    @Size(since = -32768, until = 32767)
    @FormParam("MesInicial")
    private Integer MesInicial;
    @FormParam("MesGracia")
    private Integer MesGracia;
    @FormParam("Ley44Car")
    private boolean Ley44Car;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoDescuentoIntereses")
    private Integer AnoDescuentoIntereses;
    @Size(since = 0 , until = 60)
    @FormParam("Compania")
    private String Compania;
    @Size(since = 0 , until = 13)
    @FormParam("Nit")
    private String Nit;
    @Size(since = 0 , until = 30)
    @FormParam("Ciudad")
    private String Ciudad;
    @Size(since = 0 , until = 50)
    @FormParam("Direccion")
    private String Direccion;
    @Size(since = 0 , until = 30)
    @FormParam("Telefonos")
    private String Telefonos;
    @Size(since = 0 , until = 30)
    @FormParam("Fax")
    private String Fax;
    @FormParam("Web")
    private String Web;
    @Size(since = 0 , until = 40)
    @FormParam("Version")
    private String Version;
    @Size(since = 0 , until = 10)
    @FormParam("NroLicencia")
    private String NroLicencia;
    @Size(since = 0 , until = 10)
    @FormParam("Recibo")
    private String Recibo;
    @Size(since = 0 , until = 10)
    @FormParam("Factura")
    private String Factura;
    @FormParam("Interes")
    private Float Interes;
    @Size(since = 0 , until = 255)
    @FormParam("servidor_access")
    private String servidor_access;
    @Size(since = 0 , until = 255)
    @FormParam("servidor_odbc")
    private String servidor_odbc;
    @Size(since = 0 , until = 255)
    @FormParam("path_logo")
    private String path_logo;
    @Size(since = 0 , until = 255)
    @FormParam("Mensaje")
    private String Mensaje;
    @FormParam("Mensaje1")
    private String Mensaje1;
    @NotNull
    @FormParam("FormularioSinPago")
    private Float FormularioSinPago;
    @FormParam("ley1066IMP")
    private boolean ley1066IMP;
    @FormParam("Ley1066CAR")
    private boolean Ley1066CAR;
    @NotNull
    @DateFormat
    @FormParam("F_CorteLey1066")
    private String F_CorteLey1066;
    @NotNull
    @DateFormat
    @FormParam("F_DerogacionLey1066")
    private String F_DerogacionLey1066;
    @NotNull
    @FormParam("NoPeriodosVencim")
    private Float NoPeriodosVencim;
    @NotNull
    @DateFormat
    @FormParam("F_Actualizacion")
    private String F_Actualizacion;
    @NotNull
    @FormParam("PeriodoInteres")
    private Float PeriodoInteres;
    @NotNull
    @Size(since = -32768, until = 32767)
    @FormParam("AnoDcto75")
    private Integer AnoDcto75;
    @FormParam("Ind_InteresTEAU")
    private boolean Ind_InteresTEAU;
    @NotNull
    @Size(since = -32768, until = 32767)
    @FormParam("MetodoDcto75")
    private Integer MetodoDcto75;
    @FormParam("PorcDescIntLey")
    private Float PorcDescIntLey;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoActivacion")
    private String CodigoActivacion;
    @FormParam("IndInterface")
    private boolean IndInterface;
    @FormParam("IndInteresCapital")
    private boolean IndInteresCapital;
    @Size(since = 0 , until = 100)
    @FormParam("Password_Change")
    private String Password_Change;
    @Size(since = 0 , until = 100)
    @FormParam("Password_Change2")
    private String Password_Change2;
    @Size(since = 0 , until = 2)
    @NotNull
    @FormParam("AccesoPassword")
    private String AccesoPassword;
    @Size(since = 0 , until = 100)
    @FormParam("Password_Change3")
    private String Password_Change3;
    @NotNull
    @Size(since = 0 , until = 1)
    @FormParam("VesionDemo")
    private String VesionDemo;
    @NotNull
    @DateFormat
    @FormParam("f_int_simple")
    private String f_int_simple;
    @Size(since = 0 , until = 8)
    @FormParam("UltimaRevision")
    private String UltimaRevision;
    @NotNull
    @Size(since = -32768, until = 32767)
    @FormParam("lenReferencia")
    private Integer lenReferencia;


    private Integer Id_Parametros;


	public ParametrosModelo() {
		super();
	}


	public ParametrosModelo(Integer id, boolean ley44, Integer anoInicialLey44, Integer mesInicial, Integer mesGracia,
			boolean ley44Car, Integer anoDescuentoIntereses, String compania, String nit, String ciudad,
			String direccion, String telefonos, String fax, String web, String version, String nroLicencia,
			String recibo, String factura, Float interes, String servidor_access, String servidor_odbc,
			String path_logo, String mensaje, String mensaje1, Float formularioSinPago, boolean ley1066imp,
			boolean ley1066car, String f_CorteLey1066, String f_DerogacionLey1066, Float noPeriodosVencim,
			String f_Actualizacion, Float periodoInteres, Integer anoDcto75, boolean ind_InteresTEAU,
			Integer metodoDcto75, Float porcDescIntLey, String codigoActivacion, boolean indInterface,
			boolean indInteresCapital, String password_Change, String password_Change2, String accesoPassword,
			String password_Change3, String vesionDemo, String f_int_simple, String ultimaRevision,
			Integer lenReferencia, Integer id_Parametros) {
		super();
		this.id = id;
		Ley44 = ley44;
		AnoInicialLey44 = anoInicialLey44;
		MesInicial = mesInicial;
		MesGracia = mesGracia;
		Ley44Car = ley44Car;
		AnoDescuentoIntereses = anoDescuentoIntereses;
		Compania = compania;
		Nit = nit;
		Ciudad = ciudad;
		Direccion = direccion;
		Telefonos = telefonos;
		Fax = fax;
		Web = web;
		Version = version;
		NroLicencia = nroLicencia;
		Recibo = recibo;
		Factura = factura;
		Interes = interes;
		this.servidor_access = servidor_access;
		this.servidor_odbc = servidor_odbc;
		this.path_logo = path_logo;
		Mensaje = mensaje;
		Mensaje1 = mensaje1;
		FormularioSinPago = formularioSinPago;
		ley1066IMP = ley1066imp;
		Ley1066CAR = ley1066car;
		F_CorteLey1066 = f_CorteLey1066;
		F_DerogacionLey1066 = f_DerogacionLey1066;
		NoPeriodosVencim = noPeriodosVencim;
		F_Actualizacion = f_Actualizacion;
		PeriodoInteres = periodoInteres;
		AnoDcto75 = anoDcto75;
		Ind_InteresTEAU = ind_InteresTEAU;
		MetodoDcto75 = metodoDcto75;
		PorcDescIntLey = porcDescIntLey;
		CodigoActivacion = codigoActivacion;
		IndInterface = indInterface;
		IndInteresCapital = indInteresCapital;
		Password_Change = password_Change;
		Password_Change2 = password_Change2;
		AccesoPassword = accesoPassword;
		Password_Change3 = password_Change3;
		VesionDemo = vesionDemo;
		this.f_int_simple = f_int_simple;
		UltimaRevision = ultimaRevision;
		this.lenReferencia = lenReferencia;
		Id_Parametros = id_Parametros;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public boolean isLey44() {
		return Ley44;
	}


	public void setLey44(boolean ley44) {
		Ley44 = ley44;
	}


	public Integer getAnoInicialLey44() {
		return AnoInicialLey44;
	}


	public void setAnoInicialLey44(Integer anoInicialLey44) {
		AnoInicialLey44 = anoInicialLey44;
	}


	public Integer getMesInicial() {
		return MesInicial;
	}


	public void setMesInicial(Integer mesInicial) {
		MesInicial = mesInicial;
	}


	public Integer getMesGracia() {
		return MesGracia;
	}


	public void setMesGracia(Integer mesGracia) {
		MesGracia = mesGracia;
	}


	public boolean isLey44Car() {
		return Ley44Car;
	}


	public void setLey44Car(boolean ley44Car) {
		Ley44Car = ley44Car;
	}


	public Integer getAnoDescuentoIntereses() {
		return AnoDescuentoIntereses;
	}


	public void setAnoDescuentoIntereses(Integer anoDescuentoIntereses) {
		AnoDescuentoIntereses = anoDescuentoIntereses;
	}


	public String getCompania() {
		return Compania;
	}


	public void setCompania(String compania) {
		Compania = compania;
	}


	public String getNit() {
		return Nit;
	}


	public void setNit(String nit) {
		Nit = nit;
	}


	public String getCiudad() {
		return Ciudad;
	}


	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getTelefonos() {
		return Telefonos;
	}


	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}


	public String getFax() {
		return Fax;
	}


	public void setFax(String fax) {
		Fax = fax;
	}


	public String getWeb() {
		return Web;
	}


	public void setWeb(String web) {
		Web = web;
	}


	public String getVersion() {
		return Version;
	}


	public void setVersion(String version) {
		Version = version;
	}


	public String getNroLicencia() {
		return NroLicencia;
	}


	public void setNroLicencia(String nroLicencia) {
		NroLicencia = nroLicencia;
	}


	public String getRecibo() {
		return Recibo;
	}


	public void setRecibo(String recibo) {
		Recibo = recibo;
	}


	public String getFactura() {
		return Factura;
	}


	public void setFactura(String factura) {
		Factura = factura;
	}


	public Float getInteres() {
		return Interes;
	}


	public void setInteres(Float interes) {
		Interes = interes;
	}


	public String getServidor_access() {
		return servidor_access;
	}


	public void setServidor_access(String servidor_access) {
		this.servidor_access = servidor_access;
	}


	public String getServidor_odbc() {
		return servidor_odbc;
	}


	public void setServidor_odbc(String servidor_odbc) {
		this.servidor_odbc = servidor_odbc;
	}


	public String getPath_logo() {
		return path_logo;
	}


	public void setPath_logo(String path_logo) {
		this.path_logo = path_logo;
	}


	public String getMensaje() {
		return Mensaje;
	}


	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}


	public String getMensaje1() {
		return Mensaje1;
	}


	public void setMensaje1(String mensaje1) {
		Mensaje1 = mensaje1;
	}


	public Float getFormularioSinPago() {
		return FormularioSinPago;
	}


	public void setFormularioSinPago(Float formularioSinPago) {
		FormularioSinPago = formularioSinPago;
	}


	public boolean isLey1066IMP() {
		return ley1066IMP;
	}


	public void setLey1066IMP(boolean ley1066imp) {
		ley1066IMP = ley1066imp;
	}


	public boolean isLey1066CAR() {
		return Ley1066CAR;
	}


	public void setLey1066CAR(boolean ley1066car) {
		Ley1066CAR = ley1066car;
	}


	public String getF_CorteLey1066() {
		return F_CorteLey1066;
	}


	public void setF_CorteLey1066(String f_CorteLey1066) {
		F_CorteLey1066 = f_CorteLey1066;
	}


	public String getF_DerogacionLey1066() {
		return F_DerogacionLey1066;
	}


	public void setF_DerogacionLey1066(String f_DerogacionLey1066) {
		F_DerogacionLey1066 = f_DerogacionLey1066;
	}


	public Float getNoPeriodosVencim() {
		return NoPeriodosVencim;
	}


	public void setNoPeriodosVencim(Float noPeriodosVencim) {
		NoPeriodosVencim = noPeriodosVencim;
	}


	public String getF_Actualizacion() {
		return F_Actualizacion;
	}


	public void setF_Actualizacion(String f_Actualizacion) {
		F_Actualizacion = f_Actualizacion;
	}


	public Float getPeriodoInteres() {
		return PeriodoInteres;
	}


	public void setPeriodoInteres(Float periodoInteres) {
		PeriodoInteres = periodoInteres;
	}


	public Integer getAnoDcto75() {
		return AnoDcto75;
	}


	public void setAnoDcto75(Integer anoDcto75) {
		AnoDcto75 = anoDcto75;
	}


	public boolean isInd_InteresTEAU() {
		return Ind_InteresTEAU;
	}


	public void setInd_InteresTEAU(boolean ind_InteresTEAU) {
		Ind_InteresTEAU = ind_InteresTEAU;
	}


	public Integer getMetodoDcto75() {
		return MetodoDcto75;
	}


	public void setMetodoDcto75(Integer metodoDcto75) {
		MetodoDcto75 = metodoDcto75;
	}


	public Float getPorcDescIntLey() {
		return PorcDescIntLey;
	}


	public void setPorcDescIntLey(Float porcDescIntLey) {
		PorcDescIntLey = porcDescIntLey;
	}


	public String getCodigoActivacion() {
		return CodigoActivacion;
	}


	public void setCodigoActivacion(String codigoActivacion) {
		CodigoActivacion = codigoActivacion;
	}


	public boolean isIndInterface() {
		return IndInterface;
	}


	public void setIndInterface(boolean indInterface) {
		IndInterface = indInterface;
	}


	public boolean isIndInteresCapital() {
		return IndInteresCapital;
	}


	public void setIndInteresCapital(boolean indInteresCapital) {
		IndInteresCapital = indInteresCapital;
	}


	public String getPassword_Change() {
		return Password_Change;
	}


	public void setPassword_Change(String password_Change) {
		Password_Change = password_Change;
	}


	public String getPassword_Change2() {
		return Password_Change2;
	}


	public void setPassword_Change2(String password_Change2) {
		Password_Change2 = password_Change2;
	}


	public String getAccesoPassword() {
		return AccesoPassword;
	}


	public void setAccesoPassword(String accesoPassword) {
		AccesoPassword = accesoPassword;
	}


	public String getPassword_Change3() {
		return Password_Change3;
	}


	public void setPassword_Change3(String password_Change3) {
		Password_Change3 = password_Change3;
	}


	public String getVesionDemo() {
		return VesionDemo;
	}


	public void setVesionDemo(String vesionDemo) {
		VesionDemo = vesionDemo;
	}


	public String getF_int_simple() {
		return f_int_simple;
	}


	public void setF_int_simple(String f_int_simple) {
		this.f_int_simple = f_int_simple;
	}


	public String getUltimaRevision() {
		return UltimaRevision;
	}


	public void setUltimaRevision(String ultimaRevision) {
		UltimaRevision = ultimaRevision;
	}


	public Integer getLenReferencia() {
		return lenReferencia;
	}


	public void setLenReferencia(Integer lenReferencia) {
		this.lenReferencia = lenReferencia;
	}


	public Integer getId_Parametros() {
		return Id_Parametros;
	}


	public void setId_Parametros(Integer id_Parametros) {
		Id_Parametros = id_Parametros;
	}
    
    
    
}
