package Java;
import java.util.Scanner;
import java.util.Arrays;
public class RevArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[7];
        System.out.println("Enter 7 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            end--;
            start++;
        }
        
        

        System.out.println(Arrays.toString(arr));

    }   
}
