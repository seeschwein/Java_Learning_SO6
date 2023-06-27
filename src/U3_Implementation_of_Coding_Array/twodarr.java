package U3_Implementation_of_Coding_Array;

public class twodarr {
    public static void main(String[] args) {
        String[][] listy = {
                {"Moh", "ena", "oio"},
                {"Kin", "eba", "ibo"},
                {"Mko", "esa", "ibe"}
        };

        // PRINT ALL ELEMENTS
        for (int i = 0; i < listy.length; i++) { // row counter
            for (int j = 0; j < listy[i].length; j++) { // column counter
                System.out.print(listy[i][j] + " ");
            }
            System.out.println();
        }
    }
}