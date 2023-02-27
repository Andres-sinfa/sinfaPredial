package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class ArchivosPlanosModelo {
    @Size(since = 0 , until = 8)
    @NotNull(update = false)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @Size(since = 0 , until = 2000)
    @FormParam("sSQL")
    private String sSQL;
    @FormParam("ODBC")
    private boolean ODBC;

    private Integer Id_ArchivosPlanos;

	public ArchivosPlanosModelo(String codigo, String descripcion, String sSQL, boolean oDBC,
			Integer id_ArchivosPlanos) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		this.sSQL = sSQL;
		ODBC = oDBC;
		Id_ArchivosPlanos = id_ArchivosPlanos;
	}

	public ArchivosPlanosModelo() {
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

	public Integer getId_ArchivosPlanos() {
		return Id_ArchivosPlanos;
	}

	public void setId_ArchivosPlanos(Integer id_ArchivosPlanos) {
		Id_ArchivosPlanos = id_ArchivosPlanos;
	}
    
    
}
