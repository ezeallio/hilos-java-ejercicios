
package hilo;

import java.util.Scanner;

public class Waitnotify {

    public static void main(String[] args) {
        Object objeto = new Object();

        String respuesta = "";
        Hilo hilo1 = new Hilo(objeto);
        hilo1.start();

        Scanner teclado = new Scanner(System.in);

        respuesta=teclado.next();

            if (respuesta.equals("interrumpir")) {
                synchronized (objeto) {
                    hilo1.interrupt();
                    System.out.println("chau!");
                }
        }
    }
}
