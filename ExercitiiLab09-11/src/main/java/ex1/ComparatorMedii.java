package ex1;

import java.util.Comparator;

public class ComparatorMedii implements Comparator<Integer> {
    @Override
    public int compare(Integer nr1, Integer nr2) {
        return nr2 - nr1;
    }
}
