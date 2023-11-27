public class Actividad1 {
    public static void main(String[] args) {
        //Personas
        Persona[] personas = {
            new Persona("Juan", "Calle A", "123456789"),
            new Persona("María", "Calle B", "987654321"),
            new Persona("Pedro", "Calle C", "111222333")
        };
        System.out.println("Comprobación Personas: ");
        Verificadora<Persona> Pc = new Verificadora<Persona>(personas);
        System.out.println(Pc.contiene(new Persona("Juan", null, null)));
        System.out.println(Pc.contiene(new Persona("Eminem", "Calle A", "123456789")));
        System.out.println(Pc.contiene(new Persona("Pedro", "Calle C", null)));
        
        //Goodies
        Goodies[] goodies = {
            new Goodies(1, "Producto A", 10.5f),
            new Goodies(2, "Producto B", 20.0f),
            new Goodies(3, "Producto C", 15.75f)
        };
        System.out.println("Comprobación Goodies: ");
        Verificadora<Goodies> Gc = new Verificadora<Goodies>(goodies);
        System.out.println(Gc.contiene(new Goodies(2, null, 0)));
        System.out.println(Gc.contiene(new Goodies(4, "Producto B", 20.0f)));
        System.out.println(Gc.contiene(new Goodies(1, null, 0)));

        
        //Estudiantes
        Procedencia procedencia1 = new Procedencia("Dept. 1", "Prov. A");
        Procedencia procedencia2 = new Procedencia("Dept. 2", "Prov. B");
        Estudiante[] estudiantes = {
            new Estudiante("Cristiano", "Calle D", "555444333", "Ing. Informática", procedencia1),
            new Estudiante("Carlos", "Calle E", "222333444", "Medicina", procedencia2),
            new Estudiante("Lionel", "Calle F", "777888999", "Derecho", procedencia2)
        };
        System.out.println("Comprobación Estudiantes: ");
        Verificadora<Estudiante> Ec = new Verificadora<Estudiante>(estudiantes);
        System.out.println(Ec.contiene(new Estudiante("Cristiano", null, null, null, procedencia1)));
        System.out.println(Ec.contiene(new Estudiante("Lionel", null, null, null, procedencia1)));
        System.out.println(Ec.contiene(new Estudiante("Carlos", null, null, null, procedencia2)));
    }
}