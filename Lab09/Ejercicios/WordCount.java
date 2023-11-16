package Lab09.Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount extends JFrame {

    private JLabel linesLabel, wordsLabel, charsLabel, fileLabel;

    public WordCount() {
        setTitle("Word Count");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fileLabel =new JLabel("File: ");
        linesLabel = new JLabel("Lines: ");
        wordsLabel = new JLabel("Words: ");
        charsLabel = new JLabel("Chars: ");

        setLayout(new GridLayout(4, 1));
        add(fileLabel);
        add(linesLabel);
        add(wordsLabel);
        add(charsLabel);
    }

    public void countWords(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lines = 0;
            int words = 0;
            int chars = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                chars += line.length();

                String[] wordsArray = line.split("\\s+");

                for (String word : wordsArray) {
                    if (word.length() > 0 && Character.isLetterOrDigit(word.charAt(0))) {
                        words++;
                    }
                }
            }

            fileLabel.setText("File: "+ filePath);
            linesLabel.setText("Lines: " + lines);
            wordsLabel.setText("Words: " + words);
            charsLabel.setText("Chars: " + chars);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WordCount wordCount = new WordCount();
            wordCount.setVisible(true);

            String filePath = "lear.txt";
            wordCount.countWords(filePath);
        });
    }
}
