package com.predial.modelo;
import com.predial.anotacion.DateFormat;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Compania")
public class PlanaInterfaceFacSerModelo {
    @Size(since = 0 , until = 11)
    @FormParam("Compania")
    @NotNull(update = false)
    private String Compania;
    @Size(since = 0 , until = 10)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 3)
    @FormParam("Tipo_cpte")
    @NotNull(update = false)
    private String Tipo_cpte;
    @FormParam("Comprobante")
    @NotNull(update = false)
    private Float Comprobante;
    @Size(since = 0 , until = 10)
    @FormParam("Consecutivo")
    @NotNull(update = false)
    private Integer Consecutivo;
    @Size(since = 0 , until = 60)
    @FormParam("Cuenta")
    private String Cuenta;
    @Size(since = 0 , until = 16)
    @FormParam("Codigo_cuenta")
    private String Codigo_cuenta;
    @DateFormat
    @FormParam("fecha")
    private String fecha;
    @Size(since = 0 , until = 1)
    @FormParam("Naturaleza")
    private String Naturaleza;
    @Size(since = 0 , until = 80)
    @FormParam("Codigo_pptal")
    private String Codigo_pptal;
    @Size(since = 0 , until = 3)
    @FormParam("TipoPptal")
    private String TipoPptal;
    @FormParam("NumeroPptal")
    private Float NumeroPptal;
    @Size(since = 0 , until = 80)
    @FormParam("CuentaPptal")
    private String CuentaPptal;
    @Size(since = 0 , until = 60)
    @FormParam("Descripcion")
    private String Descripcion;
    @FormParam("Valor_debito")
    private Float Valor_debito;
    @FormParam("Valor_credito")
    private Float Valor_credito;
    @FormParam("Debito_Equiv")
    private Float Debito_Equiv;
    @FormParam("Credito_Equiv")
    private Float Credito_Equiv;
    @FormParam("Ejecucion_debito")
    private Float Ejecucion_debito;
    @FormParam("Ejecucion_credito")
    private Float Ejecucion_credito;
    @FormParam("Base_gravable")
    private Float Base_gravable;
    @Size(since = 0 , until = 3)
    @FormParam("Tipo_documento")
    private String Tipo_documento;
    @Size(since = 0 , until = 30)
    @FormParam("Nro_documento")
    private String Nro_documento;
    @Size(since = 0 , until = 10)
    @FormParam("Centro_costo")
    private String Centro_costo;
    @Size(since = 0 , until = 11)
    @FormParam("Tercero")
    private String Tercero;
    @Size(since = 0 , until = 3)
    @FormParam("Sucursal")
    private String Sucursal;
    @Size(since = 0 , until = 16)
    @FormParam("Auxiliar")
    private String Auxiliar;
    @Size(since = 0 , until = 3)
    @FormParam("Tipo_cpte_afect")
    private String Tipo_cpte_afect;
    @FormParam("Cmpte_afectado")
    private Float Cmpte_afectado;
    @FormParam("Reg_retefuente")
    private boolean Reg_retefuente;
    @FormParam("Reg_reteica")
    private boolean Reg_reteica;
    @FormParam("Reg_retetbr")
    private boolean Reg_retetbr;
    @FormParam("Reg_reteiva")
    private boolean Reg_reteiva;
    @FormParam("Reg_retepro")
    private boolean Reg_retepro;
    @Size(since = 0 , until = 20)
    @FormParam("ChequeParaAnular")
    private String ChequeParaAnular;
    @Size(since = 0 , until = 3)
    @FormParam("Moneda")
    private String Moneda;
    @FormParam("Cierre")
    private boolean Cierre;
    @FormParam("Base_IVA")
    private Float Base_IVA;
    @FormParam("PagadoBanco")
    private boolean PagadoBanco;
    @FormParam("DisAfectada")
    private Float DisAfectada;
    @FormParam("ConsecutivoPpto")
    private Float ConsecutivoPpto;
    @DateFormat
    private String Hora;
    @Size(since = 0 , until = 3)
    @FormParam("CodigoRetencion")
    private String CodigoRetencion;
    @FormParam("Saldo_Acumulado")
    private Float Saldo_Acumulado;
    @FormParam("Cantidad")
    private Float Cantidad;
    @Size(since = 0 , until = 6)
    @FormParam("PerConciliacion")
    private String PerConciliacion;
    
    private Integer Id_PlanaInterfaceFacSer;

	public PlanaInterfaceFacSerModelo() {
		super();
	}

	public PlanaInterfaceFacSerModelo(String compania, Integer ano, String tipo_cpte, Float comprobante,
			Integer consecutivo, String cuenta, String codigo_cuenta, String fecha, String naturaleza,
			String codigo_pptal, String tipoPptal, Float numeroPptal, String cuentaPptal, String descripcion,
			Float valor_debito, Float valor_credito, Float debito_Equiv, Float credito_Equiv, Float ejecucion_debito,
			Float ejecucion_credito, Float base_gravable, String tipo_documento, String nro_documento,
			String centro_costo, String tercero, String sucursal, String auxiliar, String tipo_cpte_afect,
			Float cmpte_afectado, boolean reg_retefuente, boolean reg_reteica, boolean reg_retetbr, boolean reg_reteiva,
			boolean reg_retepro, String chequeParaAnular, String moneda, boolean cierre, Float base_IVA,
			boolean pagadoBanco, Float disAfectada, Float consecutivoPpto, String hora, String codigoRetencion,
			Float saldo_Acumulado, Float cantidad, String perConciliacion, Integer id_PlanaInterfaceFacSer) {
		super();
		Compania = compania;
		Ano = ano;
		Tipo_cpte = tipo_cpte;
		Comprobante = comprobante;
		Consecutivo = consecutivo;
		Cuenta = cuenta;
		Codigo_cuenta = codigo_cuenta;
		this.fecha = fecha;
		Naturaleza = naturaleza;
		Codigo_pptal = codigo_pptal;
		TipoPptal = tipoPptal;
		NumeroPptal = numeroPptal;
		CuentaPptal = cuentaPptal;
		Descripcion = descripcion;
		Valor_debito = valor_debito;
		Valor_credito = valor_credito;
		Debito_Equiv = debito_Equiv;
		Credito_Equiv = credito_Equiv;
		Ejecucion_debito = ejecucion_debito;
		Ejecucion_credito = ejecucion_credito;
		Base_gravable = base_gravable;
		Tipo_documento = tipo_documento;
		Nro_documento = nro_documento;
		Centro_costo = centro_costo;
		Tercero = tercero;
		Sucursal = sucursal;
		Auxiliar = auxiliar;
		Tipo_cpte_afect = tipo_cpte_afect;
		Cmpte_afectado = cmpte_afectado;
		Reg_retefuente = reg_retefuente;
		Reg_reteica = reg_reteica;
		Reg_retetbr = reg_retetbr;
		Reg_reteiva = reg_reteiva;
		Reg_retepro = reg_retepro;
		ChequeParaAnular = chequeParaAnular;
		Moneda = moneda;
		Cierre = cierre;
		Base_IVA = base_IVA;
		PagadoBanco = pagadoBanco;
		DisAfectada = disAfectada;
		ConsecutivoPpto = consecutivoPpto;
		Hora = hora;
		CodigoRetencion = codigoRetencion;
		Saldo_Acumulado = saldo_Acumulado;
		Cantidad = cantidad;
		PerConciliacion = perConciliacion;
		Id_PlanaInterfaceFacSer = id_PlanaInterfaceFacSer;
	}

	public String getCompania() {
		return Compania;
	}

	public void setCompania(String compania) {
		Compania = compania;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getTipo_cpte() {
		return Tipo_cpte;
	}

	public void setTipo_cpte(String tipo_cpte) {
		Tipo_cpte = tipo_cpte;
	}

	public Float getComprobante() {
		return Comprobante;
	}

	public void setComprobante(Float comprobante) {
		Comprobante = comprobante;
	}

	public Integer getConsecutivo() {
		return Consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		Consecutivo = consecutivo;
	}

	public String getCuenta() {
		return Cuenta;
	}

	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}

	public String getCodigo_cuenta() {
		return Codigo_cuenta;
	}

	public void setCodigo_cuenta(String codigo_cuenta) {
		Codigo_cuenta = codigo_cuenta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNaturaleza() {
		return Naturaleza;
	}

	public void setNaturaleza(String naturaleza) {
		Naturaleza = naturaleza;
	}

	public String getCodigo_pptal() {
		return Codigo_pptal;
	}

	public void setCodigo_pptal(String codigo_pptal) {
		Codigo_pptal = codigo_pptal;
	}

	public String getTipoPptal() {
		return TipoPptal;
	}

	public void setTipoPptal(String tipoPptal) {
		TipoPptal = tipoPptal;
	}

	public Float getNumeroPptal() {
		return NumeroPptal;
	}

	public void setNumeroPptal(Float numeroPptal) {
		NumeroPptal = numeroPptal;
	}

	public String getCuentaPptal() {
		return CuentaPptal;
	}

	public void setCuentaPptal(String cuentaPptal) {
		CuentaPptal = cuentaPptal;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Float getValor_debito() {
		return Valor_debito;
	}

	public void setValor_debito(Float valor_debito) {
		Valor_debito = valor_debito;
	}

	public Float getValor_credito() {
		return Valor_credito;
	}

	public void setValor_credito(Float valor_credito) {
		Valor_credito = valor_credito;
	}

	public Float getDebito_Equiv() {
		return Debito_Equiv;
	}

	public void setDebito_Equiv(Float debito_Equiv) {
		Debito_Equiv = debito_Equiv;
	}

	public Float getCredito_Equiv() {
		return Credito_Equiv;
	}

	public void setCredito_Equiv(Float credito_Equiv) {
		Credito_Equiv = credito_Equiv;
	}

	public Float getEjecucion_debito() {
		return Ejecucion_debito;
	}

	public void setEjecucion_debito(Float ejecucion_debito) {
		Ejecucion_debito = ejecucion_debito;
	}

	public Float getEjecucion_credito() {
		return Ejecucion_credito;
	}

	public void setEjecucion_credito(Float ejecucion_credito) {
		Ejecucion_credito = ejecucion_credito;
	}

	public Float getBase_gravable() {
		return Base_gravable;
	}

	public void setBase_gravable(Float base_gravable) {
		Base_gravable = base_gravable;
	}

	public String getTipo_documento() {
		return Tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		Tipo_documento = tipo_documento;
	}

	public String getNro_documento() {
		return Nro_documento;
	}

	public void setNro_documento(String nro_documento) {
		Nro_documento = nro_documento;
	}

	public String getCentro_costo() {
		return Centro_costo;
	}

	public void setCentro_costo(String centro_costo) {
		Centro_costo = centro_costo;
	}

	public String getTercero() {
		return Tercero;
	}

	public void setTercero(String tercero) {
		Tercero = tercero;
	}

	public String getSucursal() {
		return Sucursal;
	}

	public void setSucursal(String sucursal) {
		Sucursal = sucursal;
	}

	public String getAuxiliar() {
		return Auxiliar;
	}

	public void setAuxiliar(String auxiliar) {
		Auxiliar = auxiliar;
	}

	public String getTipo_cpte_afect() {
		return Tipo_cpte_afect;
	}

	public void setTipo_cpte_afect(String tipo_cpte_afect) {
		Tipo_cpte_afect = tipo_cpte_afect;
	}

	public Float getCmpte_afectado() {
		return Cmpte_afectado;
	}

	public void setCmpte_afectado(Float cmpte_afectado) {
		Cmpte_afectado = cmpte_afectado;
	}

	public boolean isReg_retefuente() {
		return Reg_retefuente;
	}

	public void setReg_retefuente(boolean reg_retefuente) {
		Reg_retefuente = reg_retefuente;
	}

	public boolean isReg_reteica() {
		return Reg_reteica;
	}

	public void setReg_reteica(boolean reg_reteica) {
		Reg_reteica = reg_reteica;
	}

	public boolean isReg_retetbr() {
		return Reg_retetbr;
	}

	public void setReg_retetbr(boolean reg_retetbr) {
		Reg_retetbr = reg_retetbr;
	}

	public boolean isReg_reteiva() {
		return Reg_reteiva;
	}

	public void setReg_reteiva(boolean reg_reteiva) {
		Reg_reteiva = reg_reteiva;
	}

	public boolean isReg_retepro() {
		return Reg_retepro;
	}

	public void setReg_retepro(boolean reg_retepro) {
		Reg_retepro = reg_retepro;
	}

	public String getChequeParaAnular() {
		return ChequeParaAnular;
	}

	public void setChequeParaAnular(String chequeParaAnular) {
		ChequeParaAnular = chequeParaAnular;
	}

	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
	}

	public boolean isCierre() {
		return Cierre;
	}

	public void setCierre(boolean cierre) {
		Cierre = cierre;
	}

	public Float getBase_IVA() {
		return Base_IVA;
	}

	public void setBase_IVA(Float base_IVA) {
		Base_IVA = base_IVA;
	}

	public boolean isPagadoBanco() {
		return PagadoBanco;
	}

	public void setPagadoBanco(boolean pagadoBanco) {
		PagadoBanco = pagadoBanco;
	}

	public Float getDisAfectada() {
		return DisAfectada;
	}

	public void setDisAfectada(Float disAfectada) {
		DisAfectada = disAfectada;
	}

	public Float getConsecutivoPpto() {
		return ConsecutivoPpto;
	}

	public void setConsecutivoPpto(Float consecutivoPpto) {
		ConsecutivoPpto = consecutivoPpto;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getCodigoRetencion() {
		return CodigoRetencion;
	}

	public void setCodigoRetencion(String codigoRetencion) {
		CodigoRetencion = codigoRetencion;
	}

	public Float getSaldo_Acumulado() {
		return Saldo_Acumulado;
	}

	public void setSaldo_Acumulado(Float saldo_Acumulado) {
		Saldo_Acumulado = saldo_Acumulado;
	}

	public Float getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Float cantidad) {
		Cantidad = cantidad;
	}

	public String getPerConciliacion() {
		return PerConciliacion;
	}

	public void setPerConciliacion(String perConciliacion) {
		PerConciliacion = perConciliacion;
	}

	public Integer getId_PlanaInterfaceFacSer() {
		return Id_PlanaInterfaceFacSer;
	}

	public void setId_PlanaInterfaceFacSer(Integer id_PlanaInterfaceFacSer) {
		Id_PlanaInterfaceFacSer = id_PlanaInterfaceFacSer;
	}
    
    
}
