package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class EstadoCarteraModelo {
    @Size(since = 0 , until = 2)
    @NotNull(update = false)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 50)
    @NotNull
    @FormParam("Descripcion")
    private String Descripcion;
    @NotNull
    @FormParam("IndSinFactura")
    private boolean IndSinFactura;
    @NotNull
    @FormParam("IndSinPazYSalvo")
    private boolean IndSinPazYSalvo;
    @NotNull
    @FormParam("IndSinCertificado")
    private boolean IndSinCertificado;

    private Integer Id_EstadoCartera;

	public EstadoCarteraModelo(String codigo, String descripcion, boolean indSinFactura, boolean indSinPazYSalvo,
			boolean indSinCertificado, Integer id_EstadoCartera) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		IndSinFactura = indSinFactura;
		IndSinPazYSalvo = indSinPazYSalvo;
		IndSinCertificado = indSinCertificado;
		Id_EstadoCartera = id_EstadoCartera;
	}

	public EstadoCarteraModelo() {
		super();
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public boolean isIndSinFactura() {
		return IndSinFactura;
	}

	public void setIndSinFactura(boolean indSinFactura) {
		IndSinFactura = indSinFactura;
	}

	public boolean isIndSinPazYSalvo() {
		return IndSinPazYSalvo;
	}

	public void setIndSinPazYSalvo(boolean indSinPazYSalvo) {
		IndSinPazYSalvo = indSinPazYSalvo;
	}

	public boolean isIndSinCertificado() {
		return IndSinCertificado;
	}

	public void setIndSinCertificado(boolean indSinCertificado) {
		IndSinCertificado = indSinCertificado;
	}

	public Integer getId_EstadoCartera() {
		return Id_EstadoCartera;
	}

	public void setId_EstadoCartera(Integer id_EstadoCartera) {
		Id_EstadoCartera = id_EstadoCartera;
	}
    
}
