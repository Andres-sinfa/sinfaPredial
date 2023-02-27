package com.predial.modelo;
import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;
import jakarta.ws.rs.FormParam;
@OrderDefault("Ano")
public class IGAC_CamModelo {
    @Size(since = -32768, until = 32767)
    @FormParam("Ano")
    @NotNull(update = false)
    private Integer Ano;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoCancelado")
    @NotNull(update = false)
    private String CodigoCancelado;
    @Size(since = 0 , until = 30)
    @FormParam("CodigoIncorporado")
    private String CodigoIncorporado;
    
    private Integer Id_IGAC_Cam;

	public IGAC_CamModelo() {
		super();
	}

	public IGAC_CamModelo(Integer ano, String codigoCancelado, String codigoIncorporado, Integer id_IGAC_Cam) {
		super();
		Ano = ano;
		CodigoCancelado = codigoCancelado;
		CodigoIncorporado = codigoIncorporado;
		Id_IGAC_Cam = id_IGAC_Cam;
	}

	public Integer getAno() {
		return Ano;
	}

	public void setAno(Integer ano) {
		Ano = ano;
	}

	public String getCodigoCancelado() {
		return CodigoCancelado;
	}

	public void setCodigoCancelado(String codigoCancelado) {
		CodigoCancelado = codigoCancelado;
	}

	public String getCodigoIncorporado() {
		return CodigoIncorporado;
	}

	public void setCodigoIncorporado(String codigoIncorporado) {
		CodigoIncorporado = codigoIncorporado;
	}

	public Integer getId_IGAC_Cam() {
		return Id_IGAC_Cam;
	}

	public void setId_IGAC_Cam(Integer id_IGAC_Cam) {
		Id_IGAC_Cam = id_IGAC_Cam;
	}
    
}
