package Factory;

public class Accauntant extends Worker{
    private Double salary;

    public Accauntant(String name, Double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    double getSalary() {
        return salary;
    }

    @Override
    String getProfession() {
        return getClass().getSimpleName();
    }
}
