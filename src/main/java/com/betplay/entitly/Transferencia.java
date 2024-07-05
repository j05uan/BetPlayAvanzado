package com.betplay.entitly;

import java.util.Date;

public class Transferencia {
    private int id;
    private Jugador jugador;
    private Equipo equipoOrigen;
    private Equipo equipoDestino;
    private String monto;
    private Date fech;
    public Transferencia() {
    }
    public Transferencia(int id, Jugador jugador, Equipo equipoOrigen, Equipo equipoDestino, String monto, Date fech) {
        this.id = id;
        this.jugador = jugador;
        this.equipoOrigen = equipoOrigen;
        this.equipoDestino = equipoDestino;
        this.monto = monto;
        this.fech = fech;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Jugador getJugador() {
        return jugador;
    }
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    public Equipo getEquipoOrigen() {
        return equipoOrigen;
    }
    public void setEquipoOrigen(Equipo equipoOrigen) {
        this.equipoOrigen = equipoOrigen;
    }
    public Equipo getEquipoDestino() {
        return equipoDestino;
    }
    public void setEquipoDestino(Equipo equipoDestino) {
        this.equipoDestino = equipoDestino;
    }
    public String getMonto() {
        return monto;
    }
    public void setMonto(String monto) {
        this.monto = monto;
    }
    public Date getFech() {
        return fech;
    }
    public void setFech(Date fech) {
        this.fech = fech;
    }
    
}
