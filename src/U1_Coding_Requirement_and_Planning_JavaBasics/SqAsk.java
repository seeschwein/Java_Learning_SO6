package U1_Coding_Requirement_and_Planning_JavaBasics;

import java.util.Scanner; //readuserinput
public class SqAsk {
    // Workbook 1
        public static void main(String[] args) {
            Scanner asker = new Scanner(System.in); //createobject
            System.out.println("--RECTANGLE CALCULATOR PROGRAM--");

            // ask for input
            System.out.println("What's the width? ");
            double width = asker.nextDouble();
            System.out.println("What's the height? ");
            double height = asker.nextDouble();


            // 2. Print variables width and height
            System.out.println("We have a rectangle. The measurement for width is " + width);
            System.out.println("The measurement for height is " + height);
            // 3. Create variable perimeter, calculate using formula 2 * w * h
            double perimeter = 2*(width+height);
            // 4. Print variable perimeter

            System.out.println("the perimeter is " + perimeter);
            // 5. Create variable area, calculate using formula w * h
            double area = width*height;
            // 6. Print variable area
            System.out.println("the area is " + area);
        }


}
