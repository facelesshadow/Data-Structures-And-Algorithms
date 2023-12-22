package Java.Assignments.Loops;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number and the Power");
        int num1 = in.nextInt();
        int pow = in.nextInt();
        int num2 = num1;
        for(int i = 1; i < pow; i++)
        {
            num2 = num2*num1;
        }
        System.out.println("The number is: " + num2);
    }
}
