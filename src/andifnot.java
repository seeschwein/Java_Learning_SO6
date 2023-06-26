import java.util.Scanner; //import,read user input
public class andifnot {

            public static void main(String[] args) {
                System.out.println("Is your money protected? Let's find out");
                Scanner asker = new Scanner(System.in); //createobject
                System.out.println("How much you got?");
                int muneh = asker.nextInt();

                if (!(muneh >=0 && muneh <= 85000)) { //NOT
                    System.out.println("Sorry, no");
                }
                else{
                    System.out.println("aye aye yer protected");
                }
            }

    }
