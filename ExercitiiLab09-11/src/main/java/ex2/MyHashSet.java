package ex2;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

// public class MyHashSet extends HashSet<Integer>
public class MyHashSet extends HashSet<Integer> {

    private int cnt;

    public MyHashSet() {
        super();
        cnt = 0;
    }

    @Override
    public boolean add(Integer elem){
        cnt++;
        return super.add(elem);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c){
        // comenteaza linia (daca folosesti HashSet)
        cnt+= c.size();
        return super.addAll(c);
    }

    public int getCnt(){
        return cnt;
    }

}
