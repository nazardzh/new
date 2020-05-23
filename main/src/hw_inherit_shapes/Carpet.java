package hw_inherit_shapes;

public class Carpet {
    Shape shape1 = new Circle();
    Shape shape2 = new Square();
    Shape shape3 = new Rectangle();
    Shape[] shapes = {shape1, shape2, shape3};

    public double getSize() {
       return shape1.getArea() + shape2.getArea() + shape3.getArea();
    }
}

