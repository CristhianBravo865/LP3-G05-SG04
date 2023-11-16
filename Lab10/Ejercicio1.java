package Lab10;

public class Ejercicio1 {
    public static void imprimirArray(Object[] inputArray) {
        for (Object elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }
    //Ejercicio 1
    public static void imprimirArray(String[] inputArray) {
        int totalL=inputArray.length/2;
        int c=0;
        System.out.println("\nArray de cadenas contiene: ");
        for (String i:inputArray){
            c=c+1;
            System.out.printf("%-10s ", i);
            if (c==totalL){
                System.out.println("");
            }
        }
    }
    //Ejercicio 2
    public static <T> void intercambiarElementos(T[] arreglo, int indice1, int indice2) {
        if (indice1 < 0 || indice2 < 0 || indice1 >= arreglo.length || indice2 >= arreglo.length) {
            System.out.println("Índices fuera de rango. No se puede intercambiar.");
            return;
        }

        T temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }
    //Ejercicio 3
    public static <T> boolean isEqualTo(T arg1, T arg2) {
        return arg1 != null && arg1.equals(arg2);
    }
    
    //Main
    public static void main(String[] args) {
        String[] ls={"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho"};
        //Ejercicio 1
        imprimirArray(ls);

        //Ejercicio 2
        intercambiarElementos(ls, 0, 7);
        imprimirArray(ls);

        //Ejercicio 3
        Object obj1 = true;
        Object obj2 = true;
        System.out.println("\n¿Son iguales los objetos ? " + isEqualTo(obj1, obj2));

        Integer int1 = 5;
        Integer int2 = 3;
        System.out.println("¿Son iguales los enteros ? " + isEqualTo(int1, int2));

        Double dbl1 = 3.14;
        Double dbl2 = 2.14;
        System.out.println("¿Son iguales los números decimales ? " + isEqualTo(dbl1, dbl2));

        String str1 = "Hola";
        String str2 = "Hola";
        System.out.println("¿Son iguales las cadenas ? " + isEqualTo(str1, str2));

        
    }


}
