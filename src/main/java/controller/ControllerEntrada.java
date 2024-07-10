package controller;

import com.betplay.entitly.Entrada;

public class ControllerEntrada {
    Controller controlador = new Controller();

    public void addEntrada(String id, Entrada entrada){
        controlador.entradas.put(id,entrada);
    }

    public void getEntrada (String id){
        if (!controlador.entradas.containsKey(id)) {
            System.out.println("No se encontraron entradas con ese ID");
            return;
        }
        controlador.entradas.forEach((k,v)-> System.out.println("Id: "+ k +"Nombre: "+v.getFechaCompra()+"Ubicacion: "+ v.getUbicacion()));
        controlador.entradas.get(id);
    }

    public void updateEntrada(String id, Entrada entrada){
        controlador.entradas.put(id, entrada);
    }

    public void deleteActividad (String id){
        controlador.entradas.remove(id);
    }

}
