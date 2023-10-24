package Assignments.first;
import java.util.Scanner;
public class operator {
        public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Expression: ");
        
        int a = in.nextInt();
        char b = in.next().charAt(0);
        int c = in.nextInt();
        int result = 0;

        if(b == '+')
        {

            result = a+c;
        }
        else if(b == '-')
        {
            result = a-c;
        }
        else if(b == '*')
        {
            result = a*c;
        }
        else if(b == '/')
        {
            result = a/c;
        }
        System.out.println("Result is: "+ result);
    }
}
