package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import static java.lang.Math.round;

public class Catalog extends TreeMap<Integer, List<Student>> {

    // implicit daca nu se da niciun comparator, cheile vor fi sortate invers ordinii naturale
    // (adica descrescator dupa medie)
    public Catalog(){
        super(Comparator.reverseOrder());
    }

    public Catalog(Comparator<Integer> comp){
        super(comp);
    }

    public void add(Student student) throws MedieNepermisa{
        int medieStud = round(student.getMedie());
        if(0<= student.getMedie() && student.getMedie() <= 10) {

            // daca nu exista niciun student cu media specificata, se va crea lista,
            // care va contine in acel moment doar studentul curent
            if (!containsKey(medieStud)) {
                List<Student> ls = new ArrayList<>();
                ls.add(student);
                put(medieStud, ls);
            }
            // altfel, se va adauga in lista deja existenta studentul nou
            else{
                List<Student> ls = get(medieStud);
                ls.add(student);
                put(medieStud, ls);
            }
        }
        else{
            throw new MedieNepermisa("Ati gresit media studentului cu numele: " + student.getNume() + ".");
        }

    }

}
