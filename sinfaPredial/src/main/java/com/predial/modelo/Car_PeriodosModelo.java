package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Codigo")
public class Car_PeriodosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 6)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 100)
    @FormParam("Descripcion")
    @NotNull
    private String Descripcion;
    @Size(since = -32768, until = 32767)
    @FormParam("MesInicial")
    @NotNull
    private Integer MesInicial;
    @Size(since = -32768, until = 32767)
    @FormParam("MesFinal")
    @NotNull
    private Integer MesFinal;
    @FormParam("IndCerrado")
    private boolean IndCerrado;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @NotNull
    @Size(since = -32768, until = 32767)
    @FormParam("estado")
    private Integer estado;
    @DateFormat
    @FormParam("fechaCorte")
    private String fechaCorte;

    private Integer Id_Car_Periodos;

	public Car_PeriodosModelo(String codigo, String descripcion, Integer mesInicial, Integer mesFinal,
			boolean indCerrado, String codUnicoCatastral, Integer estado, String fechaCorte, Integer id_Car_Periodos) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		MesInicial = mesInicial;
		MesFinal = mesFinal;
		IndCerrado = indCerrado;
		CodUnicoCatastral = codUnicoCatastral;
		this.estado = estado;
		this.fechaCorte = fechaCorte;
		Id_Car_Periodos = id_Car_Periodos;
	}

	public Car_PeriodosModelo() {
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

	public Integer getMesInicial() {
		return MesInicial;
	}

	public void setMesInicial(Integer mesInicial) {
		MesInicial = mesInicial;
	}

	public Integer getMesFinal() {
		return MesFinal;
	}

	public void setMesFinal(Integer mesFinal) {
		MesFinal = mesFinal;
	}

	public boolean isIndCerrado() {
		return IndCerrado;
	}

	public void setIndCerrado(boolean indCerrado) {
		IndCerrado = indCerrado;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(String fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public Integer getId_Car_Periodos() {
		return Id_Car_Periodos;
	}

	public void setId_Car_Periodos(Integer id_Car_Periodos) {
		Id_Car_Periodos = id_Car_Periodos;
	}
    
    
}
