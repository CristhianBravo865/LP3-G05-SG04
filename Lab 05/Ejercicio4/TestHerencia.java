package Ejercicio4;

public class TestHerencia {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28, 3500.0);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan Mota",  55333222, 30, "noche", 4000.0);
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Camino", 55333666, 35, "Granada", 3800.0);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}
