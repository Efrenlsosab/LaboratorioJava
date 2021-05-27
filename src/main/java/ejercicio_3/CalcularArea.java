package main.java.ejercicio_3;

public class CalcularArea {
    private double area = 0.0;
    public void areaCirculo(double r){
        area = Math.PI * Math.pow(r,2);
        System.out.println("El area del ciuculo es: "+ area + ".");
    }
}
