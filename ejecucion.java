import java.util.Scanner;

public class Main {  
    public void Main (String[] args)
    {
        Scanner scanner = new scanner(System.in);

        Animal perro = new Animal(peso, temp, edad);

        double peso = perro.getPeso();
        double temp = perro.getTemperarura();
        double edad = perro.getEdad();

        System.out.printin("La edad del perro: ");
        int Edad = scanner.nextint ();

        System.out.printin("Ingrese la temperatura del perro: ");
        double temp = scanner.nextDouble ();

        System.out.printin("Ingrese el peso del perro: ");
        double peso = scanner.nextDouble ();

        System.out.printin("La edad: " + texto + "La temperatura: "+ numero + "El peso: "+decimal);

        if (temp <=40 && temp >= 37 && edad > 1 && peso > 5)
            sistem.out.printin("Perro sano"); 
        else
            sistem.out.printin("Perro enfermo");

    }
}
