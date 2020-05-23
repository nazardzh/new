package Factory;

public class Accauntant extends Worker{

    @Override
    double getSalary() {
        return 4200.0;
    }

    @Override
    String getProfession() {
        return "Accountant";
    }
}
