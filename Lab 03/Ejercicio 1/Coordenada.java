public class Coordenada{
    private int x,y;
    public Coordenada(){}
    public Coordenada(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Coordenada(Coordenada c){
        this.x=c.x;
        this.y=c.y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distancia(Coordenada c){
        double disx=this.x-c.x;
        if (disx<0){
            disx=disx*-1;
        }
        double disy=this.y-c.y;
        if (disy<0){
            disy=disy*-1;
        }
        double distancia = Math.sqrt(Math.pow(disx, 2)+Math.pow(disy, 2));
    return distancia;
    }
    public static double distancia(Coordenada c1,Coordenada c2){
        double disx=c2.x-c1.x;
        if (disx<0){
            disx=disx*-1;
        }
        double disy=c2.y-c1.y;
        if (disy<0){
            disy=disy*-1;
        }
        double distancia = Math.sqrt(Math.pow(disx, 2)+Math.pow(disy, 2));
    return distancia;

    }
    @Override
    public String toString(){
        return x+" , "+y;
    }
}