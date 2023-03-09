package com.predial.ModelosRetorno;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;

import com.predial.conexion.ConBd;

public class ConexionModelo {
	
	public Connection conContratacionWeb;
    public Connection conMod000;
    public Connection conAdmin;
    public Connection ConIcaWeb;
    public String archivoPropiedades;
    public String urlConexionContratacionWeb;
    public String urlConexionMod000;
    public String urlConexionAdmin;
    public String driver;
    public String motorBD;
    public String servidor;
    public String puerto;
    public String baseDatos;
    public String carpetaRecaudo;
    public String usuario;
    public String contrasena;
    public Connection conDB_SIG;
    public Connection ConPredial;
    public String urlConexionDB_SIG;
    public String urlConexionPredial;
    public String nitLicencia;
    public ArrayList<String> listaErrores = new ArrayList<>();
    public String servidorDBSIG;
    public boolean Conexion;
    
	public ConexionModelo(Connection conContratacionWeb, Connection conMod000, Connection conAdmin,
			Connection conIcaWeb, String archivoPropiedades, String urlConexionContratacionWeb,
			String urlConexionMod000, String urlConexionAdmin, String driver, String motorBD, String servidor,
			String puerto, String baseDatos, String carpetaRecaudo, String usuario, String contrasena,
			Connection conDB_SIG, Connection conPredial, String urlConexionDB_SIG, String urlConexionPredial,
			String nitLicencia, ArrayList<String> listaErrores, String servidorDBSIG, boolean conexion) {
		super();
		this.conContratacionWeb = conContratacionWeb;
		this.conMod000 = conMod000;
		this.conAdmin = conAdmin;
		ConIcaWeb = conIcaWeb;
		this.archivoPropiedades = archivoPropiedades;
		this.urlConexionContratacionWeb = urlConexionContratacionWeb;
		this.urlConexionMod000 = urlConexionMod000;
		this.urlConexionAdmin = urlConexionAdmin;
		this.driver = driver;
		this.motorBD = motorBD;
		this.servidor = servidor;
		this.puerto = puerto;
		this.baseDatos = baseDatos;
		this.carpetaRecaudo = carpetaRecaudo;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.conDB_SIG = conDB_SIG;
		ConPredial = conPredial;
		this.urlConexionDB_SIG = urlConexionDB_SIG;
		this.urlConexionPredial = urlConexionPredial;
		this.nitLicencia = nitLicencia;
		this.listaErrores = listaErrores;
		this.servidorDBSIG = servidorDBSIG;
		Conexion = conexion;
	}

	public ConexionModelo() {
		super();
	}

	public boolean isConexion() {
		return Conexion;
	}

	public void setConexion(boolean conexion) {
		Conexion = conexion;
	}

	public Connection getConContratacionWeb() {
		return conContratacionWeb;
	}
	public void setConContratacionWeb(Connection conContratacionWeb) {
		this.conContratacionWeb = conContratacionWeb;
	}
	public Connection getConMod000() {
		return conMod000;
	}
	public void setConMod000(Connection conMod000) {
		this.conMod000 = conMod000;
	}
	public Connection getConAdmin() {
		return conAdmin;
	}
	public void setConAdmin(Connection conAdmin) {
		this.conAdmin = conAdmin;
	}
	public Connection getConIcaWeb() {
		return ConIcaWeb;
	}
	public void setConIcaWeb(Connection conIcaWeb) {
		ConIcaWeb = conIcaWeb;
	}
	public String getArchivoPropiedades() {
		return archivoPropiedades;
	}
	public void setArchivoPropiedades() {
        File jarPath = new File(ConBd.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        this.archivoPropiedades = jarPath.getParentFile().getAbsolutePath() + "/sinfa.properties";
        this.archivoPropiedades = this.archivoPropiedades.replace("%20", " ");
	}
	public String getUrlConexionContratacionWeb() {
		return urlConexionContratacionWeb;
	}
	public void setUrlConexionContratacionWeb(String urlConexionContratacionWeb) {
		this.urlConexionContratacionWeb = urlConexionContratacionWeb;
	}
	public String getUrlConexionMod000() {
		return urlConexionMod000;
	}
	public void setUrlConexionMod000(String urlConexionMod000) {
		this.urlConexionMod000 = urlConexionMod000;
	}
	public String getUrlConexionAdmin() {
		return urlConexionAdmin;
	}
	public void setUrlConexionAdmin(String urlConexionAdmin) {
		this.urlConexionAdmin = urlConexionAdmin;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getMotorBD() {
		return motorBD;
	}
	public void setMotorBD(String motorBD) {
		this.motorBD = motorBD;
	}
	public String getServidor() {
		return servidor;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	public String getCarpetaRecaudo() {
		return carpetaRecaudo;
	}
	public void setCarpetaRecaudo(String carpetaRecaudo) {
		this.carpetaRecaudo = carpetaRecaudo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Connection getConDB_SIG() {
		return conDB_SIG;
	}
	public void setConDB_SIG(Connection conDB_SIG) {
		this.conDB_SIG = conDB_SIG;
	}
	public Connection getConPredial() {
		return ConPredial;
	}
	public void setConPredial(Connection conPredial) {
		ConPredial = conPredial;
	}
	public String getUrlConexionDB_SIG() {
		return urlConexionDB_SIG;
	}
	public void setUrlConexionDB_SIG(String urlConexionDB_SIG) {
		this.urlConexionDB_SIG = urlConexionDB_SIG;
	}
	public String getUrlConexionPredial() {
		return urlConexionPredial;
	}
	public void setUrlConexionPredial(String urlConexionPredial) {
		this.urlConexionPredial = urlConexionPredial;
	}
	public String getNitLicencia() {
		return nitLicencia;
	}
	public void setNitLicencia(String nitLicencia) {
		this.nitLicencia = nitLicencia;
	}
	public ArrayList<String> getListaErrores() {
		return listaErrores;
	}
	public void setListaErrores(ArrayList<String> listaErrores) {
		this.listaErrores = listaErrores;
	}
	public String getServidorDBSIG() {
		return servidorDBSIG;
	}
	public void setServidorDBSIG(String servidorDBSIG) {
		this.servidorDBSIG = servidorDBSIG;
	}
    
    public String getCarpetaErrores() {
        return System.getProperty("user.dir");
    }
    
}
