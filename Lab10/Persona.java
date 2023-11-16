package Lab10;

public class Persona {
    private int dni;
    private String nombres;
    private String direccion;
    public Persona(int dni, String n, String d) {
        this.dni = dni;
        this.nombres = n;
        this.direccion = d;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getdireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombres=" + nombres + ", Dirección=" + direccion + "]";
    }
    public int compareTo(Persona otraPersona) {
        return this.nombres.compareTo(otraPersona.nombres);
    }
}
