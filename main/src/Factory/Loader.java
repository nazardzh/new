package Factory;

public class Loader extends Worker{
    public Loader(String name) {
        super(name);
    }

    @Override
    double getSalary() {
        return 3200.0;
    }

    @Override
    String getProfession() {
        return "Loader";
    }
}
