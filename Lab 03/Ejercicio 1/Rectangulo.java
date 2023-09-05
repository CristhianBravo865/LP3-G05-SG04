public class Rectangulo {
    private Coordenada x,y;
    private String color;
    private static String ultimocolor="Rojo";
    private void CreacionColor(){
        if (ultimocolor=="Verde"){
            ultimocolor="Amarillo";
        }
        else if (ultimocolor=="Amarillo"){
            ultimocolor="Rojo";
        }
        else if (ultimocolor=="Rojo"){
            ultimocolor="Verde";
        }
    }
    public Rectangulo(Coordenada c1, Coordenada c2){
        this.x=c1;
        this.y=c2;
        CreacionColor();
        this.color=ultimocolor;
    }
    public Rectangulo(Coordenada ba){
        Coordenada n = new Coordenada(0,0);
        this.x=n;
        this.y=ba;
        CreacionColor();
        this.color=ultimocolor;
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
        return "Las coordenadas de las esquinas son "+this.x+" , "+this.y+" , su color es "+this.color;
    }
}
