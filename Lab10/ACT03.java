package Lab10;
public class ACT03 {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            System.out.println("Imprimiendo subarreglo del 3 al 7:");
            int cantidadElementos = imprimirArray(intArray, 3, 7);
            System.out.println("Cantidad de elementos en el rango: " +
                    cantidadElementos);
            System.out.println("\nImprimiendo subarreglo del 5 al 12:");
            cantidadElementos = imprimirArray(intArray, 5, 12);
            System.out.println("Cantidad de elementos en el rango: " +
                    cantidadElementos);
        } catch (LimiteInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static <T> int imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
        return inputArray.length;
    }

    public static <T> int imprimirArray(T[] inputArray, int limiteInferior,
            int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= inputArray.length ||
                limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Límites inválidos");
        }
        int cantidadElementos = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.printf("%s ", inputArray[i]);
            cantidadElementos++;
        }
        System.out.println();
        return cantidadElementos;
    }
}

class LimiteInvalidoException extends Exception {
    public LimiteInvalidoException(String mensaje) {
        super(mensaje);
    }
}
