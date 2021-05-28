package main.java.ejercicio_14;

import java.util.Scanner;

public class Main_catorce {
    public static void main(String[] args) {
        int numero = 0;
        Scanner dato = new Scanner(System.in);


        System.out.println("Ingrese un numero: ");
        numero = dato.nextInt();

        while(numero <= 1000){
            System.out.println("Numero: " + numero);
            numero += 2;
        }
    }
}
