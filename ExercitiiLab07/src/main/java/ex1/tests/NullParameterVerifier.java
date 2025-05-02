package ex1.tests;

import ex1.FileService;
import ex1.MyCalculator;
import ex1.exceptions.NullParameterException;
import ex1.exceptions.OverflowException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.String.valueOf;

public class NullParameterVerifier extends ExceptionVerifier {

    public NullParameterVerifier(String message) {
        super(message);
    }

    public void TestNullParameter() throws NullParameterException, NullPointerException {
        MyCalculator calc = new MyCalculator();

        Double m = null;
        Double n = 7.0;
        double rez = calc.divide(m, n);

    }

}
