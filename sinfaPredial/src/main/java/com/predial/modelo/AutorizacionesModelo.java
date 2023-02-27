package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Usuario")
public class AutorizacionesModelo {
    @Size(since = 0 , until = 20)
    @NotNull(update = false)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 11)
    @FormParam("Nit")
    private String Nit;
    @Size(since = 0 , until = 32)
    @FormParam("Nombre")
    private String Nombre;
    @Size(since = 0 , until = 25)
    @FormParam("Dependencia")
    private String Dependencia;
    @Size(since = 0 , until = 12)
    @FormParam("clave20200116")
    private String clave20200116;
    @Size(since = -32768, until = 32767)
    @FormParam("Nivel")
    private Integer Nivel;
    @FormParam("Consulta")
    private boolean Consulta;
    @FormParam("Reimprime")
    private boolean Reimprime;
    @Size(since = 0 , until = 2)
    @FormParam("Grupo")
    private String Grupo;
    @FormParam("PWEncriptado")
    private boolean PWEncriptado;
    @Size(since = 0 , until = 2)
    @NotNull
    @FormParam("EstadoUsuario")
    private String EstadoUsuario;
    @FormParam("Reimprimir")
    private boolean Reimprimir;
    @Size(since = 0 , until = 20)
    @FormParam("Password20")
    private String Password20;
    @FormParam("indliquidador")
    private boolean indliquidador;
    @FormParam("indRestringirImp")
    private boolean indRestringirImp;
    @Size(since = 0 , until = 11)
    @FormParam("Compania")
    private String Compania;
    @FormParam("indSancion")
    private Integer indSancion;
    @FormParam("indPerFechaInteres")
    private boolean indPerFechaInteres;
    @FormParam("indCongelaDeuda")
    private boolean indCongelaDeuda;

    private Integer Id_Autorizaciones;

	public AutorizacionesModelo() {
		super();
	}

	public AutorizacionesModelo(String usuario, String nit, String nombre, String dependencia, String clave20200116,
			Integer nivel, boolean consulta, boolean reimprime, String grupo, boolean pWEncriptado,
			String estadoUsuario, boolean reimprimir, String password20, boolean indliquidador,
			boolean indRestringirImp, String compania, Integer indSancion, boolean indPerFechaInteres,
			boolean indCongelaDeuda, Integer id_Autorizaciones) {
		super();
		Usuario = usuario;
		Nit = nit;
		Nombre = nombre;
		Dependencia = dependencia;
		this.clave20200116 = clave20200116;
		Nivel = nivel;
		Consulta = consulta;
		Reimprime = reimprime;
		Grupo = grupo;
		PWEncriptado = pWEncriptado;
		EstadoUsuario = estadoUsuario;
		Reimprimir = reimprimir;
		Password20 = password20;
		this.indliquidador = indliquidador;
		this.indRestringirImp = indRestringirImp;
		Compania = compania;
		this.indSancion = indSancion;
		this.indPerFechaInteres = indPerFechaInteres;
		this.indCongelaDeuda = indCongelaDeuda;
		Id_Autorizaciones = id_Autorizaciones;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDependencia() {
		return Dependencia;
	}

	public void setDependencia(String dependencia) {
		Dependencia = dependencia;
	}

	public String getClave20200116() {
		return clave20200116;
	}

	public void setClave20200116(String clave20200116) {
		this.clave20200116 = clave20200116;
	}

	public Integer getNivel() {
		return Nivel;
	}

	public void setNivel(Integer nivel) {
		Nivel = nivel;
	}

	public boolean isConsulta() {
		return Consulta;
	}

	public void setConsulta(boolean consulta) {
		Consulta = consulta;
	}

	public boolean isReimprime() {
		return Reimprime;
	}

	public void setReimprime(boolean reimprime) {
		Reimprime = reimprime;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public boolean isPWEncriptado() {
		return PWEncriptado;
	}

	public void setPWEncriptado(boolean pWEncriptado) {
		PWEncriptado = pWEncriptado;
	}

	public String getEstadoUsuario() {
		return EstadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		EstadoUsuario = estadoUsuario;
	}

	public boolean isReimprimir() {
		return Reimprimir;
	}

	public void setReimprimir(boolean reimprimir) {
		Reimprimir = reimprimir;
	}

	public String getPassword20() {
		return Password20;
	}

	public void setPassword20(String password20) {
		Password20 = password20;
	}

	public boolean isIndliquidador() {
		return indliquidador;
	}

	public void setIndliquidador(boolean indliquidador) {
		this.indliquidador = indliquidador;
	}

	public boolean isIndRestringirImp() {
		return indRestringirImp;
	}

	public void setIndRestringirImp(boolean indRestringirImp) {
		this.indRestringirImp = indRestringirImp;
	}

	public String getCompania() {
		return Compania;
	}

	public void setCompania(String compania) {
		Compania = compania;
	}

	public Integer getIndSancion() {
		return indSancion;
	}

	public void setIndSancion(Integer indSancion) {
		this.indSancion = indSancion;
	}

	public boolean isIndPerFechaInteres() {
		return indPerFechaInteres;
	}

	public void setIndPerFechaInteres(boolean indPerFechaInteres) {
		this.indPerFechaInteres = indPerFechaInteres;
	}

	public boolean isIndCongelaDeuda() {
		return indCongelaDeuda;
	}

	public void setIndCongelaDeuda(boolean indCongelaDeuda) {
		this.indCongelaDeuda = indCongelaDeuda;
	}

	public Integer getId_Autorizaciones() {
		return Id_Autorizaciones;
	}

	public void setId_Autorizaciones(Integer id_Autorizaciones) {
		Id_Autorizaciones = id_Autorizaciones;
	}
    
    
}
