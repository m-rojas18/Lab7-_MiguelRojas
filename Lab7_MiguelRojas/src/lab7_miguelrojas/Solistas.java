package lab7_miguelrojas;

import java.io.Serializable;

public class Solistas extends Artistas {

    private int edad;

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
        return nombre;
    }
}
