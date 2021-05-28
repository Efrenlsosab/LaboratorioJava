package main.java.ejercicio_16;

import java.util.Scanner;

public class Main_dieciseis {
    public static void main(String[] args) {
        String nombre ="";
        int edad = 0;
        String sexo = "H";
        double altura = 0.0;
        double peso = 0.0;


        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = dato.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = dato.nextInt();
        System.out.println("ingrese el sexo");
        sexo = dato.nextLine().toUpperCase();
        Persona persona1 = new Persona();
        System.out.println("ingrese el peso");
        peso = dato.nextDouble();
        System.out.println("Ingrese la altura");
        altura = dato.nextDouble();

        //Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);




    }
}
