import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        int x;
        int[] y;
        Scanner num = new Scanner(System.in);
        System.out.print("Provide value of array: ");
        x = num.nextInt();
        y = new int [x];
        for (int i = 0; i < x; i++){
            System.out.print("Enter number a ["+ i +"]: ");
            y[i] = num.nextInt();
        }
        System.out.print("Duplicate elements in an array: ");
        for(int i = 0; i < y.length; i++) {
            for(int j = i + 1; j < y.length; j++) {
                if(y[i] == y[j])
                    System.out.println(y[j]);
            }
        }
    }
}