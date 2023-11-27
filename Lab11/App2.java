import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        Bag<Integer> bagInteger = new Bag<>(3);
        Bag<String> bagString = new Bag<>(2);
        Bag<Persona> bagPersona = new Bag<>(3);

        try {
            bagInteger.add(10);
            bagInteger.add(20);
            bagInteger.add(30);
        } catch (IsFull e) {
            e.printStackTrace();
        }
        try {
            bagString.add("Hola");
            bagString.add("Mundo");
        } catch (IsFull e) {
            e.printStackTrace();
        }
        try {
            bagPersona.add(new Persona("Juan", "", ""));
            bagPersona.add(new Persona("María", "", ""));
            bagPersona.add(new Persona("Pedro", "", ""));
        } catch (IsFull e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Contenido de la bolsa de enteros:");
            Object[] integersl = bagInteger.getObjects();
            for (Object i : integersl) {
                System.out.println(i);
            }

            System.out.println("\nContenido de la bolsa de Strings:");
            Object[] stringsl = bagString.getObjects();
            for (Object i : stringsl) {
                System.out.println(i);
            }

            System.out.println("\nContenido de la bolsa de personas:");
            Object[] personasObj = bagPersona.getObjects();
            Persona[] personas = Arrays.copyOf(personasObj, personasObj.length, Persona[].class);
            for (Persona persona : personas) {
                System.out.println(persona);
            }

            System.out.println("\nRemoviendo 'Mundo' de la bolsa de Strings:");
            bagString.remove("Mundo");
            System.out.println(bagString.toString());

            int indexJuan = bagPersona.getIndex(new Persona("Juan", "", ""));
            System.out.println("\nÍndice de 'Juan' en la bolsa de personas: " + indexJuan);
        } catch (IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
