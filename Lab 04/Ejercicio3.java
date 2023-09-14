import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[5][4];
        System.out.println("Ingrese los datos de ventas del mes pasado (vendedor producto monto), o -1 para terminar:");
        while (true) {
            System.out.println("Ingrese el número de vendedor (1 al 4)");
            int vendedor = scanner.nextInt();
            if (vendedor == -1) {
                break;
            }
            System.out.println("Ingrese el número de producto (1 al 5)");
            int producto = scanner.nextInt();
            System.out.println("Ingrese el valor total en dólares de ese producto vendido en ese día");
            double monto = scanner.nextDouble();

            ventas[producto - 1][vendedor - 1] += monto;
        }
        System.out.println("Ventas por Producto y Vendedor:");
        System.out.println("Producto | Vendedor 1 | Vendedor 2 | Vendedor 3 | Vendedor 4 | Total Producto");
        System.out.println("----------------------------------------------");

        double[] totalVendedor = new double[4];
        double[] totalProducto = new double[5];

        for (int producto = 0; producto < 5; producto++) {
            System.out.printf("%8d |", producto + 1);
            double totalPorProducto = 0;
            for (int vendedor = 0; vendedor < 4; vendedor++) {
                System.out.printf(" %12.2f |", ventas[producto][vendedor]);
                totalPorProducto += ventas[producto][vendedor];
                totalVendedor[vendedor] += ventas[producto][vendedor];
            }
            totalProducto[producto] = totalPorProducto;
            System.out.printf(" %12.2f%n", totalPorProducto);
        }

        System.out.println("----------------------------------------------");
        System.out.print("Total Vendedor |");
        double totalGeneral = 0;
        for (int vendedor = 0; vendedor < 4; vendedor++) {
            System.out.printf(" %12.2f |", totalVendedor[vendedor]);
            totalGeneral += totalVendedor[vendedor];
        }
        System.out.printf(" %12.2f%n", totalGeneral);
    }
}
