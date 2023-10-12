package Ejercicio1;

public class Triangulo extends FiguraBidimensional{
    private double h;
    private double b;
    public Triangulo(double h,double b){
        this.h=h;
        this.b=b;
    }
    public double obtenerArea(){
        double area=(this.h*this.b)/2;
        return area;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void Describir(){
    System.out.println("El triangulo es una figura bidimensional\nEste tiene:\nUna altura de: "+h+"\nUna base de: "+b);
    }
}
