import java.util.*;
public class Arrays {
    public static void main(String[] args) {

        //Array Declaration
        int[] num = new int[5];
        //or
        int[] num2 = {1, 2, 3 ,4 ,5};
        //or
        int[] num3;
        num3 = new int[5];

        System.out.println(num3[2]);

         String[] arr = new String[4];

         System.out.println(arr[3]);

         //Enhanced for loop
         for(int n : num2){
            System.out.print(n + " ");
         }

         //Printing array like an arrat by converting it into a string by Array class
         //System.out.println(Arrays.toString(num2));
         

         
    }   
}
