package interfaces;

public class Main {
     public static void main(String... args){
          Circle shape1 = new Circle(2);
          Shape shape2 = new Rectangle(2,3);
          System.out.println("Circle area = " + String.format("%.3f", shape1.getArea()));
          System.out.println("Rectangle area = " + shape2.getArea());
     shape1.draw();
     }
}
