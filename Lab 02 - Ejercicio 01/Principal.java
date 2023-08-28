import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        String titular = s1.nextLine();
        System.out.print("Desea ingresar una cantidad (S/N): ");
        String confirmacionIngresar = s1.next();
        double cantidadInicial = 0.0;

        if (confirmacionIngresar.equals("S")) {
            System.out.print("Ingrese la cantidad inicial: ");
            cantidadInicial = s1.nextDouble();
        }

        CuentaBanco cuenta;

        if (cantidadInicial > 0) {
            cuenta = new CuentaBanco(titular, cantidadInicial);
        } else {
            cuenta = new CuentaBanco(titular);
        }

        System.out.println("Información de la cuenta:");
        System.out.println(cuenta);

        int opcion;

        do {
            System.out.println("\nMenú");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = s1.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double cantidadIngresar = s1.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = s1.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    System.out.println(cuenta.toString());
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo por favor.");
            }
        } while (opcion != 4);
        s1.close();
    }
}