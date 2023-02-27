package com.predial.modelo;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class BancosOtrosCobrosModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @Size(since = 0 , until = 16)
    @NotNull(update = false)
    @FormParam("Banco")
    private String Banco;
    @Size(since = 0 , until = 10)
    @NotNull(update = false)
    @FormParam("Concepto")
    private String Concepto;
    @NotNull
    @Size(since = 0 , until = 16)
    @FormParam("Cuenta")
    private String Cuenta;

    private Integer   Id_BancosOtrosCobros;

	public BancosOtrosCobrosModelo(Integer ano, String banco, String concepto, String cuenta,
			Integer id_BancosOtrosCobros) {
		super();
		Ano = ano;
		Banco = banco;
		Concepto = concepto;
		Cuenta = cuenta;
		Id_BancosOtrosCobros = id_BancosOtrosCobros;
	}
	

	public BancosOtrosCobrosModelo() {
		super();
	}


	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getConcepto() {
		return Concepto;
	}

	public void setConcepto(String concepto) {
		Concepto = concepto;
	}

	public String getCuenta() {
		return Cuenta;
	}

	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}

	public Integer getId_BancosOtrosCobros() {
		return Id_BancosOtrosCobros;
	}

	public void setId_BancosOtrosCobros(Integer id_BancosOtrosCobros) {
		Id_BancosOtrosCobros = id_BancosOtrosCobros;
	}
    
}
