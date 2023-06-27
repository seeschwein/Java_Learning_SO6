package U2_Understand_Coding_Design_Loops;

public class codes {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if ((i != j) &&(j != k) && (i != k)) {
                        count++;
                        System.out.println(i + " " + j + " " + k);// Statements

                    }
                }
            }

        }
        System.out.println("I counted " + count + " unique combinations where digits don't repeat");
    }
}