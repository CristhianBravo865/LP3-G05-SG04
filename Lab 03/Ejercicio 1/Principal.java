public class Principal{
    public static void main(String[] args) {
        Rectangulo a,b;
        Coordenada c1,c2,c3,c4;
        c1=new Coordenada(0, 0);
        c2=new Coordenada(1, 2);
        c3=new Coordenada(2, 0);
        c4=new Coordenada(4, 2);
        a=new Rectangulo(c1,c2);
        b=new Rectangulo(c3,c4);
        Coordenada.distancia(c1, c2);
        System.out.println(Coordenada.distancia(c3, c4));
        System.out.println(a.toString());
    }
}