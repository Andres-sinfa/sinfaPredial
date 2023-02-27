package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class BarrasModelo {
    @Size(since = 0 , until = 5)
    @FormParam("Codigo")
    @NotNull(update = false)
    private String Codigo;
    @Size(since = 0 , until = 30)
    @FormParam("Nombre")
    private String Nombre;
    @Size(since = 0 , until = 2)
    @FormParam("Modulo")
    @NotNull(update = false)
    private String Modulo;

    private Integer Id_Barras;

	public BarrasModelo(String codigo, String nombre, String modulo, Integer id_Barras) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Modulo = modulo;
		Id_Barras = id_Barras;
	}

	public BarrasModelo() {
		super();
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getModulo() {
		return Modulo;
	}

	public void setModulo(String modulo) {
		Modulo = modulo;
	}

	public Integer getId_Barras() {
		return Id_Barras;
	}

	public void setId_Barras(Integer id_Barras) {
		Id_Barras = id_Barras;
	}
    
}
