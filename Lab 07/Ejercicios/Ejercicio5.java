package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = -78;
        
        assert (numero > 0) : "El número no es positivo";
        
        System.out.println("El número es positivo: " + numero);
    }
}