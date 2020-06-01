package hw_inherit_shapes;

public class Carpet {
    Shape[] shapes;
    public Carpet(Shape[] shapes){
        this.shapes = shapes;
    }

    public double getSize() {
     double sum = 0.0;
     for(Shape shape : shapes){
         sum = sum + shape.getArea();
     }
     return sum;
    }
}

