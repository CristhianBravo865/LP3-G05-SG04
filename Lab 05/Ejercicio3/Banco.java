package Ejercicio3;
public class Banco {
    private String nombre;
    private Persona clientes[];
    private int numClientes;

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }

    public void agregarCliente(Persona persona) {
        if (numClientes < clientes.length) {
            clientes[numClientes] = persona;
            numClientes++;
        } else {
            System.out.println("El banco está lleno, no se pueden agregar más clientes.");
        }
    }

    public Persona darBajaCliente(int id) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getId() == id) {
                Persona clienteEliminado = clientes[i];
                clientes[i] = clientes[numClientes - 1];
                clientes[numClientes - 1] = null;
                numClientes--;
                return clienteEliminado;
            }
        }
        return null; 
    }

    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo " + tipo + ":");
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].getCuenta().getTipoCliente() == tipo) {
                System.out.println(clientes[i]);
            }
        }
    }

    public String toString() {
        
        return "Banco: " + nombre; 
    }
}
