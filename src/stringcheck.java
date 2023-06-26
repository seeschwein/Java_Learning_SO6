import java.util.Scanner;
public class stringcheck {
    public static void main(String[] args) {
        Scanner asker = new Scanner(System.in); //createobject
        // check if the word contains yes
        System.out.println("Would you like to play a game");
        String first = asker.nextLine();


        if (!( first.equalsIgnoreCase("yes"))) {
            System.out.println("What you said, " + first + ", is sad");
            System.out.println("Game over");
        } else {
            System.out.println( "Good, you said " + first);
            System.out.println("Let's play");
        }
        System.out.println("Cats or dogs?");
        String second = asker.nextLine();
        if ( second.equalsIgnoreCase("cats")) {
            System.out.println("Oh yes I agree " + second + " are great");
            System.out.println(" /\\_/\\");
            System.out.println("( o.o )");
        } else {
            System.out.println("Ah I disagree");
            System.out.println("Game over I guess");
        }
    }
}
