package Ejercicio4;

public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }
    
    @Override
    public double calcularNomina() {
        return super.calcularNomina() * 1.10; 
    }

    @Override
    public String toString() {
        return "Empleado de Distribución\n" +
               "DNI: " + getDni() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Región: " + region + "\n" +
               "Vacaciones: " + getDiasVacaciones() + " días\n" +
               "Salario: " + calcularNomina();
    }



    public String getRegion() {
        return region;
    }



    public void setRegion(String region) {
        this.region = region;
    }
}