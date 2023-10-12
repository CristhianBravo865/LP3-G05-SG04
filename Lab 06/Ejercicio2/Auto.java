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
}
