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



public class tokenModificacionServicio implements GeneradoresRepositorio{
	
	public void crearToken() throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException{
		String token = this.generarToken();
		this.sendMail("andres.olmos@sinfa.com.co", "hola", "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <style>\r\n"
				+ "        *{\r\n"
				+ "            margin: 0px 0px;\r\n"
				+ "        }\r\n"
				+ "        .all{\r\n"
				+ "            position: fixed;\r\n"
				+ "            width: 100%;\r\n"
				+ "            height: 100%;\r\n"
				+ "        }\r\n"
				+ "        .header{\r\n"
				+ "            display: table-cell;\r\n"
				+ "            height: 6vh;\r\n"
				+ "            width: 50vw;\r\n"
				+ "            background-color: #b3b3b3;\r\n"
				+ "            vertical-align: middle;\r\n"
				+ "            font-size: 18px;\r\n"
				+ "            color: white;\r\n"
				+ "        }\r\n"
				+ "        .body{\r\n"
				+ "            background: #fafafa;\r\n"
				+ "            width: 50vw;\r\n"
				+ "            font-size: 21px;\r\n"
				+ "            align-items: center;\r\n"
				+ "            color: #1c1c1caf;\r\n"
				+ "        }\r\n"
				+ "        .token{\r\n"
				+ "            background-color: #b3b3b3;\r\n"
				+ "            height: 6vh;\r\n"
				+ "            width: 30vw;\r\n"
				+ "            color: white;\r\n"
				+ "            display: table-cell;\r\n"
				+ "            text-align: center;\r\n"
				+ "            background-color: #b3b3b3ae;\r\n"
				+ "            vertical-align: middle;\r\n"
				+ "            font-size: 16px;\r\n"
				+ "            color: white;\r\n"
				+ "        }\r\n"
				+ "        .footer{\r\n"
				+ "            \r\n"
				+ "            height: 15vh;\r\n"
				+ "            width: 50vw;\r\n"
				+ "            background-color: #b3b3b3;\r\n"
				+ "        }\r\n"
				+ "        .foteterA{\r\n"
				+ "            float: left;\r\n"
				+ "            width: 20vw;\r\n"
				+ "            height: 100%;\r\n"
				+ "        }\r\n"
				+ "        .foteterA div{\r\n"
				+ "            margin: 2.8vh 0vw;\r\n"
				+ "        }\r\n"
				+ "        .foteterA div img{\r\n"
//				+ "            width: 16vw;\r\n"
				+ "            height: 7.2vh;\r\n"
				+ "        }\r\n"
				+ "        .foteterB{\r\n"
				+ "            margin: 1vh 1vw;\r\n"
				+ "            float: right;\r\n"
				+ "            width: 28vw;\r\n"
				+ "            height: 13vh;\r\n"
				+ "            color: white;\r\n"
				+ "        }\r\n"
				+ "        .foteterB a{\r\n"
				+ "            color: white;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div  class=\"all\" >\r\n"
				+ "        <center>\r\n"
				+ "        <div class=\"header\">\r\n"
				+ "            <h1> Codigo de modificación </h1>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"body\">\r\n"
				+ "            <br>\r\n"
				+ "            <p> Su token de modificaión es: </p>\r\n"
				+ "            <br>\r\n"
				+ "            <div class=\"token\">\r\n"
				+ "                <h1>"+token+"</h1>\r\n"
				+ "            </div>\r\n"
				+ "            <br>\r\n"
				+ "            <p>Este token le servira para modificar las tarifas y los avaluos aplicativo en el Sinfa Predial</p>\r\n"
				+ "            <p>por favor introuzca este token en la zona requerida por el aplicativo</p>\r\n"
				+ "            <br>\r\n"
				+ "        </div>\r\n"
				+ "          <div class=\"footer\">\r\n"
				+ "            \r\n"
				+ "            <div class=\"foteterA\">\r\n"
				+ "                <div>\r\n"
				+ "                <img src=\"cid:image\" alt=\"\">\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"foteterB\">\r\n"
				+ "                <div>\r\n"
				+ "                <p>Recuerde que en Sinfa estamos para ayudarlo, si tiene problemas por favor comuniquese a</p>\r\n"
				+ "                <br>\r\n"
				+ "                <p>Telefono: 3994567894</p>\r\n"
				+ "                <p>Correo: <a href=\"mailto:soportex@sinfa.com.co\">soportex@sinfa.com.co</a></p>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "        </center>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		System.out.println(this.convertirSHA256(token,"sak"));
	}
	
}
