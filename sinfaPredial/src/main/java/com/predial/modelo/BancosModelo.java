package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;

@OrderDefault("Ano")
public class BancosModelo {
    @Size(since = -32768, until = 32767)
    @NotNull(update = false)
    @FormParam("Ano")
    private Integer Ano;
    @NotNull(update = false)
    @Size(since = 0 , until = 16)
    @FormParam("Codigo")
    private String Codigo;
    @Size(since = 0 , until = 13)
    @FormParam("nit")
    private String nit;
    @Size(since = 0 , until = 20)
    @FormParam("nombre")
    private String nombre;
    @Size(since = 0 , until = 60)
    @FormParam("cuenta_general")
    private String cuenta_general;
    @Size(since = 0 , until = 50)
    @FormParam("contacto")
    private String contacto;
    @Size(since = 0 , until = 50)
    @FormParam("cargo_contacto")
    private String cargo_contacto;
    @FormParam("detalle_diario")
    private boolean detalle_diario;
    @FormParam("Activo")
    private boolean Activo;
    @NotNull
    @Size(since = -32768, until = 32767)
    @FormParam("Asobancaria")
    private Integer Asobancaria;
    @Size(since = 0 , until = 2)
    @FormParam("TipoArchivo")
    private String TipoArchivo;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("CodigoBanco")
    private String CodigoBanco;
    @Size(since = 0 , until = 10)
    @FormParam("CodigoBancario")
    private String CodigoBancario;
    @Size(since = 0 , until = 10)
    @FormParam("SectorBancario")
    private String SectorBancario;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("TipoCta")
    private String TipoCta;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("CodigoInterfaz")
    private String CodigoInterfaz;
    @NotNull
    @Size(since = 0 , until = 2)
    @FormParam("Sector")
    private String Sector;
    @Size(since = 0 , until = 20)
    @FormParam("CodigoConvenio")
    private String CodigoConvenio;
    @FormParam("IndConciliarInt")
    private boolean IndConciliarInt;
    
    private Integer Id_Bancos;

	public BancosModelo(Integer ano, String codigo, String nit, String nombre, String cuenta_general, String contacto,
			String cargo_contacto, boolean detalle_diario, boolean activo, Integer asobancaria, String tipoArchivo,
			String codigoBanco, String codigoBancario, String sectorBancario, String tipoCta, String codigoInterfaz,
			String sector, String codigoConvenio, boolean indConciliarInt, Integer id_Bancos) {
		super();
		Ano = ano;
		Codigo = codigo;
		this.nit = nit;
		this.nombre = nombre;
		this.cuenta_general = cuenta_general;
		this.contacto = contacto;
		this.cargo_contacto = cargo_contacto;
		this.detalle_diario = detalle_diario;
		Activo = activo;
		Asobancaria = asobancaria;
		TipoArchivo = tipoArchivo;
		CodigoBanco = codigoBanco;
		CodigoBancario = codigoBancario;
		SectorBancario = sectorBancario;
		TipoCta = tipoCta;
		CodigoInterfaz = codigoInterfaz;
		Sector = sector;
		CodigoConvenio = codigoConvenio;
		IndConciliarInt = indConciliarInt;
		Id_Bancos = id_Bancos;
	}

	public BancosModelo() {
		super();
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta_general() {
		return cuenta_general;
	}

	public void setCuenta_general(String cuenta_general) {
		this.cuenta_general = cuenta_general;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getCargo_contacto() {
		return cargo_contacto;
	}

	public void setCargo_contacto(String cargo_contacto) {
		this.cargo_contacto = cargo_contacto;
	}

	public boolean isDetalle_diario() {
		return detalle_diario;
	}

	public void setDetalle_diario(boolean detalle_diario) {
		this.detalle_diario = detalle_diario;
	}

	public boolean isActivo() {
		return Activo;
	}

	public void setActivo(boolean activo) {
		Activo = activo;
	}

	public Integer getAsobancaria() {
		return Asobancaria;
	}

	public void setAsobancaria(Integer asobancaria) {
		Asobancaria = asobancaria;
	}

	public String getTipoArchivo() {
		return TipoArchivo;
	}

	public void setTipoArchivo(String tipoArchivo) {
		TipoArchivo = tipoArchivo;
	}

	public String getCodigoBanco() {
		return CodigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		CodigoBanco = codigoBanco;
	}

	public String getCodigoBancario() {
		return CodigoBancario;
	}

	public void setCodigoBancario(String codigoBancario) {
		CodigoBancario = codigoBancario;
	}

	public String getSectorBancario() {
		return SectorBancario;
	}

	public void setSectorBancario(String sectorBancario) {
		SectorBancario = sectorBancario;
	}

	public String getTipoCta() {
		return TipoCta;
	}

	public void setTipoCta(String tipoCta) {
		TipoCta = tipoCta;
	}

	public String getCodigoInterfaz() {
		return CodigoInterfaz;
	}

	public void setCodigoInterfaz(String codigoInterfaz) {
		CodigoInterfaz = codigoInterfaz;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getCodigoConvenio() {
		return CodigoConvenio;
	}

	public void setCodigoConvenio(String codigoConvenio) {
		CodigoConvenio = codigoConvenio;
	}

	public boolean isIndConciliarInt() {
		return IndConciliarInt;
	}

	public void setIndConciliarInt(boolean indConciliarInt) {
		IndConciliarInt = indConciliarInt;
	}

	public Integer getId_Bancos() {
		return Id_Bancos;
	}

	public void setId_Bancos(Integer id_Bancos) {
		Id_Bancos = id_Bancos;
	}
    
}
