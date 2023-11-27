public class Actividad4 {
    public static void main(String[] args) {
        Bag<Goodies> bag = new Bag<Goodies>(10);

        Biscuits biscuit1 = new Biscuits(1, "Cookie", 1.5f, "Chocolate");
        Chocolates chocolate1 = new Chocolates(2, "Milk chocolate bar", 2.0f, "Milk");
        Soda soda1 = new Soda(3, "Cola biscuit", 1.2f, "Cola", "Carbonated");
        Sweet sweet1 = new Sweet(4, "Honey biscuit", 1.8f, "Honey", "Dessert");

        try {
            bag.add(biscuit1);
            bag.add(chocolate1);
            bag.add(soda1);
            bag.add(sweet1);

            System.out.println(bag.toString());

        } catch (IsFull e) {
            e.printStackTrace();
        }
        try{
            bag.remove(soda1);
            Object[] l=bag.getObjects();
            for (Object i:l){
                System.out.println(i);
            };

        }catch (IsEmpty|ObjectNoExist e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }}