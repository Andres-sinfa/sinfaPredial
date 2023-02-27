package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("nombre")
public class ConsultasModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 100)
    @FormParam("nombre")
    private String nombre;
    @FormParam("sql")
    private String sql;
    @Size(since = 0 , until = 2000)
    @FormParam("sSQL")
    private String sSQL;
    @FormParam("ODBC")
    private boolean ODBC;
    
    private Integer Id_Consultas;

	public ConsultasModelo() {
		super();
	}

	public ConsultasModelo(String nombre, String sql, String sSQL, boolean oDBC, Integer id_Consultas) {
		super();
		this.nombre = nombre;
		this.sql = sql;
		this.sSQL = sSQL;
		ODBC = oDBC;
		Id_Consultas = id_Consultas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
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

	public Integer getId_Consultas() {
		return Id_Consultas;
	}

	public void setId_Consultas(Integer id_Consultas) {
		Id_Consultas = id_Consultas;
	}
    
}
