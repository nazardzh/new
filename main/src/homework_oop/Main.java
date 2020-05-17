package homework_oop;

public class Main {
    public static void main(String[] args){
        Emploee emploee1 = new Emploee(123, "Ignat", " XXX", 6500);

        System.out.println("Name: " + emploee1.getName());
        System.out.println("ID: " + emploee1.getId());
        System.out.println("Previous salary: " + emploee1.getSalary());
        System.out.println("Raise salary (salary * percent): " + emploee1.raiseSalary(5));
        System.out.println("Annual salary: " + emploee1.getAnnualSalary());
        System.out.println(emploee1.toString());





    }
}
