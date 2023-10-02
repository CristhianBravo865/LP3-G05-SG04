package Ejercicio3;
public class TestAsociacion {
    public static void main(String[] args) {
        Banco banco = new Banco("BCP");

        Persona cliente1 = new Persona(1, "Bruno", "Días");
        Persona cliente2 = new Persona(2, "Arthur", "Morgan");
        Persona cliente3 = new Persona(3, "Luffy", "Monkey");

        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);

        banco.clientesTipo('C');
        banco.clientesTipo('B');

        Persona clienteEliminado = banco.darBajaCliente(2);
        if (clienteEliminado != null) {
            System.out.println("Cliente eliminado: " + clienteEliminado.getNombre());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
