package Lab10;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String n, String d) {
        this.dni = dni;
        this.nombres = n;
        this.direccion = d;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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
        return "Persona [DNI=" + dni + ", Nombres=" + nombres + ", Dirección=" + direccion + "]";
    }

    public int compareTo(Persona otraPersona) {
        String fcharthis=String.valueOf(this.nombres.charAt(0));
        String fcharparametro=String.valueOf(otraPersona.nombres.charAt(0));
        return fcharthis.compareTo(fcharparametro);
    }
    //Ejercicio 6
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return nombres.equals(persona.nombres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombres, direccion);
    }

}
