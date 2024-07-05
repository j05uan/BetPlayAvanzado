package com.betplay.entitly;

import java.util.Date;

public class Permiso {
    private int id;
    private String descripcion;

    public Permiso(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Permiso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}



    