package main.java.ejercicio_10;

import java.util.Scanner;

public class Main_diez {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese una frase con muchos espacios");
        String frase = dato.nextLine();
        frase = frase.replace(" ", "");
        System.out.println(frase);

    }
}
