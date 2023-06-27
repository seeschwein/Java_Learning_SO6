import java.io.FileWriter; // importing FileWriter class
import java.io.IOException; // importing error handler class
public class Scribe {
        public static void main(String[] args) {
            try{
                FileWriter myWriter = new FileWriter("forgot.txt", false); // specify which text to write on
                myWriter.write("what did I forget? ");
                myWriter.write("my keys,");
                myWriter.write("my pen,");
                myWriter.write("my lunch,");
                myWriter.write("my dignity...");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }
            catch (IOException e){
                System.out.println("An error occured.");
                e.printStackTrace();
            }
        }
}

