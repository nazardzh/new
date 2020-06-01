package Factory;

public abstract class Worker {
    private String name;
    abstract double getSalary();
    abstract String getProfession();

    public Worker(String name){
        this.name = name;
    }
}
