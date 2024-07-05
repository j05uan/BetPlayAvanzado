package com.betplay.entitly;

import java.sql.Date;
import java.util.List;



public class Partido {
    private int id;
    private String equipoLoca;
    private String equipoVisitante;
    private Date fecha;
    private List<Gol> listGoles;
    private List<Tarjeta> listTarjetas;
    private List<Incidente> listIncidentes;
    private Resultado resultado;
    public Partido() {
    }
    public Partido(int id, String equipoLoca, String equipoVisitante, Date fecha, List<Gol> listGoles,
            List<Tarjeta> listTarjetas, List<Incidente> listIncidentes, Resultado resultado) {
        this.id = id;
        this.equipoLoca = equipoLoca;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.listGoles = listGoles;
        this.listTarjetas = listTarjetas;
        this.listIncidentes = listIncidentes;
        this.resultado = resultado;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEquipoLoca() {
        return equipoLoca;
    }
    public void setEquipoLoca(String equipoLoca) {
        this.equipoLoca = equipoLoca;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public List<Gol> getListGoles() {
        return listGoles;
    }
    public void setListGoles(List<Gol> listGoles) {
        this.listGoles = listGoles;
    }
    public List<Tarjeta> getListTarjetas() {
        return listTarjetas;
    }
    public void setListTarjetas(List<Tarjeta> listTarjetas) {
        this.listTarjetas = listTarjetas;
    }
    public List<Incidente> getListIncidentes() {
        return listIncidentes;
    }
    public void setListIncidentes(List<Incidente> listIncidentes) {
        this.listIncidentes = listIncidentes;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }



}
