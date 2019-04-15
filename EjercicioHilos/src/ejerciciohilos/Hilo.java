/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciohilos;

/**
 *
 * @author 6-1user07
 */
public class Hilo extends Thread {
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("hilo nuevo "+i);
        }
    
    
    
    }
}
