package U3_Implementation_of_Coding_Array;

import java.util.Scanner; //imported scanner
public class existarr {
    public static void main(String[] args) {
        int sum = 0;
        Scanner asker = new Scanner(System.in); //created scanner object
        int[] numbers = {3, 6, 7, 9, 10, 14, 19, 20, 21, 40};
        boolean found = false;
        System.out.println("Tell me a number and I'll see if we got it");         // ask user to enter a name to reverse
        int input = asker.nextInt();

        for (int x : numbers) {
            if (x == input) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}


