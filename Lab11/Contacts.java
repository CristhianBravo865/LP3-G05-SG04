import java.util.Scanner;

public class Contacts {
    private Dictionary<String, Persona> contactos;

    public Contacts() {
        this.contactos = new Dictionary<>();
    }

    public void agregarContacto(String dni, Persona persona) {
        contactos.add(dni, persona);
    }

    public boolean eliminarContacto(String dni) {
        return contactos.delete(dni);
    }

    public Persona obtenerContacto(String dni) throws ObjectNoExist {
        return contactos.getValue(dni);
    }

    public void mostrarContactos() {
        System.out.println("Lista de Contactos:");
        System.out.println(contactos);
    }

    public static void main(String[] args) {
        Contacts agenda = new Contacts();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Obtener Contacto");
            System.out.println("4. Mostrar Todos los Contactos");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el DNI del contacto:");
                    String dni = scanner.nextLine();
                    System.out.println("Ingrese el nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la dirección:");
                    String direccion = scanner.nextLine();
                    System.out.println("Ingrese el teléfono:");
                    String telefono = scanner.nextLine();

                    Persona nuevaPersona = new Persona(nombre, direccion, telefono);
                    agenda.agregarContacto(dni, nuevaPersona);
                    break;

                case 2:
                    System.out.println("Ingrese el DNI del contacto a eliminar:");
                    String dniEliminar = scanner.nextLine();
                    boolean eliminado = agenda.eliminarContacto(dniEliminar);
                    if (eliminado) {
                        System.out.println("Contacto con DNI " + dniEliminar + " eliminado.");
                    } else {
                        System.out.println("No se encontró un contacto con el DNI " + dniEliminar);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el DNI del contacto a buscar:");
                    String dniBuscar = scanner.nextLine();
                    try {
                        Persona contacto = agenda.obtenerContacto(dniBuscar);
                        System.out.println("Contacto encontrado:");
                        System.out.println(contacto);
                    } catch (ObjectNoExist e) {
                        System.out.println("No se encontró un contacto con el DNI " + dniBuscar);
                    }
                    break;

                case 4:
                    agenda.mostrarContactos();
                    break;

                case 5:
                    System.out.println("FIN");
                    break;

                default:
                    System.out.println("Opción inválida, por favor ingrese una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
