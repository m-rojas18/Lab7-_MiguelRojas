package lab7_miguelrojas;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable{
    
    private String usuario;
    private String password;
    private String nombre;
    private int edad;
    private ArrayList<Eventos> lista_eventos = new ArrayList();
    private ArrayList<Artistas> lista_artistas = new ArrayList();
    
    private static final long serialVersionUID = 111L;

    public Usuarios(String usuario, String password, String nombre, int edad) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Eventos> getLista_eventos() {
        return lista_eventos;
    }

    public void setLista_eventos(ArrayList<Eventos> lista_eventos) {
        this.lista_eventos = lista_eventos;
    }

    public ArrayList<Artistas> getLista_artistas() {
        return lista_artistas;
    }

    public void setLista_artistas(ArrayList<Artistas> lista_artistas) {
        this.lista_artistas = lista_artistas;
    }
    
    
    
}
