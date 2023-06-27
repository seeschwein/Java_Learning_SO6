package U3_Implementation_of_Coding_Array;

import java.util.Scanner; //imported scanner
public class revstr {
    public static void main(String[] args) {
        Scanner asker = new Scanner(System.in); //created scanner object
        System.out.println("Want to see a cool trick? I can speak backwards. Say something");         // ask user to enter a name to reverse
        char[] letters = asker.nextLine().toCharArray();         // get the user input, type casting from String to Char with .charArray()
        for (int i = 0; i < letters.length; i++) {         // use for loop to print original name
            System.out.print(letters[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Okay let me thing about it");
        for (int i = letters.length-1; i >= 0; i--) {         // use for loop to print name in reverse, hint use i--, starts from the letter.length-1 to 0
            System.out.print(letters[i] + " ");
        }
    }
}