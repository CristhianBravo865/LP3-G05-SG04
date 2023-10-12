package Ejercicio1;
public class Circulo extends FiguraBidimensional{
    private double radio;
    public Circulo(double r){
        this.radio=r;
    }

    public double obtenerArea(){
        double area=Math.PI*Math.pow(this.radio,2);
        return area;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void Describir(){
        System.out.println("El circulo tiene:\nUn radio de: "+radio+"\nUn área de: "+this.obtenerArea());
    }
}
