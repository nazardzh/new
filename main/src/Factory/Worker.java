package Factory;

public abstract class Worker {
    private String name;
    abstract double getSalary();
    abstract String getProfession();

    public void setName(String name) {
        this.name = name;
    }
}
