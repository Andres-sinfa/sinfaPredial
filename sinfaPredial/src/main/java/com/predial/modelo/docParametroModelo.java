package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Informe")
public class docParametroModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("Informe")
    private String Informe;
    @NotNull(update = false)
    @FormParam("Orden")
    private Integer Orden;
    @Size(since = 0 , until = 20)
    @FormParam("Nombre")
    private String Nombre;
    @Size(since = 0 , until = 20)
    @FormParam("ValorDefecto")
    private String ValorDefecto;
    @Size(since = 0 , until = 20)
    @FormParam("ValorParametro")
    private String ValorParametro;
    @Size(since = 0 , until = 1)
    @FormParam("Tipo")
    private String Tipo;

    private Integer Id_docParametro;

	public docParametroModelo() {
		super();
	}

	public docParametroModelo(String informe, Integer orden, String nombre, String valorDefecto, String valorParametro,
			String tipo, Integer id_docParametro) {
		super();
		Informe = informe;
		Orden = orden;
		Nombre = nombre;
		ValorDefecto = valorDefecto;
		ValorParametro = valorParametro;
		Tipo = tipo;
		Id_docParametro = id_docParametro;
	}

	public String getInforme() {
		return Informe;
	}

	public void setInforme(String informe) {
		Informe = informe;
	}

	public Integer getOrden() {
		return Orden;
	}

	public void setOrden(Integer orden) {
		Orden = orden;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getValorDefecto() {
		return ValorDefecto;
	}

	public void setValorDefecto(String valorDefecto) {
		ValorDefecto = valorDefecto;
	}

	public String getValorParametro() {
		return ValorParametro;
	}

	public void setValorParametro(String valorParametro) {
		ValorParametro = valorParametro;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Integer getId_docParametro() {
		return Id_docParametro;
	}

	public void setId_docParametro(Integer id_docParametro) {
		Id_docParametro = id_docParametro;
	}
    
}
