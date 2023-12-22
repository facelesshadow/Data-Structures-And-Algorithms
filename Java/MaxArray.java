package Java;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[7];
        System.out.println("Enter 7 Numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Max is" + max);

    
    }
    
}
