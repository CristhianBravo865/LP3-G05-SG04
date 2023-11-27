import java.util.Arrays;

public class CandyBags extends Bag<Goodies> {

    public CandyBags(int n) {
        super(n);
    }

    @Override
    public void add(Goodies obj) throws IsFull {
        if (getIndex(obj) != -1) {
            System.out.println("La golosina ya está incluida en la bolsa.");
        }
        super.add(obj);
    }

    public Goodies cheapest() throws IsEmpty {
        Object[] objects = super.getObjects(); 

        Goodies[] goodies = Arrays.copyOf(objects, objects.length, Goodies[].class);
    
        if (goodies.length == 0) {
            throw new IsEmpty();
        }
    
        Goodies cheapestGoodie = goodies[0];
        for (int i = 1; i < goodies.length; i++) {
            if (goodies[i].getPrice() < cheapestGoodie.getPrice()) {
                cheapestGoodie = goodies[i];
            }
        }
    
        return cheapestGoodie;
    }
    

    public CandyBags mostExpensive(int n) throws IsEmpty, IsFull {
        Object[] objects = super.getObjects(); 
    
       
        Goodies[] goodies = Arrays.copyOf(objects, getCount(), Goodies[].class);
    
        if (goodies.length == 0) {
            throw new IsEmpty();
        }
    
        Arrays.sort(goodies, (g1, g2) -> Float.compare(g2.getPrice(), g1.getPrice())); 
    
        n = Math.min(n, goodies.length); 
    
        CandyBags expensiveBag = new CandyBags(n);
        for (int i = 0; i < n; i++) {
            expensiveBag.add(goodies[i]);
        }
        return expensiveBag;
    }
    
}
