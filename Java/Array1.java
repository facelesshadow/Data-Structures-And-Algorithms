package Java;
import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int[] num2 = new int[5];
        for(int i = 0; i < 5; i++)
        {
            num2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(num2));
    }
}
