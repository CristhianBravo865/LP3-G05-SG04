package Ejercicio1;

public class Cuadrado extends FiguraBidimensional{
    private double lado;
    public Cuadrado(double l){
        this.lado=l;
    }
    public double obtenerArea(){
        double area=this.lado*this.lado;
        return area;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    };
    public void Describir(){
        System.out.println("El cuadrado tiene:\nUn lado de: "+lado+"\nUn área de: "+this.obtenerArea());
    }
}
