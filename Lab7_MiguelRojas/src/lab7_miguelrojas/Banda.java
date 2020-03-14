package lab7_miguelrojas;

public class Banda extends Artistas{

    private int integrantes;
    
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
        return nombre;
    }   
}
