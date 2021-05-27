package main.java.ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Listasfor {

    private List parfor = new ArrayList();
    private List imparfor = new ArrayList();

    public void mostarListas() {
        System.out.println("Numero par: " + parfor);
        System.out.println("Numero impar: " + imparfor);
    }
    public void conFor() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                parfor.add(i);
            } else {
                imparfor.add(i);
            }
        }
    }


}
