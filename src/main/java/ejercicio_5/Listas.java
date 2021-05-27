package main.java.ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    private List par = new ArrayList();
    private List impar = new ArrayList();

    public void mostarListas() {
        System.out.println("Numero par: " + par);
        System.out.println("Numero impar: " + impar);
    }

    public void conWhile() {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                par.add(i);
            } else {
                impar.add(i);
            }
            i++;
        }
    }


}
