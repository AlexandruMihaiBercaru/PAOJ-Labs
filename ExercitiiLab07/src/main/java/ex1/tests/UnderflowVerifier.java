package ex1.tests;

import ex1.FileService;
import ex1.MyCalculator;
import ex1.exceptions.OverflowException;
import ex1.exceptions.UnderflowException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.String.valueOf;

public class UnderflowVerifier extends ExceptionVerifier{

    public UnderflowVerifier(String fileName){
        super(fileName);
    }

    public void WriteToFile(String fileName){
        String path = "ExercitiiLab07/src/main/resources/" + fileName;

        // daca nu exista, se va crea un fisier nou la calea specificata in variabila path
        try(BufferedWriter fout = new BufferedWriter(new FileWriter(path))){
            double mininf = Double.NEGATIVE_INFINITY;
            fout.write(2 + "\n");
            fout.write("-1 ");
            fout.write(valueOf(mininf));
        }
        catch(IOException e){
            System.out.println("IOException in UnderFlowVerifier");
        }
        System.out.println("Numbers written to file.");
    }

    public void TestUnderflow() throws UnderflowException {
        MyCalculator calc = new MyCalculator();
        WriteToFile(fileName);
        double[] numbers = FileService.readNumbersFromFile(fileName);
        double rez = calc.add(numbers[0], numbers[1]);

    }
}
