public class Rectangulo {
    private Coordenada x,y;
    
    public Rectangulo(Coordenada c1, Coordenada c2){
        this.x=c1;
        this.y=c2;
    }
    public Rectangulo(Coordenada ba){
        this.x.setX(0);
        this.x.setY(0);
        this.y=ba;
    }
    public Coordenada getX() {
        return x;
    }
    public void setX(Coordenada x) {
        this.x = x;
    }
    public Coordenada getY() {
        return y;
    }
    public void setY(Coordenada y) {
        this.y = y;
    }
    @Override
    public String toString(){
        return "Las coordenadas de las esquinas son "+x+" , "+y;
    }
}
