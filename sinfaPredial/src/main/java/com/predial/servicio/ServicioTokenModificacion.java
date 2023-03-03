package com.predial.servicio;


import java.awt.Image;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.ImageIcon;

import com.predial.repositorio.GeneradoresRepositorio;



public class ServicioTokenModificacion implements GeneradoresRepositorio{
	
	public void crearToken() throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException{
		String token = this.generarToken();
		String[] imagenes = {"D:/imagenes/logo1.png","D:/imagenes/facebook2x.png","D:/imagenes/twitter2x.png","D:/imagenes/instagram2x.png","D:/imagenes/linkedin2x.png","D:/imagenes/bee.png"};
		this.sendMail("andres.olmos@sinfa.com.co", "token de modificación", this.emailContent(token),imagenes);
		System.out.println(this.convertirSHA256(token,"sak"));
	}
	
}
