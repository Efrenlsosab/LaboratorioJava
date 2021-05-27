package main.java.ejercicio_4;

public class CalcularPrecio {
    private final double iva = 0.21;
    private double total = 0.0;
    public void calculoPrecio(double precio){
        total = precio * iva;
        System.out.println("El precio total del producto es: " + total + ".");

    }
    public double calcularIva(double precio){
        
    }
}
