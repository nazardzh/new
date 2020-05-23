package hw_inherit_shapes;

public class Circle extends Shape {
    private double radius = 2.2;

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
