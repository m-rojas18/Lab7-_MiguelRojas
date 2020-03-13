package lab7_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Admin_Usuario {

    private ArrayList<Usuarios> lista_usuarios = new ArrayList();
    private File archivo_U = null;

    public Admin_Usuario(String path) {
        archivo_U = new File(path);
    }

    public ArrayList<Usuarios> getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ArrayList<Usuarios> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    public File getArchivo_U() {
        return archivo_U;
    }

    public void setArchivo_U(File archivo_U) {
        this.archivo_U = archivo_U;
    }

    @Override
    public String toString() {
        return "lista_usuarios=" + lista_usuarios;
    }

    public void escribirArchivoU() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo_U);
            bw = new ObjectOutputStream(fw);
            for (Usuarios u : lista_usuarios) {
                bw.writeObject(u);
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

    public void cargarArchivoU() {
        try {
            lista_usuarios = new ArrayList();
            Usuarios temp;
            if (archivo_U.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo_U);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
                        lista_usuarios.add(temp);
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
}
