package ex1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class TestCatalog {

    public static void main(String[] args) {

        Catalog myCatalog = new Catalog();

        Student[] studenti = {new Student("Popa Tudor", 8.50F), new Student("Ionescu Mihaela", 7.45F),
                new Student("Teodorescu Teodor", 10.1F), new Student("Munteanu Gabriela", 7.49F),
                new Student("Oprescu Sorin", 9.50F), new Student("Cristea Matei", 9.20F),
                new Student("Ionescu Maria", 6.85F), new Student("Poepscu Mihnea", 4.5F),};

        for(var s: studenti){
            try{
                myCatalog.add(s);
                System.out.println("Student adaugat cu succes");
            }catch(MedieNepermisa me){
                System.out.println(me.getMessage());
            }
        }

        // aux :: Map.Entry<Integer, List<Student>>
        for(var aux: myCatalog.entrySet()){
            List<Student> ls = aux.getValue();
            System.out.println("\nMedia: " + aux.getKey() + "\nLista inainte de sortare: " + ls);
            // ls.sort((a, b) -> a.getNume().compareTo(b.getStudent())
            ls.sort(Comparator.comparing(Student::getNume));
            System.out.println("Lista sortata: " + ls);
            myCatalog.put(aux.getKey(), ls);

        }
    }
}
