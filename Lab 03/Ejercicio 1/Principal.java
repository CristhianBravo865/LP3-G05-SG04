public class Principal{
    public static void main(String[] args) {
        Rectangulo a,b,c;
        Coordenada c5;
        c5=new Coordenada(4,2);
        a=new Rectangulo(c5);
        b=new Rectangulo(c5);
        c=new Rectangulo(c5);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}