package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Bandas {

    private ArrayList<Banda> lista_Bandas = new ArrayList();
    private File archivo_B = null;

    public Admin_Bandas(String path) {
        archivo_B = new File(path);
    }

    public ArrayList<Banda> getLista_Bandas() {
        return lista_Bandas;
    }

    public void setLista_Bandas(ArrayList<Banda> lista_Bandas) {
        this.lista_Bandas = lista_Bandas;
    }

    public void cargarArchivo_B() {
        try {
            lista_Bandas = new ArrayList();
            Banda temp;
            if (archivo_B.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo_B);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Banda) objeto.readObject()) != null) {
                        lista_Bandas.add(temp);
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

    public void escribirArchivo_B() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo_B);
            bw = new ObjectOutputStream(fw);
            for (Banda b : lista_Bandas) {
                bw.writeObject(b);
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
