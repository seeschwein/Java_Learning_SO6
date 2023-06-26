import java.util.Scanner;
public class andif {

            public static void main(String[] args) {
                Scanner asker = new Scanner(System.in); //createobject
                System.out.println("How much you got?");
                int muneh = asker.nextInt();

                if (muneh >=0 && muneh <= 85000) {
                    System.out.println("aye aye yer protected");
                }
                else{
                    System.out.println("Sorry, no");
                }
            }

    }
