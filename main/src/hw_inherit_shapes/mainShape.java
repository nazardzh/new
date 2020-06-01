package hw_inherit_shapes;

public class mainShape {
    public static void main(String[] args){
        Shape[] shapes = {new Circle(2.5), new Rectangle(3,5), new Square(6)};

        Carpet carpet = new Carpet(shapes);
     System.out.println(carpet.getSize());



    }
}
