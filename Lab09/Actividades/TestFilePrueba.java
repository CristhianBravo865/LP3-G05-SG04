package Lab09.Actividades;
import java.io.FileInputStream;
import javax.swing.*;
import javax.swing.text.View;
import java.io.*;

public class TestFilePrueba{
    public static void main(String[] args) throws IOException{
        FileInputStream file;
        byte b[]=new byte[1024];
        try{
            file=new FileInputStream("C:/Users/Matías/Documents/LP3-G05-SG04/text.txt");
            file.read(b);
            String s =new String(b);
            ViewFile view = new ViewFile(s);
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setSize(400,150);
            view.setVisible(true);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
