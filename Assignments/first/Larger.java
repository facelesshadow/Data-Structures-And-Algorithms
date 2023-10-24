package Assignments.first;
import java.util.Scanner;
public class Larger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b)
        {
            System.out.println(a +" is greater than " + b);
        }
        else if(a<b)
        {
            System.out.println(b + " is greater than " + a);
        }
        else
        {
            System.out.println("Both are equal");
        }
    }
}
