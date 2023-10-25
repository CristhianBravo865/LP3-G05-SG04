package Actividades;
public class AppStack {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception excepcion) {
            System.out.printf("%s\n\n", excepcion.getMessage());
            excepcion.printStackTrace();
            StackTraceElement[] itemRastreo = excepcion.getStackTrace();
            System.out.println("\nRastreo de la pila de getStackTrace:");
            for (StackTraceElement item : itemRastreo) {
                System.out.printf("%s\t", item.getClassName());
                System.out.printf("%s\t", item.getFileName());
                System.out.printf("%s\t", item.getLineNumber());
                System.out.printf("%s\t", item.getMethodName());
            }
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        throw new Exception("La excepcion se lanzo");
    }
}