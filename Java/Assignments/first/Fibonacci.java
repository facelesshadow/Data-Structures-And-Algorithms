package Java.Assignments.first;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci Series: ");
        for(int i = 0; i < n ; i++)
        {
            c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
