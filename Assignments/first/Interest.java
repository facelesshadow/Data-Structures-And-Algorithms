package Assignments.first;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle, Time and Rate: ");
        int P = in.nextInt();
        int T = in.nextInt();
        int R = in.nextInt();

        int S = (P*R*T)/100;
        System.out.print("Simple Interest is: " + S);
    }
}
