package Ejercicio1;

public class TestComposicion {
    public static void main(String[] args) {
        Persona p1 = new Persona(1, "Bruno", "Días");
        Persona p2 = new Persona(2, "Arthur", "Morgan");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();
        p1.getCuenta().DepositarCantidad(1000);
        p2.getCuenta().RetrirarCantidad(8888);
        p2.getCuenta().RetrirarCantidad(2);
        System.out.println();
        System.out.println(p1);
        System.out.println(p2);
        
    }
}
