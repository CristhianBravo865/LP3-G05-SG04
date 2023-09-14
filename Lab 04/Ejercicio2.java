import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        int totalPersonas = 8;
        int hombres = 0;
        int mujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sueldoHombresTrabajan = 0;
        int sueldoMujeresTrabajan = 0;
        Random random = new Random();
        for (int i = 0; i < totalPersonas; i++) {
            int sexo = random.nextInt(2) + 1; 
            int trabaja = random.nextInt(2) + 1; 
            int sueldo = 0;

            if (trabaja == 1) {
                sueldo = random.nextInt(3001 - 950) + 950; 
            }
            if (sexo == 1) {
                hombres++;
                if (trabaja == 1) {
                    hombresTrabajan++;
                    sueldoHombresTrabajan += sueldo;
                }
            } else {
                mujeres++;
                if (trabaja == 1) {
                    mujeresTrabajan++;
                    sueldoMujeresTrabajan += sueldo;
                }
            }
        }
        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / hombres * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / mujeres * 100;
        double sueldoPromedioHombresTrabajan = (double) sueldoHombresTrabajan / hombresTrabajan;
        double sueldoPromedioMujeresTrabajan = (double) sueldoMujeresTrabajan / mujeresTrabajan;
        System.out.println("a) Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c) Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("d) Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("e) Sueldo promedio de los hombres que trabajan: " + sueldoPromedioHombresTrabajan);
        System.out.println("f) Sueldo promedio de las mujeres que trabajan: " + sueldoPromedioMujeresTrabajan);
    }
}
