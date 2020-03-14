package lab7_miguelrojas;

import java.io.Serializable;
import java.util.ArrayList;

public class Artistas implements Serializable{
    
    protected String usuario;
    protected String password;
    protected String nombre;
    protected String genero_musical;
    protected ArrayList<Canciones> lista_canciones = new ArrayList();
    private static final long serialVersionUID = 222L;

    public Artistas(String usuario, String password, String nombre, String genero_musical) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.genero_musical = genero_musical;
    }

    public String getUsuario() {
        return usuario;
    }
    Artistas(){
        
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

    public String getGenero_musical() {
        return genero_musical;
    }

    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }

    public ArrayList<Canciones> getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(ArrayList<Canciones> lista_canciones) {
        this.lista_canciones = lista_canciones;
    }

    @Override
    public String toString() {
        return  nombre + "Genero:" + genero_musical + "Canciones:";
    }
}
