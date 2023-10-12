package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
            new Triangulo(3,2),
            new Circulo(4),
            new Cuadrado(2),
            new Esfera(4),
            new Cubo(2),
            new Tetraedro(2)
        };
        for (Figura figura : figuras) {
            figura.Describir();

            if (figura instanceof FiguraBidimensional){
                System.out.println("Área: ");
                System.out.println(((FiguraBidimensional) figura).obtenerArea());
                if (figura instanceof Circulo){
                    System.out.println("Color: "+((Circulo)figura).getColor());
                }
            } else if (figura instanceof FiguraTridimensional){
                System.out.println("Área: ");
                System.out.println(((FiguraTridimensional) figura).obtenerArea());
                System.out.println("Volumen: ");
                System.out.println(((FiguraTridimensional) figura).obtenerVolumen());
                if (figura instanceof Tetraedro){
                    System.out.println("Aplicación: "+((Tetraedro)figura).getAplicacion());
                }
            }
            
            System.out.println();
        }
    }
}
