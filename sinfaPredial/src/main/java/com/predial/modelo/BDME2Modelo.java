package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class BDME2Modelo {
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
    @Size(since = 0 , until = 119)
    @FormParam("Filler")
    private String Filler;
    
    private Integer Id_BDME2;

	public BDME2Modelo() {
		super();
	}

	public BDME2Modelo(Long ano, String codigo, String consecutivo, String tipoRegistro, String tipoIdentificacion,
			String nroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String filler, Integer id_BDME2) {
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
		Filler = filler;
		Id_BDME2 = id_BDME2;
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

	public String getFiller() {
		return Filler;
	}

	public void setFiller(String filler) {
		Filler = filler;
	}

	public Integer getId_BDME2() {
		return Id_BDME2;
	}

	public void setId_BDME2(Integer id_BDME2) {
		Id_BDME2 = id_BDME2;
	}
    
}
