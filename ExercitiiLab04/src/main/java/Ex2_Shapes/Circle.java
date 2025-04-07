package Ex2_Shapes;

public class Circle extends Form{
    private float radius;

    public Circle(){}

    public Circle(String color, float radius){
        super(color); // apelez constructorul din superclasa
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (2 * Math.PI * radius);
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + super.toString() + " " + this.getArea();
    }

    @Override
    public void printDimensions() {
        System.out.println("RADIUS: " + radius + " cm");
    }

    public void printCircleDimensions(){
        System.out.println("RADIUS: " + radius + " cm");
    }
}
