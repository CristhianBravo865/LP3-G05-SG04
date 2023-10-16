public class Bicicleta implements ImpactoEcologico{
    private double desechosrefaccionesKG;
    private double tiempovidaAÑOS;
    final static private double factoremision=0.05;
    
    public Bicicleta(double desechosrefaccionesKG, double tiempovidaAÑOS) {
        this.desechosrefaccionesKG = desechosrefaccionesKG;
        this.tiempovidaAÑOS = tiempovidaAÑOS;
    }

    public double obtenerImpactoEcologico(){
        double datoactividad=(this.desechosrefaccionesKG*tiempovidaAÑOS)/8;
        double impactoecologico=datoactividad*factoremision;
        return impactoecologico;
    }

    @Override
    public String toString() {
        return "\nBicicleta: "+"\nDesechos por refacciones en kg: "+this.desechosrefaccionesKG
        +"\nTiempo de vida de la bicicleta en años: "+this.tiempovidaAÑOS;
    }
    
}
