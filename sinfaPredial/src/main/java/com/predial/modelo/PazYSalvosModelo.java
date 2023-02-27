package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class PazYSalvosModelo {
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 10)
    @FormParam("Tipo")
    @NotNull(update = false)
    private String Tipo;
    @FormParam("Numero")
    @NotNull(update = false)
    private Float Numero;
    @DateFormat
    @FormParam("Fecha")
    private String Fecha;
    @Size(since = 0 , until = 10)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @Size(since = 0 , until = 10)
    @FormParam("Efectos")
    private String Efectos;
    @Size(since = 0 , until = 10)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 10)
    @FormParam("Solicitante")
    private String Solicitante;
    @Size(since = 0 , until = 10)
    @FormParam("NombreSolicitante")
    private String NombreSolicitante;
    @Size(since = 0 , until = 10)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 10)
    @FormParam("Equipo")
    private String Equipo;
    @DateFormat
    @FormParam("FechaCreacion")
    private String FechaCreacion;
    @FormParam("IndRevisado")
    private boolean IndRevisado;
    @FormParam("IndVUR")
    private boolean IndVUR;

    private Integer Id_PazYSalvos;

	public PazYSalvosModelo() {
		super();
	}

	public PazYSalvosModelo(Integer ano, String tipo, Float numero, String fecha, String codigoCatastral,
			String efectos, String codUnicoCatastral, String solicitante, String nombreSolicitante, String usuario,
			String equipo, String fechaCreacion, boolean indRevisado, boolean indVUR, Integer id_PazYSalvos) {
		super();
		Ano = ano;
		Tipo = tipo;
		Numero = numero;
		Fecha = fecha;
		CodigoCatastral = codigoCatastral;
		Efectos = efectos;
		CodUnicoCatastral = codUnicoCatastral;
		Solicitante = solicitante;
		NombreSolicitante = nombreSolicitante;
		Usuario = usuario;
		Equipo = equipo;
		FechaCreacion = fechaCreacion;
		IndRevisado = indRevisado;
		IndVUR = indVUR;
		Id_PazYSalvos = id_PazYSalvos;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Float getNumero() {
		return Numero;
	}

	public void setNumero(Float numero) {
		Numero = numero;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getEfectos() {
		return Efectos;
	}

	public void setEfectos(String efectos) {
		Efectos = efectos;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getSolicitante() {
		return Solicitante;
	}

	public void setSolicitante(String solicitante) {
		Solicitante = solicitante;
	}

	public String getNombreSolicitante() {
		return NombreSolicitante;
	}

	public void setNombreSolicitante(String nombreSolicitante) {
		NombreSolicitante = nombreSolicitante;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public boolean isIndRevisado() {
		return IndRevisado;
	}

	public void setIndRevisado(boolean indRevisado) {
		IndRevisado = indRevisado;
	}

	public boolean isIndVUR() {
		return IndVUR;
	}

	public void setIndVUR(boolean indVUR) {
		IndVUR = indVUR;
	}

	public Integer getId_PazYSalvos() {
		return Id_PazYSalvos;
	}

	public void setId_PazYSalvos(Integer id_PazYSalvos) {
		Id_PazYSalvos = id_PazYSalvos;
	}
    
    
    
}
