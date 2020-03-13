package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Solistas {

    private ArrayList<Solistas> lista_solistas = new ArrayList();
    private File archivo_S = null;

    public Admin_Solistas(String pathname) {
        archivo_S = new File(pathname);
    }

    public ArrayList<Solistas> getLista_solistas() {
        return lista_solistas;
    }

    public void setLista_solistas(ArrayList<Solistas> lista_solistas) {
        this.lista_solistas = lista_solistas;
    }

    public void cargarArchivoS() {
try {
            lista_solistas = new ArrayList();
            Solistas temp;
            if (archivo_S.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo_S);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Solistas) objeto.readObject()) != null) {
                        lista_solistas.add(temp);
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

    public void escribirArchivoS() {
        
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo_S);
            bw = new ObjectOutputStream(fw);
            for (Solistas s : lista_solistas) {
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
