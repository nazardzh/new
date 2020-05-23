package Factory;

public class Manager extends Worker {
    @Override
    double getSalary() {
        return 5500.0;
    }

    @Override
    String getProfession() {
        return "Manager";
    }

}
