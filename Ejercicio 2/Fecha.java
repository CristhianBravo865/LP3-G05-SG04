import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this(1, 1, 1900);
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    private void valida() {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día (1-31): ");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes (1-12): ");
        mes = scanner.nextInt();
        System.out.println("Ingrese el año (1900-2050): ");
        anio = scanner.nextInt();
        valida();
    }

    public boolean bisiesto() {
        return (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
    }

    public int diasMes(int mes) {
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }

    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
        valida();
    }

    public int getAnio() {
        return anio;
    }

    public String corta() {
        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }

    public int diasTranscurridos() {
        int dias = 0;
        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = 1900; i < anio; i++) {
            dias += bisiesto() ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            dias += diasPorMes[i];
        }
        dias += dia;
        if (mes > 2 && bisiesto()) {
            dias += 1;
        }
        return dias;
    }

    public int diaSemana() {
        int a = (14 - mes) / 12;
        int y = anio - a;
        int m = mes + 12 * a - 2;
        int d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return d;
    }

    public String larga() {
        String[] diasSemana = { "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado" };
        return String.format("%s %d de %s de %d", diasSemana[diaSemana()], dia, nombreMes(), anio);
    }

    private String nombreMes() {
        String[] meses = { "", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        return meses[mes];
    }

    public void fechaTras(long dias) {
        int totalDias = diasTranscurridos() + (int) dias;
        int nuevoAnio = 1900;
        while (totalDias > (bisiesto() ? 366 : 365)) {
            totalDias -= bisiesto() ? 366 : 365;
            nuevoAnio++;
        }
        anio = nuevoAnio;
        int nuevoMes = 1;
        while (totalDias > diasMes(nuevoMes)) {
            totalDias -= diasMes(nuevoMes);
            nuevoMes++;
        }
        mes = nuevoMes;
        dia = totalDias;
    }

    public int diasEntre(Fecha otraFecha) {
        int dias = Math.abs(diasTranscurridos() - otraFecha.diasTranscurridos());
        return dias;
    }

    public void siguiente() {
        int totalDias = diasTranscurridos();
        totalDias++;
        fechaTras(totalDias);
    }

    public void anterior() {
        int totalDias = diasTranscurridos();
        totalDias--;
        fechaTras(totalDias);
    }

    public void fechaFutura(long dias) {
        fechaTras(dias);
    }

    public Fecha copia() {
        return new Fecha(dia, mes, anio);
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio;
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio) {
            if (fecha1.mes < fecha2.mes) {
                return true;
            } else if (fecha1.mes == fecha2.mes) {
                return fecha1.dia < fecha2.dia;
            }
        }
        return false;
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio > fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio) {
            if (fecha1.mes > fecha2.mes) {
                return true;
            } else if (fecha1.mes == fecha2.mes) {
                return fecha1.dia > fecha2.dia;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Prueba constructor sin parametros");
        Fecha fechasinpara = new Fecha();
        System.out.println(fechasinpara.corta()+ " o " + fechasinpara.larga());
        System.out.println("Prueba constructor con parametros");
        Fecha fechaconpara = new Fecha(9, 11, 2022);
        System.out.println(fechaconpara.corta()+ " o " + fechaconpara.larga());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de una fecha:");
        Fecha fecha = new Fecha();
        fecha.leer();

        System.out.println("Fecha actual:");
        System.out.println("Fecha corta: " + fecha.corta());
        System.out.println("Fecha larga: " + fecha.larga());

        System.out.println("Día de la semana: " + fecha.larga());

        System.out.println("Días transcurridos desde 1900: " + fecha.diasTranscurridos());

        System.out.println("Ingrese un número de días para avanzar la fecha:");
        int diasAVanzar = scanner.nextInt();
        fecha.fechaFutura(diasAVanzar);
        System.out.println("Nueva fecha después de avanzar " + diasAVanzar + " días:");
        System.out.println("Fecha corta: " + fecha.corta());
        System.out.println("Fecha larga: " + fecha.larga());

        System.out.println("Creación de otra fecha:");
        Fecha otraFecha = new Fecha();
        otraFecha.leer();
        System.out.println("Días entre las dos fechas: " + fecha.diasEntre(otraFecha));

        System.out.println("Comparación de fechas:");
        if (Fecha.igualQue(fecha, otraFecha)) {
            System.out.println("Las fechas son iguales.");
        } else if (Fecha.menorQue(fecha, otraFecha)) {
            System.out.println("La primera fecha es menor que la segunda fecha.");
        } else if (Fecha.mayorQue(fecha, otraFecha)) {
            System.out.println("La primera fecha es mayor que la segunda fecha.");
        }
    }
}
