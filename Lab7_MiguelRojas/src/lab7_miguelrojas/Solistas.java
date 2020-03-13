package lab7_miguelrojas;

import java.io.Serializable;

public class Solistas extends Artistas implements Serializable{
    
    private int edad;
     private static final long serialVersionUID = 333L;

    public Solistas(int edad, String usuario, String password, String nombre, String genero_musical) {
        super(usuario, password, nombre, genero_musical);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "edad=" + edad + '}';
    }  
}
