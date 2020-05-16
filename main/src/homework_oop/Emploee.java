package homework_oop;

public class Emploee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public double percent;

    public Emploee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getName(){
        return firstName + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public float raiseSalary(float percent){
        percent = percent / 100;
        return salary + (salary * percent);
    }
    public String toString(){
        return "Emploee[Name: " + getName() + ", Salary: " + getAnnualSalary() + "]";
    }



}








