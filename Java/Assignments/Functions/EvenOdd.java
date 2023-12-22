package Java.Assignments.Functions;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");

        int num = in.nextInt();
        boolean check = EvenOdd(num);

        if(check == true)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is Odd");
        }
    }    

    static boolean EvenOdd(int num){
        if (num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
