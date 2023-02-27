package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("IdCoactivo")
public class tblCoactivoModelo {
    @NotNull(update = false)
    @FormParam("IdCoactivo")
    private Integer IdCoactivo;
    @Size(since = 0 , until = 50)
    @FormParam("codigocatastral")
    private String codigocatastral;
    @FormParam("ano")
    private Integer ano;
    @Size(since = 0 , until = 50)
    @FormParam("numeroCoactivo")
    private String numeroCoactivo;
    @DateFormat
    @FormParam("fechaCoactivo")
    private String fechaCoactivo;
    @FormParam("vigenciaInicial")
    private Integer vigenciaInicial;
    @FormParam("vigenciaFinal")
    private Integer vigenciaFinal;
    @FormParam("valorCoactivo")
    private Integer valorCoactivo;
    @NotNull
    @FormParam("estado")
    private Integer estado;
    @Size(since = 0 , until = 50)
    @FormParam("usuario")
    private String usuario;
    @Size(since = 0 , until = 50)
    @FormParam("equipo")
    private String equipo;
    @Size(since = 0 , until = 1000)
    @FormParam("observaciones")
    private String observaciones;

    private Integer Id_tblCoactivo;

	public tblCoactivoModelo() {
		super();
	}

	public tblCoactivoModelo(Integer idCoactivo, String codigocatastral, Integer ano, String numeroCoactivo,
			String fechaCoactivo, Integer vigenciaInicial, Integer vigenciaFinal, Integer valorCoactivo, Integer estado,
			String usuario, String equipo, String observaciones, Integer id_tblCoactivo) {
		super();
		IdCoactivo = idCoactivo;
		this.codigocatastral = codigocatastral;
		this.ano = ano;
		this.numeroCoactivo = numeroCoactivo;
		this.fechaCoactivo = fechaCoactivo;
		this.vigenciaInicial = vigenciaInicial;
		this.vigenciaFinal = vigenciaFinal;
		this.valorCoactivo = valorCoactivo;
		this.estado = estado;
		this.usuario = usuario;
		this.equipo = equipo;
		this.observaciones = observaciones;
		Id_tblCoactivo = id_tblCoactivo;
	}

	public Integer getIdCoactivo() {
		return IdCoactivo;
	}

	public void setIdCoactivo(Integer idCoactivo) {
		IdCoactivo = idCoactivo;
	}

	public String getCodigocatastral() {
		return codigocatastral;
	}

	public void setCodigocatastral(String codigocatastral) {
		this.codigocatastral = codigocatastral;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getNumeroCoactivo() {
		return numeroCoactivo;
	}

	public void setNumeroCoactivo(String numeroCoactivo) {
		this.numeroCoactivo = numeroCoactivo;
	}

	public String getFechaCoactivo() {
		return fechaCoactivo;
	}

	public void setFechaCoactivo(String fechaCoactivo) {
		this.fechaCoactivo = fechaCoactivo;
	}

	public Integer getVigenciaInicial() {
		return vigenciaInicial;
	}

	public void setVigenciaInicial(Integer vigenciaInicial) {
		this.vigenciaInicial = vigenciaInicial;
	}

	public Integer getVigenciaFinal() {
		return vigenciaFinal;
	}

	public void setVigenciaFinal(Integer vigenciaFinal) {
		this.vigenciaFinal = vigenciaFinal;
	}

	public Integer getValorCoactivo() {
		return valorCoactivo;
	}

	public void setValorCoactivo(Integer valorCoactivo) {
		this.valorCoactivo = valorCoactivo;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getId_tblCoactivo() {
		return Id_tblCoactivo;
	}

	public void setId_tblCoactivo(Integer id_tblCoactivo) {
		Id_tblCoactivo = id_tblCoactivo;
	}
    
    
}
