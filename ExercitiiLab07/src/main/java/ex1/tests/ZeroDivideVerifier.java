package ex1.tests;

import ex1.FileService;
import ex1.MyCalculator;
import ex1.exceptions.MyArithmeticException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZeroDivideVerifier extends ExceptionVerifier{

    public ZeroDivideVerifier(String fileName){
        super(fileName);
    }

    public void WriteToFile(String fileName){
        String path = "ExercitiiLab07/src/main/resources/" + fileName;

        // daca nu exista, se va crea un fisier nou la calea specificata in variabila path
        try(BufferedWriter fout = new BufferedWriter(new FileWriter(path))){
            fout.write(2 + "\n");
            fout.write("5 0");
        }
        catch(IOException e){
            System.out.println("IOException in ZeroDivideVerifier");
        }
        System.out.println("Numbers written to file.");
    }

    public void TestZeroDivide() throws MyArithmeticException{
        MyCalculator calc = new MyCalculator();
        WriteToFile(fileName);
        double[] numbers = FileService.readNumbersFromFile(fileName);
        double rez = calc.divide(numbers[0], numbers[1]);

    }
}
