package com.predial.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
	public Connection Conexion(){
		try {
	        String connectionUrl =
	                "jdbc:sqlserver://localhost:1433;"
	                        + "database=DB_PREDIAL;"
	                        + "user=desarrollo;"
	                        + "password=s1nf4.d3s4rr0ll0;"
	                        + "encrypt=true;"
	                        + "trustServerCertificate=true;"
	                        + "loginTimeout=30;"
	                        + "useBulkCopyForBatchInsert=true;";
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(connectionUrl);
			return con;
		} catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
			return null;
		}
	}
}
