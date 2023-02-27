package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class ResolucionModelo {
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String  Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Origen")
    private String  Origen;
    @Size(since = 0 , until = 50)
    @FormParam("Nombre")
    private String  Nombre;
    @Size(since = 0 , until = 100)
    @FormParam("Archivo_Base")
    private String  Archivo_Base;
    @FormParam("TieneTabla")
    private boolean TieneTabla;
    @FormParam("Tabulado")
    private boolean Tabulado;
    @Size(since = 0 , until = 1)
    @FormParam("CaracterSeparador")
    private String  CaracterSeparador;

    private Integer Id_Resolucion;

	public ResolucionModelo(String codigo, String origen, String nombre, String archivo_Base, boolean tieneTabla,
			boolean tabulado, String caracterSeparador, Integer id_Resolucion) {
		super();
		Codigo = codigo;
		Origen = origen;
		Nombre = nombre;
		Archivo_Base = archivo_Base;
		TieneTabla = tieneTabla;
		Tabulado = tabulado;
		CaracterSeparador = caracterSeparador;
		Id_Resolucion = id_Resolucion;
	}

	public ResolucionModelo() {
		super();
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getArchivo_Base() {
		return Archivo_Base;
	}

	public void setArchivo_Base(String archivo_Base) {
		Archivo_Base = archivo_Base;
	}

	public boolean isTieneTabla() {
		return TieneTabla;
	}

	public void setTieneTabla(boolean tieneTabla) {
		TieneTabla = tieneTabla;
	}

	public boolean isTabulado() {
		return Tabulado;
	}

	public void setTabulado(boolean tabulado) {
		Tabulado = tabulado;
	}

	public String getCaracterSeparador() {
		return CaracterSeparador;
	}

	public void setCaracterSeparador(String caracterSeparador) {
		CaracterSeparador = caracterSeparador;
	}

	public Integer getId_Resolucion() {
		return Id_Resolucion;
	}

	public void setId_Resolucion(Integer id_Resolucion) {
		Id_Resolucion = id_Resolucion;
	}
    
}
