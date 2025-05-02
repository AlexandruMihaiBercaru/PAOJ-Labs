package ex1.tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionVerifier {
    protected String fileName;

    public ExceptionVerifier(String fileName) {
        this.fileName = fileName;
    }

    public ExceptionVerifier(){}

    public void WriteToFile(String fileName){}

    public String getFileName(){
        return fileName;
    }
}
