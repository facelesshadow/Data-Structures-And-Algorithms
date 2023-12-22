package Java.Assignments.first;

import java.util.Scanner;
public class Even {
    public static void main(String[] args) {

    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");

    int num = input.nextInt();

    if(num%2 == 0){
        System.out.println("Number is even");
    }
    else
    {
        System.out.println("Number is odd");
    }
    
    input.close();
    }

}
