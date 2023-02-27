package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class MesesCuotasModelo {
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    private Integer Ano;
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("Cuota")
    private Integer Cuota;
    @DateFormat
    @FormParam("FechaInicioIntereses")
    private String FechaInicioIntereses;
    @NotNull
    @Size(since = -32768, until = 32767)
    @FormParam("Meses")
    private Integer Meses;

    private int   Id_MesesCuotas;

	public MesesCuotasModelo() {
		super();
	}

	public MesesCuotasModelo(Integer ano, Integer cuota, String fechaInicioIntereses, Integer meses,
			int id_MesesCuotas) {
		super();
		Ano = ano;
		Cuota = cuota;
		FechaInicioIntereses = fechaInicioIntereses;
		Meses = meses;
		Id_MesesCuotas = id_MesesCuotas;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getCuota() {
		return Cuota;
	}

	public void setCuota(Integer cuota) {
		Cuota = cuota;
	}

	public String getFechaInicioIntereses() {
		return FechaInicioIntereses;
	}

	public void setFechaInicioIntereses(String fechaInicioIntereses) {
		FechaInicioIntereses = fechaInicioIntereses;
	}

	public Integer getMeses() {
		return Meses;
	}

	public void setMeses(Integer meses) {
		Meses = meses;
	}

	public int getId_MesesCuotas() {
		return Id_MesesCuotas;
	}

	public void setId_MesesCuotas(int id_MesesCuotas) {
		Id_MesesCuotas = id_MesesCuotas;
	}
    
}
