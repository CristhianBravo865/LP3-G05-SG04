public abstract class Empleado implements PorPagar { 
    private String nombre; 
    private String apellido; 
    private String numeroSeguroSocial; 
  
    public Empleado(String nombre, String apellido, String numeroSeguroSocial) { 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.numeroSeguroSocial = numeroSeguroSocial; 
    } 
  
    public String obtenerNombre() { 
        return nombre; 
    } 
  
    public String obtenerApellido() { 
        return apellido; 
    } 
  
    public String obtenerNumeroSeguroSocial() { 
        return numeroSeguroSocial; 
    } 
  
    @Override 
    public String obtenerInformacionPago() { 
        return "Nombre: " + nombre + " " + apellido + "\nNúmero de seguro social: " + numeroSeguroSocial; 
    } 
} 
