import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("A is "+ a);
        System.out.println("B is " + b);
        
     }

     static void swap(int a, int b)
     {
        int temp = a;
        a = b;
        b = temp;
     }
    //     int bruh = sum();
    //     
    // }    
    // static int sum(){
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the numbers");
    //     int num1 = in.nextInt();
    //     int num2 = in.nextInt();
    //     int x = num1 + num2;
    //     return x;    
}
