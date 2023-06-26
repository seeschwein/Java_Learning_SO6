public class fora {
    public static void main(String[] args) { //invoke with main
        System.out.println("Using a for loop now");
        for (int x = 0; x < 3; x = x + 1) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
        System.out.println("Using a while loop now");
        int x = 3;
        while( x < 6 ) //no semicolon ; at end
        {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
        System.out.println("Using a do/while loop now");
        int  y =6; //had to make this variable a different name
        do
        {
            System.out.print
                    ("value of x : " + y );
            y++;
            System.out.print("\n");
        } while ( y < 12 ); //condition comes last, it will get exec once even if the while will be false, or it could go into


    }
}
