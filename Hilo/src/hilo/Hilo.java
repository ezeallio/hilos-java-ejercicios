
package hilo;

public class Hilo extends Thread{
    
    Object palabra;
    
    public Hilo(Object p)
    {
        palabra = p;
    }
    
    @Override
    public void run()
    {
        System.out.println("durmiendo...");
        synchronized(palabra){
            try {
                palabra.wait();
            } catch (InterruptedException ex) {
                System.out.println("me desperte por una interrupción");
            }
        }
    }    
}
