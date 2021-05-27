package main.java.ejercicio_7;

import java.util.Scanner;

public class Main_siete {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        do{        System.out.println("ingrese numero: ");
            int numero = Integer.parseInt(dato.nextLine());
            if(numero >= 0) {
                System.out.println("El nuemro" + numero + " es mayor o igual que cero");
                break;
            }
        }while(true);

    }
}
