package com.predial.repositorio;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import com.google.common.hash.Hashing;

import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.Authenticator;
import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public interface GeneradoresRepositorio {
	public default void sendMail(String to,String subject,String content){
	     final String username = "andresolmos2784@gmail.com";
	     final String password = "ikkwrbbdwuyywemv";
	       
	Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	Matcher mather = pattern.matcher(to);
	if(mather.find() == true) { 
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
				}
				};
	Properties prop = new Properties();
	prop.put("mail.smtp.host", "smtp.gmail.com");
	prop.put("mail.smtp.port", "465");
	prop.put("mail.smtp.auth", "true");
	prop.put("mail.smtp.socketFactory.port", "465");
	prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	Session session = Session.getInstance(prop,auth);
	 
	        try {
	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(username));
	        message.setRecipients(
	             Message.RecipientType.TO,
	             InternetAddress.parse(to)
	        );
	        message.setSubject(subject);
	        MimeMultipart multipart = new MimeMultipart("related");
	        
	        BodyPart messageBodyPart = new MimeBodyPart();
	        messageBodyPart.setContent(content, "text/html");
	        multipart.addBodyPart(messageBodyPart);
	        
	        messageBodyPart = new MimeBodyPart();
	        DataSource fds = new FileDataSource("D:/logo1.png");
	        
	        messageBodyPart.setDataHandler(new DataHandler(fds));
	        messageBodyPart.setHeader("Content-ID", "<image>");
	        
	        multipart.addBodyPart(messageBodyPart);
	        
	        message.setContent(multipart);
	        Transport.send(message);
	        System.out.println("enviado");
	        } catch (MessagingException e) {
	        e.printStackTrace();

	        }
	}else {
		System.out.println("no enviado");
	} 
	}
	
	
	public default String generarToken() {
		String token =  String.valueOf(((int) (Math.random() * 1000000)));
		return token;
	}
	
	public default String convertirSHA256(String text ,String salt) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		System.out.println(text + "hola");
		String password = "fulano";
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);
	    SecretKey secret = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
	    
	    byte[] iv = new byte[16];
	    new SecureRandom().nextBytes(iv);
	    IvParameterSpec IvparameterSpec= new IvParameterSpec(iv);
	    
	    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    cipher.init(Cipher.ENCRYPT_MODE, secret, IvparameterSpec);
	    byte[] cipherText = cipher.doFinal(text.getBytes());
	    System.out.println(cipherText);
	    
	    return Hashing.sha256().hashString(cipherText.toString(), StandardCharsets.UTF_8).toString();
	    
//	    return Base64.getEncoder()
//	        .encodeToString(cipherText);
}
}
