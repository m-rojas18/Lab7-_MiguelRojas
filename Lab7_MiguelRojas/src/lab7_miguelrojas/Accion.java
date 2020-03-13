package lab7_miguelrojas;

import javax.swing.JProgressBar;

public class Accion extends Thread{
    
    
    private JProgressBar barraU;
    private boolean empezar;
    private boolean vive;
    
    public  Accion(JProgressBar barraU){
        
        this.barraU = barraU;
        empezar = true;
        vive = true;
    }
    //Mutadores Barra
    public void setEmpezar(boolean empezar) {
        this.empezar = empezar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    @Override
    public void run(){
        
        while(empezar){
            if (vive) {
                barraU.setValue(barraU.getValue() + 1);
            }
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            
        }
        
    }
}
