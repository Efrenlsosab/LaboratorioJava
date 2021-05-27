package main.java.ejercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Comparar comparacion = new Comparar();
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese a");
        int a = datos.nextInt();
        System.out.println("Ingrese b");
        int b = datos.nextInt();

        comparacion.compararNumeros(a,b);


    }


}
