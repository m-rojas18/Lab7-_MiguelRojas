package lab7_miguelrojas;

import java.io.Serializable;
import java.util.ArrayList;

public class Eventos implements Serializable{
    
    private String fecha;
    private String ciudad;
    private String lugar;
    private int capacidad_personas;
    private ArrayList<Canciones> set_list;
    private static final long serialVersionUID = 333L;

    public Eventos(String fecha, String ciudad, String lugar, int capacidad_personas, ArrayList<Canciones> set_list) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidad_personas = capacidad_personas;
        this.set_list = set_list;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad_personas() {
        return capacidad_personas;
    }

    public void setCapacidad_personas(int capacidad_personas) {
        this.capacidad_personas = capacidad_personas;
    }

    public ArrayList<Canciones> getSet_list() {
        return set_list;
    }

    public void setSet_list(ArrayList<Canciones> set_list) {
        this.set_list = set_list;
    }
    
    
    
}
