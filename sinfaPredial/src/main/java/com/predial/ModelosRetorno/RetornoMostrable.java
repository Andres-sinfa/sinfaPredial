package com.predial.ModelosRetorno;

public class RetornoMostrable {
	private Object Id;
	private Object data;
	private String mensaje;
	private int status;
	public RetornoMostrable() {
		super();
	}
	public RetornoMostrable(Object Id, Object data, String mensaje, int status) {
		super();
		this.Id = Id;
		this.data = data;
		this.mensaje = mensaje;
		this.status = status;
	}
	public Object getId() {
		return Id;
	}
	public void setId(Object Id) {
		this.Id = Id;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
