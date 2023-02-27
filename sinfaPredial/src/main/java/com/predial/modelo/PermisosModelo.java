package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Barra")
public class PermisosModelo {
    @Size(since = 0 , until = 5)
    @FormParam("Barra")
    @NotNull(update = false)
    private String Barra;
    @Size(since = 0 , until = 20)
    @FormParam("Usuario")
    @NotNull(update = false)
    private String Usuario;
    @Size(since = 0 , until = 5)
    @FormParam("Menu")
    @NotNull(update = false)
    private String Menu;
    @Size(since = 0 , until = 10)
    @FormParam("Opcion")
    @NotNull(update = false)
    private String Opcion;
    @FormParam("Edita")
    private boolean Edita;
    @FormParam("Borra")
    private boolean Borra;
    @FormParam("Adiciona")
    private boolean Adiciona;
    @Size(since = 0 , until = 2)
    @FormParam("Modulo")
    @NotNull(update = false)
    private String Modulo;

    private Integer Id_Permisos;

	public PermisosModelo(String barra, String usuario, String menu, String opcion, boolean edita, boolean borra,
			boolean adiciona, String modulo, Integer id_Permisos) {
		super();
		Barra = barra;
		Usuario = usuario;
		Menu = menu;
		Opcion = opcion;
		Edita = edita;
		Borra = borra;
		Adiciona = adiciona;
		Modulo = modulo;
		Id_Permisos = id_Permisos;
	}

	public PermisosModelo() {
		super();
	}

	public String getBarra() {
		return Barra;
	}

	public void setBarra(String barra) {
		Barra = barra;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getMenu() {
		return Menu;
	}

	public void setMenu(String menu) {
		Menu = menu;
	}

	public String getOpcion() {
		return Opcion;
	}

	public void setOpcion(String opcion) {
		Opcion = opcion;
	}

	public boolean isEdita() {
		return Edita;
	}

	public void setEdita(boolean edita) {
		Edita = edita;
	}

	public boolean isBorra() {
		return Borra;
	}

	public void setBorra(boolean borra) {
		Borra = borra;
	}

	public boolean isAdiciona() {
		return Adiciona;
	}

	public void setAdiciona(boolean adiciona) {
		Adiciona = adiciona;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public Integer getId_Permisos() {
		return Id_Permisos;
	}

	public void setId_Permisos(Integer id_Permisos) {
		Id_Permisos = id_Permisos;
	}
    
}
