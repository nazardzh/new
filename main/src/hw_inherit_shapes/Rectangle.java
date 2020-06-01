package hw_inherit_shapes;

public class Rectangle extends Shape {
    private int width ;
    private int height ;

    @Override
    public double getArea() {
        return width * height;
    }

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

}
