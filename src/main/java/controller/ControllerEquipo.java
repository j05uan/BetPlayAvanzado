package controller;

import com.betplay.entitly.Equipo;

public class ControllerEquipo {
    
    Controller controlador = new Controller();

    public void addEquipo(String id, Equipo equipo) {
        controlador.equipos.put(id, equipo);
    }

    public void getEquipo(String id) {
        if (!controlador.equipos.containsKey(id)) {
            System.out.println("No hay ningun equipo con ese ID.");
            return;
        }
        controlador.equipos.forEach((k,v)-> System.out.println("Id: "+ k +" Nombre Equipo: "+ v.getNombre()));
        controlador.equipos.get(id);
        
    }
    
    public void updateEquipo(String id, Equipo equipo) {
        controlador.equipos.put(id, equipo);
    }
    
    public void deleteEquipo(String id) {
        controlador.equipos.remove(id);
    }

}
