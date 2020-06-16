package MyProject;

import java.util.Scanner;

import static MyProject.Agreement.*;

public class project {
    public static void main(String... args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Yes or No: ");
            String agreements = scanner.nextLine();

            Agreement a = Agreement.valueOf(agreements.toUpperCase());
            try {
                if (a.equals(YES)) {
                    Customer customer = new Customer("", "", 0);

                } else {
                    System.out.println("Thank you");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        }
    }
}