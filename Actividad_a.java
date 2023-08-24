import java.util.scanner;

public class Animal{

    private String Raza;
    private int Edad;
    private double Peso;
    private double Temperatura;

    public Animal (String Raza, int Edad, double Peso, double Temperatura)
    {
        this.Raza = raza;
        this.Edad = edad;
        this.Peso = peso;
        this.Temperatura = temp;
    }
    public int getEdad() {  // obetener valor *get
        return edad;
    }

    public void setEdad(int edad) {  // modificar valor *set
        this.Edad = edad;
    }

    public double getPeso () {
        return peso;
    }
    public void setPeso( double peso){
        this.Peso = peso;
    }

    public double getTemperatura () {
        return temp;
    }
    public void setTemperatura (double temp){
        this.Temperatura = temp;
    }
}

public Animal ()
{
    this.raza = "Chihuahua";
    this.edad = 10;
    this.peso = 10.5;
    this.temp = 37;
}
