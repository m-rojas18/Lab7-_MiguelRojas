package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Canciones {


    private ArrayList<Canciones> lista_canciones = new ArrayList();
    private File archivo_canciones = null;
    
    public Admin_Canciones(String path){
        archivo_canciones = new File(path);
    }

    public ArrayList<Canciones> getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(ArrayList<Canciones> lista_canciones) {
        this.lista_canciones = lista_canciones;
    }

    public File getArchivo_canciones() {
        return archivo_canciones;
    }

    public void setArchivo_canciones(File archivo_canciones) {
        this.archivo_canciones = archivo_canciones;
    }
    
    public void cargarArchivoC(){
        try {
            lista_canciones = new ArrayList();
            Canciones temp;
            if (archivo_canciones.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo_canciones);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Canciones) objeto.readObject()) != null) {
                        lista_canciones.add(temp);
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
            fw = new FileOutputStream(archivo_canciones);
            bw = new ObjectOutputStream(fw);
            for (Canciones s : lista_canciones) {
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
