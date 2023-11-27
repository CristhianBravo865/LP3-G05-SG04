import java.util.ArrayList;

public class Dictionary<K, V> {
    private ArrayList<Pair<K, V>> pairs;

    public Dictionary() {
        this.pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        Pair<K, V> newPair = new OrderedPair<>(key, value);
        pairs.add(newPair);
    }

    public boolean delete(K key) {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExist {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("Clave no encontrada");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Pair<K, V> pair : pairs) {
            result.append(pair.toString());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Dictionary<Integer, String> dict = new Dictionary<>();
        dict.add(1, "Uno");
        dict.add(2, "Dos");
        dict.add(3, "Tres");
        System.out.println("Diccionario:");
        System.out.println(dict);
        try{
        System.out.println("Valor para la key 2" + dict.getValue(2));
            }catch (ObjectNoExist e){
                e.printStackTrace();
            }
        System.out.println("Eliminando la key 2");
        boolean deleted = dict.delete(2);
        if (deleted) {
            System.out.println("Key 2 eliminada");
            System.out.println("Diccionario actualizado");
            System.out.println(dict);
        } else {
            System.out.println("Key 2 no encontrada");
        }

        try {
            System.out.println("Valor para la key 2 " + dict.getValue(2));
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}