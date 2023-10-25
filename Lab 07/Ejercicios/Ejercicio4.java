package Ejercicios;
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            int[] numeros = {8, 6, 5};
            int indice = 4;
            int resultado = numeros[indice];
            int division = 5 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepción ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Se produjo una excepción ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se produjo una excepción genérica Exception: " + e.getMessage());
        }
    }
}
