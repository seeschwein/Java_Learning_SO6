public class ara2 {
        public static void main(String[] args) {
            // create an array, put values inside
            int [] carPrices = {12000, 34000, 56000, 15450, 45000};
            // print all data inside the array using for loop or for each loop
            for (int i = 0; i < carPrices.length; i++) {
                System.out.println(carPrices[i]);
            }

            carPrices[0] = 12670;
            carPrices[1] = 30293;
            carPrices[2] = 89281; // update the value of the elements
            carPrices[4] = 55000;
            System.out.println("Print updated values : ");
            // print the array again with the new updated values
            for (int i = 0; i < carPrices.length; i++) {
                System.out.println(carPrices[i]);
            }
            System.out.println("Alas just the fourth car remained the same price: " +carPrices[3]);

        }
    }


