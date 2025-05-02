package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {


    public static double[] readNumbersFromFile(String fileName){
        String path = "ExercitiiLab07/src/main/resources/" + fileName;
        try(BufferedReader fin = new BufferedReader(new FileReader(path))) {
            int numbersInFile = Integer.parseInt(fin.readLine());

            double[] numbers = new double[numbersInFile];
            String[] listOfNumbers = fin.readLine().split(" ");
            for(int i = 0; i < numbers.length; i++){
                numbers[i] = Double.parseDouble(listOfNumbers[i]);

            }
            return numbers;
        }
        catch(NumberFormatException e){
            System.out.println("Error at converting string (parsed from file) to double!");
            return null;
        }
        catch(IOException e){
            System.out.println("Error when reading from file.");
            return null;
        }
    }
}
