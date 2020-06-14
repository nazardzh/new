package equals_hash;

public class mainCirc {
    public static void main(String[] args){
        Circle circle = new Circle(2);
        Circle circle2 = new Circle(2);
        System.out.println(circle == circle2);
        System.out.println(circle.equals(circle2));
        System.out.println(circle.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle);
        System.out.println(circle2.toString());
    }
}
