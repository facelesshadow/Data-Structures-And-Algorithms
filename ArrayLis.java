import java.util.ArrayList; 
import java.util.Scanner;

public class ArrayLis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> name = new ArrayList<>(1);
        name.add(69);
        name.add(369);
        name.add(39);
        name.add(36);
        name.add(3229);
        name.add(29);

        name.set(0, 99);


        System.out.println(name);
        System.out.println(name.contains(99));

    }    
}
