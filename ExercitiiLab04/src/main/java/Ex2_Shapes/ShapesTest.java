package Ex2_Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Form[] shapes = new Form[5];
        shapes[0] = new Triangle("red", 5, 7);
        shapes[1] = new Circle("green", 2.5F);
        shapes[2] = new Triangle("maroon", 5, 7);
        shapes[3] = new Circle("violet", 1);
        shapes[4] = new Triangle("orange", 3, 8);

        for(var shape : shapes) {
            System.out.println(shape);

            // o alta implementare, fara a fi necesar downcast:
            // shape.printDimensions();

            if(shape instanceof Triangle){
                Triangle aux = (Triangle) shape;
                aux.printTriangleDimensions();
            }
            else if(shape instanceof Circle){
                Circle aux = (Circle) shape;
                aux.printCircleDimensions();
            }
            System.out.println("---------------");
        }
        // pentru metodele non-statice, se vor apela implementarile din subclase,
        // deoarece se ia in considerare tipul real (al subclasei) cand se alege metoda

        /* h) o posibila implementare, fara a fi necesara folosirea operatorului instance of (si downcast explicit):
              adaugam in superclasa o metoda printDimensions() (putem sa o facem abstracta, atunci vom face si clasa abstracta),
              deoarece este un "comportament" general pentru orice forma geometrica.
              metoda printDimensions va fi suprascrisa in Triangle si Circle, si vor fi apelate acele implementari cand parcurgem
              array-ul de obiecte
         */
    }
}
