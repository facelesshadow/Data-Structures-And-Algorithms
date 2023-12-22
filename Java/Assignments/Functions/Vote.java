package Java.Assignments.Functions;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Age:");
        int age = in.nextInt();
        Vote_check(age);
    }

    static void Vote_check(int age){
        if (age>=18){
            System.out.println("The persi=on is eligible to vote");
        }
        else{
            System.out.println("The person is not eligible to vote");
        }
    }
    
}
