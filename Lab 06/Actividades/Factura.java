public class Factura implements PorPagar { 
    private String numeroFactura; 
    private double montoTotal; 
  
    public Factura(String numeroFactura, double montoTotal) { 
        this.numeroFactura = numeroFactura; 
        this.montoTotal = montoTotal; 
    } 
  
    @Override 
    public double obtenerMontoPago() { 
        return montoTotal; 
    } 
  
    @Override 
    public String obtenerInformacionPago() { 
        return "Factura #" + numeroFactura + "\nMonto total: $" + montoTotal; 
    } 
} 
 
