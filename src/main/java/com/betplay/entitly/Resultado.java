package com.betplay.entitly;

public class Resultado {
    private int id;
    private Partido partido;
    private int goleEquipoLocal;
    private int goleEqiopoVisitante;
    public Resultado() {
    }
    public Resultado(int id, Partido partido, int goleEquipoLocal, int goleEqiopoVisitante) {
        this.id = id;
        this.partido = partido;
        this.goleEquipoLocal = goleEquipoLocal;
        this.goleEqiopoVisitante = goleEqiopoVisitante;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public int getGoleEquipoLocal() {
        return goleEquipoLocal;
    }
    public void setGoleEquipoLocal(int goleEquipoLocal) {
        this.goleEquipoLocal = goleEquipoLocal;
    }
    public int getGoleEqiopoVisitante() {
        return goleEqiopoVisitante;
    }
    public void setGoleEqiopoVisitante(int goleEqiopoVisitante) {
        this.goleEqiopoVisitante = goleEqiopoVisitante;
    }

}
