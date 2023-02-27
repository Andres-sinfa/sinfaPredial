package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Nombre")
public class Tbl_QryDocumentosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 100)
    @FormParam("Nombre")
    private String Nombre;
    @FormParam("sSQL")
    private String sSQL;
    @FormParam("ODBC")
    private boolean ODBC;
    
    private Integer Id_Tbl_QryDocumentos;

	public Tbl_QryDocumentosModelo() {
		super();
	}

	public Tbl_QryDocumentosModelo(String nombre, String sSQL, boolean oDBC, Integer id_Tbl_QryDocumentos) {
		super();
		Nombre = nombre;
		this.sSQL = sSQL;
		ODBC = oDBC;
		Id_Tbl_QryDocumentos = id_Tbl_QryDocumentos;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getSSQL() {
		return sSQL;
	}

	public void setSSQL(String sSQL) {
		this.sSQL = sSQL;
	}

	public boolean isODBC() {
		return ODBC;
	}

	public void setODBC(boolean oDBC) {
		ODBC = oDBC;
	}

	public Integer getId_Tbl_QryDocumentos() {
		return Id_Tbl_QryDocumentos;
	}

	public void setId_Tbl_QryDocumentos(Integer id_Tbl_QryDocumentos) {
		Id_Tbl_QryDocumentos = id_Tbl_QryDocumentos;
	}
    
}
