package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class CategoriasSCHIPModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 2)
    @NotNull(update = false)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 100)
    @NotNull
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 100)
    @NotNull
    @FormParam("Formulario")
    private String Formulario;
    @Size(since = 0 , until = 50)
    @NotNull
    @FormParam("TipoDeuda")
    private String TipoDeuda;
    @NotNull
    @FormParam("CifraControl")
    private boolean CifraControl;

    private Integer Id_CategoriasSCHIP;

	public CategoriasSCHIPModelo(Integer ano, String codigo, String descripcion, String formulario, String tipoDeuda,
			boolean cifraControl, Integer id_CategoriasSCHIP) {
		super();
		Ano = ano;
		Codigo = codigo;
		Descripcion = descripcion;
		Formulario = formulario;
		TipoDeuda = tipoDeuda;
		CifraControl = cifraControl;
		Id_CategoriasSCHIP = id_CategoriasSCHIP;
	}

	public CategoriasSCHIPModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
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

	public String getFormulario() {
		return Formulario;
	}

	public void setFormulario(String formulario) {
		Formulario = formulario;
	}

	public String getTipoDeuda() {
		return TipoDeuda;
	}

	public void setTipoDeuda(String tipoDeuda) {
		TipoDeuda = tipoDeuda;
	}

	public boolean isCifraControl() {
		return CifraControl;
	}

	public void setCifraControl(boolean cifraControl) {
		CifraControl = cifraControl;
	}

	public Integer getId_CategoriasSCHIP() {
		return Id_CategoriasSCHIP;
	}

	public void setId_CategoriasSCHIP(Integer id_CategoriasSCHIP) {
		Id_CategoriasSCHIP = id_CategoriasSCHIP;
	}

}
