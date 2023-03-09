package com.predial.configuracion;

import utilAdmin.sinfa.ConfiguracionCors;

public class Configuracion extends ConfiguracionCors {

    public void get(String dominio) {
        String path = Configuracion.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        getCors(path, dominio);
    }

    public void get() {
        String path = Configuracion.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        getCors(path);
    }
	
}
