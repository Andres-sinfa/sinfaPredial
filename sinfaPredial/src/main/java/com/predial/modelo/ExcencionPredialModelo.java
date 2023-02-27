package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class ExcencionPredialModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 10)
    @FormParam("Resolucion")
    @NotNull(update = false)
    private String Resolucion;
    @Size(since = -32768, until = 32767)
    @FormParam("ano")
    @NotNull(update = false)
    private Integer ano;
    @FormParam("cuota")
    @NotNull(update = false)
    private Integer cuota;
    @FormParam("ExcImpuesto")
    private boolean ExcImpuesto;
    @FormParam("ExcCar")
    private boolean ExcCar;
    @FormParam("ExcSobretasa")
    private boolean ExcSobretasa;
    @FormParam("ExcOtros")
    private boolean ExcOtros;
    @FormParam("ExcLey44")
    private boolean ExcLey44;
    @FormParam("ExcImpMinimo")
    private boolean ExcImpMinimo;
    @FormParam("ExcImpMaximo")
    private boolean ExcImpMaximo;
    @FormParam("ExcIntPredial")
    private boolean ExcIntPredial;
    @FormParam("ExcIntCAR")
    private boolean ExcIntCAR;
    @Size(since = 0 , until = 30)
    @FormParam("Usuario")
    private String Usuario;
    @FormParam("ind_ForzaMinimo")
    private boolean ind_ForzaMinimo;
    @FormParam("Ind_ForzaMaximo")
    private boolean Ind_ForzaMaximo;
    @FormParam("ind_AvaluoPorTarifa")
    private boolean ind_AvaluoPorTarifa;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @FormParam("porDesuentoimp")
    private float   porDesuentoimp;
    @FormParam("porDesuentoCAR")
    private float   porDesuentoCAR;
    @DateFormat
    @FormParam("fechaLimitePago")
    private String fechaLimitePago;
    @DateFormat
    @FormParam("fechacreacion")
    private String fechacreacion;
    @Size(since = 0 , until = 1000)
    @FormParam("Observacion")
    private String Observacion;
    @FormParam("excDescuentoPago")
    private boolean excDescuentoPago;

    private Integer Id_ExcencionPredial;

	public ExcencionPredialModelo() {
		super();
	}

	public ExcencionPredialModelo(String codigoCatastral, String resolucion, Integer ano, Integer cuota,
			boolean excImpuesto, boolean excCar, boolean excSobretasa, boolean excOtros, boolean excLey44,
			boolean excImpMinimo, boolean excImpMaximo, boolean excIntPredial, boolean excIntCAR, String usuario,
			boolean ind_ForzaMinimo, boolean ind_ForzaMaximo, boolean ind_AvaluoPorTarifa, String codUnicoCatastral,
			float porDesuentoimp, float porDesuentoCAR, String fechaLimitePago, String fechacreacion,
			String observacion, boolean excDescuentoPago, Integer id_ExcencionPredial) {
		super();
		CodigoCatastral = codigoCatastral;
		Resolucion = resolucion;
		this.ano = ano;
		this.cuota = cuota;
		ExcImpuesto = excImpuesto;
		ExcCar = excCar;
		ExcSobretasa = excSobretasa;
		ExcOtros = excOtros;
		ExcLey44 = excLey44;
		ExcImpMinimo = excImpMinimo;
		ExcImpMaximo = excImpMaximo;
		ExcIntPredial = excIntPredial;
		ExcIntCAR = excIntCAR;
		Usuario = usuario;
		this.ind_ForzaMinimo = ind_ForzaMinimo;
		Ind_ForzaMaximo = ind_ForzaMaximo;
		this.ind_AvaluoPorTarifa = ind_AvaluoPorTarifa;
		CodUnicoCatastral = codUnicoCatastral;
		this.porDesuentoimp = porDesuentoimp;
		this.porDesuentoCAR = porDesuentoCAR;
		this.fechaLimitePago = fechaLimitePago;
		this.fechacreacion = fechacreacion;
		Observacion = observacion;
		this.excDescuentoPago = excDescuentoPago;
		Id_ExcencionPredial = id_ExcencionPredial;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public boolean isExcImpuesto() {
		return ExcImpuesto;
	}

	public void setExcImpuesto(boolean excImpuesto) {
		ExcImpuesto = excImpuesto;
	}

	public boolean isExcCar() {
		return ExcCar;
	}

	public void setExcCar(boolean excCar) {
		ExcCar = excCar;
	}

	public boolean isExcSobretasa() {
		return ExcSobretasa;
	}

	public void setExcSobretasa(boolean excSobretasa) {
		ExcSobretasa = excSobretasa;
	}

	public boolean isExcOtros() {
		return ExcOtros;
	}

	public void setExcOtros(boolean excOtros) {
		ExcOtros = excOtros;
	}

	public boolean isExcLey44() {
		return ExcLey44;
	}

	public void setExcLey44(boolean excLey44) {
		ExcLey44 = excLey44;
	}

	public boolean isExcImpMinimo() {
		return ExcImpMinimo;
	}

	public void setExcImpMinimo(boolean excImpMinimo) {
		ExcImpMinimo = excImpMinimo;
	}

	public boolean isExcImpMaximo() {
		return ExcImpMaximo;
	}

	public void setExcImpMaximo(boolean excImpMaximo) {
		ExcImpMaximo = excImpMaximo;
	}

	public boolean isExcIntPredial() {
		return ExcIntPredial;
	}

	public void setExcIntPredial(boolean excIntPredial) {
		ExcIntPredial = excIntPredial;
	}

	public boolean isExcIntCAR() {
		return ExcIntCAR;
	}

	public void setExcIntCAR(boolean excIntCAR) {
		ExcIntCAR = excIntCAR;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public boolean isInd_ForzaMinimo() {
		return ind_ForzaMinimo;
	}

	public void setInd_ForzaMinimo(boolean ind_ForzaMinimo) {
		this.ind_ForzaMinimo = ind_ForzaMinimo;
	}

	public boolean isInd_ForzaMaximo() {
		return Ind_ForzaMaximo;
	}

	public void setInd_ForzaMaximo(boolean ind_ForzaMaximo) {
		Ind_ForzaMaximo = ind_ForzaMaximo;
	}

	public boolean isInd_AvaluoPorTarifa() {
		return ind_AvaluoPorTarifa;
	}

	public void setInd_AvaluoPorTarifa(boolean ind_AvaluoPorTarifa) {
		this.ind_AvaluoPorTarifa = ind_AvaluoPorTarifa;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public float getPorDesuentoimp() {
		return porDesuentoimp;
	}

	public void setPorDesuentoimp(float porDesuentoimp) {
		this.porDesuentoimp = porDesuentoimp;
	}

	public float getPorDesuentoCAR() {
		return porDesuentoCAR;
	}

	public void setPorDesuentoCAR(float porDesuentoCAR) {
		this.porDesuentoCAR = porDesuentoCAR;
	}

	public String getFechaLimitePago() {
		return fechaLimitePago;
	}

	public void setFechaLimitePago(String fechaLimitePago) {
		this.fechaLimitePago = fechaLimitePago;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public boolean isExcDescuentoPago() {
		return excDescuentoPago;
	}

	public void setExcDescuentoPago(boolean excDescuentoPago) {
		this.excDescuentoPago = excDescuentoPago;
	}

	public Integer getId_ExcencionPredial() {
		return Id_ExcencionPredial;
	}

	public void setId_ExcencionPredial(Integer id_ExcencionPredial) {
		Id_ExcencionPredial = id_ExcencionPredial;
	}
    
}
