public class Bag<T> {
    private T[] list;
    private int count; 

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count >= list.length) {
            throw new IsFull();
        }
        list[count++] = obj;
    }

    public T[] getObjects() throws IsEmpty {
        if (count == 0) {
            throw new IsEmpty();
        }
        return list;
    }

    public T remove(T obj) throws ObjectNoExist {
        int index = this.getIndex(obj);
        if (index == -1) {
            throw new ObjectNoExist("El objeto no existe en la bolsa.");
        }
        T removedObj = list[index];
        for (int i = index; i < count - 1; i++) {
            list[i] = list[i + 1];
        }
        count--;
        return removedObj;
    }

    public int getIndex(T a) {
        for (int i = 0; i < count; i++) {
            if (list[i] != null && list[i].equals(a)) {
                return i;
            }
        }
        return -1;
    }
    

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Contenido de la bolsa:\n");
        for (int i = 0; i < count; i++) {
            result.append(list[i].toString()).append("\n");
        }
        return result.toString();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
