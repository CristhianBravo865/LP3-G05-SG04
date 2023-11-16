package Lab09.Actividades;

public class Alumno extends Persona{
     private Fecha fechaMatricula;

     public Alumno (String nif, String nombre, int edad, Fecha fechaMatricula) {
        super(nif, nombre, Integer.toString(edad));
        this.fechaMatricula =new Fecha();
        setFechaMatricula(fechaMatricula);
     }

     public Alumno () {
        super("","","");
     }
     public Fecha getFechaMatricula () {
         return fechaMatricula;
     }
     public void setFechaMatricula (Fecha fechaMatricula) {
         this.fechaMatricula.setDia(fechaMatricula.getDia());
         this.fechaMatricula.setMes(fechaMatricula.getMes());
         this.fechaMatricula.setAño(fechaMatricula.getAño());

     }}