package hw_inherit_zoo;

public class Lion extends Animal {
    private String sound;

    @Override
    public void makeSound() {
        System.out.println("Lion sound");
    }
}
