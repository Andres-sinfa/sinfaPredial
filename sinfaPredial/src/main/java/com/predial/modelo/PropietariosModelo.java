package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class PropietariosModelo {
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull(update = false)
    private String CodigoCatastral;
    @Size(since = 0 , until = 3)
    @FormParam("Propietario")
    @NotNull(update = false)
    private String Propietario;
    @Size(since = 0 , until = 200)
    @FormParam("Nombres")
    private String Nombres;
    @Size(since = 0 , until = 13)
    @FormParam("Nit")
    private String Nit;
    @Size(since = 0 , until = 100)
    @FormParam("DireccionCorrespondencia")
    private String DireccionCorrespondencia;
    @Size(since = 0 , until = 3)
    @FormParam("NroRegistros")
    private String NroRegistros;
    @Size(since = 0 , until = 1)
    @FormParam("DcasadaViuda")
    private String DcasadaViuda;
    @Size(since = 0 , until = 1)
    @FormParam("TipoNit")
    private String TipoNit;
    @Size(since = 0 , until = 25)
    @FormParam("Resolucion")
    private String Resolucion;
    @Size(since = 0 , until = 2)
    @FormParam("Estado")
    private String Estado;
    @Size(since = 0 , until = 100)
    @FormParam("NombrePredio")
    private String NombrePredio;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCancelado")
    private String CodigoCancelado;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @Size(since = 0 , until = 2)
    @FormParam("TipoIdentificacion")
    private String TipoIdentificacion;

    private Integer Id_Propietarios;

	public PropietariosModelo() {
		super();
	}

	public PropietariosModelo(String codigoCatastral, String propietario, String nombres, String nit,
			String direccionCorrespondencia, String nroRegistros, String dcasadaViuda, String tipoNit,
			String resolucion, String estado, String nombrePredio, String codigoCancelado, String codUnicoCatastral,
			String tipoIdentificacion, Integer id_Propietarios) {
		super();
		CodigoCatastral = codigoCatastral;
		Propietario = propietario;
		Nombres = nombres;
		Nit = nit;
		DireccionCorrespondencia = direccionCorrespondencia;
		NroRegistros = nroRegistros;
		DcasadaViuda = dcasadaViuda;
		TipoNit = tipoNit;
		Resolucion = resolucion;
		Estado = estado;
		NombrePredio = nombrePredio;
		CodigoCancelado = codigoCancelado;
		CodUnicoCatastral = codUnicoCatastral;
		TipoIdentificacion = tipoIdentificacion;
		Id_Propietarios = id_Propietarios;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getPropietario() {
		return Propietario;
	}

	public void setPropietario(String propietario) {
		Propietario = propietario;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getNit() {
		return Nit;
	}

	public void setNit(String nit) {
		Nit = nit;
	}

	public String getDireccionCorrespondencia() {
		return DireccionCorrespondencia;
	}

	public void setDireccionCorrespondencia(String direccionCorrespondencia) {
		DireccionCorrespondencia = direccionCorrespondencia;
	}

	public String getNroRegistros() {
		return NroRegistros;
	}

	public void setNroRegistros(String nroRegistros) {
		NroRegistros = nroRegistros;
	}

	public String getDcasadaViuda() {
		return DcasadaViuda;
	}

	public void setDcasadaViuda(String dcasadaViuda) {
		DcasadaViuda = dcasadaViuda;
	}

	public String getTipoNit() {
		return TipoNit;
	}

	public void setTipoNit(String tipoNit) {
		TipoNit = tipoNit;
	}

	public String getResolucion() {
		return Resolucion;
	}

	public void setResolucion(String resolucion) {
		Resolucion = resolucion;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getNombrePredio() {
		return NombrePredio;
	}

	public void setNombrePredio(String nombrePredio) {
		NombrePredio = nombrePredio;
	}

	public String getCodigoCancelado() {
		return CodigoCancelado;
	}

	public void setCodigoCancelado(String codigoCancelado) {
		CodigoCancelado = codigoCancelado;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getTipoIdentificacion() {
		return TipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		TipoIdentificacion = tipoIdentificacion;
	}

	public Integer getId_Propietarios() {
		return Id_Propietarios;
	}

	public void setId_Propietarios(Integer id_Propietarios) {
		Id_Propietarios = id_Propietarios;
	}
    
    
}
