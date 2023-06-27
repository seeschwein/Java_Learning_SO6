package U3_Implementation_of_Coding_Array;

public class arrfor {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {3, 6, 7, 9, 10, 14, 19, 20, 21, 40};
        System.out.println("Here are our elements of the array");// Print all the array elements
        for (int data:numbers) {
            System.out.println(data);
        }
        for (int data:numbers) {
            sum = sum+ data;
        }
        System.out.println("their sum is " + sum);
        double average = sum/numbers.length;
        System.out.println("their average is " + average);


    }

}
