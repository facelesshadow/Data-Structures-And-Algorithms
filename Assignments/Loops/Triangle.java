package Assignments.Loops;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base and Height: ");

        float b = in.nextFloat();
        float h = in.nextFloat();

        float area = (b*h)/2;

        System.out.println("Area is: " + area);
    }
}
