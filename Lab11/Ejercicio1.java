import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            Goodies g1 = new Goodies(1, "Chocolate", 2.5f);
            Goodies g2 = new Goodies(2, "Galletas", 1.75f);
            Goodies g3 = new Goodies(3, "Caramelos", 1.0f);
            Goodies g4 = new Goodies(4, "Chicles", 0.5f);


            CandyBags candyBag = new CandyBags(5);


            candyBag.add(g1);
            candyBag.add(g2);
            candyBag.add(g3);
            candyBag.add(g4);
            candyBag.add(g1);

            System.out.println(candyBag);

            Goodies cheapestGoodie = candyBag.cheapest();
            System.out.println("Golosina más económica: " + cheapestGoodie.getDescription() + ", Precio: $"
                    + cheapestGoodie.getPrice());

            CandyBags expensiveBags = candyBag.mostExpensive(2);

            Object[] objects = expensiveBags.getObjects();

            Goodies[] expensiveGoodies = Arrays.copyOf(objects, objects.length, Goodies[].class);

            System.out.println("Golosinas más caras:");
            for (Goodies g : expensiveGoodies) {
                System.out.println("- " + g.getDescription() + ", Precio: $" + g.getPrice());
            }

        } catch (IsFull | IsEmpty e) {
            e.printStackTrace();
        }
    }
}
