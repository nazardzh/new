package interfaces;

public class Rectangle extends Shape implements Drowable{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }



    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
