public class EmpleadoAsalariado extends Empleado implements PorPagar { 
    private double salarioMensual; 
  
    public EmpleadoAsalariado(String nombre, String apellido, String numeroSeguroSocial, double salarioMensual) { 
        super(nombre, apellido, numeroSeguroSocial); 
        this.salarioMensual = salarioMensual; 
    } 
  
    @Override 
    public double obtenerMontoPago() { 
        return salarioMensual; 
    } 
} 
