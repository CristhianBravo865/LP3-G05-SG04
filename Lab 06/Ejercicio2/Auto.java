public class Auto implements ImpactoEcologico{
    private int emisionesdirectas;
    private double desechosrefaccionesKG;
    private double tiempovidaAÑOS;
    final static private double factoremision=0.05;
    
    public Auto(int emisionesdirectas, double desechosrefaccionesKG, double tiempovidaAÑOS) {
        this.emisionesdirectas = emisionesdirectas;
        this.desechosrefaccionesKG = desechosrefaccionesKG;
        this.tiempovidaAÑOS = tiempovidaAÑOS;
    }

    public double obtenerImpactoEcologico(){
        double datoactividad=(this.desechosrefaccionesKG+Math.pow(emisionesdirectas, 2))*tiempovidaAÑOS;
        double impactoecologico=datoactividad*factoremision;
        return impactoecologico;
    }

    @Override
    public String toString() {
        return "\nAuto: "+"\nEmisiones Directas: "+this.emisionesdirectas+
        "\nDesechos por refacciones en kg: "+this.desechosrefaccionesKG
        +"\nTiempo de vida del auto en años: "+this.tiempovidaAÑOS;
    }
    
}
