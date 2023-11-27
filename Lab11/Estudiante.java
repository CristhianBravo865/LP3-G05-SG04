public class Estudiante extends Persona{
    private String especialidad;
    private Procedencia procedencia;
    public Estudiante(String nombres, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombres, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Procedencia getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((procedencia == null) ? 0 : procedencia.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) obj;
        return this.getNombres().equals(other.getNombres()) && this.getProcedencia().equals(other.getProcedencia());
    }
    
    
    
}
