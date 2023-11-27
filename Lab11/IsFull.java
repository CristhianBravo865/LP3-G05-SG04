public class IsFull extends Exception {
    public IsFull() {
        super("La bolsa está llena, no se puede agregar más objetos.");
    }
}