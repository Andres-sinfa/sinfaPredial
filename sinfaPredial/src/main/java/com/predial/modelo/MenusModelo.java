package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Barra")
public class MenusModelo {
    @Size(since = 0 , until = 5)
    @FormParam("Barra")
    @NotNull(update = false)
    private String Barra;
    @Size(since = 0 , until = 5)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Caption")
    private String Caption;
    @Size(since = 0 , until = 2)
    @FormParam("Modulo")
    @NotNull(update = false)
    private String Modulo;

    private Integer Id_Menus;

	public MenusModelo(String barra, String codigo, String caption, String modulo, Integer id_Menus) {
		super();
		Barra = barra;
		Codigo = codigo;
		Caption = caption;
		Modulo = modulo;
		Id_Menus = id_Menus;
	}

	public MenusModelo() {
		super();
	}

	public String getBarra() {
		return Barra;
	}

	public void setBarra(String barra) {
		Barra = barra;
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

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public Integer getId_Menus() {
		return Id_Menus;
	}

	public void setId_Menus(Integer id_Menus) {
		Id_Menus = id_Menus;
	}

}
