package main.java.ejercicio_4;

import main.java.ejercicio_3.CalcularArea;

import java.util.Scanner;

public class Main_cuatro {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        CalcularPrecio precioFinal = new CalcularPrecio();

        System.out.println("Ingrese el precio del producto sin iva: ");

        double precio = Double.parseDouble(dato.nextLine());

        precioFinal.calculoPrecio(precio);
    }
}
