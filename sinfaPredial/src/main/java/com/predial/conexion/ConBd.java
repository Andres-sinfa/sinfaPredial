package com.predial.conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.predial.ModelosRetorno.ConexionModelo;

public class ConBd {
	ConexionModelo Modelo = new ConexionModelo();
	
	
	public void setPropiedades() throws FileNotFoundException, IOException {
		Modelo.setArchivoPropiedades();

        Properties props = new Properties();

        //  try () {
        try {
            FileInputStream inp = new FileInputStream(Modelo.archivoPropiedades);
            props.load(inp);
            Modelo.setMotorBD(props.getProperty("motorBD"));
            Modelo.servidor = props.getProperty("SERVIDOR");
            Modelo.nitLicencia = props.getProperty("NIT_LICENCIA");
            if (Modelo.motorBD.equals("sqlServer")) {
                Modelo.urlConexionMod000 = "jdbc:sqlserver://" + props.getProperty("SERVIDOR")
                        + ";databaseName=" + props.getProperty("DB_SIG")
                        + ";applicationName=JAVA;user=" + props.getProperty("USUARIO")
                        + ";password=" + props.getProperty("CONTRASENA")
                        + ";useBulkCopyForBatchInsert=true;"
                		+ "trustServerCertificate=true";
                //Modelo.urlConexion = props.getProperty("conexionSQL");
                Modelo.setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Modelo.urlConexionAdmin = "jdbc:sqlserver://" + props.getProperty("SERVIDOR")
                        + ";databaseName=" + props.getProperty("BD_ADMIN")
                        + ";applicationName=JAVA;user=" + props.getProperty("USUARIO")
                        + ";password=" + props.getProperty("CONTRASENA")
                		+ ";useBulkCopyForBatchInsert=true;"
                		+ "trustServerCertificate=true";
            } else if (Modelo.motorBD.equals("mySQL")) {
                Modelo.urlConexionMod000 = "jdbc:mysql://" + props.getProperty("SERVIDORMYSQL") + "/" + props.getProperty("BD_MOD000");
                Modelo.urlConexionAdmin = "jdbc:mysql://" + props.getProperty("SERVIDORMYSQL") + "/" + props.getProperty("BD_ADMIN");
                Modelo.setUsuario(props.getProperty("USUARIOMYSQL"));
                Modelo.setContrasena(props.getProperty("CONTRASENAMYSQL"));
                if (Modelo.contrasena == null) {
                    Modelo.setContrasena("");
                }
                if (Modelo.usuario == null) {
                    Modelo.setUsuario("root");
                }
                Modelo.setDriver("com.mysql.jdbc.Driver");
            } else if (Modelo.motorBD.equals("ORACLE")) {
                Modelo.urlConexionAdmin = "jdbc:oracle:thin:@" + props.getProperty("SERVIDOR_ORACLE") + ":" + props.getProperty("BD_ADMIN");
                Modelo.urlConexionMod000 = "jdbc:oracle:thin:@" + props.getProperty("SERVIDOR_ORACLE") + ":" + props.getProperty("BD_MOD000");

                Modelo.setUsuario(props.getProperty("USUARIO_ORACLE"));
                Modelo.setContrasena(props.getProperty("CONTRASENA_ORACLE"));
                Modelo.setDriver("oracle.jdbc.driver.OracleDriver");
            }
            inp.close();
        } finally {

        }

    }

    public void setPropiedades(String baseDatos) throws FileNotFoundException, IOException {
//        String sDirectorioTrabajo = System.getProperty("user.dir");
        // System.out.println("El directorio de trabajo es " + sDirectorioTrabajo);

        Modelo.setArchivoPropiedades();
        Modelo.servidorDBSIG = (Modelo.servidorDBSIG == null) ? "" : Modelo.servidorDBSIG;
        
        Properties props = new Properties();

        try {
            FileInputStream inp = new FileInputStream(Modelo.archivoPropiedades);
            props.load(inp);
            Modelo.setMotorBD(props.getProperty("motorBD"));
            Modelo.servidor = props.getProperty("SERVIDOR");
            Modelo.servidorDBSIG = Modelo.servidorDBSIG.equals("")? Modelo.servidor : Modelo.servidorDBSIG;
        
            Modelo.nitLicencia = props.getProperty("NIT_LICENCIA");
            if (Modelo.motorBD.equals("sqlServer")) {
                Modelo.urlConexionDB_SIG = "jdbc:sqlserver://" + Modelo.servidorDBSIG
                        + ";databaseName=" + baseDatos // props.getProperty("DB_SIG")
                        + ";applicationName=JAVA;user=" + props.getProperty("USUARIO")
                        + ";password=" + props.getProperty("CONTRASENA")
                        + ";useBulkCopyForBatchInsert=true";
                Modelo.urlConexionPredial = "jdbc:sqlserver://" + Modelo.servidorDBSIG
                        + ";databaseName=" + baseDatos // props.getProperty("DB_SIG")
                        + ";applicationName=JAVA;user=" + props.getProperty("USUARIO")
                        + ";password=" + props.getProperty("CONTRASENA")
                        + ";useBulkCopyForBatchInsert=true";
                Modelo.setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Modelo.urlConexionAdmin = "jdbc:sqlserver://" + props.getProperty("SERVIDOR")
                        + ";databaseName=" + props.getProperty("BD_ADMIN")
                        + ";applicationName=JAVA;user=" + props.getProperty("USUARIO")
                        + ";password=" + props.getProperty("CONTRASENA");
            } else if (Modelo.motorBD.equals("mySQL")) {
                Modelo.urlConexionDB_SIG = "jdbc:mysql://" + Modelo.servidorDBSIG + "/" + baseDatos + "?zeroDateTimeBehavior=convertToNull";
                Modelo.urlConexionPredial = "jdbc:mysql://" + Modelo.servidorDBSIG + "/" + baseDatos + "?zeroDateTimeBehavior=convertToNull";
                
                Modelo.urlConexionAdmin = "jdbc:mysql://" + props.getProperty("SERVIDORMYSQL") + "/" + props.getProperty("BD_ADMIN");
                Modelo.setUsuario(props.getProperty("USUARIOMYSQL"));
                Modelo.setContrasena(props.getProperty("CONTRASENAMYSQL"));
                if (Modelo.contrasena == null) {
                    Modelo.setContrasena("");
                }
                if (Modelo.usuario == null) {
                    Modelo.setUsuario("root");
                }
                Modelo.setDriver("com.mysql.jdbc.Driver");
            } else if (Modelo.motorBD.equals("ORACLE")) {
                Modelo.urlConexionAdmin = "jdbc:oracle:thin:@" + props.getProperty("SERVIDOR_ORACLE") + ":" + props.getProperty("BD_ADMIN");
                Modelo.urlConexionMod000 = "jdbc:oracle:thin:@" + props.getProperty("SERVIDOR_ORACLE") + ":" + props.getProperty("BD_MOD000");
                Modelo.urlConexionDB_SIG = "jdbc:oracle:thin:@" + Modelo.servidorDBSIG + ":" + baseDatos;

                Modelo.setUsuario(props.getProperty("USUARIO_ORACLE"));
                Modelo.setContrasena(props.getProperty("CONTRASENA_ORACLE"));
                Modelo.setDriver("oracle.jdbc.driver.OracleDriver");
            }
            inp.close();
        } finally {

        }

    }
    
    public ConexionModelo conectar() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        setPropiedades();

        //conexionSQL2 = jdbc:sqlserver://192.168.1.147;databaseName=cursojava;applicationName=cursojava;user=sinfasql;password=cotaSINFA2050
        //driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //ConeSQL = DriverManager.getConnection( url,user,pass);
        try {
            if (Modelo.motorBD.equals("mySQL")) {
                Class.forName(Modelo.driver);
                //Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG, "root", "");
                Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, "root", "");
                Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, "root", "");
            } else if (Modelo.motorBD.equals("ORACLE")) {
                Class.forName(Modelo.driver);
                //Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG, Modelo.usuario, Modelo.contrasena);
                Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, Modelo.usuario, Modelo.contrasena);
                Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, Modelo.usuario, Modelo.contrasena);
                //  Modelo.conAdmin = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:webBdAdmin", "system", "cotaSINFA2050");
            } else {
                Class.forName(Modelo.driver);
                Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin);
                Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000);
                //Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG);
            }
            Modelo.Conexion = true;
            return Modelo;
        }catch(Exception ex){
//            System.out.println(ex);
//            System.out.println(Modelo.urlConexionAdmin);
//            Modelo.listaErrores.add(ex.getMessage());
            Modelo.Conexion = false;
            return Modelo;
        }
        //Logger.log("Conectado a la base de datos");
    }
    
    public void conectarAnterior(String baseDatos) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        setPropiedades(baseDatos);

        //conexionSQL2 = jdbc:sqlserver://192.168.1.147;databaseName=cursojava;applicationName=cursojava;user=sinfasql;password=cotaSINFA2050
        //driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //ConeSQL = DriverManager.getConnection( url,user,pass);
        if (Modelo.motorBD.equals("mySQL")) {
            Class.forName(Modelo.driver);
            Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG, "root", "");
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, "root", "");
            Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, "root", "");
        } else if (Modelo.motorBD.equals("ORACLE")) {
            Class.forName(Modelo.driver);
            Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG, Modelo.usuario, Modelo.contrasena);
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, Modelo.usuario, Modelo.contrasena);
            Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, Modelo.usuario, Modelo.contrasena);
            //  Modelo.conAdmin = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:webBdAdmin", "system", "cotaSINFA2050");
        } else {
            Class.forName(Modelo.driver);
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin);
            Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG);
        }

        //Logger.log("Conectado a la base de datos");
    }
//--------------------------------------------------------- ** ------------------------------------------------------------
    
    public void conectar(String baseDatos, String servidor) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        Modelo.servidorDBSIG = servidor;
        setPropiedades(baseDatos);

        //conexionSQL2 = jdbc:sqlserver://192.168.1.147;databaseName=cursojava;applicationName=cursojava;user=sinfasql;password=cotaSINFA2050
        //driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //ConeSQL = DriverManager.getConnection( url,user,pass);
        if (Modelo.motorBD.equals("mySQL")) {
            Class.forName(Modelo.driver);
            Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG, "root", "");
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, "root", "");
            Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, "root", "");
        } else if (Modelo.motorBD.equals("ORACLE")) {
            Class.forName(Modelo.driver);
            Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG, Modelo.usuario, Modelo.contrasena);
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, Modelo.usuario, Modelo.contrasena);
            Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, Modelo.usuario, Modelo.contrasena);
            //  Modelo.conAdmin = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:webBdAdmin", "system", "cotaSINFA2050");
        } else {
            Class.forName(Modelo.driver);
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin);
            Modelo.conDB_SIG = DriverManager.getConnection(Modelo.urlConexionDB_SIG);
        }

        //Logger.log("Conectado a la base de datos");
    }
    public void conectarPredial(String baseDatos, String servidor) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        Modelo.servidorDBSIG = servidor;
        setPropiedades(baseDatos);

        //conexionSQL2 = jdbc:sqlserver://192.168.1.147;databaseName=cursojava;applicationName=cursojava;user=sinfasql;password=cotaSINFA2050
        //driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //ConeSQL = DriverManager.getConnection( url,user,pass);
        if (Modelo.motorBD.equals("mySQL")) {
            Class.forName(Modelo.driver);
            Modelo.ConPredial = DriverManager.getConnection(Modelo.urlConexionPredial, "root", "");
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, "root", "");
            Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, "root", "");
        } else if (Modelo.motorBD.equals("ORACLE")) {
            Class.forName(Modelo.driver);
            Modelo.ConPredial = DriverManager.getConnection(Modelo.urlConexionPredial, Modelo.usuario, Modelo.contrasena);
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin, Modelo.usuario, Modelo.contrasena);
            Modelo.conMod000 = DriverManager.getConnection(Modelo.urlConexionMod000, Modelo.usuario, Modelo.contrasena);
            //  Modelo.conAdmin = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:webBdAdmin", "system", "cotaSINFA2050");
        } else {
            Class.forName(Modelo.driver);
            Modelo.conAdmin = DriverManager.getConnection(Modelo.urlConexionAdmin);
            Modelo.ConPredial = DriverManager.getConnection(Modelo.urlConexionPredial);
        }

        //Logger.log("Conectado a la base de datos");
    }
    
    //--------------------------------------------------------------------- ** ---------------------------------------------------------------
	
    public boolean probarConexion() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        boolean result = false;

        //conexionSQL2 = jdbc:sqlserver://192.168.1.147;databaseName=cursojava;applicationName=cursojava;user=sinfasql;password=cotaSINFA2050
        //driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //ConeSQL = DriverManager.getConnection( url,user,pass);
        try {
            if (Modelo.motorBD.equals("mySQL")) {
                Modelo.driver = "com.mysql.jdbc.Driver";
                String servidor = Modelo.servidor;
                if (!Modelo.puerto.equals("")) {
                    servidor = servidor + ":" + Modelo.puerto;
                }
                Class.forName(Modelo.driver);

                String urlConexionContratacionWeb = "jdbc:mysql://" + servidor + "/" + Modelo.baseDatos + "?zeroDateTimeBehavior=convertToNull";
                Modelo.conContratacionWeb = DriverManager.getConnection(urlConexionContratacionWeb, Modelo.usuario, Modelo.contrasena);
                result = true;
                Modelo.conContratacionWeb.close();

            } else if (Modelo.motorBD.equals("ORACLE")) {
                Class.forName(Modelo.driver);
                //  Modelo.conAdmin = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:webBdAdmin", "system", "cotaSINFA2050");
            } else if (Modelo.motorBD.equals("sqlServer")) {
                Modelo.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(Modelo.driver);
                String servidor = Modelo.servidor;
                if (!Modelo.puerto.equals("")) {
                    servidor = servidor + ":" + Modelo.puerto;
                }
                String urlConexionContratacionWeb = "jdbc:sqlserver://" + servidor
                        + ";databaseName=" + Modelo.baseDatos
                        + ";applicationName=JAVA;user=" + Modelo.usuario
                        + ";password=" + Modelo.contrasena
                        + ";useBulkCopyForBatchInsert=true";
                Modelo.conContratacionWeb = DriverManager.getConnection(urlConexionContratacionWeb);
                result = true;
                Modelo.conContratacionWeb.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
//            String arr[] = new String[2];
//            String sMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
//            String sClassName = Thread.currentThread().getStackTrace()[1].getClassName();
//                     Modelo.listaErrores.add(sClassName + "-" + sMethodName + "-" + ex.getMessage());
//            result = false;

        }
        return result;
        //Logger.log("Conectado a la base de datos");
    }
    
    public void desconectar() throws SQLException {
        if (Modelo.conContratacionWeb != null) {
            try {
                Modelo.conContratacionWeb.close();

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        if (Modelo.conDB_SIG != null) {
            try {
                Modelo.conDB_SIG.close();

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        if (Modelo.conAdmin != null) {
            try {
                Modelo.conAdmin.close();

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        if (Modelo.conMod000 != null) {
            try {
                Modelo.conMod000.close();

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        if (Modelo.ConPredial != null) {
            try {
                Modelo.ConPredial.close();

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
    
    public String[] configPropeties() throws IOException {
        String estado[] = new String[2];
        Properties props = new Properties();
        //  InputStream inp = BD_SIG.class.getClassLoader().getResourceAsStream("com/sinfa/Conexiones/sinfa.properties");
        Modelo.setArchivoPropiedades();
        try {
            FileInputStream inp = new FileInputStream(Modelo.archivoPropiedades);
            props.load(inp);
            if (props.getProperty("SERVIDOR").equals("") || props.getProperty("SERVIDOR") == null) {
                estado[0] = "1";
                estado[1] = "";
            } else {
                conectar();
                estado[0] = "0";
                estado[1] = "";
                inp.close();
                desconectar();
            }
        } catch (Exception ex) {
            System.out.println(ex);
//            estado[0] = "1";
//            estado[1] = ex.getMessage();
        }
        return estado;
    }
    
    public void desconectarDB_SIG() throws SQLException {
        if (Modelo.getConDB_SIG() != null) {
            try {
                Modelo.getConDB_SIG().close();
            } catch (Exception ex) {
				System.out.println(ex);
            }
        }
    }
    
}
