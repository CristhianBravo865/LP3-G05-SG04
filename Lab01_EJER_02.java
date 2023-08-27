import java.util.Scanner;

class PerfilMedico {
    private String nombre;
    private String apellido;
    private char sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura; // en centímetros
    private double peso;   // en kilogramos

    public PerfilMedico(String nombre, String apellido, char sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento,
                        double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularEdad() {
        // Suponiendo que la fecha actual es 2023-08-23
        int edad = 2023 - anioNacimiento;
        if (mesNacimiento > 8 || (mesNacimiento == 8 && diaNacimiento > 23)) {
            edad--;
        }
        return edad;
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
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

        System.out.println("Ingrese el día de nacimiento:");
        int diaNacimiento = scanner.nextInt();

        System.out.println("Ingrese el mes de nacimiento:");
        int mesNacimiento = scanner.nextInt();

        System.out.println("Ingrese el año de nacimiento:");
        int anioNacimiento = scanner.nextInt();

        System.out.println("Ingrese la altura (en cm):");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el peso (en kg):");
        double peso = scanner.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo,
                                               diaNacimiento, mesNacimiento, anioNacimiento,
                                               altura, peso);

        System.out.println("\nInformación del perfil médico:");
        System.out.println("Nombre: " + perfil.getnombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de nacimiento: " + perfil.getDiaNacimiento() + "/" +
                           perfil.getMesNacimiento() + "/" + perfil.getAnioNacimiento());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        int edad = perfil.calcularEdad();
        double imc = perfil.calcularIMC();
        int fcm = perfil.calcularFrecuenciaCardiacaMaxima();

        System.out.println("\nEdad: " + edad + " años");
        System.out.println("Índice de Masa Corporal (IMC): " + imc);
        System.out.println("Frecuencia Cardiaca Máxima (FCM): " + fcm + " latidos por minuto");
    }
}
