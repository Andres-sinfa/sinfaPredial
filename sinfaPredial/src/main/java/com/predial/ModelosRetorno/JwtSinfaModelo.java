package com.predial.ModelosRetorno;

import java.util.ArrayList;

public class JwtSinfaModelo {
    private String subject = "subject";
    private String baseDatos;
    private String servidor;
    private String modulo;
    private String id = "";
    private String issuer = "";
    private String nombreUsuario = "";
    private String usuario;
    private String compania = "";
    private int idUsuario;
    private ArrayList<String> mensajeError = new ArrayList<>();
    private static String secret = "KEY_STRING_UNIQUE_PRESUP_JAVA_JSON_WEB_TOKEN_V2e";
    private String token;
	public JwtSinfaModelo() {
		super();
	}

	public JwtSinfaModelo(String subject, String baseDatos, String servidor, String modulo, String id, String issuer,
			String nombreUsuario, String usuario, String compania, int idUsuario, ArrayList<String> mensajeError,
			String token) {
		super();
		this.subject = subject;
		this.baseDatos = baseDatos;
		this.servidor = servidor;
		this.modulo = modulo;
		this.id = id;
		this.issuer = issuer;
		this.nombreUsuario = nombreUsuario;
		this.usuario = usuario;
		this.compania = compania;
		this.idUsuario = idUsuario;
		this.mensajeError = mensajeError;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	public String getServidor() {
		return servidor;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public String getModulo() {
		return modulo;
	}
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public ArrayList<String> getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(ArrayList<String> mensajeError) {
		this.mensajeError = mensajeError;
	}
	public static String getSecret() {
		return secret;
	}
	public static void setSecret(String secret) {
		JwtSinfaModelo.secret = secret;
	}
    
    
}
