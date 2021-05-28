package main.java.ejercicio_11;

import java.util.Scanner;

public class Main_once {
    public static void main(String[] args) {
        String frase = "";

        Scanner dato = new Scanner(System.in);
        AtributosFrase atributos = new AtributosFrase();


        System.out.println("Ingrese una frase");
        frase = dato.nextLine();

        atributos.tamanoFrase(frase);
        atributos.mostrarLetras(frase);

    }
}
