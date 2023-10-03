package Ejercicio2;                                
    public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        if(this.motor!=null){
            return "Automóvil con motor\nPlaca\t: "+this.placa+"\nNo.Motor\t: "+this.motor.getNumMotor()+"\nNo.Puertas\t: "
            +this.numPuertas+"\nMarca\t: "+this.marca+"\nModelo\t: "+this.modelo+"\nRPM\t: "+this.motor.getRevPorMin();
        }
        else{
            return "Automóvil sin motor\nPlaca\t: "+this.placa+"\nNo.Puertas\t: "+this.numPuertas
            +"\nMarca\t: "+this.marca+"\nModelo\t: "+this.modelo;
        }
    }
}
