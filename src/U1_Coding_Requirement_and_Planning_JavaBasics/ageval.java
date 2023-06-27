package U1_Coding_Requirement_and_Planning_JavaBasics;

import java.util.Scanner;
public class ageval {
        public static void main(String[] args) {
            Scanner asker = new Scanner(System.in); //createobject
            System.out.println("How many times have you spun around the sun?");
            int age = asker.nextInt();

            if (age >= 0 && age < 18)
            {
                System.out.println("You shall not pass");
            }
            else if (age >= 18)
            {
                System.out.println("Off you go !");
            }
            else {
                System.out.println("That's not quite right. Integers please.");
            }
        }


}
