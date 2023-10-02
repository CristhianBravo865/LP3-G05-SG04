package Ejercicio4;

public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularNomina() {
        return super.calcularNomina() * 1.15; // Incremento del 15% para producción
    }

    @Override
    public String toString() {
        return "Empleado de Producción\n" +
               "DNI: " + getDni() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Turno: " + turno + "\n" +
               "Vacaciones: " + getDiasVacaciones() + " días\n" +
               "Salario: " + calcularNomina();
    }

      public String getTurno() {
            return turno;
      }

      public void setTurno(String turno) {
            this.turno = turno;
      }
}
