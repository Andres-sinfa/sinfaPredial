package com.predial.ModelosRetorno;

import java.util.ArrayList;

public class RetornoBusqueda {
	private int totalRegistros;
	private ArrayList<Object> filas;
	private int RegistrosPagina;
	private int totalPaginas;
	public RetornoBusqueda(int totalRegistros, ArrayList<Object> filas, int RegistrosPagina, int totalPaginas) {
		super();
		this.totalRegistros = totalRegistros;
		this.filas = filas;
		this.RegistrosPagina = RegistrosPagina;
		this.totalPaginas = totalPaginas;
	}
	public RetornoBusqueda() {
		super();
	}
	public int getTotalRegistros() {
		return totalRegistros;
	}
	public void setTotalRegistros(int totalRegistros) {
		this.totalRegistros = totalRegistros;
	}
	public ArrayList<Object> getFilas() {
		return filas;
	}
	public void setFilas(ArrayList<Object> filas) {
		this.filas = filas;
	}
	public int getFilasPorPagina() {
		return RegistrosPagina;
	}
	public void setFilasPorPagina(int filasPorPagina) {
		this.RegistrosPagina = filasPorPagina;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
}
