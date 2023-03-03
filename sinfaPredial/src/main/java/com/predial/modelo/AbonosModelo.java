package com.predial.modelo;

import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;

import jakarta.ws.rs.FormParam;

@OrderDefault("CodigoCatastral")
public class AbonosModelo {
	@NotNull(update = false)
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    private String CodigoCatastral;
	@NotNull(update = false)
    @FormParam("Numero")
    private Integer Numero;
    @FormParam("VlrAbono")
    private Float VlrAbono;
    @FormParam("FechaVencimiento")
    @DateFormat
    private String FechaVencimiento;
    @Size(since = -32768, until = 32767)
    @FormParam("AnoBanco")
    private Integer AnoBanco;
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    private String Banco;
    @FormParam("F_Pago")
    @DateFormat
    private String F_Pago;
    @Size(since = 0 , until = 30)
    @FormParam("UsuarioRegistroPago")
    private String UsuarioRegistroPago;
    @Size(since = 0 , until = 10)
    @FormParam("NroComprobante")
    private String NroComprobante;
    @FormParam("Fecha_Registro")
    @DateFormat
    private String Fecha_Registro;
    @Size(since = 0 , until = 10)
    @FormParam("NroAcuerdo")
    private String NroAcuerdo;
    @Size(since = 0 , until = 200)
    @FormParam("Descripcion")
    private String Descripcion;
    @FormParam("PorcCAr")
    private Float PorcCAr;
    @FormParam("PorcImpuesto")
    private Float PorcImpuesto;
    @FormParam("PorcInteresCAR")
    private Float PorcInteresCAR;
    @FormParam("PorcInteresIMP")
    private Float PorcInteresIMP;
    @FormParam("PorcOtros")
    private Float PorcOtros;
    @FormParam("PorcSobretasa")
    private Float PorcSobretasa;
    @FormParam("F_presentacion")
    @DateFormat
    private String F_presentacion;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    @FormParam("FechaAbono")
    @DateFormat
    private String FechaAbono;
    @NotNull
    @FormParam("DeudaAFecha")
    private Float DeudaAFecha;
    @FormParam("fechaCreacion")
    @DateFormat
    private String fechaCreacion;
    @NotNull
    @FormParam("pagoPorCuotas")
    private Integer pagoPorCuotas;
    @Size(since = -32768, until = 32767)
    @FormParam("vigenciaCuota")
    private Integer vigenciaCuota;
    @Size(since = 0 , until = 1)
    @FormParam("estadoPagoPorCuota")
    private String estadoPagoPorCuota;
    @FormParam("origenRegistroPago")
    private boolean origenRegistroPago;

    private Integer Id_Abonos;

	public AbonosModelo() {
		super();
	}

	




	public AbonosModelo(String codigoCatastral, Integer numero, Float vlrAbono, String fechaVencimiento,
			Integer anoBanco, String banco, String f_Pago, String usuarioRegistroPago, String nroComprobante,
			String fecha_Registro, String nroAcuerdo, String descripcion, Float porcCAr, Float porcImpuesto,
			Float porcInteresCAR, Float porcInteresIMP, Float porcOtros, Float porcSobretasa, String f_presentacion,
			String codUnicoCatastral, String fechaAbono, Float deudaAFecha, String fechaCreacion, Integer pagoPorCuotas,
			Integer vigenciaCuota, String estadoPagoPorCuota, boolean origenRegistroPago, Integer id_Abonos) {
		super();
		CodigoCatastral = codigoCatastral;
		Numero = numero;
		VlrAbono = vlrAbono;
		FechaVencimiento = fechaVencimiento;
		AnoBanco = anoBanco;
		Banco = banco;
		F_Pago = f_Pago;
		UsuarioRegistroPago = usuarioRegistroPago;
		NroComprobante = nroComprobante;
		Fecha_Registro = fecha_Registro;
		NroAcuerdo = nroAcuerdo;
		Descripcion = descripcion;
		PorcCAr = porcCAr;
		PorcImpuesto = porcImpuesto;
		PorcInteresCAR = porcInteresCAR;
		PorcInteresIMP = porcInteresIMP;
		PorcOtros = porcOtros;
		PorcSobretasa = porcSobretasa;
		F_presentacion = f_presentacion;
		CodUnicoCatastral = codUnicoCatastral;
		FechaAbono = fechaAbono;
		DeudaAFecha = deudaAFecha;
		this.fechaCreacion = fechaCreacion;
		this.pagoPorCuotas = pagoPorCuotas;
		this.vigenciaCuota = vigenciaCuota;
		this.estadoPagoPorCuota = estadoPagoPorCuota;
		this.origenRegistroPago = origenRegistroPago;
		Id_Abonos = id_Abonos;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public Float getVlrAbono() {
		return VlrAbono;
	}

	public void setVlrAbono(Float vlrAbono) {
		VlrAbono = vlrAbono;
	}

	public String getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public Integer getAnoBanco() {
		return AnoBanco;
	}

	public void setAnoBanco(Integer anoBanco) {
		AnoBanco = anoBanco;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getF_Pago() {
		return F_Pago;
	}

	public void setF_Pago(String f_Pago) {
		F_Pago = f_Pago;
	}

	public String getUsuarioRegistroPago() {
		return UsuarioRegistroPago;
	}

	public void setUsuarioRegistroPago(String usuarioRegistroPago) {
		UsuarioRegistroPago = usuarioRegistroPago;
	}

	public String getNroComprobante() {
		return NroComprobante;
	}

	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}

	public String getFecha_Registro() {
		return Fecha_Registro;
	}

	public void setFecha_Registro(String fecha_Registro) {
		Fecha_Registro = fecha_Registro;
	}

	public String getNroAcuerdo() {
		return NroAcuerdo;
	}

	public void setNroAcuerdo(String nroAcuerdo) {
		NroAcuerdo = nroAcuerdo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Float getPorcCAr() {
		return PorcCAr;
	}

	public void setPorcCAr(Float porcCAr) {
		PorcCAr = porcCAr;
	}

	public Float getPorcImpuesto() {
		return PorcImpuesto;
	}

	public void setPorcImpuesto(Float porcImpuesto) {
		PorcImpuesto = porcImpuesto;
	}

	public Float getPorcInteresCAR() {
		return PorcInteresCAR;
	}

	public void setPorcInteresCAR(Float porcInteresCAR) {
		PorcInteresCAR = porcInteresCAR;
	}

	public Float getPorcInteresIMP() {
		return PorcInteresIMP;
	}

	public void setPorcInteresIMP(Float porcInteresIMP) {
		PorcInteresIMP = porcInteresIMP;
	}

	public Float getPorcOtros() {
		return PorcOtros;
	}

	public void setPorcOtros(Float porcOtros) {
		PorcOtros = porcOtros;
	}

	public Float getPorcSobretasa() {
		return PorcSobretasa;
	}

	public void setPorcSobretasa(Float porcSobretasa) {
		PorcSobretasa = porcSobretasa;
	}

	public String getF_presentacion() {
		return F_presentacion;
	}

	public void setF_presentacion(String f_presentacion) {
		F_presentacion = f_presentacion;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public String getFechaAbono() {
		return FechaAbono;
	}

	public void setFechaAbono(String fechaAbono) {
		FechaAbono = fechaAbono;
	}

	public Float getDeudaAFecha() {
		return DeudaAFecha;
	}

	public void setDeudaAFecha(Float deudaAFecha) {
		DeudaAFecha = deudaAFecha;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getPagoPorCuotas() {
		return pagoPorCuotas;
	}

	public void setPagoPorCuotas(Integer pagoPorCuotas) {
		this.pagoPorCuotas = pagoPorCuotas;
	}

	public Integer getVigenciaCuota() {
		return vigenciaCuota;
	}

	public void setVigenciaCuota(Integer vigenciaCuota) {
		this.vigenciaCuota = vigenciaCuota;
	}

	public String getEstadoPagoPorCuota() {
		return estadoPagoPorCuota;
	}

	public void setEstadoPagoPorCuota(String estadoPagoPorCuota) {
		this.estadoPagoPorCuota = estadoPagoPorCuota;
	}

	public boolean isOrigenRegistroPago() {
		return origenRegistroPago;
	}

	public void setOrigenRegistroPago(boolean origenRegistroPago) {
		this.origenRegistroPago = origenRegistroPago;
	}

	public Integer getId_Abonos() {
		return Id_Abonos;
	}

	public void setId_Abonos(Integer id_Abonos) {
		Id_Abonos = id_Abonos;
	}


    
}
