package com.betplay.entitly;

public class Entrada {
    private String id;
    private Partido partido;
    private Usuario comprador;
    private String fechaCompra;
    private int cantidad;
    private double precioTotal;
    private String ubicacion;
    public Entrada() {
    }
    public Entrada(String id, Partido partido, Usuario comprador, String fechaCompra, int cantidad, double precioTotal,
            String ubicacion) {
        this.id = id;
        this.partido = partido;
        this.comprador = comprador;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.ubicacion = ubicacion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public Usuario getComprador() {
        return comprador;
    }
    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
}
