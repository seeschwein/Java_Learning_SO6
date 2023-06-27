public class oopractice {

    // Create a class attribute integer called x
    private int x;

    // Create a class constructor for the Main class
    public oopractice() {
        // Set the initial value for the class attribute x as 5
        x = 5;
    }

    // Add a main method
    public static void main(String[] args) {
        // Create an object of class Main (This will call the constructor) called myObj
        oopractice myObj = new oopractice();

        // Print the value of x by calling the method myObj
        System.out.println(myObj.x);
    }
}