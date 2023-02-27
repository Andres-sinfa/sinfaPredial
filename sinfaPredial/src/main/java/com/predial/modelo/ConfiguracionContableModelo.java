package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class ConfiguracionContableModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 60)
    @FormParam("CtaDebCnt")
    private String CtaDebCnt;
    @Size(since = 0 , until = 60)
    @FormParam("CtaCreCnt")
    private String CtaCreCnt;
    @Size(since = 0 , until = 80)
    @FormParam("CtaCrePptal")
    private String CtaCrePptal;
    @Size(since = 0 , until = 80)
    @FormParam("CtaContCrePptal")
    private String CtaContCrePptal;
    @NotNull(update = false)
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 60)
    @FormParam("DebitoCartera")
    private String DebitoCartera;
    @Size(since = 0 , until = 60)
    @FormParam("CreditoCartera")
    private String CreditoCartera;
    @FormParam("DebitoRecaudoCartera")
    private Float DebitoRecaudoCartera;
    @FormParam("CreditoRecaudoCartera")
    private Float CreditoRecaudoCartera;
    @Size(since = 0 , until = 100)
    @FormParam("CtaDebCntRur")
    private String CtaDebCntRur;
    @Size(since = 0 , until = 100)
    @FormParam("CtaCreCntRur")
    private String CtaCreCntRur;
    @Size(since = 0 , until = 80)
    @FormParam("CtaCrePptalRur")
    private String CtaCrePptalRur;
    @Size(since = 0 , until = 80)
    @FormParam("CtaContCrePptalRur")
    private String CtaContCrePptalRur;
    @Size(since = 0 , until = 60)
    @FormParam("DebitoCarteraRural")
    private String DebitoCarteraRural;
    @Size(since = 0 , until = 60)
    @FormParam("CreditoCarteraRural")
    private String CreditoCarteraRural;
    @Size(since = 0 , until = 60)
    @FormParam("DebitoCarteraUrbano")
    private String DebitoCarteraUrbano;
    @Size(since = 0 , until = 60)
    @FormParam("CreditoCarteraUrbano")
    private String CreditoCarteraUrbano;

    private Integer Id_ConfiguracionContable;

	public ConfiguracionContableModelo(String codigo, String descripcion, String ctaDebCnt, String ctaCreCnt,
			String ctaCrePptal, String ctaContCrePptal, Integer ano, String debitoCartera, String creditoCartera,
			Float debitoRecaudoCartera, Float creditoRecaudoCartera, String ctaDebCntRur, String ctaCreCntRur,
			String ctaCrePptalRur, String ctaContCrePptalRur, String debitoCarteraRural, String creditoCarteraRural,
			String debitoCarteraUrbano, String creditoCarteraUrbano, Integer id_ConfiguracionContable) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		CtaDebCnt = ctaDebCnt;
		CtaCreCnt = ctaCreCnt;
		CtaCrePptal = ctaCrePptal;
		CtaContCrePptal = ctaContCrePptal;
		Ano = ano;
		DebitoCartera = debitoCartera;
		CreditoCartera = creditoCartera;
		DebitoRecaudoCartera = debitoRecaudoCartera;
		CreditoRecaudoCartera = creditoRecaudoCartera;
		CtaDebCntRur = ctaDebCntRur;
		CtaCreCntRur = ctaCreCntRur;
		CtaCrePptalRur = ctaCrePptalRur;
		CtaContCrePptalRur = ctaContCrePptalRur;
		DebitoCarteraRural = debitoCarteraRural;
		CreditoCarteraRural = creditoCarteraRural;
		DebitoCarteraUrbano = debitoCarteraUrbano;
		CreditoCarteraUrbano = creditoCarteraUrbano;
		Id_ConfiguracionContable = id_ConfiguracionContable;
	}

	public ConfiguracionContableModelo() {
		super();
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

	public String getCtaDebCnt() {
		return CtaDebCnt;
	}

	public void setCtaDebCnt(String ctaDebCnt) {
		CtaDebCnt = ctaDebCnt;
	}

	public String getCtaCreCnt() {
		return CtaCreCnt;
	}

	public void setCtaCreCnt(String ctaCreCnt) {
		CtaCreCnt = ctaCreCnt;
	}

	public String getCtaCrePptal() {
		return CtaCrePptal;
	}

	public void setCtaCrePptal(String ctaCrePptal) {
		CtaCrePptal = ctaCrePptal;
	}

	public String getCtaContCrePptal() {
		return CtaContCrePptal;
	}

	public void setCtaContCrePptal(String ctaContCrePptal) {
		CtaContCrePptal = ctaContCrePptal;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getDebitoCartera() {
		return DebitoCartera;
	}

	public void setDebitoCartera(String debitoCartera) {
		DebitoCartera = debitoCartera;
	}

	public String getCreditoCartera() {
		return CreditoCartera;
	}

	public void setCreditoCartera(String creditoCartera) {
		CreditoCartera = creditoCartera;
	}

	public Float getDebitoRecaudoCartera() {
		return DebitoRecaudoCartera;
	}

	public void setDebitoRecaudoCartera(Float debitoRecaudoCartera) {
		DebitoRecaudoCartera = debitoRecaudoCartera;
	}

	public Float getCreditoRecaudoCartera() {
		return CreditoRecaudoCartera;
	}

	public void setCreditoRecaudoCartera(Float creditoRecaudoCartera) {
		CreditoRecaudoCartera = creditoRecaudoCartera;
	}

	public String getCtaDebCntRur() {
		return CtaDebCntRur;
	}

	public void setCtaDebCntRur(String ctaDebCntRur) {
		CtaDebCntRur = ctaDebCntRur;
	}

	public String getCtaCreCntRur() {
		return CtaCreCntRur;
	}

	public void setCtaCreCntRur(String ctaCreCntRur) {
		CtaCreCntRur = ctaCreCntRur;
	}

	public String getCtaCrePptalRur() {
		return CtaCrePptalRur;
	}

	public void setCtaCrePptalRur(String ctaCrePptalRur) {
		CtaCrePptalRur = ctaCrePptalRur;
	}

	public String getCtaContCrePptalRur() {
		return CtaContCrePptalRur;
	}

	public void setCtaContCrePptalRur(String ctaContCrePptalRur) {
		CtaContCrePptalRur = ctaContCrePptalRur;
	}

	public String getDebitoCarteraRural() {
		return DebitoCarteraRural;
	}

	public void setDebitoCarteraRural(String debitoCarteraRural) {
		DebitoCarteraRural = debitoCarteraRural;
	}

	public String getCreditoCarteraRural() {
		return CreditoCarteraRural;
	}

	public void setCreditoCarteraRural(String creditoCarteraRural) {
		CreditoCarteraRural = creditoCarteraRural;
	}

	public String getDebitoCarteraUrbano() {
		return DebitoCarteraUrbano;
	}

	public void setDebitoCarteraUrbano(String debitoCarteraUrbano) {
		DebitoCarteraUrbano = debitoCarteraUrbano;
	}

	public String getCreditoCarteraUrbano() {
		return CreditoCarteraUrbano;
	}

	public void setCreditoCarteraUrbano(String creditoCarteraUrbano) {
		CreditoCarteraUrbano = creditoCarteraUrbano;
	}

	public Integer getId_ConfiguracionContable() {
		return Id_ConfiguracionContable;
	}

	public void setId_ConfiguracionContable(Integer id_ConfiguracionContable) {
		Id_ConfiguracionContable = id_ConfiguracionContable;
	}
    
}
