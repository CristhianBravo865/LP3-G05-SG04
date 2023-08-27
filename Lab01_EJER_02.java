import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class PerfilMedico
{
    private String nombre;
    private String apellido;
    private char sexo;
    private int dia, mes, anio;
    private double altura, peso;
    
    public PerfilMedico(String nombre, String apellido, char sexo, int dia, int mes, int anio, double altura, double peso )
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }


public String getnombre() {  
    return nombre;
}
   
public void setnombre(String nombre) {  // modificar valor *set
    this.nombre = nombre;
}

public String getapellido() {  
    return apellido;
}
   
public void setapellido(String apellido) {  
    this.apellido = apellido;
}

public char getsexo() {  
    return sexo;
}
   
public void setsexo(char sexo) {  
    this.sexo = sexo;
}

public int getdia() {  
    return dia;
}
   
public void setdia(int dia) {  
    this.dia = dia;
}


public int getmes() {  
    return mes;
}
   
public void setmes(int mes) {  
    this.mes = mes;
}


public int getanio() {  
    return anio;
}
   
public void setanio(int anio) {  
    this.anio = anio;
}


public double getaltura() {  
    return altura;
}
   
public void setaltura(double altura) {  
    this.altura = altura;
}


public double getpeso() {  
    return peso;
}
   
public void setpeso(double peso) {  
    this.peso = peso;
}

        // Fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();
    
        // Calcular la diferencia entre las fechas
        Period periodo = Period.between(fechaNacimiento, fechaActual);
    
        // Obtener la edad
        int edad = periodo.getYears();

public int calcularFrecuenciaCardiacaMaxima() {
    return 220 - edad;
}

public double calcularIMC() {
    double alturaEnMetros = altura / 100.0;
    return peso / (alturaEnMetros * alturaEnMetros);
}
}


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el sexo (M/F):");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el año de nacimiento:");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el mes de nacimiento:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el dia de nacimiento:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese la altura (en cm):");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el peso (en kg):");
        double peso = scanner.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo,
                                               dia, mes, anio,
                                               altura, peso);

        System.out.println("\nInformación del perfil médico:");
        System.out.println("Nombre: " + perfil.getnombre() + " " + perfil.getapellido());
        System.out.println("Sexo: " + perfil.getsexo());

        System.out.println("Altura: " + perfil.getaltura() + " cm");
        System.out.println("Peso: " + perfil.getpeso() + " kg");

        
        double imc = perfil.calcularIMC();
        int fcm = perfil.calcularFrecuenciaCardiacaMaxima();
        // Fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();
    
        // Calcular la diferencia entre las fechas
        Period periodo = Period.between(fechaNacimiento, fechaActual);
    
        // Obtener la edad
        int edad = periodo.getYears();       

        System.out.println("\nEdad: " + edad + " años");
        System.out.println("Índice de Masa Corporal (IMC): " + imc);
        System.out.println("Frecuencia Cardiaca Máxima (FCM): " + fcm + " latidos por minuto");
    
} }
