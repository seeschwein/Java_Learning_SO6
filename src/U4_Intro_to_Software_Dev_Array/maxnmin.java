package U4_Intro_to_Software_Dev_Array;

import java.util.Random; //importer

public class maxnmin {
    public static void main(String[] args) {
        Random rgn = new Random(); //random generator
        int[] arr = new int[10]; //
        // generating random number for array1
        System.out.println("Generating Array 1, random values between 1 to 100");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rgn.nextInt(100) + 1; //bound 1 to 10
            System.out.print(arr[i] + " ° ");
        }
        int max = arr[0]; // the max int

        for (int i = 0; i < arr.length; i++) { //for loop to compare each elem
            if(arr[i] > max)
                max = arr[i]; //updating the max
        }
        System.out.println(" ");
        System.out.println("\nThe largest number I found iisss *drum rolls*: " + max);

        int min = arr[0]; //the min int
        for (int i = 0; i < arr.length; i++) { //for loop to compare each elem
            if(arr[i] < min)
                min = arr[i]; //updating the min
        }
        System.out.println(" ");
        System.out.println("The smallest number I found is *quiet drum rolls*: " + min);
    }
}
