public class Manejador {
    public static double area(Rectangulo r){
        double disx=r.getX().getX()-r.getY().getX();
        if (disx<0){
            disx=disx*-1;
        }
        double disy=r.getX().getY()-r.getY().getY();
        if (disy<0){
            disy=disy*-1;
        }
        return disx*disy;
    }
    public static double perimetro(Rectangulo r){
        double disx=r.getX().getX()-r.getY().getX();
        if (disx<0){
            disx=disx*-1;
        }
        double disy=r.getX().getY()-r.getY().getY();
        if (disy<0){
            disy=disy*-1;
        }
        return (disx*2)+(disy*2);
    }
    public static void MoverX(Rectangulo r,int m){
        int XX=r.getX().getX();
        int XY=r.getX().getY();
        int YY=r.getY().getY();
        int YX=r.getY().getX();
        Coordenada c1=new Coordenada(XX+m,XY);
        Coordenada c2=new Coordenada(YX+m,YY);
        r.setX(c1);
        r.setY(c2);
    }
    public static void MoverY(Rectangulo r,int m){
        int XX=r.getX().getX();
        int XY=r.getX().getY();
        int YY=r.getY().getY();
        int YX=r.getY().getX();
        Coordenada c1=new Coordenada(XX,XY+m);
        Coordenada c2=new Coordenada(YX,YY+m);
        r.setX(c1);
        r.setY(c2);
    }
}
