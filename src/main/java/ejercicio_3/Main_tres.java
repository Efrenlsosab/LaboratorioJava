package main.java.ejercicio_3;

import java.util.Scanner;

public class Main_tres {
    public static void main(String[] args) {
        Scanner radio = new Scanner(System.in);
        CalcularArea circulo = new CalcularArea();

        System.out.println("ingrese Radio del circulo");
        double dato = Double.parseDouble(radio.nextLine());

        circulo.areaCirculo(dato);
    }
}
