package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("id_Archivo")
public class Minutas2Modelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 3)
    @FormParam("id_Archivo")
    private String id_Archivo;
    @Size(since = 0 , until = 120)
    @FormParam("Archivo")
    private String Archivo;
    @Size(since = 0 , until = 2)
    @FormParam("Naturaleza")
    private String Naturaleza;
    @FormParam("indTabla")
    private boolean indTabla;
    @Size(since = 0 , until = 50)
    @FormParam("TipoDocumento")
    private String TipoDocumento;
    @FormParam("IndCartera")
    private boolean IndCartera;
    @Size(since = 0 , until = 2)
    @FormParam("EstadoCartera")
    private String EstadoCartera;

    private Integer Id_Minutas2;

	public Minutas2Modelo() {
		super();
	}

	public Minutas2Modelo(String id_Archivo, String archivo, String naturaleza, boolean indTabla, String tipoDocumento,
			boolean indCartera, String estadoCartera, Integer id_Minutas2) {
		super();
		this.id_Archivo = id_Archivo;
		Archivo = archivo;
		Naturaleza = naturaleza;
		this.indTabla = indTabla;
		TipoDocumento = tipoDocumento;
		IndCartera = indCartera;
		EstadoCartera = estadoCartera;
		Id_Minutas2 = id_Minutas2;
	}

	public String getId_Archivo() {
		return id_Archivo;
	}

	public void setId_Archivo(String id_Archivo) {
		this.id_Archivo = id_Archivo;
	}

	public String getArchivo() {
		return Archivo;
	}

	public void setArchivo(String archivo) {
		Archivo = archivo;
	}

	public String getNaturaleza() {
		return Naturaleza;
	}

	public void setNaturaleza(String naturaleza) {
		Naturaleza = naturaleza;
	}

	public boolean isIndTabla() {
		return indTabla;
	}

	public void setIndTabla(boolean indTabla) {
		this.indTabla = indTabla;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public boolean isIndCartera() {
		return IndCartera;
	}

	public void setIndCartera(boolean indCartera) {
		IndCartera = indCartera;
	}

	public String getEstadoCartera() {
		return EstadoCartera;
	}

	public void setEstadoCartera(String estadoCartera) {
		EstadoCartera = estadoCartera;
	}

	public Integer getId_Minutas2() {
		return Id_Minutas2;
	}

	public void setId_Minutas2(Integer id_Minutas2) {
		Id_Minutas2 = id_Minutas2;
	}
    
    
}
