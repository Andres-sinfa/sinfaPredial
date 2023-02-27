package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class PredioObservacionesModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private Integer Consecutivo;
    @NotNull
    @DateFormat
    @FormParam("F_Observacion")
    private String F_Observacion;
    @FormParam("Memo")
    private String Memo;
    @Size(since = 0 , until = 1)
    @FormParam("Tipo")
    private String Tipo;
    @Size(since = 0 , until = 50)
    @FormParam("NroAcuerdoRes")
    private String NroAcuerdoRes;
    @Size(since = 0 , until = 20)
    @FormParam("Usuario")
    private String Usuario;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 50)
    @FormParam("Vigencia")
    private String Vigencia;

    private Integer Id_PredioObservaciones;

	public PredioObservacionesModelo() {
		super();
	}

	public PredioObservacionesModelo(String codigoCatastral, Integer consecutivo, String f_Observacion, String memo,
			String tipo, String nroAcuerdoRes, String usuario, String codUnicoCatastral, String vigencia,
			Integer id_PredioObservaciones) {
		super();
		CodigoCatastral = codigoCatastral;
		Consecutivo = consecutivo;
		F_Observacion = f_Observacion;
		Memo = memo;
		Tipo = tipo;
		NroAcuerdoRes = nroAcuerdoRes;
		Usuario = usuario;
		CodUnicoCatastral = codUnicoCatastral;
		Vigencia = vigencia;
		Id_PredioObservaciones = id_PredioObservaciones;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public Integer getConsecutivo() {
		return Consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		Consecutivo = consecutivo;
	}

	public String getF_Observacion() {
		return F_Observacion;
	}

	public void setF_Observacion(String f_Observacion) {
		F_Observacion = f_Observacion;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		Memo = memo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNroAcuerdoRes() {
		return NroAcuerdoRes;
	}

	public void setNroAcuerdoRes(String nroAcuerdoRes) {
		NroAcuerdoRes = nroAcuerdoRes;
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

	public String getVigencia() {
		return Vigencia;
	}

	public void setVigencia(String vigencia) {
		Vigencia = vigencia;
	}

	public Integer getId_PredioObservaciones() {
		return Id_PredioObservaciones;
	}

	public void setId_PredioObservaciones(Integer id_PredioObservaciones) {
		Id_PredioObservaciones = id_PredioObservaciones;
	}
    
    
}
