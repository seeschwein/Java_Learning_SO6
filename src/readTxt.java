import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
    public class readTxt {
        public static void main(String[] args) {
            try{
                File obj = new File("forgot.txt");
                Scanner myReader = new Scanner(obj);
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }
            catch (FileNotFoundException e){
                System.out.println("An error occured.");
                e.printStackTrace();
            }
        }
    }

