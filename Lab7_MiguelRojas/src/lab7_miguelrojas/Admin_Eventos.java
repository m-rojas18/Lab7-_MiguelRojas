package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Eventos {
    
    private ArrayList<Eventos> lista_eventos = new ArrayList();
    private File archivo_eventos = null;
    
    public Admin_Eventos(String path){
        archivo_eventos = new File(path);
    }

    public ArrayList<Eventos> getLista_eventos() {
        return lista_eventos;
    }

    public void setLista_eventos(ArrayList<Eventos> lista_eventos) {
        this.lista_eventos = lista_eventos;
    }

    public File getArchivo_eventos() {
        return archivo_eventos;
    }

    public void setArchivo_eventos(File archivo_eventos) {
        this.archivo_eventos = archivo_eventos;
    }

    
    
    public void cargarArchivoC(){
        try {
            lista_eventos = new ArrayList();
            Eventos temp;
            if (archivo_eventos.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo_eventos);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Eventos) objeto.readObject()) != null) {
                        lista_eventos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivoC(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo_eventos);
            bw = new ObjectOutputStream(fw);
            for (Eventos s : lista_eventos) {
                bw.writeObject(s);
            }
            bw.flush();
        } catch (Exception ex) {

        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
