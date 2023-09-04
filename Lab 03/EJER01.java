package Semana03.Ejercicios;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    private void valida() {
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        int maxDias = diasMes(mes);
        if (dia < 1 || dia > maxDias) {
            dia = 1;
        }
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día (1-31): ");
        dia = scanner.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        mes = scanner.nextInt();

        System.out.print("Ingrese el año (1900-2050): ");
        anio = scanner.nextInt();

        valida();
    }

    public boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public int diasMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }

    public String corta() {
        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }

    public int diasTranscurridos() {
        int totalDias = 0;
        for (int i = 1900; i < anio; i++) {
            totalDias += bisiesto() ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasMes(i);
        }
        totalDias += dia - 1;
        return totalDias;
    }

    public int diaSemana() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] diasPorMesBisiesto = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDias = diasTranscurridos();
        int diaSemana = (totalDias + 6) % 7; // 1-1-1900 fue domingo (6 en términos de Java)

        if (bisiesto()) {
            return (diaSemana + diasPorMesBisiesto[mes] - 1) % 7;
        } else {
            return (diaSemana + diasPorMes[mes] - 1) % 7;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
        valida();
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha();

        fecha.leer();
        System.out.println("Fecha en formato corto: " + fecha.corta());
        System.out.println("Es bisiesto: " + fecha.bisiesto());
        System.out.println("Día de la semana: " + fecha.diaSemana());
        System.out.println("Días transcurridos desde 1-1-1900: " + fecha.diasTranscurridos());
    }
}



