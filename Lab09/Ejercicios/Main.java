package Lab09.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final String FILE_PATH = "empleados.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Ver lista de empleados");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número del empleado:");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el sueldo del empleado:");
                    double sueldo = scanner.nextDouble();
                    scanner.nextLine(); 

                    Empleado empleado = new Empleado(numero, nombre, sueldo);
                    agregarEmpleado(empleado);
                    break;
                case 2:
                    reporteEmpleados();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static void reporteEmpleados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("Número\tNombre\tSueldo");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                int numero = Integer.parseInt(data[0]);
                String nombre = data[1];
                double sueldo = Double.parseDouble(data[2]);
                Empleado empleado = new Empleado(numero, nombre, sueldo);
                System.out.println(empleado.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void agregarEmpleado(Empleado empleado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(empleado.getNumero() + "\t" + empleado.getNombre() + "\t" + empleado.getSueldo());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

class Empleado {
    private int numero;
    private String nombre;
    private double sueldo;

    public Empleado(int numero, String nombre, double sueldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return numero + "\t" + nombre + "\t" + sueldo;
    }
}