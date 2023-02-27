package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Estado")
public class EstadosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 1)
    @FormParam("Estado")
    private String Estado;
    @Size(since = 0 , until = 15)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 50)
    @FormParam("DestinoEconomico")
    private String DestinoEconomico;
    @Size(since = 0 , until = 50)
    @FormParam("Condicion")
    private String Condicion;
    
    private Integer Id_Estados;

	public EstadosModelo() {
		super();
	}

	public EstadosModelo(String estado, String descripcion, String destinoEconomico, String condicion,
			Integer id_Estados) {
		super();
		Estado = estado;
		Descripcion = descripcion;
		DestinoEconomico = destinoEconomico;
		Condicion = condicion;
		Id_Estados = id_Estados;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getDestinoEconomico() {
		return DestinoEconomico;
	}

	public void setDestinoEconomico(String destinoEconomico) {
		DestinoEconomico = destinoEconomico;
	}

	public String getCondicion() {
		return Condicion;
	}

	public void setCondicion(String condicion) {
		Condicion = condicion;
	}

	public Integer getId_Estados() {
		return Id_Estados;
	}

	public void setId_Estados(Integer id_Estados) {
		Id_Estados = id_Estados;
	}
    
}
