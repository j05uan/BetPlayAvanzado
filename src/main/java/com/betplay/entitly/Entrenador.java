package com.betplay.entitly;

public class Entrenador  extends Persona{
    private int experiencia;
    private Equipo equipo;


    public Entrenador() {
        super();    
    }


    public Entrenador(String id, String nombre, int edad, String nacionalidad, int experiencia, Equipo equipo) {
        super(id, nombre, edad, nacionalidad);
        this.experiencia = experiencia;
        this.equipo = equipo;
    }


    public int getExperiencia() {
        return experiencia;
    }


    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    public Equipo getEquipo() {
        return equipo;
    }


    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    
}
