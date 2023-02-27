package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class ExcencionOtrosModelo {
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
    @Size(since = 0 , until = 2)
    @FormParam("concepto")
    @NotNull(update = false)
    private String concepto;
    @FormParam("excento")
    private boolean excento;
    @Size(since = 0 , until = 30)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @DateFormat
    @FormParam("fechacreacion")
    private String fechacreacion;
    @NotNull
    @FormParam("excInteres")
    private Integer excInteres;
    @Size(since = 0 , until = 1000)
    @FormParam("Observacion")
    private String Observacion;

    private Integer Id_ExcencionOtros;

	public ExcencionOtrosModelo() {
		super();
	}

	public ExcencionOtrosModelo(String codigoCatastral, String resolucion, Integer ano, Integer cuota, String concepto,
			boolean excento, String usuario, String codUnicoCatastral, String fechacreacion, Integer excInteres,
			String observacion, Integer id_ExcencionOtros) {
		super();
		CodigoCatastral = codigoCatastral;
		Resolucion = resolucion;
		this.ano = ano;
		this.cuota = cuota;
		this.concepto = concepto;
		this.excento = excento;
		Usuario = usuario;
		CodUnicoCatastral = codUnicoCatastral;
		this.fechacreacion = fechacreacion;
		this.excInteres = excInteres;
		Observacion = observacion;
		Id_ExcencionOtros = id_ExcencionOtros;
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

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public boolean isExcento() {
		return excento;
	}

	public void setExcento(boolean excento) {
		this.excento = excento;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Integer getExcInteres() {
		return excInteres;
	}

	public void setExcInteres(Integer excInteres) {
		this.excInteres = excInteres;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public Integer getId_ExcencionOtros() {
		return Id_ExcencionOtros;
	}

	public void setId_ExcencionOtros(Integer id_ExcencionOtros) {
		Id_ExcencionOtros = id_ExcencionOtros;
	}
    
}
