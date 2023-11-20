import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array Declaration
        int[] num = new int[5];
        //or
        int[] num2 = {1, 2, 3 ,4 ,5};
        //or
        int[] num3;
        num3 = new int[5];

        int lol = in.nextInt();
        System.out.println(lol);
        System.out.println(num3[2]);

         String[] arr = new String[4];

         System.out.println(arr[3]);

         //Enhanced for loop
         for(int n : num2){
            System.out.print(n + " ");
         }

         System.out.println();
         //Printing array like an arrat by converting it into a string by Array class
         //System.out.println(Arrays.toString(num2));
         
         int[] bruh = new int[5];
         int[] bruh2;
         bruh2 = new int[5];
         int[] bruh3 = {1, 2, 3, 4, 5, 6};
         int[] bruh4;

         String[] sample = new String[4];
         System.out.println("Enter 4 strings");
         for ( int m = 0; m < sample.length; m++)
         {
            sample[m] = in.next();
         }
         System.out.println(sample[0]);
         System.out.println("Enter 5 numbers");

         for(int i = 0; i < bruh.length; i++)
         {
            bruh[i] = in.nextInt();
         }
        
         for(int k : bruh)
         {
            System.out.print(k + " ");
         }

         int[][] two = new int[3][3];

         System.out.println("Enter the elements");

         for(int row = 0; row < two.length; row++)
         {
            for(int col = 0; col < two[col].length; col++)
            {
                two[row][col] = in.nextInt();
            }
         }

         



    }   
}
