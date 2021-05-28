package main.java.ejercicio_11;

import java.net.SocketTimeoutException;

public class ComprobacionPalabras {


    public void tamaño(String a, String b) {

        if (a.equals(b)) {
            System.out.println("las  palabras son iguales");
        } else if (a.compareTo(b) == 1) {
            System.out.println("El tamaño de la primera palabra es mayor");
        } else if (a.compareTo(b) == -1) {
            System.out.println("El tamaño de la segunda palabra es mayor");
        } else {
            System.out.println("Son diferentes");
        }

    }
}
