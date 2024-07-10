package controller;

import com.betplay.entitly.Actividad;
import com.betplay.entitly.Equipo;


public class ControllerActividad {
    Controller controlador = new Controller();

    public void addActividad (String id, Actividad actividad) {
        controlador.actividades.put(id, actividad);
    }

    public void getActividad (String id) {
        if (!controlador.actividades.containsKey(id)) {
            System.out.println("No hay Actividad con el ID. ");
            return;
        }
        controlador.actividades.forEach((k,v)-> System.out.println("Id: "+ k + "Nombre: "+ v.getDescripcion()));
        controlador.actividades.get(id);
    }

    public void updateActividad (String id, Actividad actividad){
        controlador.actividades.put(id,actividad);

    }

    public void deleteActividad (String id){
        controlador.actividades.remove(id);
    }




}
