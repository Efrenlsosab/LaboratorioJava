package main.java.ejercicio_16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private int dni = 0;
    private String sexo = "H";
    private double peso = 0.0;
    private double altura = 0.0;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

//getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Crear metodos

    public void mostresPesoIdeal() {
        if (calcularIMC() == -1) {
            System.out.println("esta en su peso ideal");
            ;
        } else if (calcularIMC() == 0) {
            System.out.println("estas por debajo de su peso ideal");
        } else if (calcularIMC() == 1) {
            System.out.println("estas por encima de tu peso ideal");
        }

    }

    public int calcularIMC() {
        double imc = getPeso() / (Math.pow(getAltura(), 2));
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else if (imc > 25) {
            return 1;
        }
        return 0;
    }

    public boolean esMayorDeEdad() {
        boolean mayorDeEdad = false;
        if (getEdad() >= 18) {
            mayorDeEdad = true;
        }
        return mayorDeEdad;
    }

    public String comprobarSexo() {

        if (getSexo() == "H" || getSexo() == "M") {
            return getSexo();
        } else {
            return "H";
        }
    }

    public int calcularDni() {
        this.dni = 0;
        this.dni = (int) (Math.random() * 10000000);
        return this.dni;
    }

    public String letreFinal() {
        int calculoDni;
        String letraFinalDNI = "";
        calcularDni();
        calculoDni = this.dni % 23;
        String letras[] = {"-T", "-R", "-W", "-A", "-G", "-M", "-Y", "-F", "-P", "-D", "-X", "-B", "-N", "-J", "-Z", "-S", "-Q", "-V", "-H", "-L", "-C", "-K", "-E"};
        for (int i = 0; i < letras.length; i++) {
            if (calculoDni == i) {
                letraFinalDNI = letras[i];
                break;
            }
        }
        return letraFinalDNI;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
