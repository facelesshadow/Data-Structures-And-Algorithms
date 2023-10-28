package Assignments.Functions;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = Sum(a, b);
        System.out.println("Sum is " + sum);
    }

    static int Sum(int a, int b)
    {
        return a+b;
    }
}
