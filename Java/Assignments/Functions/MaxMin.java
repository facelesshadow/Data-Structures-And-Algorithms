package Java.Assignments.Functions;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        min1(a, b, c);
        //max1(a, b, c);
    }

    static void min1(int a, int b, int c){
        int min = a;
        if (min > b)
        {
            min = b;
        }
        if (min > c)
        {
            min = c;
        }

        System.out.println("Minimum is " + min);

    }

}
