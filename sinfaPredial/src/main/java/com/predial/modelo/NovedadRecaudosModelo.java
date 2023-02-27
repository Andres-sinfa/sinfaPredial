package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Banco")
public class NovedadRecaudosModelo {
    @Size(since = 0 , until = 16)
    @FormParam("Banco")
    @NotNull(update = false)
    private String Banco;
    @DateFormat
    @FormParam("F_pago")
    @NotNull(update = false)
    private String F_pago;
    @Size(since = 0 , until = 15)
    @FormParam("Factura")
    @NotNull(update = false)
    private String Factura;
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    private Integer Registro;
    @Size(since = 0 , until = 50)
    @FormParam("Descripcion")
    private String Descripcion;
    @FormParam("ValorReportado")
    @NotNull
    private Float ValorReportado;
    @FormParam("ValorFactura")
    @NotNull
    private Float ValorFactura;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCatastral")
    @NotNull
    private String CodigoCatastral;
    @Size(since = 0 , until = 30)
    @FormParam("CodUnicoCatastral")
    private String CodUnicoCatastral;
    
    private Integer Id_NovedadRecaudos;

	public NovedadRecaudosModelo(String banco, String f_pago, String factura, Integer registro, String descripcion,
			Float valorReportado, Float valorFactura, String codigoCatastral, String codUnicoCatastral,
			Integer id_NovedadRecaudos) {
		super();
		Banco = banco;
		F_pago = f_pago;
		Factura = factura;
		Registro = registro;
		Descripcion = descripcion;
		ValorReportado = valorReportado;
		ValorFactura = valorFactura;
		CodigoCatastral = codigoCatastral;
		CodUnicoCatastral = codUnicoCatastral;
		Id_NovedadRecaudos = id_NovedadRecaudos;
	}

	public NovedadRecaudosModelo() {
		super();
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getF_pago() {
		return F_pago;
	}

	public void setF_pago(String f_pago) {
		F_pago = f_pago;
	}

	public String getFactura() {
		return Factura;
	}

	public void setFactura(String factura) {
		Factura = factura;
	}

	public Integer getRegistro() {
		return Registro;
	}

	public void setRegistro(Integer registro) {
		Registro = registro;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Float getValorReportado() {
		return ValorReportado;
	}

	public void setValorReportado(Float valorReportado) {
		ValorReportado = valorReportado;
	}

	public Float getValorFactura() {
		return ValorFactura;
	}

	public void setValorFactura(Float valorFactura) {
		ValorFactura = valorFactura;
	}

	public String getCodigoCatastral() {
		return CodigoCatastral;
	}

	public void setCodigoCatastral(String codigoCatastral) {
		CodigoCatastral = codigoCatastral;
	}

	public String getCodUnicoCatastral() {
		return CodUnicoCatastral;
	}

	public void setCodUnicoCatastral(String codUnicoCatastral) {
		CodUnicoCatastral = codUnicoCatastral;
	}

	public Integer getId_NovedadRecaudos() {
		return Id_NovedadRecaudos;
	}

	public void setId_NovedadRecaudos(Integer id_NovedadRecaudos) {
		Id_NovedadRecaudos = id_NovedadRecaudos;
	}
    
}
