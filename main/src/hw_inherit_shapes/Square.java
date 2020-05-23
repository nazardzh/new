package hw_inherit_shapes;

public class Square extends Shape{
    private int side = 1;

    @Override
    public double getArea() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
