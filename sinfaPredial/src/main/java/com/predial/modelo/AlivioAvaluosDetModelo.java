package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class AlivioAvaluosDetModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 10)
    @NotNull(update = false)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @Size(since = 0 , until = 2)
    @NotNull(update = false)
    @FormParam("Codigo")
    private String Codigo;
    @NotNull(update = false)
    @FormParam("vigencia")
    private Integer vigencia;
    @NotNull
    private Float PorcDescto;
    @NotNull
    @FormParam("PorcDesctoFin")
    private Float PorcDesctoFin;
    @NotNull
    @FormParam("PorcFInCuotaIni")
    private Float PorcFInCuotaIni;
    @NotNull
    @FormParam("desImpuesto")
    private Float desImpuesto;
    @NotNull
    @FormParam("desInteres")
    private Float desInteres;
    @NotNull
    @FormParam("desCar")
    private Float desCar;
    @NotNull
    @FormParam("desIntCar")
    private Float desIntCar;
    @NotNull
    @FormParam("desOtros")
    private Float desOtros;
    @NotNull
    @FormParam("desIntOtros")
    private Float desIntOtros;
    @NotNull
    @FormParam("desSancion")
    private Float desSancion;
    @NotNull
    @FormParam("desIntSancion")
    private Float desIntSancion;

    private Integer Id_AlivioAvaluosDet;

	public AlivioAvaluosDetModelo(Integer ano, String nroAcuerdo, String codigo, Integer vigencia, Float porcDescto,
			Float porcDesctoFin, Float porcFInCuotaIni, Float desImpuesto, Float desInteres, Float desCar,
			Float desIntCar, Float desOtros, Float desIntOtros, Float desSancion, Float desIntSancion,
			Integer id_AlivioAvaluosDet) {
		super();
		Ano = ano;
		NroAcuerdo = nroAcuerdo;
		Codigo = codigo;
		this.vigencia = vigencia;
		PorcDescto = porcDescto;
		PorcDesctoFin = porcDesctoFin;
		PorcFInCuotaIni = porcFInCuotaIni;
		this.desImpuesto = desImpuesto;
		this.desInteres = desInteres;
		this.desCar = desCar;
		this.desIntCar = desIntCar;
		this.desOtros = desOtros;
		this.desIntOtros = desIntOtros;
		this.desSancion = desSancion;
		this.desIntSancion = desIntSancion;
		Id_AlivioAvaluosDet = id_AlivioAvaluosDet;
	}

	public AlivioAvaluosDetModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Integer getVigencia() {
		return vigencia;
	}

	public void setVigencia(Integer vigencia) {
		this.vigencia = vigencia;
	}

	public Float getPorcDescto() {
		return PorcDescto;
	}

	public void setPorcDescto(Float porcDescto) {
		PorcDescto = porcDescto;
	}

	public Float getPorcDesctoFin() {
		return PorcDesctoFin;
	}

	public void setPorcDesctoFin(Float porcDesctoFin) {
		PorcDesctoFin = porcDesctoFin;
	}

	public Float getPorcFInCuotaIni() {
		return PorcFInCuotaIni;
	}

	public void setPorcFInCuotaIni(Float porcFInCuotaIni) {
		PorcFInCuotaIni = porcFInCuotaIni;
	}

	public Float getDesImpuesto() {
		return desImpuesto;
	}

	public void setDesImpuesto(Float desImpuesto) {
		this.desImpuesto = desImpuesto;
	}

	public Float getDesInteres() {
		return desInteres;
	}

	public void setDesInteres(Float desInteres) {
		this.desInteres = desInteres;
	}

	public Float getDesCar() {
		return desCar;
	}

	public void setDesCar(Float desCar) {
		this.desCar = desCar;
	}

	public Float getDesIntCar() {
		return desIntCar;
	}

	public void setDesIntCar(Float desIntCar) {
		this.desIntCar = desIntCar;
	}

	public Float getDesOtros() {
		return desOtros;
	}

	public void setDesOtros(Float desOtros) {
		this.desOtros = desOtros;
	}

	public Float getDesIntOtros() {
		return desIntOtros;
	}

	public void setDesIntOtros(Float desIntOtros) {
		this.desIntOtros = desIntOtros;
	}

	public Float getDesSancion() {
		return desSancion;
	}

	public void setDesSancion(Float desSancion) {
		this.desSancion = desSancion;
	}

	public Float getDesIntSancion() {
		return desIntSancion;
	}

	public void setDesIntSancion(Float desIntSancion) {
		this.desIntSancion = desIntSancion;
	}

	public Integer getId_AlivioAvaluosDet() {
		return Id_AlivioAvaluosDet;
	}

	public void setId_AlivioAvaluosDet(Integer id_AlivioAvaluosDet) {
		Id_AlivioAvaluosDet = id_AlivioAvaluosDet;
	}
    
    
}
