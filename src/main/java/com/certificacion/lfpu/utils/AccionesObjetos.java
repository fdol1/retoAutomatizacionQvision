package com.certificacion.lfpu.utils;

public class AccionesObjetos {

    public static void falsaEspera(int tiempo){
        try {
            Thread.sleep(tiempo);
            Constantes.logger.info("Tiempo de espera agotado: " + tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}