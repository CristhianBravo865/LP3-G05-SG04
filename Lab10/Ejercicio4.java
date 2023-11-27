package Lab10;

public class Ejercicio4 {
    public static <T> int buscarElemento(T[] arreglo, Object valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(valorBuscado)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("001", "Producto 1", 10.0),
            new Producto("002", "Producto 2", 15.0),
            new Producto("003", "Producto 3", 20.0)
        };

        Persona[] personas = {
            new Persona("111", "Juan", "Calle 123"),
            new Persona("222", "María", "Avenida 456"),
            new Persona("333", "Carlos", "Calle 789")
        };

        Estudiante[] estudiantes = {
            new Estudiante("444", "Pedro", "Carrera 1", "Ingeniería"),
            new Estudiante("555", "Laura", "Carrera 2", "Medicina"),
            new Estudiante("666", "Ana", "Carrera 3", "Arquitectura")
        };

        int posicionProducto = buscarElemento(productos, new Producto("002", "", 0.0));
        System.out.println("Posición del producto encontrado: " + posicionProducto);

        int posicionPersona = buscarElemento(personas, new Persona("", "María", ""));
        System.out.println("Posición de la persona encontrada: " + posicionPersona);

        int posicionEstudiante = buscarElemento(estudiantes, new Estudiante("", "Laura", "", "Medicina"));
        System.out.println("Posición del estudiante encontrado: " + posicionEstudiante);
    }
}
