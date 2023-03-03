package com.predial.ModelosRetorno;

public class FiltrosModelo {
	private boolean Filtro;
	private int pagina;
	private int registros;
	private String ordenar;
	private String AdicionalesCondicionales;
	
	public String getAdicionalesCondicionales() {
		return AdicionalesCondicionales;
	}

	public void setAdicionalesCondicionales(String adicionalesCondicionales) {
		AdicionalesCondicionales = adicionalesCondicionales;
	}

	public FiltrosModelo() {
		super();
	}

	@Override
	public String toString() {
		return "FiltrosModelo [Filtro=" + Filtro + ", pagina=" + pagina + ", registros=" + registros + ", ordenar="
				+ ordenar + ", AdicionalesCondicionales=" + AdicionalesCondicionales + "]";
	}

	public FiltrosModelo(boolean filtro, int pagina, int registros, String ordenar, String adicionalesCondicionales) {
		super();
		Filtro = filtro;
		this.pagina = pagina;
		this.registros = registros;
		this.ordenar = ordenar;
		AdicionalesCondicionales = adicionalesCondicionales;
	}

	public boolean isFiltro() {
		return Filtro;
	}
	public void setFiltro(boolean filtro) {
		Filtro = filtro;
	}
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	public int getRegistros() {
		return registros;
	}
	public void setRegistros(int registros) {
		this.registros = registros;
	}

	public String getOrdenar() {
		return ordenar;
	}

	public void setOrdenar(String ordenar) {
		this.ordenar = ordenar;
	}

}
