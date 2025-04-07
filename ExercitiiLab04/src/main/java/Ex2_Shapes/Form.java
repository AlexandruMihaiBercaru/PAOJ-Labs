package Ex2_Shapes;

public abstract class Form {
    private String color;

    public float getArea(){
        return 0;
    }

    public Form(){}

    public Form(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

    abstract public void printDimensions();
}
