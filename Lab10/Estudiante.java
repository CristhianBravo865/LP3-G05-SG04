package Lab10;

class Estudiante extends Persona{
    private String carrera;

    public Estudiante(int dni, String nombres, String direccion, String carrera) {
        super(dni, nombres, direccion);
        this.carrera = carrera;
    }
}