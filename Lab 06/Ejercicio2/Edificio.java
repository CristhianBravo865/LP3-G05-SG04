public class Edificio implements ImpactoEcologico{
    private double basuraGeneradaKG;
    private double usoDeAerosolesML;
    private double tiempovidaAÑOS;
    final static private double factoremision=0.5;
    
    public Edificio(double basuraGeneradaKG, double usoDeAerosolesML, double tiempovidaAÑOS) {
        this.basuraGeneradaKG = basuraGeneradaKG;
        this.usoDeAerosolesML = usoDeAerosolesML;
        this.tiempovidaAÑOS = tiempovidaAÑOS;
    }

    public double obtenerImpactoEcologico(){
        double datoactividad=(this.basuraGeneradaKG+(this.usoDeAerosolesML/4))*tiempovidaAÑOS;
        double impactoecologico=datoactividad*factoremision;
        return impactoecologico;
    }

    @Override
    public String toString() {
        return "\nEdificio: "+"\nUso de Aerosoles en ml: "+this.usoDeAerosolesML+
        "\nBasura generada en kg: "+this.basuraGeneradaKG
        +"\nTiempo de vida del edificio en años: "+this.tiempovidaAÑOS;
    }
    
}
