import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList <ImpactoEcologico> L=new ArrayList<>(Arrays.asList(
            new Auto(20, 10, 5),
            new Bicicleta(2, 5),
            new Edificio(200, 50, 1.5)));
    for(ImpactoEcologico i:L){
        System.out.println(i.toString());
        System.out.println("Impacto ecológico: "+i.obtenerImpactoEcologico());
    }
    }
}
