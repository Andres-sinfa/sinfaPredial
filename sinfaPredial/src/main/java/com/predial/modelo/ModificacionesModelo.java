package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Orden")
public class ModificacionesModelo {
    @NotNull(update = false)
    @FormParam("Orden")
    private Integer Orden;
    @Size(since = 0 , until = 50)
    @FormParam("Campo")
    private String Campo;
    @Size(since = 0 , until = 50)
    @FormParam("ValorAntes")
    private String ValorAntes;
    @Size(since = 0 , until = 50)
    @FormParam("ValorDespues")
    private String ValorDespues;
    @DateFormat
    @FormParam("Fecha")
    private String Fecha;
    @DateFormat
    @FormParam("Hora")
    private String Hora;
    @Size(since = 0 , until = 50)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 50)
    @FormParam("NombreFormulario")
    private String NombreFormulario;
    @Size(since = 0 , until = 30)
    @FormParam("Concepto")
    private String Concepto;
    @Size(since = 0 , until = 30)
    @FormParam("Codigo")
    private String Codigo;

    private Integer Id_Modificaciones;

	public ModificacionesModelo() {
		super();
	}

	public ModificacionesModelo(Integer orden, String campo, String valorAntes, String valorDespues, String fecha,
			String hora, String usuario, String nombreFormulario, String concepto, String codigo,
			Integer id_Modificaciones) {
		super();
		Orden = orden;
		Campo = campo;
		ValorAntes = valorAntes;
		ValorDespues = valorDespues;
		Fecha = fecha;
		Hora = hora;
		Usuario = usuario;
		NombreFormulario = nombreFormulario;
		Concepto = concepto;
		Codigo = codigo;
		Id_Modificaciones = id_Modificaciones;
	}

	public Integer getOrden() {
		return Orden;
	}

	public void setOrden(Integer orden) {
		Orden = orden;
	}

	public String getCampo() {
		return Campo;
	}

	public void setCampo(String campo) {
		Campo = campo;
	}

	public String getValorAntes() {
		return ValorAntes;
	}

	public void setValorAntes(String valorAntes) {
		ValorAntes = valorAntes;
	}

	public String getValorDespues() {
		return ValorDespues;
	}

	public void setValorDespues(String valorDespues) {
		ValorDespues = valorDespues;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getNombreFormulario() {
		return NombreFormulario;
	}

	public void setNombreFormulario(String nombreFormulario) {
		NombreFormulario = nombreFormulario;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Integer getId_Modificaciones() {
		return Id_Modificaciones;
	}

	public void setId_Modificaciones(Integer id_Modificaciones) {
		Id_Modificaciones = id_Modificaciones;
	}
    
}
