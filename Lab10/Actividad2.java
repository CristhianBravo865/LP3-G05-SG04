package Lab10;

import java.util.Comparator;
 public class Actividad2{
    
    public static <T> void imprimirArray(T[] inputArray) {
    for(T elemento : inputArray)
    System.out.printf("%s ",elemento);
    System.out.println();
    }

    public static <T extends Comparable<T>> T maximo (T x, T y, T z){
        T max = x;
        if(y.compareTo(x) > 0)
        max = y;
        if(z.compareTo(y) > 0)
        max = z;
       
        return max;
        }

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;

        if (b.compareTo(a) < 0) {
            min = b;
        }
        if (c.compareTo(b) < 0) {
            min = c;
        }
        if (d.compareTo(c) < 0) {
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        Persona p1=new Persona("123", "Pedro", "Calle 123");
        Persona p2=new Persona("456", "Juan", "Avenida 456");
        Persona p3=new Persona("789", "Charlie", "Calle 78");
        Persona p4=new Persona("101", "David", "Calle 65");

        //Actividad 2*/
        System.out.println(minimo(1, 2,3,4));
        System.out.println(minimo(0.8,0.5,0.4,0.3));
        System.out.println(minimo("ww","aa","asa","zzz"));
        System.out.println(minimo(p1,p2,p3,p4));
        System.out.println("a".compareTo("Charlie"));
    }
    
 }
 