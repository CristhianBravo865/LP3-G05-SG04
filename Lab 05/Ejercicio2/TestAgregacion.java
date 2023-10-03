package Ejercicio2;

public class TestAgregacion {
    public static void main(String[] args) {
        Motor motor1 = new Motor(1, 2000);

        Automovil auto1 = new Automovil("BFD763", 4, "Toyota", "Camry");
        Automovil auto2 = new Automovil("ZZZ777", 2, "Dodge", "Hellcat");

        auto1.setMotor(motor1);

        System.out.println(auto1.toString());
        System.out.println();
        System.out.println(auto2.toString());
        System.out.println();
        System.out.println(motor1);
    }
}
