package lab7_miguelrojas;

import java.io.Serializable;

public class Canciones implements Serializable{

    private String nombre;
    private int duracion;
    private static final long serialVersionUID = 444L;

    public Canciones(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
