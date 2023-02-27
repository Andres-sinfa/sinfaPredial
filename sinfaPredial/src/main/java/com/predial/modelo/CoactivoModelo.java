package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("IdCoactivo")
public class CoactivoModelo {
    @NotNull(update = false)
    @FormParam("IdCoactivo")
    private Integer IdCoactivo;
    @Size(since = 0 , until = 50)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 2)
    @FormParam("Tipo")
    private String Tipo;
    @Size(since = 0 , until = 50)
    @FormParam("Numero")
    private String Numero;
    @Size(since = 0 , until = 50)
    @FormParam("Nombre")
    private String Nombre;
    @FormParam("IdDoc")
    private Integer IdDoc;
    @Size(since = 0 , until = 50)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 50)
    @FormParam("Equipo")
    private String Equipo;
    @DateFormat
    @FormParam("FechaCreacion")
    private String FechaCreacion;
    @FormParam("VigenciaInicial")
    private Integer VigenciaInicial;
    @FormParam("VigenciaFinal")
    private Integer VigenciaFinal;
    @FormParam("ValorCoactivo")
    @NotNull
    private Float ValorCoactivo;
    @Size(since = 0 , until = 1)
    @FormParam("Estado")
    @NotNull
    private String Estado;
    @DateFormat
    @FormParam("FechaEstado")
    private String FechaEstado;
    @Size(since = 0 , until = 1000)
    @FormParam("Observaciones")
    private String Observaciones;

    private Integer Id_Coactivo;

	public CoactivoModelo() {
		super();
	}

	public CoactivoModelo(Integer idCoactivo, String codigoCatastral, Integer ano, String tipo, String numero,
			String nombre, Integer idDoc, String usuario, String equipo, String fechaCreacion, Integer vigenciaInicial,
			Integer vigenciaFinal, Float valorCoactivo, String estado, String fechaEstado, String observaciones,
			Integer id_Coactivo) {
		super();
		IdCoactivo = idCoactivo;
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Tipo = tipo;
		Numero = numero;
		Nombre = nombre;
		IdDoc = idDoc;
		Usuario = usuario;
		Equipo = equipo;
		FechaCreacion = fechaCreacion;
		VigenciaInicial = vigenciaInicial;
		VigenciaFinal = vigenciaFinal;
		ValorCoactivo = valorCoactivo;
		Estado = estado;
		FechaEstado = fechaEstado;
		Observaciones = observaciones;
		Id_Coactivo = id_Coactivo;
	}

	public Integer getIdCoactivo() {
		return IdCoactivo;
	}

	public void setIdCoactivo(Integer idCoactivo) {
		IdCoactivo = idCoactivo;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
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

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getIdDoc() {
		return IdDoc;
	}

	public void setIdDoc(Integer idDoc) {
		IdDoc = idDoc;
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

	public Integer getVigenciaInicial() {
		return VigenciaInicial;
	}

	public void setVigenciaInicial(Integer vigenciaInicial) {
		VigenciaInicial = vigenciaInicial;
	}

	public Integer getVigenciaFinal() {
		return VigenciaFinal;
	}

	public void setVigenciaFinal(Integer vigenciaFinal) {
		VigenciaFinal = vigenciaFinal;
	}

	public Float getValorCoactivo() {
		return ValorCoactivo;
	}

	public void setValorCoactivo(Float valorCoactivo) {
		ValorCoactivo = valorCoactivo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getFechaEstado() {
		return FechaEstado;
	}

	public void setFechaEstado(String fechaEstado) {
		FechaEstado = fechaEstado;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public Integer getId_Coactivo() {
		return Id_Coactivo;
	}

	public void setId_Coactivo(Integer id_Coactivo) {
		Id_Coactivo = id_Coactivo;
	}
    
}
