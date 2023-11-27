package Lab10;

public class Actividad1 {
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
        System.out.printf("%s ",elemento);
        System.out.println();
        }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float[] floatArray={0.1f,0.2f,0.3f,0.4f};
        Boolean[] booleanArray={true,false,false,true};
        Persona[] personaArray = {
                new Persona("123", "Pedro", "Calle 123"),
                new Persona("456", "Juan", "Avenida 456"),
                new Persona("789", "Charlie", "Calle 78"),
                new Persona("101", "David", "Calle 65")
        };
        imprimirArray(floatArray);
        imprimirArray(booleanArray);
        imprimirArray(personaArray);
    }
}
