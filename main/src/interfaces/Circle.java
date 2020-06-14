package interfaces;

public class Circle extends Shape implements Drowable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius ;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle ");
    }
}
