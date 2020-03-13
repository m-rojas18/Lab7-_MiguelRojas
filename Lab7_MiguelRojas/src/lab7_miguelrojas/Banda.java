package lab7_miguelrojas;

import java.io.Serializable;

public class Banda extends Artistas implements Serializable{

    private int integrantes;
    private static final long serialVersionUID = 222L;

    public Banda(int integrantes, String usuario, String password, String nombre, String genero_musical) {
        super(usuario, password, nombre, genero_musical);
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "integrantes=" + integrantes + '}';
    }   
}
