package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Barra")
public class OpcionesModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 5)
    @FormParam("Barra")
    private String Barra;
    @NotNull(update = false)
    @Size(since = 0 , until = 5)
    @FormParam("Menu")
    private String Menu;
    @NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 100)
    @FormParam("Caption")
    private String Caption;
    @Size(since = 0 , until = 50)
    @FormParam("llamada")
    private String llamada;
    @FormParam("ComienzaGrupo")
    private boolean ComienzaGrupo;
    @Size(since = 0 , until = 1)
    @FormParam("Tipo")
    private String Tipo;
    @FormParam("IdIcono")
    private Integer IdIcono;
    @Size(since = 0 , until = 50)
    @FormParam("Parametro")
    private String Parametro;
    @Size(since = 0 , until = 50)
    @FormParam("FrmName")
    private String FrmName;
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Modulo")
    private String Modulo;
    
    private Integer Id_Opciones;

	public OpcionesModelo() {
		super();
	}

	public OpcionesModelo(String barra, String menu, String codigo, String caption, String llamada,
			boolean comienzaGrupo, String tipo, Integer idIcono, String parametro, String frmName, String modulo,
			Integer id_Opciones) {
		super();
		Barra = barra;
		Menu = menu;
		Codigo = codigo;
		Caption = caption;
		this.llamada = llamada;
		ComienzaGrupo = comienzaGrupo;
		Tipo = tipo;
		IdIcono = idIcono;
		Parametro = parametro;
		FrmName = frmName;
		Modulo = modulo;
		Id_Opciones = id_Opciones;
	}

	public String getBarra() {
		return Barra;
	}

	public void setBarra(String barra) {
		Barra = barra;
	}

	public String getMenu() {
		return Menu;
	}

	public void setMenu(String menu) {
		Menu = menu;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getCaption() {
		return Caption;
	}

	public void setCaption(String caption) {
		Caption = caption;
	}

	public String getLlamada() {
		return llamada;
	}

	public void setLlamada(String llamada) {
		this.llamada = llamada;
	}

	public boolean isComienzaGrupo() {
		return ComienzaGrupo;
	}

	public void setComienzaGrupo(boolean comienzaGrupo) {
		ComienzaGrupo = comienzaGrupo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Integer getIdIcono() {
		return IdIcono;
	}

	public void setIdIcono(Integer idIcono) {
		IdIcono = idIcono;
	}

	public String getParametro() {
		return Parametro;
	}

	public void setParametro(String parametro) {
		Parametro = parametro;
	}

	public String getFrmName() {
		return FrmName;
	}

	public void setFrmName(String frmName) {
		FrmName = frmName;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public Integer getId_Opciones() {
		return Id_Opciones;
	}

	public void setId_Opciones(Integer id_Opciones) {
		Id_Opciones = id_Opciones;
	}
    
    
}
