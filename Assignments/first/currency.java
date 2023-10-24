package Assignments.first;
import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the rupees: ");
        float inr = in.nextFloat();
        float usd = inr / 83;
        System.out.println("USD: " + usd);
    }
    
}
