package Enum;


public enum Planet {
    MERCURY(12345),
    VENUS(23456),
    EARTH(34567);

    private double radius;

     Planet(double radius){
        this.radius = radius;
    }

    public double getGetRadius() {
        return radius;
    }
    @Override
    public String toString(){
         return super.toString() + " radius is: " + radius;
    }
}
