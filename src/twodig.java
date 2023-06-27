public class twodig {
    public static void main(String[] args) {
            // nested loop = loop inside another loop
            for (int i = 1; i <= 9; i++ ) { // outer loop, counter i =1
                for (int j = 0; j <= 9; j++) { // inner loop, counter j = 0 , 2, 3, 4, 5
                    if (!(i == j)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }


