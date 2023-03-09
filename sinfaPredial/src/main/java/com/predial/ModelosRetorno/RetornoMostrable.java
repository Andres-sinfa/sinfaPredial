package com.predial.ModelosRetorno;

public class RetornoMostrable {
	private Object Id;
	private Object data;
	private Object mensaje;
	private int status;
	public RetornoMostrable() {
		super();
	}
	public RetornoMostrable(Object Id, Object data, Object mensaje, int status) {
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
	public Object getMensaje() {
		return mensaje;
	}
	public void setMensaje(Object mensaje) {
		this.mensaje = mensaje;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
