import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class fileh {
    public static void main(String[] args) {
        Scanner askme = new Scanner(System.in);
        try{
            System.out.println("Input new text filename : ");
            String filename = askme.nextLine();

            if ( filename.contains(".txt")) {
                System.out.println("creating file...");
                String filenametxt = filename;
                File myobj = new File (filenametxt);
                if (myobj.createNewFile()){
                    System.out.println("new file created:" + myobj.getName());
                }
                else {
                    System.out.println("file exists already");
                }
            } else {
                System.out.println("I'll add the .txt extension for you");
                String ext = ".txt";
                String filenametxt = filename + ext;
                File myobj = new File (filenametxt);
                if (myobj.createNewFile()){
                    System.out.println("new file created:" + myobj.getName());
                }
                else {
                    System.out.println("file exists already");
                }
            }

        }
        catch (IOException exc){
            System.out.println("error");
            exc.printStackTrace();
        }

    }
}
