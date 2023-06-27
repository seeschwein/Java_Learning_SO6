import java.util.Scanner;     //1. Import java scanner
public class suma {
        public static void main(String[] args) {
            // 2. create scanner object
            Scanner reader = new Scanner(System.in);
            // 3. Ask user to enter a number using sout shortcut
            System.out.println("Enter a number to sum to: ");
            // 4. read the user input, safe it to int sumTo variable, use nextInt() to read
            int userInput = reader.nextInt();
            // 5. create while loop counter int counter, initialise/assign value =1, create sumTotal variable, assign to = 0
            int counter = 1;
            int sumTo = 0;

            // 6. use while loop to loop from counter <= sumTo, inside this loop calculate sumTotal = sumTotal + counter
            while(counter <= userInput) {
                sumTo = sumTo + counter; // adding the number
                counter = counter + 1; // updating counter
            }
            // 7. print out the sumTotal
            System.out.println("The total  number from 1 to " + userInput + " is " + sumTo);
        }
    }


