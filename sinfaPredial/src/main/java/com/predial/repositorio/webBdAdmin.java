package com.predial.repositorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;


import com.predial.ModelosRetorno.ConexionModelo;
import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.conexion.ConBd;
import com.predial.configuracion.Modulo;

import jakarta.ws.rs.container.ContainerRequestContext;
import util2.sinfa.seguridad.keys;

public interface webBdAdmin extends  GeneradoresRepositorio{
	ConBd conexionNueva = new ConBd();
	keys key = new keys();
	RetornoMostrable RetornoModelo = new RetornoMostrable();
	
	public default RetornoMostrable update(ContainerRequestContext httpHeaders) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String authHeader = httpHeaders.getHeaderString(Modulo.HEADER_AUTHORIZATION).replace("Bearer ", "");
		ConexionModelo Conexionmodelo = conexionNueva.conectar();
		Connection con = Conexionmodelo.getConAdmin();
		String update = "UPDATE mod000_token SET CodigoModificar = ? WHERE token = ?;";
		try{
			String[] token =  this.generarToken();
			String tokeneje = token[0] +"-"+token[1]+"-"+ token[2];
			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(1, key.encrypt(tokeneje));
			ps.setString(2, authHeader);
			if(ps.executeUpdate() == 0) {
				RetornoModelo.setData(false);
				RetornoModelo.setMensaje("No se logro crear");
				RetornoModelo.setStatus(500);
				RetornoModelo.setId(null);
				conexionNueva.desconectar();
				return RetornoModelo;
			}
			String[] imagenes = {"D:/imagenes/logo1.png","D:/imagenes/facebook2x.png","D:/imagenes/twitter2x.png","D:/imagenes/instagram2x.png","D:/imagenes/linkedin2x.png","D:/imagenes/bee.png"};
			String correo ="";
			String select = "select mod000_administradores.correo from mod000_administradores inner \r\n"
					+ "join mod000_token on mod000_token.usuario = mod000_administradores.usuario where mod000_token.token = ?;";
			PreparedStatement pstwo = con.prepareStatement(select);
			pstwo.setString(1, authHeader);
			ResultSet rs = pstwo.executeQuery();
			while(rs.next()) {
				correo = rs.getString(1);
			}
			this.sendMail(correo, "token de modificación", this.emailContent(token[0]) , imagenes);
			RetornoModelo.setMensaje("Creado correctamente");
			RetornoModelo.setData(true);
			RetornoModelo.setStatus(200);
			RetornoModelo.setId(null);
			conexionNueva.desconectar();
			return RetornoModelo;
			}
		catch(Exception e) {
			System.err.println(e);
			RetornoModelo.setData(false);
			RetornoModelo.setMensaje(e);
			RetornoModelo.setStatus(500);
			RetornoModelo.setId(null);
			conexionNueva.desconectar();
			return RetornoModelo;
		}

	}
	
	public default RetornoMostrable validate(ContainerRequestContext httpHeaders,String TokenModificar) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		String TpkenSqlM = "";
		String authHeader = httpHeaders.getHeaderString(Modulo.HEADER_AUTHORIZATION).replace("Bearer ", "");
		ConexionModelo Conexionmodelo = conexionNueva.conectar();
		Connection con = Conexionmodelo.getConAdmin();
		String Select = "select CodigoModificar from mod000_token where token = ? ";
		PreparedStatement ps = con.prepareStatement(Select);
		ps.setString(1, authHeader);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			TpkenSqlM = rs.getString("CodigoModificar");
		}
		TpkenSqlM = key.decrypt(TpkenSqlM);
		String[] TpkenSqlMSplit =TpkenSqlM.split("-");
		 DateTimeFormatter DATE_FORMAT =  
	            new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy[ [HH][:mm][:ss][.SSS]]")
	            .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
	            .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
	            .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
	            .toFormatter(); 

		String inicio = TpkenSqlMSplit[1];
		String expiracion = TpkenSqlMSplit[2];
		LocalDateTime FechaInicio = LocalDateTime.parse(inicio, DATE_FORMAT);
		LocalDateTime Fechaexpiracion = LocalDateTime.parse(expiracion, DATE_FORMAT);
		if(TpkenSqlMSplit[0].equals(TokenModificar)) {
			if(FechaInicio.isBefore(LocalDateTime.now()) && Fechaexpiracion.isAfter(LocalDateTime.now())) {
				RetornoModelo.setMensaje("verificado correctamente");
				RetornoModelo.setData(true);
				RetornoModelo.setStatus(200);
				RetornoModelo.setId(null);
				conexionNueva.desconectar();
				return RetornoModelo;
			}else {
				RetornoModelo.setMensaje("el codigo expiro");
				RetornoModelo.setData(false);
				RetornoModelo.setStatus(406);
				RetornoModelo.setId(null);
				conexionNueva.desconectar();
				return RetornoModelo;
			}
//			return true;
		}else {
			RetornoModelo.setMensaje("el codigo no coincide");
			RetornoModelo.setData(false);
			RetornoModelo.setStatus(406);
			RetornoModelo.setId(null);
			conexionNueva.desconectar();
			return RetornoModelo;
//			return false;
		}
		
	} 
	
}
