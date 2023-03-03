package com.predial.modelo;


import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataParam;

import com.predial.anotacion.NotNull;
import com.predial.anotacion.OrderDefault;
import com.predial.anotacion.Size;

@OrderDefault("Id_images")
public class ImagesModelo {
	@FormDataParam("File")
	private FormDataBodyPart File;
//    @Size(since = 0 , until = 255)
//    @NotNull
//    @FormDataParam("File")
    private String Patch;
    @Size(since = 0 , until = 50)
    @NotNull
    @FormDataParam("TableFather")
    private String TableFather;
    @NotNull
    @FormDataParam("TableFatherId")
    private Integer TableFatherId;
    @Size(since = 0 , until = 80)
    @NotNull
    @FormDataParam("Descripcion")
    private String Descripcion;

    private Integer Id_images;

	public ImagesModelo() {
		super();
	}
	
	@Override
	public String toString() {
		return "ImagesModelo [File=" + File + ", Patch=" + Patch + ", TableFather=" + TableFather + ", TableFatherId="
				+ TableFatherId + ", Descripcion=" + Descripcion + ", Id_images=" + Id_images + "]";
	}



	public ImagesModelo(FormDataBodyPart file, String patch, String tableFather, Integer tableFatherId, String descripcion,
			Integer id_images) {
		super();
		File = file;
		Patch = patch;
		TableFather = tableFather;
		TableFatherId = tableFatherId;
		Descripcion = descripcion;
		Id_images = id_images;
	}



	public FormDataBodyPart getFile() {
		return File;
	}



	public void setFile(FormDataBodyPart file) {
		File = file;
	}



	public String getPatch() {
		return Patch;
	}



	public void setPatch(String patch) {
		Patch = patch;
	}



	public String getTableFather() {
		return TableFather;
	}

	public void setTableFather(String tableFather) {
		TableFather = tableFather;
	}

	public Integer getTableFatherId() {
		return TableFatherId;
	}

	public void setTableFatherId(Integer tableFatherId) {
		TableFatherId = tableFatherId;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getId_images() {
		return Id_images;
	}

	public void setId_images(Integer id_images) {
		Id_images = id_images;
	}
    
    
}
