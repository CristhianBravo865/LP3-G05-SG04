package Ejercicio1;

public class Esfera extends FiguraTridimensional{
    private double radio;
    public Esfera(double r){
        this.radio=r;
    }
    public double obtenerArea(){
        double area=Math.pow(this.radio, 2)*4*Math.PI;
        return area;
    }
    public double obtenerVolumen(){
        double vol=(Math.pow(this.radio, 3)*4*Math.PI)/3;
        return vol;
    }
    public void Describir(){
        System.out.println("La esfera tiene:\nUn radio de: "+radio+"\nUn área de: "+this.obtenerArea()+"\nUn volumen de: "+this.obtenerVolumen());
    }
}
