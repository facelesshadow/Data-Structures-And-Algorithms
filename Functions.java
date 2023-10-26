import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int bruh = sum();
        System.out.println("sum is " + bruh);
    }    

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int x = num1 + num2;
        return x;
    }

}
