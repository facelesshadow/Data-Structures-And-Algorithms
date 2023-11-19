import java.util.Scanner;

public class Basics{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Basic Print With a new line on next");
        // System.out.print("Basic String print with no new line at the end");
        // System.out.println(" This is another string");

        // //Primitives
        // int num = 369;
        // String name = "Bruh";
        // char lol = 'c';
        // float marks = 96.7f; //Decimal values
        // double largeDecimalNumbers = 12341.124121;
        // long largeInteger = 1231231231L;
        // boolean check = true;

       
        // int roll = input.nextInt();
        // System.out.println("Your roll no. is " + roll);

        // int millions = 12_000_000;
        // System.out.println(millions);

        // marks = input.nextFloat();
        // System.out.println(marks);

        // String hello = input.next();
        // System.out.println(hello);

        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // char c = input.next().charAt(0);

        // int sum = num1 + num2; 
        // System.out.println("Sum is " + sum);

        //TypeCasting
        // int bbr = (int)(123.33f);
        // System.out.println(bbr);

        Scanner in = new Scanner(System.in);
        int cel = in.nextInt();
        int fahr = (cel*9/5) + 32;
        System.out.println(fahr);
    }

}