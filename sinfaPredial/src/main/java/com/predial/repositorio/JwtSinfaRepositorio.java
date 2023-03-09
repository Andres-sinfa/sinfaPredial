package com.predial.repositorio;

import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

import com.predial.ModelosRetorno.ConexionModelo;
import com.predial.ModelosRetorno.JwtSinfaModelo;
import com.predial.ModelosRetorno.RetornoMostrable;
import com.predial.conexion.ConBd;
import com.predial.configuracion.Modulo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.ws.rs.container.ContainerRequestContext;
import util2.sinfa.seguridad.keys;
import utilAdmin.sinfa.webBdAdmin.DAO.Mod000_token;

public interface JwtSinfaRepositorio {
RetornoMostrable RetornoModelo = new RetornoMostrable();

	public static String getToken() {
		 JwtSinfaModelo jwtmodelo = new JwtSinfaModelo();	
	        System.out.println(jwtmodelo.getNombreUsuario());
	        String jwtRes = "";
	        Instant now = Instant.now();
	        keys seg = new keys();
	        byte[] keyBytes = JwtSinfaModelo.getSecret().getBytes(StandardCharsets.UTF_8);
//	        System.out.println(JwtSinfaModelo.getSecret());
//	        System.out.println(Decoders.BASE64.decode(JwtSinfaModelo.getSecret()));
//	        System.out.println(Encoders.BASE64.encode(JwtSinfaModelo.getSecret().getBytes()));
//	        System.out.println(Keys.hmacShaKeyFor(keyBytes));
			jwtRes = Jwts.builder()
	                .claim("nombreUsuario", jwtmodelo.getNombreUsuario())
	                .claim("id", seg.encryptIdUsuario(jwtmodelo.getIdUsuario()))
	                .claim("ultimoIngreso", new Date())
	                .setHeaderParam("typ", "JWT")
	                .setId(jwtmodelo.getId())
	                .setIssuer(jwtmodelo.getIssuer())
	                .setIssuedAt(Date.from(now))
	                .setExpiration(Date.from(now.plus(1, ChronoUnit.DAYS)))
	                .signWith( Keys.hmacShaKeyFor(keyBytes) , SignatureAlgorithm.HS256 )
	                .compact();
	        return jwtRes;
	    }

	    public static String getTokenRecuperar() {
	    	JwtSinfaModelo jwtmodelo = new JwtSinfaModelo();	
	        String jwtRes = "";
	        Instant now = Instant.now();
	        keys seg = new keys();
	        byte[] keyBytes = JwtSinfaModelo.getSecret().getBytes(StandardCharsets.UTF_8);
	        jwtRes = Jwts.builder()
	                .claim("uss", seg.encryptIdUsuario(jwtmodelo.getIdUsuario()))
	                .claim("uss1", seg.encrypt(jwtmodelo.getUsuario()))
	                .claim("clear", new Date())
	                .setHeaderParam("typ", "JWT")
	                .setIssuer(jwtmodelo.getIssuer())
	                .setIssuedAt(Date.from(now))
	                .setExpiration(Date.from(now.plus(1, ChronoUnit.DAYS)))
	                .signWith( Keys.hmacShaKeyFor(keyBytes) , SignatureAlgorithm.HS256 )
	                .compact();
	        return jwtRes;
	    }

	    public static RetornoMostrable decode(String token) {
	    	JwtSinfaModelo jwtmodelo = new JwtSinfaModelo();	
	        try {
	            ConBd conn = new ConBd();
	            ConexionModelo Conexionmodelo = conn.conectar();
//	    		Connection con = Conexionmodelo.getConMod000();
	    		ArrayList<String> mensajeError = Conexionmodelo.getListaErrores();
	            if (Conexionmodelo.getListaErrores().size()>0){
	                mensajeError.add(Conexionmodelo.getListaErrores().get(0));
	                Conexionmodelo.setListaErrores(mensajeError);
	                RetornoModelo.setMensaje(Conexionmodelo.getListaErrores());
	                RetornoModelo.setStatus(500);
	                return RetornoModelo;
	            }
//	            System.out.println(Conexionmodelo.getConAdmin());
	            Mod000_token modToken = new Mod000_token(Conexionmodelo.getConAdmin());
	            if (!modToken.isActivo(token)) {
	                conn.desconectar();
	                RetornoModelo.setMensaje("Su sesión caduco o el token este mal formado");
	                RetornoModelo.setStatus(401);
	                return RetornoModelo;
	            }
	            keys seg = new keys();
		        byte[] keyBytes = JwtSinfaModelo.getSecret().getBytes(StandardCharsets.UTF_8) ;
	            Claims claims = Jwts.parserBuilder()
	                    .setSigningKey(Keys.hmacShaKeyFor(keyBytes)).build()
	                    .parseClaimsJws(token).getBody();
	            jwtmodelo.setIdUsuario(Integer.valueOf(seg.decryptIdUsuario((String) claims.get("id"))));
	            jwtmodelo.setUsuario((String) claims.get("iss"));
	            jwtmodelo.setNombreUsuario((String) claims.get("nombreUsuario"));
	            
//	            System.out.println(jwtmodelo.getIdUsuario() + " + " + jwtmodelo.getUsuario() +" + "+ jwtmodelo.getNombreUsuario());
	            
	            String s = "SELECT mod000_administradores.*"
	                    + " FROM mod000_administradores,mod000_baseDatos"
	                    + " WHERE mod000_baseDatos.nit= mod000_administradores.mod000_idCompania "
	                    + " AND mod000_administradores.id=? "
	                    + " AND mod000_administradores.usuario=?";

	            PreparedStatement psmt = Conexionmodelo.getConAdmin().prepareStatement(s);
	            psmt.setInt(1, jwtmodelo.getIdUsuario());
	            psmt.setString(2, jwtmodelo.getUsuario());
//	            System.out.println(jwtmodelo.getIdUsuario());
//	            System.out.println(jwtmodelo.getUsuario());
//	            System.out.println(s);
	            ResultSet rs = psmt.executeQuery();
	            if (!rs.next()) {
	                rs.close();
	                psmt.close();
	                conn.desconectar();
	                RetornoModelo.setMensaje("El usuario no se encuentra registrado");
	                RetornoModelo.setStatus(401);
	                return RetornoModelo;
	            }
	            rs.close();
	            psmt.close();
	            conn.desconectar();
	            RetornoModelo.setMensaje("ussOk");
                RetornoModelo.setStatus(200);
                return RetornoModelo;
	        } catch (Exception ex) {
	            RetornoModelo.setMensaje(ex);
                RetornoModelo.setStatus(500);
                return RetornoModelo;
	        }
	    }
	    
	    public static boolean decodeRecuperar(String token) {
	    	JwtSinfaModelo jwtmodelo = new JwtSinfaModelo();	
	        try {
	        	ConBd conn = new ConBd();
	            ConexionModelo Conexionmodelo = conn.conectar();
	            Mod000_token modToken = new Mod000_token(Conexionmodelo.getConAdmin());
	            if (!modToken.isActivoRecuperar(token)) {
	                conn.desconectar();
	                return false;
	            }
	            keys seg = new keys();
	            byte[] keyBytes = JwtSinfaModelo.getSecret().getBytes(StandardCharsets.UTF_8) ;
	            Claims claims = Jwts.parserBuilder()
	                    .setSigningKey(Keys.hmacShaKeyFor(keyBytes)).build()
	                    .parseClaimsJws(token).getBody();
	            jwtmodelo.setIdUsuario(Integer.valueOf(seg.decryptIdUsuario((String) claims.get("uss"))));
	            jwtmodelo.setUsuario(seg.decrypt((String) claims.get("uss1")));
	            String s = "SELECT mod000_administradores.*"
	                    + " FROM mod000_administradores,mod000_baseDatos"
	                    + " WHERE mod000_baseDatos.nit= mod000_administradores.mod000_idCompania "
	                    + " AND mod000_administradores.id=? "
	                    + " AND mod000_administradores.usuario=?";

	            PreparedStatement psmt = Conexionmodelo.getConAdmin().prepareStatement(s);
	            psmt.setInt(1, jwtmodelo.getIdUsuario());
	            psmt.setString(2, jwtmodelo.getUsuario());
	            ResultSet rs = psmt.executeQuery();
	            if (!rs.next()) {
	                rs.close();
	                psmt.close();
	                conn.desconectar();
	                return false;
	            }
	            rs.close();
	            psmt.close();
	            conn.desconectar();
	            return true;
	        } catch (Exception ex) {
	            System.out.println(ex); 
	            return false;
	        }
	    }
	    
	    public static RetornoMostrable validaHeaders(ContainerRequestContext httpHeaders) {
	    	JwtSinfaModelo jwtmodelo = new JwtSinfaModelo();
			try {
				String authHeader = httpHeaders.getHeaderString(Modulo.HEADER_AUTHORIZATION);
				authHeader = (authHeader == null) ? "" : authHeader;
				if (authHeader.equals("") || !authHeader.startsWith(Modulo.BEARER)) {
	                RetornoModelo.setMensaje("token requerido");
	                RetornoModelo.setStatus(401);
	                return RetornoModelo;
				}
				jwtmodelo.setToken(authHeader.substring(Modulo.BEARER.length(), authHeader.length()).trim());
				
				if(!(JwtSinfaRepositorio.decode(jwtmodelo.getToken()).getMensaje().equals("ussOk"))) {
					return JwtSinfaRepositorio.decode(jwtmodelo.getToken());
				}
			}catch (Exception e) {
				RetornoModelo.setMensaje(e);
                RetornoModelo.setStatus(500);
                return RetornoModelo;
			}
			RetornoModelo.setMensaje("aceptado");
            RetornoModelo.setStatus(202);
            return RetornoModelo;
	    }
}
