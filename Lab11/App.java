public class App {
    public static void main(String[] args) {
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 88);
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(2, "Hello there");
        Persona persona = new Persona("Goku", "Dirección 34", "936262123");
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("key", persona);

        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());
        System.out.println("Pair 3: " + pair3.toString());
    }
}
