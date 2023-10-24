package Assignments.first;

import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.next();
        System.out.print("Hello, " + name);
    }
}
