/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciohilos;

import java.util.Random;

/**
 *
 * @author 6-1user07
 */
public class EjercicioHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo unHilo= new Hilo();
        
        //unHilo.start();
       
        Thread hilo2= new Thread(new HiloConInterface());
        Thread hilo3= new Thread(new Runnable() {

            @Override
            public void run() {
                
                for (int i = 0; i < 5; i++) {
                    int numero= (int)(Math.random()*10);
                     System.out.println("hilo con clase anónima "+numero);
                     try {
                     Thread.sleep(1000);
                     }
                     catch(InterruptedException ex){
                     
                     }
                }}
        });
        hilo3.start();
        hilo2.start();
        
        
        
        
        
        //for (int i = 0; i < 1000; i++) {
        //    System.out.println("hilo viejo "+i);
        //}
    }
    
}
