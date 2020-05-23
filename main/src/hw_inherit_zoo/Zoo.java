package hw_inherit_zoo;

public class Zoo {
    Animal animal1 = new Lion();
    Animal animal2 = new Rhino();
    Animal animal3 = new Elephant();
    Animal[] animals = {animal1, animal2, animal3};
    public void enter(){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
