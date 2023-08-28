import java.util.Scanner;
public class pylab01 {
public static void main(String[] args) {
    int vida, rp;
    boolean fl = false;
    vida = 0;
    Scanner sc = new Scanner(System.in);
    do {
        vida ++;
        System.out.println("Vida:"+ vida + "\téCual es el nimero secreto? ");
        rp = sc.nextInt();
    if (rp == 1234)
        fl = true;
    }while(vida < 3 & !fl );
    if (fl == true)
        System.out.println("Correcto. Usted se a ganado un celular. ");
    else
        System.out.println("Vaya, has perdido");
    }
}
