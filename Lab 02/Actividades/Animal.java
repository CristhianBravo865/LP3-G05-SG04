import java.util.*;

public class Animal{

    private String Raza;
    private int Edad;
    private double Peso;
    private double Temperatura;

    public Animal (String Raza, int Edad, double Peso, double Temperatura)
    {
        this.Raza = Raza;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Temperatura = Temperatura;
    }
   
public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double temperatura) {
        Temperatura = temperatura;
    }

}
