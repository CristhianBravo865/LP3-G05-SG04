public class ObjectNoExist extends Exception {
    public ObjectNoExist(){
        super(new String("El objeto no existe en la bolsa."));
    }
    public ObjectNoExist(String m) {
        super(m);
    }
}