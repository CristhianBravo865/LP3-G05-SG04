public class Persona {
    private String nombres;
    private String direccion;
    private String telefono;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
        return result;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(String nombres, String direccion, String telefono) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombres == null) {
            if (other.nombres != null)
                return false;
        } else if (!nombres.equals(other.nombres))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [nombres=" + nombres + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }

}