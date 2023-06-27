package U5_Practical_App_of_Loops_and_Array_Methods;

public class u5meth {

        // my method to add int number + 5
        static int add (int x) {
            return 5 + x;
        }

        // my method to substract x to 5
        static int minus(int x){
            return x - 5;
        }

        // create method to multiply x * 5
        static int mult(int x){
            return x * 5;
        }

        // create method to divide x /5

    static int div(int x){
        return x / 5;
    }
        //main method
        public static void main(String[] args) {
            // method add calling and passing number 10 to x
            System.out.println( add(10)); // 5 + 10 = 15
            // method minus calling and passing number 10 to x
            System.out.println( minus(10)); // 10-5 = 5
            // method multiplication calling, passing number 10
            System.out.println( mult(10));
            // method division calling, passing number 10
            System.out.println( div(10));

        }
    }

