package Lab09.Actividades;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo o directorio: ");
        String nombre = sc.nextLine();

        // crear objeto Path entrada del usuario
        Path ruta = Paths.get(nombre);
        if (Files.exists(ruta)) {
            // Mostrar la informacion del archivo o directorio
            System.out.printf("%n%s existe%n", ruta.getFileName()); // B
            System.out.printf("%s es un directorio %n", Files.isDirectory(ruta) ? "Es" : "No es"); // C
            System.out.printf("%s es una ruta Absoluta %n", ruta.isAbsolute() ? "Es" : "No es"); // D
            System.out.printf("Fecha de ultima modificacion: %s%n", Files.getLastModifiedTime(ruta)); // E
            System.out.printf("Tamanio: %s%n", Files.size(ruta)); // F
            System.out.printf("Ruta: %s%n", ruta);
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath()); // G
            if (Files.isDirectory(ruta)) {
                System.out.printf("%n Contenido del directorio: %n");

                // Objeto para iterar en el contenido de un directorio
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                for (Path p : flujoDirectorio)  // H
                    System.out.println(p);
            }
        } else {
            System.out.printf("%s no existe%n", ruta);
        }
    }
}