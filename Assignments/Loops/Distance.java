package Assignments.Loops;
import java.util.Scanner;
import java.lang.Math;
public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter x2 and y2");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println(dist);
    
    }
}
