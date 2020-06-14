package Factory;

public class Manager extends Worker {
    public Manager(String name) {
        super(name);
    }

    @Override
    double getSalary() {
        return 5500.0;
    }

    @Override
    String getProfession() {
        return "Manager";
    }


}
