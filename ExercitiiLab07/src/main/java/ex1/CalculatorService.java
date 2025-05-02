package ex1;

import ex1.exceptions.*;
import ex1.tests.NullParameterVerifier;
import ex1.tests.OverflowVerifier;
import ex1.tests.UnderflowVerifier;
import ex1.tests.ZeroDivideVerifier;

import java.io.*;
import java.util.Arrays;

public class CalculatorService {

    
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();

        // pentru fiecare test, se vor scrie intr-un fisier date care genereaza o exceptie, se vor citi si se va
        // apela o metoda din clasa MyCalculator (implementeaza interfata Calculator), in care se va genera acea exceptie


        ZeroDivideVerifier test1 = new ZeroDivideVerifier("test1.txt");
        OverflowVerifier test2 = new OverflowVerifier("test2.txt");
        UnderflowVerifier test3 = new UnderflowVerifier("test3.txt");
        NullParameterVerifier test4 = new NullParameterVerifier("test4.txt");

        try{
            test1.TestZeroDivide();
        }
        catch(MyArithmeticException | NullPointerException exc){
            System.out.println(exc.getMessage() + "\n");

        }

        try{
            test2.TestOverflow();
        }
        catch(OverflowException | NullPointerException exc){
            System.out.println(exc.getMessage() + "\n");
        }

        try {
            test3.TestUnderflow();
        }catch (UnderflowException | NullPointerException exc){
            System.out.println(exc.getMessage() + "\n");
        }

        try{
            test4.TestNullParameter();
        }catch (NullParameterException | NullPointerException exc){
            System.out.println(exc.getMessage() + "\n");
        }
    }
}
