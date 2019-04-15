/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corredores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 6-1user07
 */
public class Corredor extends Thread {
    private String nombre;
    static boolean gano = true;
        public Corredor(String Nombre){
        this.nombre=Nombre;
        }
        
    public void run(){
        for (int i = 1; i < 6; i++) {
            int numero = ((int)(Math.random()*3))+2;
            
            
            try {
                Thread.sleep(numero * 1000);
                System.out.println("Soy " + this.nombre + " estoy en la vuelta "+(i)+" mi tiempo fue "+numero+" segundos");
            } catch (InterruptedException ex) {
                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        System.out.println("ya llegue al final");
        
        if(gano == true)
        {
            System.out.println("Gano " + this.nombre);
         gano = false;       
        }
    }    
}
