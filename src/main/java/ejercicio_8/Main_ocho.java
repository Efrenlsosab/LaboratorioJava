package main.java.ejercicio_8;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main_ocho {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese un dia de la semana: ");
        String dia = dato.nextLine();
        switch (dia){
            case "lunes": case "martes": case "miercoles": case "jueves": case "viernes":
                System.out.println("Es un dia laboral ");
                break;
            case "sabado": case "domingo":
                System.out.println("No es una dia laboral");
                break;
            default:
                System.out.println("Ingrese un dia de la semana valido");
        }
    }
}
