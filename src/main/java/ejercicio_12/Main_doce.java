package main.java.ejercicio_12;

import java.util.Scanner;

public class Main_doce {
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

