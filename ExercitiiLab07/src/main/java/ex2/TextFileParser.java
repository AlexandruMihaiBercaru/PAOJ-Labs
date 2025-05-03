package ex2;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileParser {

    private static void FinLongestWord(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String longestWord = "";
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for(String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            System.out.println("Cel mai lung cuvant din fisier este: " + longestWord);
        }
        catch(IOException e) {
            System.out.println("Error when reading from file");
        }
    }

    private static void getClassContent(String fileToWrite){
        String className = TextFileParser.class.getSimpleName();

        Path path = Paths.get("ExercitiiLab07/src/main/java/ex2/" +className + ".java");

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Class content written to " + fileToWrite);
        }
        catch(EOFException e){
            System.out.println("End of file.");
        }
        catch (IOException e) {
            System.out.println("Error when reading from file");
        }
    }

    private static void readEachLine(String filePath) {
        String[] linesFromFile = new String[1024];
        int i = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                linesFromFile[i++] = line;
            }
            System.out.println("Lines saved in another array:");
            for (String l : linesFromFile){
                if(l != null)
                    System.out.println(l);
            }
        }
        catch(IOException e) {
            System.out.println("Error when reading from file");
        }
    }

    public static void main(String[] args) {
        String filePath = "ExercitiiLab07/src/main/resources/" + "words.txt";
        FinLongestWord(filePath);
        getClassContent(filePath);
        readEachLine(filePath);
    }

}
