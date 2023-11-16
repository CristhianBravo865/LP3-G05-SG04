package Lab09.Actividades;
public class Persona {
    protected String nombre;
    protected String telefono;
    protected String direccion;
    
    public Persona(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }
    public String getNombre() {
        return nombre;
    }  
      
}
