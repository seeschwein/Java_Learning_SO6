package U5_Practical_App_of_Loops_and_Array_Methods;

import java.util.Scanner;
public class calcy {

        //create a method to add two numbers
        static int addme(int x, int y) {
            return x + y;
        }
        //create a method to subtract two numbers
        static int subme(int x, int y) {
            return x - y;
        }
        //create a method to multiply two numbers
        static int multme( int x, int y){
            return x * y;
        }
        //create a method to divide two numbers
        static float divme(float x, float y){
            return x / y;
        }

        // main method
        public static void main(String[] args) {
            // create scanner object
            Scanner ask = new Scanner(System.in);
            // ask user to enter the first number, create integer variable num1 to read this input
            System.out.println("This is our first number : ");
            int num1 = ask.nextInt();
            // ask user to enter second number, create integer variable num2 to read this input
            System.out.println("And this is our second number : ");
            int num2 = ask.nextInt();
            System.out.println("Okay so the first no is " + num1 + " and the second one is " + num2 + " . Substraction and division are first number - second number and first/second");
            // method calls to add, subtract, multiply and divide the numbers, print the result
            System.out.println("Addition of your numbers: " + addme(num1, num2));
            System.out.println("Subtraction of your numbers : " + subme(num1, num2));
            System.out.println("Multiplication of your numbers: " + multme(num1 , num2));
            System.out.println("Division of your numbers: " +divme(num1, num2));

        }
    }
