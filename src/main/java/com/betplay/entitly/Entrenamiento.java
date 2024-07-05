package com.betplay.entitly;

import java.sql.Date;
import java.util.List;

public class Entrenamiento {
    private int id;
    private Equipo equipo;
    private Date fecha;
    private String hora;
    private String lugar;
    private List<Jugador> jugadoresConvocados;
    private List<Actividad> actividades;
    public Entrenamiento() {
    }
    public Entrenamiento(int id, Equipo equipo, Date fecha, String hora, String lugar,
            List<Jugador> jugadoresConvocados, List<Actividad> actividades) {
        this.id = id;
        this.equipo = equipo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.jugadoresConvocados = jugadoresConvocados;
        this.actividades = actividades;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public List<Jugador> getJugadoresConvocados() {
        return jugadoresConvocados;
    }
    public void setJugadoresConvocados(List<Jugador> jugadoresConvocados) {
        this.jugadoresConvocados = jugadoresConvocados;
    }
    public List<Actividad> getActividades() {
        return actividades;
    }
    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    
    
}