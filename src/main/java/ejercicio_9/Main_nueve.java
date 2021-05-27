package main.java.ejercicio_9;

import java.util.Scanner;

public class Main_nueve {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String textoA = "La sonrisa sera la mejor arma contra la tristeza";
        textoA = textoA.replace("a","e");
        System.out.println("ingrese una frase: ");
        System.out.println(textoA + ", " + dato.nextLine());


    }
}
