package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class ConceptosFinanciablesModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Nombre")
    private String Nombre;
    @Size(since = 0 , until = 2)
    @FormParam("Tipo")
    private String Tipo;
    @Size(since = 0 , until = 60)
    @FormParam("CntActual")
    private String CntActual;
    @Size(since = 0 , until = 60)
    @FormParam("CntAnterior")
    private String CntAnterior;
    @Size(since = 0 , until = 60)
    @FormParam("CntExpirada")
    private String CntExpirada;
    @Size(since = 0 , until = 60)
    @FormParam("CntIntereses")
    private String CntIntereses;
    @Size(since = 0 , until = 60)
    @FormParam("PptActual")
    private String PptActual;
    @Size(since = 0 , until = 60)
    @FormParam("PptAnterior")
    private String PptAnterior;
    @Size(since = 0 , until = 60)
    @FormParam("PptExpirada")
    private String PptExpirada;
    @Size(since = 0 , until = 60)
    @FormParam("PptIntereses")
    private String PptIntereses;
    @FormParam("IndInteres")
    private boolean IndInteres;
    @FormParam("Orden")
    private Integer Orden;

    private Integer Id_ConceptosFinanciables;

	public ConceptosFinanciablesModelo() {
		super();
	}

	public ConceptosFinanciablesModelo(String codigo, String nombre, String tipo, String cntActual, String cntAnterior,
			String cntExpirada, String cntIntereses, String pptActual, String pptAnterior, String pptExpirada,
			String pptIntereses, boolean indInteres, Integer orden, Integer id_ConceptosFinanciables) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Tipo = tipo;
		CntActual = cntActual;
		CntAnterior = cntAnterior;
		CntExpirada = cntExpirada;
		CntIntereses = cntIntereses;
		PptActual = pptActual;
		PptAnterior = pptAnterior;
		PptExpirada = pptExpirada;
		PptIntereses = pptIntereses;
		IndInteres = indInteres;
		Orden = orden;
		Id_ConceptosFinanciables = id_ConceptosFinanciables;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getCntActual() {
		return CntActual;
	}

	public void setCntActual(String cntActual) {
		CntActual = cntActual;
	}

	public String getCntAnterior() {
		return CntAnterior;
	}

	public void setCntAnterior(String cntAnterior) {
		CntAnterior = cntAnterior;
	}

	public String getCntExpirada() {
		return CntExpirada;
	}

	public void setCntExpirada(String cntExpirada) {
		CntExpirada = cntExpirada;
	}

	public String getCntIntereses() {
		return CntIntereses;
	}

	public void setCntIntereses(String cntIntereses) {
		CntIntereses = cntIntereses;
	}

	public String getPptActual() {
		return PptActual;
	}

	public void setPptActual(String pptActual) {
		PptActual = pptActual;
	}

	public String getPptAnterior() {
		return PptAnterior;
	}

	public void setPptAnterior(String pptAnterior) {
		PptAnterior = pptAnterior;
	}

	public String getPptExpirada() {
		return PptExpirada;
	}

	public void setPptExpirada(String pptExpirada) {
		PptExpirada = pptExpirada;
	}

	public String getPptIntereses() {
		return PptIntereses;
	}

	public void setPptIntereses(String pptIntereses) {
		PptIntereses = pptIntereses;
	}

	public boolean isIndInteres() {
		return IndInteres;
	}

	public void setIndInteres(boolean indInteres) {
		IndInteres = indInteres;
	}

	public Integer getOrden() {
		return Orden;
	}

	public void setOrden(Integer orden) {
		Orden = orden;
	}

	public Integer getId_ConceptosFinanciables() {
		return Id_ConceptosFinanciables;
	}

	public void setId_ConceptosFinanciables(Integer id_ConceptosFinanciables) {
		Id_ConceptosFinanciables = id_ConceptosFinanciables;
	}
    
    
}
