package Assignments.Functions;
import java.lang.Math;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        
        int rad = in.nextInt();

        double area = Area(rad);
        double circum = Circum(rad);

        System.out.println("Area is " + area);
        System.out.println("Circumference is "+ circum);
    }

    static double Area(int rad){
        double area = 3.14*(Math.pow(rad, 2));
        return area;
    }

    static double Circum(int rad){
        double circum = 2*3.14*rad;
        return circum;
    }
    
}
