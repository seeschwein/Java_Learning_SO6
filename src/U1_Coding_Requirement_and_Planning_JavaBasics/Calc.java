package U1_Coding_Requirement_and_Planning_JavaBasics;

// Workbook 1
public class Calc {
    public static void main(String[] args) {
        System.out.println("--RECTANGLE CALCULATOR PROGRAM--");

        // 1. Declare two variables, assign width: 13.5 and height: 25.3.
        double width = 13.5;
        double height = 25.3;


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
