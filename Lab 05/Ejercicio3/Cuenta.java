package Ejercicio3;
import java.util.*;
public class Cuenta{
    private String numerodecuenta;
    private int numerocliente;
    private double saldo;
    private char tipoCliente='C';
    static private int C=999;
    static private int B=4999;
    static private int E=7999;
    public Cuenta(int numerodecliente, double saldo){
        this.numerocliente=numerodecliente;
        this.saldo=InicioSaldo(saldo);
        char t=TipoDeCliente();
        this.tipoCliente=t;
        this.numerodecuenta=NumeroDeCuenta(this.tipoCliente);
    }

    public Cuenta(int numerodecliente){
        this.numerocliente=numerodecliente;
        char t=TipoDeCliente();
        this.tipoCliente=t;
        String num=NumeroDeCuenta(this.tipoCliente);
        this.numerodecuenta=num;
        this.saldo=InicioSaldo(0);
        
    }
    public void DepositarCantidad(double cantidad){
        this.saldo=this.saldo+cantidad;
    }
    public void RetrirarCantidad(double cantidad){
        this.saldo=this.saldo-cantidad;
    }
    private double InicioSaldo(double saldo){
        if (saldo<50){
            System.out.println("Ingrese un saldo mayor a 50: ");
            Scanner sc=new Scanner(System.in);
            saldo=sc.nextDouble();
        }
        return saldo;
    }
    private char TipoDeCliente(){
        System.out.println("Ingrese el tipo de de cliente C/B/E, si ingresa un caracter invalido se le asignara como C");
        Scanner sc=new Scanner(System.in);
        char t=sc.nextLine().charAt(0);
        if (t=='B'|| t=='E'){
            return t;
        }
        else{
            return 'C';
        }
    }
    private String NumeroDeCuenta(char tipoCliente){
        if (tipoCliente=='C'){
            C=C+1;
            return "C"+C;
        }
        else if(tipoCliente=='B'){
            B=B+1;
            return "B"+B;
        }
        else{
            E=E+1;
            return "E"+E;
        }
    }
    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public int getNumerocliente() {
        return numerocliente;
    }

    public void setNumerocliente(int numerocliente) {
        this.numerocliente = numerocliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String toString(String nombres){
        return "Cliente: "+numerocliente+"\nTipo de cliente: "+this.tipoCliente+"\nNombres: "+nombres+"\nNo.Cuenta: "+this.numerodecuenta+"\t Saldo: "+this.saldo;
    }
}