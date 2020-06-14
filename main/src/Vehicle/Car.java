package Vehicle;

import java.util.Random;

public class Car extends Vehicle{

    private final Integer serialNumber;
    private String name;

    public Car(String name){
        this.name = name;
        serialNumber = new Random().nextInt();
    }

    @Override
    public String getName() {
        return null;
    }
}
