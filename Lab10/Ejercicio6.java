package Lab10;

import java.util.Arrays;

import java.util.*;

public class Ejercicio6 {

    public static <T> T[] copyArray(T[] arr1, T[] arr2) {
        Set<T> set = new LinkedHashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.toArray(Arrays.copyOf(arr1, 0));
    }

    public static void main(String[] args) {
        
        String[] arrString1 = {"a", "b", "c"};
        String[] arrString2 = {"b", "c", "d"};
        String[] resultString = copyArray(arrString1, arrString2);
        System.out.println("Array combinado de Strings: " + Arrays.toString(resultString));

        Producto[] arrProducto1 = {new Producto("001", "Producto 1", 10.0), new Producto("002", "Producto 2", 20.0)};
        Producto[] arrProducto2 = {new Producto("001", "Producto 1", 10.0), new Producto("003", "Producto 3", 30.0)};
        Producto[] resultProducto = copyArray(arrProducto1, arrProducto2);
        System.out.println("Array combinado de Productos: " + Arrays.toString(resultProducto));

        Persona[] arrPersona1 = {new Persona("888", "Bruce", "Ciudad Gotica 865"), new Persona("999", "Diana", "Temiscira 32")};
        Persona[] arrPersona2 = {new Persona("888", "Bruce", "Ciudad Gotica 865"), new Persona("111", "Clark", "Smallville 84")};
        Persona[] resultPersona = copyArray(arrPersona1, arrPersona2);
        System.out.println("Array combinado de Personas: " + Arrays.toString(resultPersona));
    }
}
