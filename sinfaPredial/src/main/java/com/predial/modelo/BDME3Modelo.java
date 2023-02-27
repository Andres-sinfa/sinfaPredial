package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class BDME3Modelo {
    @Size(since = 0 , until = 18)
    @FormParam("Ano")
    @NotNull(update = false)
    private Long Ano;
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String Codigo;
    @Size(since = 0 , until = 7)
    @FormParam("Consecutivo")
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
    @FormParam("TarjetaProfesional")
    private String TarjetaProfesional;
    @Size(since = 0 , until = 109)
    @FormParam("Filler")
    private String Filler;

    private int   Id_BDME3;

	public BDME3Modelo() {
		super();
	}

	public BDME3Modelo(Long ano, String codigo, String consecutivo, String tipoRegistro, String tipoIdentificacion,
			String nroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String tarjetaProfesional, String filler, int id_BDME3) {
		super();
		Ano = ano;
		Codigo = codigo;
		Consecutivo = consecutivo;
		TipoRegistro = tipoRegistro;
		TipoIdentificacion = tipoIdentificacion;
		NroIdentificacion = nroIdentificacion;
		PrimerNombre = primerNombre;
		SegundoNombre = segundoNombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		TarjetaProfesional = tarjetaProfesional;
		Filler = filler;
		Id_BDME3 = id_BDME3;
	}

	public Long getAno() {
		return Ano;
	}

	public void setAno(Long ano) {
		Ano = ano;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
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

	public String getTarjetaProfesional() {
		return TarjetaProfesional;
	}

	public void setTarjetaProfesional(String tarjetaProfesional) {
		TarjetaProfesional = tarjetaProfesional;
	}

	public String getFiller() {
		return Filler;
	}

	public void setFiller(String filler) {
		Filler = filler;
	}

	public int getId_BDME3() {
		return Id_BDME3;
	}

	public void setId_BDME3(int id_BDME3) {
		Id_BDME3 = id_BDME3;
	}
    
}
