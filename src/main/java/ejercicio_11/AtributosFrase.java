package main.java.ejercicio_11;

import java.util.Locale;

public class AtributosFrase {

    int a = 0, e = 0, i = 0, o = 0, u = 0;


    public void tamanoFrase(String frase) {
        int letras = frase.length();
        System.out.println("El tamaño de la frase es de: " + letras + " caracteres. ");
    }

    public void mostrarLetras(String frase){
        vocales(frase);
        System.out.println("A = "+ a +".");
        System.out.println("E = "+ e +".");
        System.out.println("I = "+ i +".");
        System.out.println("O = "+ o +".");
        System.out.println("U = "+ u +".");
    }
    public void vocales(String frase) {
        for (int j = 0; j < frase.length(); j++) {
            char letra = frase.toLowerCase(Locale.ROOT).charAt(j);
            switch (letra) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }

        }
    }

}
