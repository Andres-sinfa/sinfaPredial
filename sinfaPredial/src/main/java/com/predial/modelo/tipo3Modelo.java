package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Resolucion")
public class tipo3Modelo {
    @Size(since = 0 , until = 4)
    @FormParam("Resolucion")
    @NotNull(update = false)
    private String Resolucion;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 3)
    @FormParam("propietario")
    @NotNull(update = false)
    private String propietario;
    @Size(since = 0 , until = 2)
    @FormParam("Estado")
    @NotNull(update = false)
    private String Estado;
    @Size(since = 0 , until = 3)
    @FormParam("NroRegistros")
    private String NroRegistros;
    @Size(since = 0 , until = 2)
    @FormParam("Departamento")
    private String Departamento;
    @Size(since = 0 , until = 3)
    @FormParam("Municipio")
    private String Municipio;
    @Size(since = 0 , until = 1)
    @FormParam("TipoRegistro")
    private String TipoRegistro;
    @Size(since = 0 , until = 5)
    @FormParam("radicacion")
    private String radicacion;
    @Size(since = 0 , until = 1)
    @FormParam("mutacion")
    private String mutacion;
    @Size(since = 0 , until = 70)
    @FormParam("decretos")
    private String decretos;
    @Size(since = 0 , until = 50)
    @FormParam("espacios")
    private String espacios;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_tipo3;

	public tipo3Modelo() {
		super();
	}

	public tipo3Modelo(String resolucion, String codigoCatastral, String propietario, String estado,
			String nroRegistros, String departamento, String municipio, String tipoRegistro, String radicacion,
			String mutacion, String decretos, String espacios, String codUnicoCatastral, Integer id_tipo3) {
		super();
		Resolucion = resolucion;
		CodigoCatastral = codigoCatastral;
		this.propietario = propietario;
		Estado = estado;
		NroRegistros = nroRegistros;
		Departamento = departamento;
		Municipio = municipio;
		TipoRegistro = tipoRegistro;
		this.radicacion = radicacion;
		this.mutacion = mutacion;
		this.decretos = decretos;
		this.espacios = espacios;
		CodUnicoCatastral = codUnicoCatastral;
		Id_tipo3 = id_tipo3;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getNroRegistros() {
		return NroRegistros;
	}

	public void setNroRegistros(String nroRegistros) {
		NroRegistros = nroRegistros;
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

	public String getTipoRegistro() {
		return TipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		TipoRegistro = tipoRegistro;
	}

	public String getRadicacion() {
		return radicacion;
	}

	public void setRadicacion(String radicacion) {
		this.radicacion = radicacion;
	}

	public String getMutacion() {
		return mutacion;
	}

	public void setMutacion(String mutacion) {
		this.mutacion = mutacion;
	}

	public String getDecretos() {
		return decretos;
	}

	public void setDecretos(String decretos) {
		this.decretos = decretos;
	}

	public String getEspacios() {
		return espacios;
	}

	public void setEspacios(String espacios) {
		this.espacios = espacios;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_tipo3() {
		return Id_tipo3;
	}

	public void setId_tipo3(Integer id_tipo3) {
		Id_tipo3 = id_tipo3;
	}

}
