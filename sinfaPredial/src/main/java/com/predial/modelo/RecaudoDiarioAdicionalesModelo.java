package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("AnoBanco")
public class RecaudoDiarioAdicionalesModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    @NotNull(update = false)
    private Integer AnoBanco;
    @Size(since = 0 , until = 16)
    @FormParam("banco")
    @NotNull(update = false)
    private String banco;
    @DateFormat
    @FormParam("f_recaudo")
    @NotNull(update = false)
    private String f_recaudo;
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String Codigo;
    @Size(since = 0 , until = 15)
    @FormParam("NroComprobante")
    @NotNull(update = false)
    private String NroComprobante;
    @FormParam("VlrConcepto")
    @NotNull
    private Float VlrConcepto;

    private Integer Id_RecaudoDiarioAdicionales;

	public RecaudoDiarioAdicionalesModelo() {
		super();
	}

	public RecaudoDiarioAdicionalesModelo(Integer anoBanco, String banco, String f_recaudo, String codigo,
			String nroComprobante, Float vlrConcepto, Integer id_RecaudoDiarioAdicionales) {
		super();
		AnoBanco = anoBanco;
		this.banco = banco;
		this.f_recaudo = f_recaudo;
		Codigo = codigo;
		NroComprobante = nroComprobante;
		VlrConcepto = vlrConcepto;
		Id_RecaudoDiarioAdicionales = id_RecaudoDiarioAdicionales;
	}

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getF_recaudo() {
		return f_recaudo;
	}

	public void setF_recaudo(String f_recaudo) {
		this.f_recaudo = f_recaudo;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public Float getVlrConcepto() {
		return VlrConcepto;
	}

	public void setVlrConcepto(Float vlrConcepto) {
		VlrConcepto = vlrConcepto;
	}

	public Integer getId_RecaudoDiarioAdicionales() {
		return Id_RecaudoDiarioAdicionales;
	}

	public void setId_RecaudoDiarioAdicionales(Integer id_RecaudoDiarioAdicionales) {
		Id_RecaudoDiarioAdicionales = id_RecaudoDiarioAdicionales;
	}
    
    
}
