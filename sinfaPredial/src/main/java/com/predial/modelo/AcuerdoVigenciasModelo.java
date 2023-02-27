package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;

import jakarta.ws.rs.FormParam;
@OrderDefault("idAcuerdo")
public class AcuerdoVigenciasModelo {
	@Size(since = 0 , until = 10)
    @NotNull(update = false)
    @FormParam("idAcuerdo")
    private String idAcuerdo;
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @NotNull
    @FormParam("indAcuerdo")
    private boolean indAcuerdo;
    @NotNull
    @FormParam("total")
    private Float total;
    @NotNull
    @FormParam("impuesto")
    private Float impuesto;
    @NotNull
    @FormParam("interes")
    private Float interes;
    @NotNull
    @FormParam("descuento")
    private Float descuento;
    @NotNull
    @FormParam("sobretasa")
    private Float sobretasa;
    @NotNull
    @FormParam("car")
    private Float car;
    @NotNull
    @FormParam("interesCar")
    private Float interesCar;
    @NotNull
    @FormParam("otros")
    private Float otros;
    @NotNull
    @FormParam("abonos")
    private Float abonos;
    @NotNull
    @FormParam("creditos")
    private Float creditos;
    @NotNull
    @FormParam("ajuste")
    private Float ajuste;
    @NotNull
    @FormParam("cuota")
    private Integer cuota;
    
    private Integer Id_AcuerdoVigencias;

	public AcuerdoVigenciasModelo(String idAcuerdo, Integer ano, boolean indAcuerdo, Float total, Float impuesto,
			Float interes, Float descuento, Float sobretasa, Float car, Float interesCar, Float otros, Float abonos,
			Float creditos, Float ajuste, Integer cuota, Integer id_AcuerdoVigencias) {
		super();
		this.idAcuerdo = idAcuerdo;
		Ano = ano;
		this.indAcuerdo = indAcuerdo;
		this.total = total;
		this.impuesto = impuesto;
		this.interes = interes;
		this.descuento = descuento;
		this.sobretasa = sobretasa;
		this.car = car;
		this.interesCar = interesCar;
		this.otros = otros;
		this.abonos = abonos;
		this.creditos = creditos;
		this.ajuste = ajuste;
		this.cuota = cuota;
		Id_AcuerdoVigencias = id_AcuerdoVigencias;
	}

	public AcuerdoVigenciasModelo() {
		super();
	}

	public String getIdAcuerdo() {
		return idAcuerdo;
	}

	public void setIdAcuerdo(String idAcuerdo) {
		this.idAcuerdo = idAcuerdo;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public boolean isIndAcuerdo() {
		return indAcuerdo;
	}

	public void setIndAcuerdo(boolean indAcuerdo) {
		this.indAcuerdo = indAcuerdo;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Float impuesto) {
		this.impuesto = impuesto;
	}

	public Float getInteres() {
		return interes;
	}

	public void setInteres(Float interes) {
		this.interes = interes;
	}

	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

	public Float getSobretasa() {
		return sobretasa;
	}

	public void setSobretasa(Float sobretasa) {
		this.sobretasa = sobretasa;
	}

	public Float getCar() {
		return car;
	}

	public void setCar(Float car) {
		this.car = car;
	}

	public Float getInteresCar() {
		return interesCar;
	}

	public void setInteresCar(Float interesCar) {
		this.interesCar = interesCar;
	}

	public Float getOtros() {
		return otros;
	}

	public void setOtros(Float otros) {
		this.otros = otros;
	}

	public Float getAbonos() {
		return abonos;
	}

	public void setAbonos(Float abonos) {
		this.abonos = abonos;
	}

	public Float getCreditos() {
		return creditos;
	}

	public void setCreditos(Float creditos) {
		this.creditos = creditos;
	}

	public Float getAjuste() {
		return ajuste;
	}

	public void setAjuste(Float ajuste) {
		this.ajuste = ajuste;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public Integer getId_AcuerdoVigencias() {
		return Id_AcuerdoVigencias;
	}

	public void setId_AcuerdoVigencias(Integer id_AcuerdoVigencias) {
		Id_AcuerdoVigencias = id_AcuerdoVigencias;
	}
    
    
}
