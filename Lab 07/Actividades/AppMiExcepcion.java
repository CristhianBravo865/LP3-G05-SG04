package Actividades;

public class AppMiExcepcion { 

    public static void main(String[] args){ 

        validaPropia(88); 

    } 

    public static void validaPropia(int n){ 

 
 

        try{ 

            minimo(n); 

            System.out.println(n+" es mayor a 10"); 

        } 

        catch(MiExcepcion e){ 

            System.out.println("No sirve este num"); 

             

        } 

    } 

    public static void minimo(int numero) throws MiExcepcion{ 

        if(numero <=10){ 

            throw new MiExcepcion("Un num mayor a 10 se necesita"); 

        } 

    } 

} 