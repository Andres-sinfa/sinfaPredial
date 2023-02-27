package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Reporte")
public class ColumnasModelo {
    @Size(since = 0 , until = 5)
    @FormParam("Reporte")
    @NotNull(update = false)
    private String Reporte;
    @FormParam("Orden")
    @NotNull(update = false)
    private Integer Orden;
    @Size(since = 0 , until = 20)
    @FormParam("Campo")
    @NotNull(update = false)
    private String Campo;
    @Size(since = 0 , until = 30)
    @FormParam("Titulo")
    private String Titulo;
    @FormParam("Ancho")
    private Integer Ancho;
    @Size(since = 0 , until = 50)
    @FormParam("Formato")
    private String Formato;
    @FormParam("Totaliza")
    private boolean Totaliza;
    @FormParam("Mostrar")
    private boolean Mostrar;

    private Integer Id_Columnas;

	public ColumnasModelo(String reporte, Integer orden, String campo, String titulo, Integer ancho, String formato,
			boolean totaliza, boolean mostrar, Integer id_Columnas) {
		super();
		Reporte = reporte;
		Orden = orden;
		Campo = campo;
		Titulo = titulo;
		Ancho = ancho;
		Formato = formato;
		Totaliza = totaliza;
		Mostrar = mostrar;
		Id_Columnas = id_Columnas;
	}

	public ColumnasModelo() {
		super();
	}

	public String getReporte() {
		return Reporte;
	}

	public void setReporte(String reporte) {
		Reporte = reporte;
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

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Integer getAncho() {
		return Ancho;
	}

	public void setAncho(Integer ancho) {
		Ancho = ancho;
	}

	public String getFormato() {
		return Formato;
	}

	public void setFormato(String formato) {
		Formato = formato;
	}

	public boolean isTotaliza() {
		return Totaliza;
	}

	public void setTotaliza(boolean totaliza) {
		Totaliza = totaliza;
	}

	public boolean isMostrar() {
		return Mostrar;
	}

	public void setMostrar(boolean mostrar) {
		Mostrar = mostrar;
	}

	public Integer getId_Columnas() {
		return Id_Columnas;
	}

	public void setId_Columnas(Integer id_Columnas) {
		Id_Columnas = id_Columnas;
	}
    
    
}
