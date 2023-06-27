import java.util.Random;
public class crazydice {

        public static void main(String[] args) {
            // create random object
            Random random = new Random();
            // generate a random int number, save to a variable
            int face = random.nextInt(12) + 1; // boundary 1 to 6
            // print the number
            System.out.println("You rolled " +face + " , congrats!");
        }
    }
