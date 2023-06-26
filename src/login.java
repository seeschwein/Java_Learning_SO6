import java.util.Scanner; // import Scanner class
// public class login {
    // this program will read user name (String) and password (int)



    public class login {
        public static void main(String[] args) {
            // create Scanner object
            Scanner reader = new Scanner(System.in);

            System.out.println("What's the last dessert you ate? ");
            // read a
            String dessert = reader.nextLine();


            System.out.println("Was it nice? ");
            // read b
            boolean liked = reader.nextBoolean();

            // print information
            System.out.println("You last had a " + dessert + "for dessert");

            if (liked == true) {
                System.out.println("You said you liked it");
            } else {
                System.out.println("You said you didn't like it");
            }

        }
    }