package hw_inherit_shapes;

public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public Circle (double radius){
        this.radius = radius;
    }
}
