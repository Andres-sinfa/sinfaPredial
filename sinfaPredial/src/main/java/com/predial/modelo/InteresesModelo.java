package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class InteresesModelo {
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    private Integer Ano;
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("Mes")
    private Integer Mes;
    @FormParam("PorInteres")
    private Float PorInteres;
    @FormParam("PorAno")
    private Float PorAno;
    @FormParam("IntCuota")
    private Float IntCuota;
    @FormParam("IntTEAU")
    private Float IntTEAU;
    @FormParam("DTF")
    @NotNull
    private Float DTF;
    @FormParam("intCorriente")
    @NotNull
    private Float intCorriente;

    private Integer Id_Intereses;

	public InteresesModelo() {
		super();
	}

	public InteresesModelo(Integer ano, Integer mes, Float porInteres, Float porAno, Float intCuota, Float intTEAU,
			Float dTF, Float intCorriente, Integer id_Intereses) {
		super();
		Ano = ano;
		Mes = mes;
		PorInteres = porInteres;
		PorAno = porAno;
		IntCuota = intCuota;
		IntTEAU = intTEAU;
		DTF = dTF;
		this.intCorriente = intCorriente;
		Id_Intereses = id_Intereses;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getMes() {
		return Mes;
	}

	public void setMes(Integer mes) {
		Mes = mes;
	}

	public Float getPorInteres() {
		return PorInteres;
	}

	public void setPorInteres(Float porInteres) {
		PorInteres = porInteres;
	}

	public Float getPorAno() {
		return PorAno;
	}

	public void setPorAno(Float porAno) {
		PorAno = porAno;
	}

	public Float getIntCuota() {
		return IntCuota;
	}

	public void setIntCuota(Float intCuota) {
		IntCuota = intCuota;
	}

	public Float getIntTEAU() {
		return IntTEAU;
	}

	public void setIntTEAU(Float intTEAU) {
		IntTEAU = intTEAU;
	}

	public Float getDTF() {
		return DTF;
	}

	public void setDTF(Float dTF) {
		DTF = dTF;
	}

	public Float getIntCorriente() {
		return intCorriente;
	}

	public void setIntCorriente(Float intCorriente) {
		this.intCorriente = intCorriente;
	}

	public Integer getId_Intereses() {
		return Id_Intereses;
	}

	public void setId_Intereses(Integer id_Intereses) {
		Id_Intereses = id_Intereses;
	}
    
}
