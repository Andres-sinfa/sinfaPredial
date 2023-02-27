package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class EstratosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 50)
    @FormParam("DestinoEconomico")
    private String DestinoEconomico;
    @Size(since = 0 , until = 255)
    @FormParam("Condicion")
    private String Condicion;
    @Size(since = 0 , until = 2)
    @FormParam("NumEstrato")
    private String NumEstrato;
    @FormParam("IndAlertas")
    private boolean IndAlertas;
    @Size(since = 0 , until = 100)
    @FormParam("TxtAlerta")
    private String TxtAlerta;
    @FormParam("IndBloquearImp")
    private boolean IndBloquearImp;
    @Size(since = 0 , until = 2)
    @FormParam("Uso")
    private String Uso;
    @Size(since = 0 , until = 3)
    @FormParam("sector")
    private String sector;
    @FormParam("IndPatrimonio")
    private boolean IndPatrimonio;

    private Integer Id_Estratos;

	public EstratosModelo() {
		super();
	}

	public EstratosModelo(String codigo, String descripcion, String destinoEconomico, String condicion,
			String numEstrato, boolean indAlertas, String txtAlerta, boolean indBloquearImp, String uso, String sector,
			boolean indPatrimonio, Integer id_Estratos) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		DestinoEconomico = destinoEconomico;
		Condicion = condicion;
		NumEstrato = numEstrato;
		IndAlertas = indAlertas;
		TxtAlerta = txtAlerta;
		IndBloquearImp = indBloquearImp;
		Uso = uso;
		this.sector = sector;
		IndPatrimonio = indPatrimonio;
		Id_Estratos = id_Estratos;
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

	public String getNumEstrato() {
		return NumEstrato;
	}

	public void setNumEstrato(String numEstrato) {
		NumEstrato = numEstrato;
	}

	public boolean isIndAlertas() {
		return IndAlertas;
	}

	public void setIndAlertas(boolean indAlertas) {
		IndAlertas = indAlertas;
	}

	public String getTxtAlerta() {
		return TxtAlerta;
	}

	public void setTxtAlerta(String txtAlerta) {
		TxtAlerta = txtAlerta;
	}

	public boolean isIndBloquearImp() {
		return IndBloquearImp;
	}

	public void setIndBloquearImp(boolean indBloquearImp) {
		IndBloquearImp = indBloquearImp;
	}

	public String getUso() {
		return Uso;
	}

	public void setUso(String uso) {
		Uso = uso;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public boolean isIndPatrimonio() {
		return IndPatrimonio;
	}

	public void setIndPatrimonio(boolean indPatrimonio) {
		IndPatrimonio = indPatrimonio;
	}

	public Integer getId_Estratos() {
		return Id_Estratos;
	}

	public void setId_Estratos(Integer id_Estratos) {
		Id_Estratos = id_Estratos;
	}
    
    
}
