package main.java.ejercicio_11;

import java.util.Scanner;

public class Main_once {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        ComprobacionPalabras comprobacion = new ComprobacionPalabras();

        System.out.println("Ingrese la primera palabra");
        String palabraUno = dato.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String palabraDos = dato.nextLine();

        comprobacion.tamaño(palabraUno, palabraDos);


    }
}
