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


        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }   

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
