package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Resolucion")
public class Tabla_ResolucionModelo {
    @Size(since = 0 , until = 2)
    @FormParam("Resolucion")
    @NotNull(update = false)
    private String Resolucion;
    @Size(since = 0 , until = 50)
    @FormParam("MarcadorTabla")
    @NotNull(update = false)
    private String MarcadorTabla;
    @Size(since = 0 , until = 80)
    @FormParam("OrigenTabla")
    @NotNull
    private String OrigenTabla;
    @FormParam("Ind_Width")
    private boolean Ind_Width;

    private Integer Id_Tabla_Resolucion;

	public Tabla_ResolucionModelo() {
		super();
	}

	public Tabla_ResolucionModelo(String resolucion, String marcadorTabla, String origenTabla, boolean ind_Width,
			Integer id_Tabla_Resolucion) {
		super();
		Resolucion = resolucion;
		MarcadorTabla = marcadorTabla;
		OrigenTabla = origenTabla;
		Ind_Width = ind_Width;
		Id_Tabla_Resolucion = id_Tabla_Resolucion;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getMarcadorTabla() {
		return MarcadorTabla;
	}

	public void setMarcadorTabla(String marcadorTabla) {
		MarcadorTabla = marcadorTabla;
	}

	public String getOrigenTabla() {
		return OrigenTabla;
	}

	public void setOrigenTabla(String origenTabla) {
		OrigenTabla = origenTabla;
	}

	public boolean isInd_Width() {
		return Ind_Width;
	}

	public void setInd_Width(boolean ind_Width) {
		Ind_Width = ind_Width;
	}

	public Integer getId_Tabla_Resolucion() {
		return Id_Tabla_Resolucion;
	}

	public void setId_Tabla_Resolucion(Integer id_Tabla_Resolucion) {
		Id_Tabla_Resolucion = id_Tabla_Resolucion;
	}

}
