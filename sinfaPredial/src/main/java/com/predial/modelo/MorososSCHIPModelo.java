package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class MorososSCHIPModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @FormParam("Periodo")
    @NotNull(update = false)
    private Float Periodo;
    @Size(since = 0 , until = 2)
    @FormParam("TipoDeuda")
    @NotNull(update = false)
    private String TipoDeuda;
    @Size(since = 0 , until = 30)
    @FormParam("Identificacion")
    @NotNull(update = false)
    private String Identificacion;
    @Size(since = 0 , until = 2)
    @FormParam("TipoIdentificacion")
    private String TipoIdentificacion;
    @Size(since = 0 , until = 2)
    @FormParam("DigVerificacion")
    private String DigVerificacion;
    @Size(since = 0 , until = 50)
    @FormParam("PrimerNombre")
    private String PrimerNombre;
    @Size(since = 0 , until = 50)
    @FormParam("SegundoNombre")
    private String SegundoNombre;
    @Size(since = 0 , until = 50)
    @FormParam("PrimerApellido")
    private String PrimerApellido;
    @Size(since = 0 , until = 50)
    @FormParam("SegundoApellido")
    private String SegundoApellido;
    @Size(since = 0 , until = 100)
    @FormParam("RazonSocial")
    private String RazonSocial;
    @Size(since = 0 , until = 50)
    @FormParam("NroObligacion")
    private String NroObligacion;
    @NotNull
    @FormParam("ValorObligacion")
    private Float ValorObligacion;
    @FormParam("Cantidad")
    private Float Cantidad;
    @Size(since = 0 , until = 100)
    @FormParam("direccion")
    private String direccion;
    
    private Integer Id_MorososSCHIP;

	public MorososSCHIPModelo() {
		super();
	}

	public MorososSCHIPModelo(Integer ano, Float periodo, String tipoDeuda, String identificacion,
			String tipoIdentificacion, String digVerificacion, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido, String razonSocial, String nroObligacion,
			Float valorObligacion, Float cantidad, String direccion, Integer id_MorososSCHIP) {
		super();
		Ano = ano;
		Periodo = periodo;
		TipoDeuda = tipoDeuda;
		Identificacion = identificacion;
		TipoIdentificacion = tipoIdentificacion;
		DigVerificacion = digVerificacion;
		PrimerNombre = primerNombre;
		SegundoNombre = segundoNombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		RazonSocial = razonSocial;
		NroObligacion = nroObligacion;
		ValorObligacion = valorObligacion;
		Cantidad = cantidad;
		this.direccion = direccion;
		Id_MorososSCHIP = id_MorososSCHIP;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Float getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(Float periodo) {
		Periodo = periodo;
	}

	public String getTipoDeuda() {
		return TipoDeuda;
	}

	public void setTipoDeuda(String tipoDeuda) {
		TipoDeuda = tipoDeuda;
	}

	public String getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}

	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}

	public String getDigVerificacion() {
		return DigVerificacion;
	}

	public void setDigVerificacion(String digVerificacion) {
		DigVerificacion = digVerificacion;
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

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getNroObligacion() {
		return NroObligacion;
	}

	public void setNroObligacion(String nroObligacion) {
		NroObligacion = nroObligacion;
	}

	public Float getValorObligacion() {
		return ValorObligacion;
	}

	public void setValorObligacion(Float valorObligacion) {
		ValorObligacion = valorObligacion;
	}

	public Float getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Float cantidad) {
		Cantidad = cantidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getId_MorososSCHIP() {
		return Id_MorososSCHIP;
	}

	public void setId_MorososSCHIP(Integer id_MorososSCHIP) {
		Id_MorososSCHIP = id_MorososSCHIP;
	}
    
}
