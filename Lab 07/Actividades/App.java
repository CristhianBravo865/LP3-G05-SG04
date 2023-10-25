package Actividades; 
 
import java.util.*; 

public class App{ 

    public static int cociente(int numerador,int denominador) throws ArithmeticException{ 

        return numerador/denominador; 

    } 

    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in); 

        boolean flag=true; 

        do{ 

            try{ 

                System.out.println("Introduzca un numerador  entero: "); 

                int numerador =sc.nextInt(); 

                System.out.println("Introduzca un denominador entero: "); 

                int denominador=sc.nextInt(); 

 
 

                int resultado=cociente(numerador, denominador); 

                System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,resultado); 

                flag = false; 

            } 

            catch(InputMismatchException inputMismatchE){ 

                System.out.printf("\nExcepcion : %s\n", inputMismatchE); 

                sc.nextLine(); 

                System.out.println("Ingrese enteros. Siga intentando..."); 

            } 

            catch(ArithmeticException arithmeticE){ 

                System.out.printf("\nExcepcion : %s\n",arithmeticE); 

                sc.nextLine(); 

                System.out.println("Cero es un denominador invalido. Intente nuevamente..."); 

            } 

        }while(flag); 

    } 

} 