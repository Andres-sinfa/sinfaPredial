package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class AlivioAvaluosModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 10)
    @NotNull(update = false)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @Size(since = 0 , until = 10)
    @NotNull(update = false)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 10)
    @FormParam("Descripcion")
    private String Descripcion;
    @DateFormat
    @NotNull
    @FormParam("FechaInicio")
    private String FechaInicio;
    @DateFormat
    @NotNull
    @FormParam("FechaFinal")
    private String FechaFinal;
    @NotNull
    @FormParam("PorcDescto")
    private Float PorcDescto;
    @NotNull
    @FormParam("PorcDesctoFin")
    private Float PorcDesctoFin;
    @NotNull
    @FormParam("PorcFInCuotaIni")
    private Float PorcFInCuotaIni;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("AnoInicial")
    private Integer AnoInicial;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("AnoFinal")
    private Integer AnoFinal;
    @FormParam("Ind_Impuesto")
    private boolean Ind_Impuesto;
    @FormParam("Ind_IntPred")
    private boolean Ind_IntPred;
    @FormParam("Ind_CAR")
    private boolean Ind_CAR;
    @FormParam("Ind_IntCAR")
    private boolean Ind_IntCAR;
    @FormParam("IndTodos")
    private boolean IndTodos;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("AnoPazysalvoFinal")
    private Integer AnoPazysalvoFinal;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("AnoPazysalvo")
    private Integer AnoPazysalvo;
    @FormParam("IndSancion")
    private boolean IndSancion;
    @FormParam("IndInteresOtros")
    private boolean IndInteresOtros;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("VigPazInicial")
    private Integer VigPazInicial;
    @Size(since = -32768, until = 32767)
    @NotNull
    @FormParam("VigPazFinal")
    private Integer VigPazFinal;
    @Size(since = 0 , until = 10)
    @FormParam("IdAlivio")
    private String IdAlivio;
    @FormParam("indAutorizado")
    private Integer indAutorizado;
    @Size(since = 0 , until = 10)
    @NotNull
    @FormParam("baseInteres")
    private String baseInteres;
    @FormParam("IndOtros")
    private boolean IndOtros;
    @NotNull
    @FormParam("desImpuesto")
    private Float desImpuesto;
    @NotNull
    @FormParam("desInteres")
    private Float desInteres;
    @NotNull
    @FormParam("desCar")
    private Float desCar;
    @NotNull
    @FormParam("desIntCar")
    private Float desIntCar;
    @NotNull
    @FormParam("desOtros")
    private Float desOtros;
    @NotNull
    @FormParam("desIntOtros")
    private Float desIntOtros;
    @NotNull
    @FormParam("desSancion")
    private Float desSancion;
    @NotNull
    @FormParam("desIntSancion")
    private Float desIntSancion;
    
    private Integer Id_AlivioAvaluos;

	public AlivioAvaluosModelo(Integer ano, String nroAcuerdo, String codigo, String descripcion, String fechaInicio,
			String fechaFinal, Float porcDescto, Float porcDesctoFin, Float porcFInCuotaIni, Integer anoInicial,
			Integer anoFinal, boolean ind_Impuesto, boolean ind_IntPred, boolean ind_CAR, boolean ind_IntCAR,
			boolean indTodos, Integer anoPazysalvoFinal, Integer anoPazysalvo, boolean indSancion,
			boolean indInteresOtros, Integer vigPazInicial, Integer vigPazFinal, String idAlivio, Integer indAutorizado,
			String baseInteres, boolean indOtros, Float desImpuesto, Float desInteres, Float desCar, Float desIntCar,
			Float desOtros, Float desIntOtros, Float desSancion, Float desIntSancion, Integer id_AlivioAvaluos) {
		super();
		Ano = ano;
		NroAcuerdo = nroAcuerdo;
		Codigo = codigo;
		Descripcion = descripcion;
		FechaInicio = fechaInicio;
		FechaFinal = fechaFinal;
		PorcDescto = porcDescto;
		PorcDesctoFin = porcDesctoFin;
		PorcFInCuotaIni = porcFInCuotaIni;
		AnoInicial = anoInicial;
		AnoFinal = anoFinal;
		Ind_Impuesto = ind_Impuesto;
		Ind_IntPred = ind_IntPred;
		Ind_CAR = ind_CAR;
		Ind_IntCAR = ind_IntCAR;
		IndTodos = indTodos;
		AnoPazysalvoFinal = anoPazysalvoFinal;
		AnoPazysalvo = anoPazysalvo;
		IndSancion = indSancion;
		IndInteresOtros = indInteresOtros;
		VigPazInicial = vigPazInicial;
		VigPazFinal = vigPazFinal;
		IdAlivio = idAlivio;
		this.indAutorizado = indAutorizado;
		this.baseInteres = baseInteres;
		IndOtros = indOtros;
		this.desImpuesto = desImpuesto;
		this.desInteres = desInteres;
		this.desCar = desCar;
		this.desIntCar = desIntCar;
		this.desOtros = desOtros;
		this.desIntOtros = desIntOtros;
		this.desSancion = desSancion;
		this.desIntSancion = desIntSancion;
		Id_AlivioAvaluos = id_AlivioAvaluos;
	}

	public AlivioAvaluosModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
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

	public String getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return FechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		FechaFinal = fechaFinal;
	}

	public Float getPorcDescto() {
		return PorcDescto;
	}

	public void setPorcDescto(Float porcDescto) {
		PorcDescto = porcDescto;
	}

	public Float getPorcDesctoFin() {
		return PorcDesctoFin;
	}

	public void setPorcDesctoFin(Float porcDesctoFin) {
		PorcDesctoFin = porcDesctoFin;
	}

	public Float getPorcFInCuotaIni() {
		return PorcFInCuotaIni;
	}

	public void setPorcFInCuotaIni(Float porcFInCuotaIni) {
		PorcFInCuotaIni = porcFInCuotaIni;
	}

	public Integer getAnoInicial() {
		return AnoInicial;
	}

	public void setAnoInicial(Integer anoInicial) {
		AnoInicial = anoInicial;
	}

	public Integer getAnoFinal() {
		return AnoFinal;
	}

	public void setAnoFinal(Integer anoFinal) {
		AnoFinal = anoFinal;
	}

	public boolean isInd_Impuesto() {
		return Ind_Impuesto;
	}

	public void setInd_Impuesto(boolean ind_Impuesto) {
		Ind_Impuesto = ind_Impuesto;
	}

	public boolean isInd_IntPred() {
		return Ind_IntPred;
	}

	public void setInd_IntPred(boolean ind_IntPred) {
		Ind_IntPred = ind_IntPred;
	}

	public boolean isInd_CAR() {
		return Ind_CAR;
	}

	public void setInd_CAR(boolean ind_CAR) {
		Ind_CAR = ind_CAR;
	}

	public boolean isInd_IntCAR() {
		return Ind_IntCAR;
	}

	public void setInd_IntCAR(boolean ind_IntCAR) {
		Ind_IntCAR = ind_IntCAR;
	}

	public boolean isIndTodos() {
		return IndTodos;
	}

	public void setIndTodos(boolean indTodos) {
		IndTodos = indTodos;
	}

	public Integer getAnoPazysalvoFinal() {
		return AnoPazysalvoFinal;
	}

	public void setAnoPazysalvoFinal(Integer anoPazysalvoFinal) {
		AnoPazysalvoFinal = anoPazysalvoFinal;
	}

	public Integer getAnoPazysalvo() {
		return AnoPazysalvo;
	}

	public void setAnoPazysalvo(Integer anoPazysalvo) {
		AnoPazysalvo = anoPazysalvo;
	}

	public boolean isIndSancion() {
		return IndSancion;
	}

	public void setIndSancion(boolean indSancion) {
		IndSancion = indSancion;
	}

	public boolean isIndInteresOtros() {
		return IndInteresOtros;
	}

	public void setIndInteresOtros(boolean indInteresOtros) {
		IndInteresOtros = indInteresOtros;
	}

	public Integer getVigPazInicial() {
		return VigPazInicial;
	}

	public void setVigPazInicial(Integer vigPazInicial) {
		VigPazInicial = vigPazInicial;
	}

	public Integer getVigPazFinal() {
		return VigPazFinal;
	}

	public void setVigPazFinal(Integer vigPazFinal) {
		VigPazFinal = vigPazFinal;
	}

	public String getIdAlivio() {
		return IdAlivio;
	}

	public void setIdAlivio(String idAlivio) {
		IdAlivio = idAlivio;
	}

	public Integer getIndAutorizado() {
		return indAutorizado;
	}

	public void setIndAutorizado(Integer indAutorizado) {
		this.indAutorizado = indAutorizado;
	}

	public String getBaseInteres() {
		return baseInteres;
	}

	public void setBaseInteres(String baseInteres) {
		this.baseInteres = baseInteres;
	}

	public boolean isIndOtros() {
		return IndOtros;
	}

	public void setIndOtros(boolean indOtros) {
		IndOtros = indOtros;
	}

	public Float getDesImpuesto() {
		return desImpuesto;
	}

	public void setDesImpuesto(Float desImpuesto) {
		this.desImpuesto = desImpuesto;
	}

	public Float getDesInteres() {
		return desInteres;
	}

	public void setDesInteres(Float desInteres) {
		this.desInteres = desInteres;
	}

	public Float getDesCar() {
		return desCar;
	}

	public void setDesCar(Float desCar) {
		this.desCar = desCar;
	}

	public Float getDesIntCar() {
		return desIntCar;
	}

	public void setDesIntCar(Float desIntCar) {
		this.desIntCar = desIntCar;
	}

	public Float getDesOtros() {
		return desOtros;
	}

	public void setDesOtros(Float desOtros) {
		this.desOtros = desOtros;
	}

	public Float getDesIntOtros() {
		return desIntOtros;
	}

	public void setDesIntOtros(Float desIntOtros) {
		this.desIntOtros = desIntOtros;
	}

	public Float getDesSancion() {
		return desSancion;
	}

	public void setDesSancion(Float desSancion) {
		this.desSancion = desSancion;
	}

	public Float getDesIntSancion() {
		return desIntSancion;
	}

	public void setDesIntSancion(Float desIntSancion) {
		this.desIntSancion = desIntSancion;
	}

	public Integer getId_AlivioAvaluos() {
		return Id_AlivioAvaluos;
	}

	public void setId_AlivioAvaluos(Integer id_AlivioAvaluos) {
		Id_AlivioAvaluos = id_AlivioAvaluos;
	}
    
}
