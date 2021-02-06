package com.certificacion.lfpu.models;

public class DatosBusqueda {

    private String lugarDestino;
    private String diaLlegada;
    private String diaSalida;
    private String numeroDeHabitaciones;
    private String numeroDeAdultos;
    private String numeroDeInfantes;

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getDiaLlegada() {
        return diaLlegada;
    }

    public void setDiaLlegada(String diaLlegada) {
        this.diaLlegada = diaLlegada;
    }

    public String getDiaSalida() {
        return diaSalida;
    }

    public void setDiaSalida(String diaSalida) {
        this.diaSalida = diaSalida;
    }

    public String getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(String numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public String getNumeroDeAdultos() {
        return numeroDeAdultos;
    }

    public void setNumeroDeAdultos(String numeroDeAdultos) {
        this.numeroDeAdultos = numeroDeAdultos;
    }

    public String getNumeroDeInfantes() {
        return numeroDeInfantes;
    }

    public void setNumeroDeInfantes(String numeroDeInfantes) {
        this.numeroDeInfantes = numeroDeInfantes;
    }
}
