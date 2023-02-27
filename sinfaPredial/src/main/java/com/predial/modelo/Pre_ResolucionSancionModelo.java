package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class Pre_ResolucionSancionModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = -32768, until = 32767)
    @FormParam("Cuota")
    @NotNull(update = false)
    private Integer Cuota;
    @Size(since = 0 , until = 20)
    @FormParam("NroResolucion")
    @NotNull
    private String NroResolucion;
    @DateFormat
    @FormParam("Fecha")
    @NotNull
    private String Fecha;
    @FormParam("IndAvaluo")
    private boolean IndAvaluo;
    @FormParam("VlrCostas")
    @NotNull
    private float   VlrCostas;
    @DateFormat
    @FormParam("F_Presentacion")
    private String F_Presentacion;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;

    private Integer Id_Pre_ResolucionSancion;

	public Pre_ResolucionSancionModelo() {
		super();
	}

	public Pre_ResolucionSancionModelo(String codigoCatastral, Integer ano, Integer cuota, String nroResolucion,
			String fecha, boolean indAvaluo, float vlrCostas, String f_Presentacion, String codUnicoCatastral,
			Integer id_Pre_ResolucionSancion) {
		super();
		CodigoCatastral = codigoCatastral;
		Ano = ano;
		Cuota = cuota;
		NroResolucion = nroResolucion;
		Fecha = fecha;
		IndAvaluo = indAvaluo;
		VlrCostas = vlrCostas;
		F_Presentacion = f_Presentacion;
		CodUnicoCatastral = codUnicoCatastral;
		Id_Pre_ResolucionSancion = id_Pre_ResolucionSancion;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
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

	public String getNroResolucion() {
		return NroResolucion;
	}

	public void setNroResolucion(String nroResolucion) {
		NroResolucion = nroResolucion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public boolean isIndAvaluo() {
		return IndAvaluo;
	}

	public void setIndAvaluo(boolean indAvaluo) {
		IndAvaluo = indAvaluo;
	}

	public float getVlrCostas() {
		return VlrCostas;
	}

	public void setVlrCostas(float vlrCostas) {
		VlrCostas = vlrCostas;
	}

	public String getF_Presentacion() {
		return F_Presentacion;
	}

	public void setF_Presentacion(String f_Presentacion) {
		F_Presentacion = f_Presentacion;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_Pre_ResolucionSancion() {
		return Id_Pre_ResolucionSancion;
	}

	public void setId_Pre_ResolucionSancion(Integer id_Pre_ResolucionSancion) {
		Id_Pre_ResolucionSancion = id_Pre_ResolucionSancion;
	}
    
}
