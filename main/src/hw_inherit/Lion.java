package hw_inherit;

public class Lion extends Animal {
    private String sound;

    @Override
    public void makeSound() {
        System.out.println("Lion sound");
    }
}
