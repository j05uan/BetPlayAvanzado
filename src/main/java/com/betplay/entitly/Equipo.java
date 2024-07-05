package com.betplay.entitly;

import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;
    private String estadio;
    private String nombreEntrenador ;
    private List<Jugador> listJugador;
    private List<Partido> listPartidos;
    public Equipo() {
    }
    public Equipo(int id, String nombre, String ciudad, String estadio, String nombreEntrenador,
            List<Jugador> listJugador, List<Partido> listPartidos) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.nombreEntrenador = nombreEntrenador;
        this.listJugador = listJugador;
        this.listPartidos = listPartidos;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public String nombreEntrenador() {
        return nombreEntrenador;
    }
    public void setListEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }
    public List<Jugador> getListJugador() {
        return listJugador;
    }
    public void setListJugador(List<Jugador> listJugador) {
        this.listJugador = listJugador;
    }
    public List<Partido> getListPartidos() {
        return listPartidos;
    }
    public void setListPartidos(List<Partido> listPartidos) {
        this.listPartidos = listPartidos;
    }   

}
