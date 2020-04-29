import java.util.Scanner;
public class main {
    public static void main(String...args){

        int a;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");
        a = num.nextInt();
        if (a == 10){
            System.out.println("Hello name");
        }else if(a == 5){
            System.out.println("Hello noname");
        }else if (a == 7){
            System.out.println("how?");
        }

    }
}
