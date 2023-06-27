package U4_Intro_to_Software_Dev_Array;

import java.util.Random;
public class arraa {

    public static void main(String[] args) {
        Random rgn = new Random();
        int[] arr1 = new int[10]; //
        // generating random number for array1
        System.out.println("Generating Array 1, random values between 1 to 20");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rgn.nextInt(20) + 1;
            System.out.print(arr1[i] + " | ");
        }
        // generating random number for array2
        int[] arr2 = new int[10]; //
        System.out.println("");
        System.out.println("Generating Array 2, random values between 1 to 20");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = rgn.nextInt(20) + 1;
            System.out.print(arr2[j] + " | ");
        }
        System.out.println("");
        System.out.println("Let's compare arrays and see duplicates");
        boolean found = false;
        for(int i = 0; i < arr1.length; i++){ // this for loop to access array1 index
            for(int j = 0; j < arr2.length; j++){ // this for loop to access array2 index
                if(arr1[i] == arr2[j]){
                    found = true; //change the bool
                    System.out.println(arr1[i]);  // print the duplicated value
                }
            }
        }
        System.out.println("");

        System.out.println("Are there duplicate values?");

        System.out.println(found); //print the bool
    }
}

