package ex2;

import java.util.ArrayList;
import java.util.List;

public class MyCollectionTest {

    public static void afiseazaContor(MyHashSet col){
        System.out.println("Numar elemente: " + col.getCnt());
    }

    public static void main(String[] args) {
        MyHashSet mult = new MyHashSet();

        List<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(435);
        listaNumere.add(12);
        listaNumere.add(1001);


        mult.add(1); afiseazaContor(mult);
        mult.add(55); afiseazaContor(mult);
        mult.add(39); afiseazaContor(mult);
        mult.add(39); afiseazaContor(mult);
        mult.addAll(listaNumere);
        afiseazaContor(mult);

        System.out.println(mult);

        // daca mostenim clasa HashSet, iar in implementarea colectiei mele retin numarul de elemente
        // adaugand la contor dimensiunea colectiei (in metoda addAll), se poate observa faptul ca
        // pentru fiecare element din colectie, contorul creste cu "2", deoarece, pe langa
        // atribuirea din addAll, se va mai apela, pentru fiecare element, metoda add, unde se incrementeaza
        // din nou contorul.
        // pentru a corecta acest comportament, ar trebui eliminata incrementarea contorului din addALl()

        // daca modificam colectia noastra astfel incat sa mosteneasca LinkedList,
        // atunci contorul nu se va mai incrementa de doua ori atunci cand
        // adaugam elemente printr-o colectie (in implementarea addAll() din LinkedList nu se apeleaza add()).
    }
}
