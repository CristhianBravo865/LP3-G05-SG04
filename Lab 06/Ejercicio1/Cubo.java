package Ejercicio1;

public class Cubo extends FiguraTridimensional{
    private double arista;
    public Cubo(double a){
        this.arista=a;
    }
    public double obtenerArea(){
        double area=Math.pow(this.arista, 2)*6;
        return area;
    }
    public double obtenerVolumen(){
        double vol=Math.pow(this.arista, 3);
        return vol;
    }
    public void Describir(){
        System.out.println("El cubo es una figura tridimensional\nEste tiene:\nUna arista de: "+arista);
    }
}
