package Ejercicio1;

public class Tetraedro extends FiguraTridimensional{
    private String aplicacion="Egypto";
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
        System.out.println("El tetraedro es una figura tridimensional\nEste tiene:\nUna arista de: "+arista);
    }
    public String getAplicacion() {
        return aplicacion;
    }
    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }
    public double getArista() {
        return arista;
    }
    public void setArista(double arista) {
        this.arista = arista;
    }
    
}
