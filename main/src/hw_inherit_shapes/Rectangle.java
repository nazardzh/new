package hw_inherit_shapes;

public class Rectangle extends Shape {
    private int width = 3;
    private int height = 2;

    @Override
    public double getArea() {
        return width * height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
