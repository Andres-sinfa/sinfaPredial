package com.predial.configuracion;

public class Modulo {

    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_ORIGIN = "origin";
    public static final String BEARER = "Bearer ";
    public static final String SECRET = "mySecretKey";
    public static final String VERSION = "2.0";
    public static final String FECHA_ACTUALIZACION = "2021-06-28";
    public static final String MODULO = "MOD000";
    public static final String BASE_DATOS = "webBdAdmin";
    public static final String SESION_USUARIO = "MOD000_USUARIO";
    public static final String SESION_SERVIDOR = "MOD000_SERVIDOR";
    public static final String SESION_ID_USUARIO = "MOD000_ID_USUARIO";
    public static final String SESION_NOMBRE_USUARIO = "MOD000_NOMBRE_USUARIO";
    public static final String SESION_NOMBRE_COMPANIA = "MOD000_NOMBRE_COMPANIA";
    public static final String SESION_BASEDATOS = "MOD000_BASEDATOS";
    public static final String SESION_COMPANIA = "MOD000_ID_COMPANIA";
    public static final String SESION_ID_COMPANIA_PERMITIDA = "MOD000_ID_COMPANIA_PERMITIDA";
    public static final String SESION_ID_GRUPO_USUARIO = "MOD000_ID_GRUPO_USUARIO";
    public static final String SESION_CONTRASENA_VALIDA = "MOD000_CONTRASENA_VALIDA";
    public static final String SESION_FECHA_ENTRADA = "MOD000_FECHA_ENTRADA";
    public static final String SESION_ACTUALIZAR = "MOD000_ACTUALIZAR";
    public static final String CAMPO_VERISION_JAVA = "versionJavaMOD004";
    public static final String ARCHIVOS_CARGA = "/archivosPresupuestoBancEnd";
    private static final String PATH_CONFIGURACION = "/archivosPresupuestoBackEnd";
    private static final String PATH_LINUX = "/share/CACHEDEV1_DATA/javaWeb";
    //DEFINICION DE MODULOS
   
    
    public static final int[] bgColorEncabezado = {0, 155, 90};

    public static String getPathConfiguracion() {
        String sSistemaOperativo = System.getProperty("os.name");
        if (sSistemaOperativo.equalsIgnoreCase("LINUX")) {
            return PATH_LINUX.concat(PATH_CONFIGURACION);
        } else {
            return PATH_CONFIGURACION;
        }
    }
}
