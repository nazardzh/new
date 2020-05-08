import java.util.Scanner;
public class exercise_3compl {

    public static void main(String[] args) {
        int x, y;
        int[] a, b;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter value of array(1): ");
        x = num.nextInt();
        a = new int[x];
        for (int i = 0; i < x; i++){

            System.out.print("Enter value a[" + i +"]: ");
            a[i] = num.nextInt();

        }
        System.out.print("Enter value of array(2): ");
        y = num.nextInt();
        b = new int[y];
        for(int j = 0; j < y; j++){

            System.out.print("Enter value a["+ j +"]: ");
            b[j] = num.nextInt();

        }
        System.out.print("Repeats elements: ");
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(a[i] == b[j]){

                    System.out.print(a[i] + "; ");

                }
            }
        }

    }

}

