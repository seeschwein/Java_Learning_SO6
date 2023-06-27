package U2_Understand_Coding_Design_Loops;

import java.util.Scanner;
public class times {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // 2. create scanner object
        System.out.println("What number would you like to multiply?"); // 3. ask user to enter any number (int timesTable variable)
        int timesTable = reader.nextInt();
        for (int i = 1; i <13 ; i++) { // it seems to work the same <3 or <=12 4. use for loops to display the times table from i=1 to i <= 12
            System.out.println(timesTable +" x " +i +" = " +timesTable*i); // 5. inside this loop print the timesTable * i and also print the result
        }
    }
}




