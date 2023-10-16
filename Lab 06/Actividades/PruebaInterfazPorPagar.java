public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        // Crear objetos de tipo Factura, EmpleadoAsalariado y Prestamo
        Factura factura = new Factura("F001", 1000.00);
        EmpleadoAsalariado empleado = new EmpleadoAsalariado("John", "Doe", "123456789", 2000.00);
        Prestamo prestamo = new Prestamo(12, 500.00);
        // Imprimir información de pago de la factura, del empleado y del préstamo
        System.out.println("Información de pago de la factura:");
        System.out.println(factura.obtenerInformacionPago());
        System.out.println("Monto a pagar: $" + factura.obtenerMontoPago());
        System.out.println();
        System.out.println("Información de pago del empleado:");
        System.out.println(empleado.obtenerInformacionPago());
        System.out.println("Monto a pagar: $" + empleado.obtenerMontoPago());
        System.out.println();
        System.out.println("Información de pago del préstamo:");
        System.out.println(prestamo.toString());
    }
}
