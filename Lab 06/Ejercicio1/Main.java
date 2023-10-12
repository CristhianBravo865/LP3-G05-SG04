package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de Figura y llenarlo con objetos de las diferentes clases
        Figura[] figuras = new Figura[]{
            new Triangulo(3,2),
            new Circulo(4),
            new Cuadrado(2),
            new Esfera(4),
            new Cubo(2),
            new Tetraedro(2)
        };
        // Procesar cada figura en el arreglo
        for (Figura figura : figuras) {
            figura.Describir();

            if (figura instanceof FiguraBidimensional) {
                System.out.println(((FiguraBidimensional) figura).obtenerArea());
            } else if (figura instanceof FiguraTridimensional) {
                System.out.println(((FiguraTridimensional) figura).obtenerArea());
                System.out.println(((FiguraTridimensional) figura).obtenerVolumen());
            }
            
            System.out.println();
        }
    }
}
