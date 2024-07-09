package controller;

import java.util.HashMap;

import com.betplay.entitly.Actividad;
import com.betplay.entitly.Equipo;
import com.betplay.entitly.Usuario;

public class Controller {
    public HashMap <String, Equipo> equipos = new HashMap<>();
    public HashMap <String, Usuario> usuarios = new HashMap<>();
    public HashMap <String, Actividad> actividad = new HashMap<>();
    
    

    public void addEquipo(String id, Equipo equipo) {
        equipos.put(id, equipo);
    }
    
    
    public void setEquipos(String key,Equipo equipo) {
        this.equipos.put(key, equipo);
    }

    public Equipo getEquipo(String id) {
        return equipos.get(id);
    }
    
    public void updateEquipo(String id, Equipo equipo) {
        equipos.put(id, equipo);
    }
    
    public void deleteEquipo(String id) {
        equipos.remove(id);
    }
    
    public HashMap<String, Equipo> getAllEquipos() {
        return equipos;
    }

    // Métodos para manejar los usuarios


    public void setUsuarios(String key,Usuario usuario) {
        this.usuarios.put(key, usuario);
    }


    public void addUsuario(String email, Usuario usuario) {
        usuarios.put(email, usuario);
    }
    
    public Usuario getUsuario(String email) {
        return usuarios.get(email);
    }
    
    public void updateUsuario(String email, Usuario usuario) {
        usuarios.put(email, usuario);
    }
    
    public void deleteUsuario(String email) {
        usuarios.remove(email);
    }
    
    public HashMap<String, Usuario> getAllUsuarios() {
        return usuarios;
    }

}
