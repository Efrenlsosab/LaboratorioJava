package main.java.ejercicio_15;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main_quince {
    public static void main(String[] args) {
        int seleccion = 0;

        Scanner dato = new Scanner(System.in);
        Menu menu = new Menu();



        while (seleccion != 8){
            menu.menu();
            System.out.println("Ingrese su seleccion");
            seleccion = dato.nextInt();
            switch ( seleccion){
                case 1: case 2: case 3: case 4 : case 5: case 6: case 7:
                    menu.menu();
                    break;
                case 8: break;
                default:
                    System.out.println("Ingrese un numero valido para el menu");
                    }
        }



    }
}
