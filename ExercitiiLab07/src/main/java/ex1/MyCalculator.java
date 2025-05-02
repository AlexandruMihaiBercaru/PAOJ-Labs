package ex1;

import ex1.exceptions.MyArithmeticException;
import ex1.exceptions.NullParameterException;
import ex1.exceptions.OverflowException;
import ex1.exceptions.UnderflowException;

import static java.lang.Double.valueOf;

public class MyCalculator implements  Calculator {

    public MyCalculator() {}


    @Override
    public double add(Double x, Double y) throws NullParameterException, OverflowException, UnderflowException {

        if (x == null || y == null){
            throw new NullPointerException("The arguments of 'add' functon cannot be null!");
        }
        if (x + y == Double.POSITIVE_INFINITY){
            throw new OverflowException("The sum of the two numbers is equal to infinity!");
        }
        if (x + y == Double.NEGATIVE_INFINITY){
            throw new UnderflowException("The sum of the two numbers in equal to negative infinity!");
        }
        return x + y;
    }

    @Override
    public double divide(Double x, Double y) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException{
        if (x == null || y == null){
            throw new NullPointerException("The arguments of 'divide' function cannot be null!");
        }
        if(y == 0){
            throw new MyArithmeticException("Dividing by zero is not allowed!");
        }
        if (x / y == Double.POSITIVE_INFINITY){
            throw new OverflowException("The quotient of the two numbers is equal to infinity!");
        }
        if (x / y == Double.NEGATIVE_INFINITY){
            throw new UnderflowException("The quotient of the two numbers is equal to negative infinity!");
        }
        return x / y;
    }

    @Override
    public double average(double[] v) throws NullParameterException, OverflowException, UnderflowException{
        double partSum = 0;
        for(int i = 0; i < v.length; i = i + 2){
            partSum += add(v[i], v[i+1]);
        }
        return divide(partSum, (double) v.length);
    }
}
