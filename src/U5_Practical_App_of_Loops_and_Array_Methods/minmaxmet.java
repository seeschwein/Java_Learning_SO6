package U5_Practical_App_of_Loops_and_Array_Methods;

import java.util.Scanner;
public class minmaxmet {
    static int min (int num1, int num2, int num3) {
        int mini = num1;

        if (num2 < mini) {
            mini = num2;
        }

        if (num3 < mini) {
            mini = num3;
        }

        return mini;
    }
    static int max (int num1, int num2, int num3) {
        int maxi = num1;

        if (num2 > maxi) {
            maxi = num2;
        }

        if (num3 > maxi) {
            maxi = num3;
        }

        return maxi;
    }

    static double min (double num1, double num2, double num3) {
        double mini = num1;

        if (num2 < mini) {
            mini = num2;
        }

        if (num3 < mini) {
            mini = num3;
        }

        return mini;
    }
    static double max (double num1, double num2, double num3) {
        double maxi = num1;

        if (num2 > maxi) {
            maxi = num2;
        }

        if (num3 > maxi) {
            maxi = num3;
        }

        return maxi;
    }
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);

        System.out.println("This is our first number A: ");
        double a = ask.nextDouble();

        System.out.println("And this is our second number B: ");
        double b = ask.nextDouble();
        System.out.println("And finally this is our third number C: ");
        double c = ask.nextDouble();
        if (a % 1 == 0 && b % 1 == 0 && c % 1 == 0) {
            int mini = min((int) a, (int) b, (int) c);
            int maxi = max((int) a, (int) b, (int) c);
            System.out.println("Smallest of the three numbers is: " + mini);
            System.out.println("Biggest of the three numbers is: " + maxi);
        } else {
            double mini = min(a, b, c);
            double maxi = max(a, b, c);
            System.out.println("Smallest of the three numbers is: " + mini);
            System.out.println("Biggest of the three numbers is: " + maxi);
        }


    }


}
