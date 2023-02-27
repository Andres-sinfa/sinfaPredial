package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Vigencia")
public class VencimientosModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Vigencia")
    @NotNull(update = false)
    private Integer Vigencia;
    @Size(since = -32768, until = 32767)
    @FormParam("Mes")
    @NotNull(update = false)
    private Integer Mes;
    @DateFormat
    @FormParam("Fecha")
    @NotNull(update = false)
    private String Fecha;
    @Size(since = -32768, until = 32767)
    @FormParam("Vencimiento")
    private Integer Vencimiento;
    
    private Integer Id_Vencimientos;

	public VencimientosModelo() {
		super();
	}

	public VencimientosModelo(Integer vigencia, Integer mes, String fecha, Integer vencimiento,
			Integer id_Vencimientos) {
		super();
		Vigencia = vigencia;
		Mes = mes;
		Fecha = fecha;
		Vencimiento = vencimiento;
		Id_Vencimientos = id_Vencimientos;
	}

	public Integer getVigencia() {
		return Vigencia;
	}

	public void setVigencia(Integer vigencia) {
		Vigencia = vigencia;
	}

	public Integer getMes() {
		return Mes;
	}

	public void setMes(Integer mes) {
		Mes = mes;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Integer getVencimiento() {
		return Vencimiento;
	}

	public void setVencimiento(Integer vencimiento) {
		Vencimiento = vencimiento;
	}

	public Integer getId_Vencimientos() {
		return Id_Vencimientos;
	}

	public void setId_Vencimientos(Integer id_Vencimientos) {
		Id_Vencimientos = id_Vencimientos;
	}
    
    
}
