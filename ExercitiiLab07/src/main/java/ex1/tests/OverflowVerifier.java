package ex1.tests;

import ex1.FileService;
import ex1.MyCalculator;
import ex1.exceptions.OverflowException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.String.valueOf;

public class OverflowVerifier extends ExceptionVerifier{

    public OverflowVerifier(String fileName){
        super(fileName);
    }

    public void WriteToFile(String fileName){
        String path = "ExercitiiLab07/src/main/resources/" + fileName;

        // daca nu exista, se va crea un fisier nou la calea specificata in variabila path
        try(BufferedWriter fout = new BufferedWriter(new FileWriter(path))){
            //double inf = Double.POSITIVE_INFINITY;
            double a = 1.0e308;
            fout.write(2 + "\n");
            fout.write(String.valueOf(a) + " ");
            fout.write(String.valueOf(a));
            //fout.write(valueOf(inf));
        }
        catch(IOException e){
            System.out.println("IOException in OverflowVerifier");
        }
        System.out.println("Numbers written to file.");
    }

    public void TestOverflow() throws OverflowException {
        MyCalculator calc = new MyCalculator();
        WriteToFile(fileName);
        double[] numbers = FileService.readNumbersFromFile(fileName);
        double rez = calc.add(numbers[0], numbers[1]);
        System.out.println("Rezultatul este: " + rez);

    }
}
