import java.util.Scanner;

public class exercise1 {
    public static void main(String... args){
        int x;
        int[] y;

        Scanner num = new Scanner(System.in);
        System.out.print("Provide value of arrays: ");
        x = num.nextInt();
        y = new int[x];
        for (int i = 0; i < x; i++){
            System.out.print("Enter a["+ i +"]");
            y[i] = num.nextInt();

        }
        System.out.println("Reversing...");
        for (int i = y.length-1; i >= 0; i--){
            System.out.print("Position a["+ i +"]" );
            System.out.println(y[i]);
        }
    }
}
