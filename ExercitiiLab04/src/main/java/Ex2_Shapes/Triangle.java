package Ex2_Shapes;
import java.util.Objects;

public class Triangle extends Form{
    private float base;
    private float height;

    public Triangle(){}

    public Triangle(String color, float base, float height){
        super(color); // apelez constructorul din superclasa
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + super.toString() + " " + this.getArea();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangle other = (Triangle) obj;
        if (this.base != other.base || this.height != other.height)
            return false;

        return true;
    }
    /* doua instante ale clasei Triangle vor fi egale daca au inaltimea si baza egale */


    public void printTriangleDimensions(){
        System.out.println(
                "BASE: " + base + " cm \nHEIGHT: " + height + "cm"
        );
    }

    @Override
    public void printDimensions() {
        System.out.println(
                "BASE: " + base + " cm \nHEIGHT: " + height + "cm"
        );
    }
}
