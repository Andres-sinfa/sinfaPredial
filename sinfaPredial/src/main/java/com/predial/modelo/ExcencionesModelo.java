package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("CodigoCatastral")
public class ExcencionesModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("Codigocatastral")
    private String Codigocatastral;
    @NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("Resolucion")
    private String Resolucion;
    @DateFormat
    @FormParam("f_resolucion")
    private String f_resolucion;
    @FormParam("PeriodoInicial")
    private Float PeriodoInicial;
    @FormParam("PeriodoFinal")
    private Float PeriodoFinal;
    @Size(since = 0 , until = 30)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @DateFormat
    @FormParam("fechacreacion")
    private String fechacreacion;
    @Size(since = 0 , until = 1000)
    @FormParam("Observacion")
    private String Observacion;
    @Size(since = 0 , until = 8)
    @FormParam("Excluido")
    private String Excluido;
    @DateFormat
    @FormParam("fechaLimitePago")
    private String fechaLimitePago;
    
    private Integer Id_Excenciones;

	public ExcencionesModelo() {
		super();
	}

	public ExcencionesModelo(String codigocatastral, String resolucion, String f_resolucion, Float periodoInicial,
			Float periodoFinal, String usuario, String codUnicoCatastral, String fechacreacion, String observacion,
			String excluido, String fechaLimitePago, Integer id_Excenciones) {
		super();
		Codigocatastral = codigocatastral;
		Resolucion = resolucion;
		this.f_resolucion = f_resolucion;
		PeriodoInicial = periodoInicial;
		PeriodoFinal = periodoFinal;
		Usuario = usuario;
		CodUnicoCatastral = codUnicoCatastral;
		this.fechacreacion = fechacreacion;
		Observacion = observacion;
		Excluido = excluido;
		this.fechaLimitePago = fechaLimitePago;
		Id_Excenciones = id_Excenciones;
	}

	public String getCodigocatastral() {
		return Codigocatastral;
	}

	public void setCodigocatastral(String codigocatastral) {
		Codigocatastral = codigocatastral;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getF_resolucion() {
		return f_resolucion;
	}

	public void setF_resolucion(String f_resolucion) {
		this.f_resolucion = f_resolucion;
	}

	public Float getPeriodoInicial() {
		return PeriodoInicial;
	}

	public void setPeriodoInicial(Float periodoInicial) {
		PeriodoInicial = periodoInicial;
	}

	public Float getPeriodoFinal() {
		return PeriodoFinal;
	}

	public void setPeriodoFinal(Float periodoFinal) {
		PeriodoFinal = periodoFinal;
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

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public String getExcluido() {
		return Excluido;
	}

	public void setExcluido(String excluido) {
		Excluido = excluido;
	}

	public String getFechaLimitePago() {
		return fechaLimitePago;
	}

	public void setFechaLimitePago(String fechaLimitePago) {
		this.fechaLimitePago = fechaLimitePago;
	}

	public Integer getId_Excenciones() {
		return Id_Excenciones;
	}

	public void setId_Excenciones(Integer id_Excenciones) {
		Id_Excenciones = id_Excenciones;
	}
    
}
