package com.betplay.entitly;

import java.util.ArrayList;
import java.util.List;



public class Comunicacion {
    private  String id;
    private String titulo;
    private String contenido;
    private String fechaPublicacion;
    private List<Usuario> listDestinatarios;

    public Comunicacion() {
        this.listDestinatarios = new ArrayList<>();
    }

  

    public Comunicacion(String id, String titulo, String contenido, String fechaPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getContenido() {
        return contenido;
    }



    public void setContenido(String contenido) {
        this.contenido = contenido;
    }



    public String getFechaPublicacion() {
        return fechaPublicacion;
    }



    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }



    public List<Usuario> getlistDestinatarios() {
        return listDestinatarios;
    }



    public void setlistDestinatarios(Usuario usuario) {
        this.listDestinatarios.add(usuario);
    }

  

    
}
