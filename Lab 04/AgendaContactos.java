import java.util.Scanner;
import java.util.ArrayList;

public class AgendaContactos {
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de Agenda de Contactos:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Listar todos los contactos");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono);
                    agenda.add(nuevoContacto);
                    System.out.println("Contacto agregado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    eliminarContacto(agenda, nombreEliminar);
                    break;
                case 3:
                    listarContactos(agenda);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    buscarContacto(agenda, nombreBuscar);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static void eliminarContacto(ArrayList<Contacto> agenda, String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
                agenda.remove(i);
                System.out.println("Contacto eliminado con éxito.");
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public static void listarContactos(ArrayList<Contacto> agenda) {
        if (agenda.isEmpty()) {
            System.out.println("La agenda de contactos está vacía.");
        } else {
            System.out.println("Lista de Contactos:");
            for (Contacto contacto : agenda) {
                System.out.println(contacto);
            }
        }
    }

    public static void buscarContacto(ArrayList<Contacto> agenda, String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : agenda) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado:");
                System.out.println(contacto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }
}