package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class DocumentsTblModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 10)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 30)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 255)
    @FormParam("Encabezado")
    private String Encabezado;
    @FormParam("Contenido")
    private String Contenido;
    @Size(since = 0 , until = 255)
    @FormParam("Pie")
    private String Pie;
    @FormParam("Consulta")
    private String Consulta;
    @Size(since = 0 , until = 30)
    @FormParam("FuenteContenido")
    private String FuenteContenido;
    @FormParam("TamanoContenido")
    private Integer TamanoContenido;
    @FormParam("ItalicContenido")
    private boolean ItalicContenido;
    @FormParam("BoldContenido")
    private boolean BoldContenido;
    @FormParam("ColorContenido")
    private Integer ColorContenido;
    @Size(since = 0 , until = 30)
    @FormParam("FuenteEncabezado")
    private String FuenteEncabezado;
    @FormParam("TamanoEncabezado")
    private Integer TamanoEncabezado;
    @FormParam("ItalicEncabezado")
    private boolean ItalicEncabezado;
    @FormParam("BoldEncabezado")
    private boolean BoldEncabezado;
    @FormParam("ColorEncabezado")
    private Integer ColorEncabezado;
    @Size(since = 0 , until = 30)
    @FormParam("FuentePie")
    private String FuentePie;
    @FormParam("TamanoPie")
    private Integer TamanoPie;
    @FormParam("ItalicPie")
    private boolean ItalicPie;
    @FormParam("BoldPie")
    private boolean BoldPie;
    @FormParam("ColorPie")
    private Integer ColorPie;
    
    private Integer Id_DocumentsTbl;

	public DocumentsTblModelo(String codigo, String descripcion, String encabezado, String contenido, String pie,
			String consulta, String fuenteContenido, Integer tamanoContenido, boolean italicContenido,
			boolean boldContenido, Integer colorContenido, String fuenteEncabezado, Integer tamanoEncabezado,
			boolean italicEncabezado, boolean boldEncabezado, Integer colorEncabezado, String fuentePie,
			Integer tamanoPie, boolean italicPie, boolean boldPie, Integer colorPie, Integer id_DocumentsTbl) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		Encabezado = encabezado;
		Contenido = contenido;
		Pie = pie;
		Consulta = consulta;
		FuenteContenido = fuenteContenido;
		TamanoContenido = tamanoContenido;
		ItalicContenido = italicContenido;
		BoldContenido = boldContenido;
		ColorContenido = colorContenido;
		FuenteEncabezado = fuenteEncabezado;
		TamanoEncabezado = tamanoEncabezado;
		ItalicEncabezado = italicEncabezado;
		BoldEncabezado = boldEncabezado;
		ColorEncabezado = colorEncabezado;
		FuentePie = fuentePie;
		TamanoPie = tamanoPie;
		ItalicPie = italicPie;
		BoldPie = boldPie;
		ColorPie = colorPie;
		Id_DocumentsTbl = id_DocumentsTbl;
	}

	public DocumentsTblModelo() {
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

	public String getEncabezado() {
		return Encabezado;
	}

	public void setEncabezado(String encabezado) {
		Encabezado = encabezado;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public String getPie() {
		return Pie;
	}

	public void setPie(String pie) {
		Pie = pie;
	}

	public String getConsulta() {
		return Consulta;
	}

	public void setConsulta(String consulta) {
		Consulta = consulta;
	}

	public String getFuenteContenido() {
		return FuenteContenido;
	}

	public void setFuenteContenido(String fuenteContenido) {
		FuenteContenido = fuenteContenido;
	}

	public Integer getTamanoContenido() {
		return TamanoContenido;
	}

	public void setTamanoContenido(Integer tamanoContenido) {
		TamanoContenido = tamanoContenido;
	}

	public boolean isItalicContenido() {
		return ItalicContenido;
	}

	public void setItalicContenido(boolean italicContenido) {
		ItalicContenido = italicContenido;
	}

	public boolean isBoldContenido() {
		return BoldContenido;
	}

	public void setBoldContenido(boolean boldContenido) {
		BoldContenido = boldContenido;
	}

	public Integer getColorContenido() {
		return ColorContenido;
	}

	public void setColorContenido(Integer colorContenido) {
		ColorContenido = colorContenido;
	}

	public String getFuenteEncabezado() {
		return FuenteEncabezado;
	}

	public void setFuenteEncabezado(String fuenteEncabezado) {
		FuenteEncabezado = fuenteEncabezado;
	}

	public Integer getTamanoEncabezado() {
		return TamanoEncabezado;
	}

	public void setTamanoEncabezado(Integer tamanoEncabezado) {
		TamanoEncabezado = tamanoEncabezado;
	}

	public boolean isItalicEncabezado() {
		return ItalicEncabezado;
	}

	public void setItalicEncabezado(boolean italicEncabezado) {
		ItalicEncabezado = italicEncabezado;
	}

	public boolean isBoldEncabezado() {
		return BoldEncabezado;
	}

	public void setBoldEncabezado(boolean boldEncabezado) {
		BoldEncabezado = boldEncabezado;
	}

	public Integer getColorEncabezado() {
		return ColorEncabezado;
	}

	public void setColorEncabezado(Integer colorEncabezado) {
		ColorEncabezado = colorEncabezado;
	}

	public String getFuentePie() {
		return FuentePie;
	}

	public void setFuentePie(String fuentePie) {
		FuentePie = fuentePie;
	}

	public Integer getTamanoPie() {
		return TamanoPie;
	}

	public void setTamanoPie(Integer tamanoPie) {
		TamanoPie = tamanoPie;
	}

	public boolean isItalicPie() {
		return ItalicPie;
	}

	public void setItalicPie(boolean italicPie) {
		ItalicPie = italicPie;
	}

	public boolean isBoldPie() {
		return BoldPie;
	}

	public void setBoldPie(boolean boldPie) {
		BoldPie = boldPie;
	}

	public Integer getColorPie() {
		return ColorPie;
	}

	public void setColorPie(Integer colorPie) {
		ColorPie = colorPie;
	}

	public Integer getId_DocumentsTbl() {
		return Id_DocumentsTbl;
	}

	public void setId_DocumentsTbl(Integer id_DocumentsTbl) {
		Id_DocumentsTbl = id_DocumentsTbl;
	}
    
}
