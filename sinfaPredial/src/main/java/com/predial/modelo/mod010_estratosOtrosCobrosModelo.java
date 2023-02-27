package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Codigo")
public class mod010_estratosOtrosCobrosModelo {
    @NotNull(update = false)
    @Size(since = 0 , until = 2)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @FormParam("idUsuario")
    private Integer idUsuario;
    @Size(since = 0 , until = 200)
    @FormParam("nombreUsuario")
    private String nombreUsuario;
    @DateFormat
    @FormParam("fechaCreacion")
    private String fechaCreacion;
    @Size(since = 0 , until = 50)
    @FormParam("ip")
    private String ip;

    private Integer Id_mod010_estratosOtrosCobros;

	public mod010_estratosOtrosCobrosModelo() {
		super();
	}

	public mod010_estratosOtrosCobrosModelo(String codigo, String descripcion, Integer idUsuario, String nombreUsuario,
			String fechaCreacion, String ip, Integer id_mod010_estratosOtrosCobros) {
		super();
		Codigo = codigo;
		Descripcion = descripcion;
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.fechaCreacion = fechaCreacion;
		this.ip = ip;
		Id_mod010_estratosOtrosCobros = id_mod010_estratosOtrosCobros;
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

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getId_mod010_estratosOtrosCobros() {
		return Id_mod010_estratosOtrosCobros;
	}

	public void setId_mod010_estratosOtrosCobros(Integer id_mod010_estratosOtrosCobros) {
		Id_mod010_estratosOtrosCobros = id_mod010_estratosOtrosCobros;
	}
    
    
}
