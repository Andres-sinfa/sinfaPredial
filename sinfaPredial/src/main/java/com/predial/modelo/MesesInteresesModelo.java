package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class MesesInteresesModelo {
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @FormParam("Meses")
    private Integer Meses;
    @Size(since = 0 , until = 255)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 1)
    @FormParam("Tipo")
    private String Tipo;
    @FormParam("Cuotas")
    private Integer Cuotas;
    @DateFormat
    @FormParam("FechaInicioIntereses")
    private String FechaInicioIntereses;
    @DateFormat
    @FormParam("FechaDeclaracion")
    private String FechaDeclaracion;
    @FormParam("VlrSalarioMinimo")
    @NotNull
    private Float VlrSalarioMinimo;
    @FormParam("VlrUVT")
    @NotNull
    private Float VlrUVT;
    @DateFormat
    @FormParam("F_LimitePred")
    private String F_LimitePred;
    @NotNull
    @FormParam("mesesCar")
    private Integer mesesCar;
    @DateFormat
    @FormParam("fechaInicioInteresesCar")
    private String fechaInicioInteresesCar;

    private Integer Id_MesesIntereses;

	public MesesInteresesModelo(Integer ano, Integer meses, String descripcion, String tipo, Integer cuotas,
			String fechaInicioIntereses, String fechaDeclaracion, Float vlrSalarioMinimo, Float vlrUVT,
			String f_LimitePred, Integer mesesCar, String fechaInicioInteresesCar, Integer id_MesesIntereses) {
		super();
		Ano = ano;
		Meses = meses;
		Descripcion = descripcion;
		Tipo = tipo;
		Cuotas = cuotas;
		FechaInicioIntereses = fechaInicioIntereses;
		FechaDeclaracion = fechaDeclaracion;
		VlrSalarioMinimo = vlrSalarioMinimo;
		VlrUVT = vlrUVT;
		F_LimitePred = f_LimitePred;
		this.mesesCar = mesesCar;
		this.fechaInicioInteresesCar = fechaInicioInteresesCar;
		Id_MesesIntereses = id_MesesIntereses;
	}

	public MesesInteresesModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public Integer getMeses() {
		return Meses;
	}

	public void setMeses(Integer meses) {
		Meses = meses;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Integer getCuotas() {
		return Cuotas;
	}

	public void setCuotas(Integer cuotas) {
		Cuotas = cuotas;
	}

	public String getFechaInicioIntereses() {
		return FechaInicioIntereses;
	}

	public void setFechaInicioIntereses(String fechaInicioIntereses) {
		FechaInicioIntereses = fechaInicioIntereses;
	}

	public String getFechaDeclaracion() {
		return FechaDeclaracion;
	}

	public void setFechaDeclaracion(String fechaDeclaracion) {
		FechaDeclaracion = fechaDeclaracion;
	}

	public Float getVlrSalarioMinimo() {
		return VlrSalarioMinimo;
	}

	public void setVlrSalarioMinimo(Float vlrSalarioMinimo) {
		VlrSalarioMinimo = vlrSalarioMinimo;
	}

	public Float getVlrUVT() {
		return VlrUVT;
	}

	public void setVlrUVT(Float vlrUVT) {
		VlrUVT = vlrUVT;
	}

	public String getF_LimitePred() {
		return F_LimitePred;
	}

	public void setF_LimitePred(String f_LimitePred) {
		F_LimitePred = f_LimitePred;
	}

	public Integer getMesesCar() {
		return mesesCar;
	}

	public void setMesesCar(Integer mesesCar) {
		this.mesesCar = mesesCar;
	}

	public String getFechaInicioInteresesCar() {
		return fechaInicioInteresesCar;
	}

	public void setFechaInicioInteresesCar(String fechaInicioInteresesCar) {
		this.fechaInicioInteresesCar = fechaInicioInteresesCar;
	}

	public Integer getId_MesesIntereses() {
		return Id_MesesIntereses;
	}

	public void setId_MesesIntereses(Integer id_MesesIntereses) {
		Id_MesesIntereses = id_MesesIntereses;
	}
    
}
