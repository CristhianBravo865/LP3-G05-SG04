package Ejercicio1;

public class Tetraedro extends FiguraTridimensional{
    private double arista;
    public Tetraedro(double a){
        this.arista=a;
    }
    public double obtenerArea(){
        double area=Math.pow(this.arista, 2)*Math.sqrt(3);
        return area;
    }
    public double obtenerVolumen(){
        double vol=(Math.pow(this.arista, 3)*Math.sqrt(2))/12;
        return vol;
    }
    public void Describir(){
        System.out.println("El tetraedro tiene:\nUna arista de: "+arista+"\nUn área de: "+this.obtenerArea()+"\nUn volumen de: "+this.obtenerVolumen());
    }
}
