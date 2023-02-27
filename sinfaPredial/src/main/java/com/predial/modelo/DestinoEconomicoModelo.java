package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Codigo")
public class DestinoEconomicoModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @NotNull
    @Size(since = 0 , until = 150)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 500)
    @FormParam("Texto")
    private String Texto;

    private Integer Id_DestinoEconomico;

	public DestinoEconomicoModelo(String codigo, String descripcion, String texto, Integer id_DestinoEconomico) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		Texto = texto;
		Id_DestinoEconomico = id_DestinoEconomico;
	}

	public DestinoEconomicoModelo() {
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

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	}

	public Integer getId_DestinoEconomico() {
		return Id_DestinoEconomico;
	}

	public void setId_DestinoEconomico(Integer id_DestinoEconomico) {
		Id_DestinoEconomico = id_DestinoEconomico;
	}
    
}
