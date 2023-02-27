package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Codigo")
public class ConceptosPredialModelo {
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
    @Size(since = 0 , until = 60)
    @FormParam("CtaCrePptal")
    private String CtaCrePptal;
    @Size(since = 0 , until = 80)
    @FormParam("CtaContCrePptal")
    private String CtaContCrePptal;
    @Size(since = 0 , until = 60)
    @FormParam("CtaDebCntInt")
    private String CtaDebCntInt;
    @Size(since = 0 , until = 60)
    @FormParam("CtaCreCntInt")
    private String CtaCreCntInt;
    @Size(since = 0 , until = 60)
    @FormParam("CtaCrePptalInt")
    private String CtaCrePptalInt;
    @Size(since = 0 , until = 80)
    @FormParam("CtaContCrePptalInt")
    private String CtaContCrePptalInt;
    @Size(since = 0 , until = 60)
    @FormParam("CreCntAnterior")
    private String CreCntAnterior;
    @Size(since = 0 , until = 60)
    @FormParam("CreCntDificil")
    private String CreCntDificil;
    @Size(since = 0 , until = 60)
    @FormParam("CreCntIntAnterior")
    private String CreCntIntAnterior;
    @Size(since = 0 , until = 60)
    @FormParam("CreCntIntDificil")
    private String CreCntIntDificil;
    @Size(since = 0 , until = 80)
    @FormParam("CrePptalAnterior")
    private String CrePptalAnterior;
    @Size(since = 0 , until = 80)
    @FormParam("CrePptalDificil")
    private String CrePptalDificil;
    @Size(since = 0 , until = 80)
    @FormParam("CrePptalIntAnterior")
    private String CrePptalIntAnterior;
    @Size(since = 0 , until = 80)
    @FormParam("CrePptalIntDificil")
    private String CrePptalIntDificil;
    @FormParam("IndEjidos")
    private boolean IndEjidos;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("TipoConcepto")
    private String TipoConcepto;
    @Size(since = 0 , until = 60)
    @FormParam("DebitoCartera")
    private String DebitoCartera;
    @Size(since = 0 , until = 60)
    @FormParam("CreditoCartera")
    private String CreditoCartera;
    @FormParam("IndInteres")
    private boolean IndInteres;
    @Size(since = 0 , until = 100)
    @FormParam("CtaCreCntRur")
    private String CtaCreCntRur;
    @Size(since = 0 , until = 100)
    @FormParam("CreCntAnteriorRur")
    private String CreCntAnteriorRur;
    @Size(since = 0 , until = 100)
    @FormParam("CreCntDificilRur")
    private String CreCntDificilRur;
    @Size(since = 0 , until = 100)
    @FormParam("CtaCreCntIntRur")
    private String CtaCreCntIntRur;
    @Size(since = 0 , until = 100)
    @FormParam("CreCntIntAnteriorRur")
    private String CreCntIntAnteriorRur;
    @Size(since = 0 , until = 100)
    @FormParam("CreCntIntDificilRur")
    private String CreCntIntDificilRur;
    @Size(since = 0 , until = 100)
    @FormParam("CtaContCrePptalRur")
    private String CtaContCrePptalRur;
    @Size(since = 0 , until = 100)
    @FormParam("CrePptalAnteriorRur")
    private String CrePptalAnteriorRur;
    @Size(since = 0 , until = 100)
    @FormParam("CrePptalDificilRur")
    private String CrePptalDificilRur;
    @Size(since = 0 , until = 100)
    @FormParam("CtaContCrePptalIntRur")
    private String CtaContCrePptalIntRur;
    @Size(since = 0 , until = 100)
    @FormParam("CrePptalIntAnteriorRur")
    private String CrePptalIntAnteriorRur;
    @Size(since = 0 , until = 100)
    @FormParam("CrePptalIntDificilRur")
    private String CrePptalIntDificilRur;
    @FormParam("indAlumbrado")
    private boolean indAlumbrado;
    @FormParam("indBomberos")
    private boolean indBomberos;
    
    private Integer Id_ConceptosPredial;

	public ConceptosPredialModelo(String codigo, String descripcion, String ctaDebCnt, String ctaCreCnt,
			String ctaCrePptal, String ctaContCrePptal, String ctaDebCntInt, String ctaCreCntInt, String ctaCrePptalInt,
			String ctaContCrePptalInt, String creCntAnterior, String creCntDificil, String creCntIntAnterior,
			String creCntIntDificil, String crePptalAnterior, String crePptalDificil, String crePptalIntAnterior,
			String crePptalIntDificil, boolean indEjidos, String tipoConcepto, String debitoCartera,
			String creditoCartera, boolean indInteres, String ctaCreCntRur, String creCntAnteriorRur,
			String creCntDificilRur, String ctaCreCntIntRur, String creCntIntAnteriorRur, String creCntIntDificilRur,
			String ctaContCrePptalRur, String crePptalAnteriorRur, String crePptalDificilRur,
			String ctaContCrePptalIntRur, String crePptalIntAnteriorRur, String crePptalIntDificilRur,
			boolean indAlumbrado, boolean indBomberos, Integer id_ConceptosPredial) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		CtaDebCnt = ctaDebCnt;
		CtaCreCnt = ctaCreCnt;
		CtaCrePptal = ctaCrePptal;
		CtaContCrePptal = ctaContCrePptal;
		CtaDebCntInt = ctaDebCntInt;
		CtaCreCntInt = ctaCreCntInt;
		CtaCrePptalInt = ctaCrePptalInt;
		CtaContCrePptalInt = ctaContCrePptalInt;
		CreCntAnterior = creCntAnterior;
		CreCntDificil = creCntDificil;
		CreCntIntAnterior = creCntIntAnterior;
		CreCntIntDificil = creCntIntDificil;
		CrePptalAnterior = crePptalAnterior;
		CrePptalDificil = crePptalDificil;
		CrePptalIntAnterior = crePptalIntAnterior;
		CrePptalIntDificil = crePptalIntDificil;
		IndEjidos = indEjidos;
		TipoConcepto = tipoConcepto;
		DebitoCartera = debitoCartera;
		CreditoCartera = creditoCartera;
		IndInteres = indInteres;
		CtaCreCntRur = ctaCreCntRur;
		CreCntAnteriorRur = creCntAnteriorRur;
		CreCntDificilRur = creCntDificilRur;
		CtaCreCntIntRur = ctaCreCntIntRur;
		CreCntIntAnteriorRur = creCntIntAnteriorRur;
		CreCntIntDificilRur = creCntIntDificilRur;
		CtaContCrePptalRur = ctaContCrePptalRur;
		CrePptalAnteriorRur = crePptalAnteriorRur;
		CrePptalDificilRur = crePptalDificilRur;
		CtaContCrePptalIntRur = ctaContCrePptalIntRur;
		CrePptalIntAnteriorRur = crePptalIntAnteriorRur;
		CrePptalIntDificilRur = crePptalIntDificilRur;
		this.indAlumbrado = indAlumbrado;
		this.indBomberos = indBomberos;
		Id_ConceptosPredial = id_ConceptosPredial;
	}

	public ConceptosPredialModelo() {
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

	public String getCtaDebCntInt() {
		return CtaDebCntInt;
	}

	public void setCtaDebCntInt(String ctaDebCntInt) {
		CtaDebCntInt = ctaDebCntInt;
	}

	public String getCtaCreCntInt() {
		return CtaCreCntInt;
	}

	public void setCtaCreCntInt(String ctaCreCntInt) {
		CtaCreCntInt = ctaCreCntInt;
	}

	public String getCtaCrePptalInt() {
		return CtaCrePptalInt;
	}

	public void setCtaCrePptalInt(String ctaCrePptalInt) {
		CtaCrePptalInt = ctaCrePptalInt;
	}

	public String getCtaContCrePptalInt() {
		return CtaContCrePptalInt;
	}

	public void setCtaContCrePptalInt(String ctaContCrePptalInt) {
		CtaContCrePptalInt = ctaContCrePptalInt;
	}

	public String getCreCntAnterior() {
		return CreCntAnterior;
	}

	public void setCreCntAnterior(String creCntAnterior) {
		CreCntAnterior = creCntAnterior;
	}

	public String getCreCntDificil() {
		return CreCntDificil;
	}

	public void setCreCntDificil(String creCntDificil) {
		CreCntDificil = creCntDificil;
	}

	public String getCreCntIntAnterior() {
		return CreCntIntAnterior;
	}

	public void setCreCntIntAnterior(String creCntIntAnterior) {
		CreCntIntAnterior = creCntIntAnterior;
	}

	public String getCreCntIntDificil() {
		return CreCntIntDificil;
	}

	public void setCreCntIntDificil(String creCntIntDificil) {
		CreCntIntDificil = creCntIntDificil;
	}

	public String getCrePptalAnterior() {
		return CrePptalAnterior;
	}

	public void setCrePptalAnterior(String crePptalAnterior) {
		CrePptalAnterior = crePptalAnterior;
	}

	public String getCrePptalDificil() {
		return CrePptalDificil;
	}

	public void setCrePptalDificil(String crePptalDificil) {
		CrePptalDificil = crePptalDificil;
	}

	public String getCrePptalIntAnterior() {
		return CrePptalIntAnterior;
	}

	public void setCrePptalIntAnterior(String crePptalIntAnterior) {
		CrePptalIntAnterior = crePptalIntAnterior;
	}

	public String getCrePptalIntDificil() {
		return CrePptalIntDificil;
	}

	public void setCrePptalIntDificil(String crePptalIntDificil) {
		CrePptalIntDificil = crePptalIntDificil;
	}

	public boolean isIndEjidos() {
		return IndEjidos;
	}

	public void setIndEjidos(boolean indEjidos) {
		IndEjidos = indEjidos;
	}

	public String getTipoConcepto() {
		return TipoConcepto;
	}

	public void setTipoConcepto(String tipoConcepto) {
		TipoConcepto = tipoConcepto;
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

	public boolean isIndInteres() {
		return IndInteres;
	}

	public void setIndInteres(boolean indInteres) {
		IndInteres = indInteres;
	}

	public String getCtaCreCntRur() {
		return CtaCreCntRur;
	}

	public void setCtaCreCntRur(String ctaCreCntRur) {
		CtaCreCntRur = ctaCreCntRur;
	}

	public String getCreCntAnteriorRur() {
		return CreCntAnteriorRur;
	}

	public void setCreCntAnteriorRur(String creCntAnteriorRur) {
		CreCntAnteriorRur = creCntAnteriorRur;
	}

	public String getCreCntDificilRur() {
		return CreCntDificilRur;
	}

	public void setCreCntDificilRur(String creCntDificilRur) {
		CreCntDificilRur = creCntDificilRur;
	}

	public String getCtaCreCntIntRur() {
		return CtaCreCntIntRur;
	}

	public void setCtaCreCntIntRur(String ctaCreCntIntRur) {
		CtaCreCntIntRur = ctaCreCntIntRur;
	}

	public String getCreCntIntAnteriorRur() {
		return CreCntIntAnteriorRur;
	}

	public void setCreCntIntAnteriorRur(String creCntIntAnteriorRur) {
		CreCntIntAnteriorRur = creCntIntAnteriorRur;
	}

	public String getCreCntIntDificilRur() {
		return CreCntIntDificilRur;
	}

	public void setCreCntIntDificilRur(String creCntIntDificilRur) {
		CreCntIntDificilRur = creCntIntDificilRur;
	}

	public String getCtaContCrePptalRur() {
		return CtaContCrePptalRur;
	}

	public void setCtaContCrePptalRur(String ctaContCrePptalRur) {
		CtaContCrePptalRur = ctaContCrePptalRur;
	}

	public String getCrePptalAnteriorRur() {
		return CrePptalAnteriorRur;
	}

	public void setCrePptalAnteriorRur(String crePptalAnteriorRur) {
		CrePptalAnteriorRur = crePptalAnteriorRur;
	}

	public String getCrePptalDificilRur() {
		return CrePptalDificilRur;
	}

	public void setCrePptalDificilRur(String crePptalDificilRur) {
		CrePptalDificilRur = crePptalDificilRur;
	}

	public String getCtaContCrePptalIntRur() {
		return CtaContCrePptalIntRur;
	}

	public void setCtaContCrePptalIntRur(String ctaContCrePptalIntRur) {
		CtaContCrePptalIntRur = ctaContCrePptalIntRur;
	}

	public String getCrePptalIntAnteriorRur() {
		return CrePptalIntAnteriorRur;
	}

	public void setCrePptalIntAnteriorRur(String crePptalIntAnteriorRur) {
		CrePptalIntAnteriorRur = crePptalIntAnteriorRur;
	}

	public String getCrePptalIntDificilRur() {
		return CrePptalIntDificilRur;
	}

	public void setCrePptalIntDificilRur(String crePptalIntDificilRur) {
		CrePptalIntDificilRur = crePptalIntDificilRur;
	}

	public boolean isIndAlumbrado() {
		return indAlumbrado;
	}

	public void setIndAlumbrado(boolean indAlumbrado) {
		this.indAlumbrado = indAlumbrado;
	}

	public boolean isIndBomberos() {
		return indBomberos;
	}

	public void setIndBomberos(boolean indBomberos) {
		this.indBomberos = indBomberos;
	}

	public Integer getId_ConceptosPredial() {
		return Id_ConceptosPredial;
	}

	public void setId_ConceptosPredial(Integer id_ConceptosPredial) {
		Id_ConceptosPredial = id_ConceptosPredial;
	}
    
    
}
