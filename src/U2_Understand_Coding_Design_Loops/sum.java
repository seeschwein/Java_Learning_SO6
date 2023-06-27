package U2_Understand_Coding_Design_Loops;

import java.util.Scanner;
    public class sum {
        public static void main(String[] args) {
            Scanner askme = new Scanner(System.in);   // 2. create scanner object
            System.out.println("Input a number to sum to: "); // 3. Ask user to enter a number using sout shortcut
            int desired = askme.nextInt(); // 4. read the user input, safe it to int sumTo variable, use nextInt() to read
            int sumTo = 0;
            int counter = 1;
            System.out.println("Numbers to sum are from 1 to "+ desired);

            while(counter<=desired) // 5. create while loop counter int counter, initialise/assign value =1,
            {
                sumTo = sumTo + counter;
                counter++;
            }
            System.out.print("the total of those numbers above is " + sumTo);  // 7. print out the sumTotal
        }
    }

