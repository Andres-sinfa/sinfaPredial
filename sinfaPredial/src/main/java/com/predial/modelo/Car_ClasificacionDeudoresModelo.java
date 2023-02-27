package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Periodo")
public class Car_ClasificacionDeudoresModelo {
    @Size(since = 0 , until = 6)
    @FormParam("Periodo")
    @NotNull(update = false)
    private String Periodo;
    @Size(since = 0 , until = 3)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String Codigo;
    @Size(since = 0 , until = 100)
    @FormParam("Descripcion")
    @NotNull
    private String Descripcion;
    @FormParam("Porcentaje")
    @NotNull
    private Float Porcentaje;
    @FormParam("LimiteInferior")
    @NotNull
    private Float LimiteInferior;
    @FormParam("LimiteSuperior")
    @NotNull
    private Float LimiteSuperior;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_Car_ClasificacionDeudores;

	public Car_ClasificacionDeudoresModelo(String periodo, String codigo, String descripcion, Float porcentaje,
			Float limiteInferior, Float limiteSuperior, String codUnicoCatastral,
			Integer id_Car_ClasificacionDeudores) {
		super();
		Periodo = periodo;
		Codigo = codigo;
		Descripcion = descripcion;
		Porcentaje = porcentaje;
		LimiteInferior = limiteInferior;
		LimiteSuperior = limiteSuperior;
		CodUnicoCatastral = codUnicoCatastral;
		Id_Car_ClasificacionDeudores = id_Car_ClasificacionDeudores;
	}

	public Car_ClasificacionDeudoresModelo() {
		super();
	}

	public String getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Float getPorcentaje() {
		return Porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		Porcentaje = porcentaje;
	}

	public Float getLimiteInferior() {
		return LimiteInferior;
	}

	public void setLimiteInferior(Float limiteInferior) {
		LimiteInferior = limiteInferior;
	}

	public Float getLimiteSuperior() {
		return LimiteSuperior;
	}

	public void setLimiteSuperior(Float limiteSuperior) {
		LimiteSuperior = limiteSuperior;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_Car_ClasificacionDeudores() {
		return Id_Car_ClasificacionDeudores;
	}

	public void setId_Car_ClasificacionDeudores(Integer id_Car_ClasificacionDeudores) {
		Id_Car_ClasificacionDeudores = id_Car_ClasificacionDeudores;
	}
    
    
}
