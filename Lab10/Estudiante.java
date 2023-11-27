package Lab10;

class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String dni, String nombres, String direccion, String carrera) {
        super(dni, nombres, direccion);
        this.carrera = carrera;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return this.getNombres().equals(estudiante.getNombres()) && carrera.equals(estudiante.carrera);
    }
    @Override
    public String toString() {
        return "Estudiante [carrera=" + carrera + "]";
    }
    
}