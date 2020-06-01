package hw_inherit_shapes;

public class Square extends Shape{
    private int side ;

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(int side){
        this.side = side;
    }
}
