package MyProject;

import java.util.Scanner;
import static MyProject.CheckList.*;

public class Customer {
    private String name;
    private String Surname;
    private Integer age;
    private String gender;
    private String country;

    Scanner scanner = new Scanner(System.in);

    public Customer(String name, String Surname, Integer age){
        this.name = name;
        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        this.Surname = Surname;
        System.out.print("Enter Surname: ");
        Surname = scanner.nextLine();

        this.age = age;
        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        CheckList checked = CheckList.valueOf(name.toUpperCase());
        if(checked == NAZAR || checked == VASYA || checked == IGNAT || checked == MASHA) {
            System.out.println("Congratulations!!!");
        }
    }
}
