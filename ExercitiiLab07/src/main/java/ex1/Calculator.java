package ex1;

import ex1.exceptions.MyArithmeticException;
import ex1.exceptions.NullParameterException;
import ex1.exceptions.OverflowException;
import ex1.exceptions.UnderflowException;

public interface Calculator {

    double add(Double x, Double y) throws NullParameterException, OverflowException, UnderflowException;

    double divide(Double x, Double y) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException;

    double average(double[] v) throws NullParameterException, OverflowException, UnderflowException;
}
