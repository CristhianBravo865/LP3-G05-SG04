package Ejercicios.Ejercicio3;

import java. io. IOException;
import java. io. InputStream;
import java. io. InputStreamReader;
import java. io. Reader;

public class LeerEntrada {
    private Reader stream;

    public LeerEntrada(InputStream fuente) {
        stream = new InputStreamReader(fuente);
    }

    public char getChar() throws IOException {
        return (char) this.stream.read();
    }

    public void procesar(char caracter,int c) throws IOException, ExcepcionNumero, ExcepcionBlanco, ExcepcionVocal, ExcepcionSalida {
        if (Character.isDigit(caracter)) {
            throw new ExcepcionNumero();
        } else if (Character.isWhitespace(caracter) && c%3==0) {
            throw new ExcepcionBlanco();
        } else if (caracter == 'Q') {
            throw new ExcepcionSalida();
        } else if ("AEIOUaeiou".indexOf(caracter) >= 0) {
            throw new ExcepcionVocal();
        }
    }

    public static void main(String[] args) {
        LeerEntrada lector = new LeerEntrada(System.in);
        int c=3;
        while (true) {
            
            try {
                if (c%3==0){
                System.out.print("Introduce un carácter (Q para salir): ");
            }
                char caracter = lector.getChar();
                lector.procesar(caracter,c);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }catch (ExcepcionSalida e) {
                System.out.println(e.getMessage());
                break; 
            } catch (ExcepcionNumero | ExcepcionBlanco | ExcepcionVocal e) {
                System.out.println(e.getMessage());
            } 
            c=c+1;
        }
    }
}
