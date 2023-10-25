package Actividades;

public class AppExcepcion { 

    public static void main(String[] args){ 

        try{ 

            metodo1(); 

        } 

        catch(Exception excepcion){ 

            System.out.println("La excepcion se manejo en main"); 

        } 

        metodo2(); 

    } 

    public static void metodo1() throws Exception{ 

        try{ 

            System.out.println("Metodo 1"); 

            throw new Exception(); 

        } 

        catch(Exception excepcion){ 

            System.out.println("La excepcion se manejo en el metodo 1"); 

            throw excepcion; 

        } 

        finally{ 

            System.out.println("Se ejecuto finally del metodo 1"); 

        } 

    } 

    public static void metodo2() { 

        try{ 

            System.out.println("Metodo metodo2"); 

        } 

        catch(Exception excepcion){ 

            System.out.println(excepcion); 

        } 

        finally{ 

            System.out.println("Se ejecuto finally del metodo 2"); 

        } 

        System.out.println("FIN metodo2"); 

    } 

} 