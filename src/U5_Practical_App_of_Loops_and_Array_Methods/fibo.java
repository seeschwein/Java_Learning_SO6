package U5_Practical_App_of_Loops_and_Array_Methods;

public class fibo {
    public static void main(String[] args) {
        Fibonacci();
    }

    public static void Fibonacci() {
        int n = 100; // number of Fibonacci numbers to generate
        int num1 = 0;
        int num2 = 1;
        int sum;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 2; i < n; i++) {
            sum = num1 + num2;
            if (sum > 0){ //added condition to have only positive numbers
            System.out.print(sum + " ");};
            num1 = num2;
            num2 = sum;
        }
    }
}
