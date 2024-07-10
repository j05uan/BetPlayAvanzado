package controller;

import com.betplay.entitly.Usuario;

public class controllerUsusario {
    Controller controlador = new Controller();

      public void addUsuario(String id, Usuario usuario) {
        controlador.usuarios.put(id, usuario);
    }
    
    public void getUsuario(String id) {
        if(!controlador.usuarios.containsKey(id)){
            System.out.println("No hay Usuarios con ese Id");
        }
        controlador.usuarios.get(id);
    }
    
    public void updateUsuario(String id, Usuario usuario) {
        controlador.usuarios.put(id, usuario);
    }
    
    public void deleteUsuario(String id) {
        controlador.usuarios.remove(id);
    }
}
