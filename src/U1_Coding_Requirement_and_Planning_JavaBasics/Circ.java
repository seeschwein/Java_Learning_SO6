package U1_Coding_Requirement_and_Planning_JavaBasics;

public class Circ {
    // Workbook 1, HOMEWORK

        public static void main(String[] args) {
            System.out.println("==Circle Calculator Program==");
            // 1. Declare one variable called circleRadius, assign the value of 12.0
            double circleRadius = 12;
            // 2. Declare variable diameter, calculate using formula, diameter = 2 * circleRadius
            double diameter = 2 * circleRadius;
            // 3. Print the diameter
            System.out.println(diameter);
            // 4. Declare variable area, calculate using formula, area = 3.14 * radius * radius
            double area = 3.14 * circleRadius;
            // 5. Print the area
            System.out.println(area);
            // 6. Declare variable circumference, calculate using formula, circumference = 2 * 3.14 * radius
            double circumference = 2 * 3.14 * circleRadius;
            // 7. Print the circumference
            System.out.println(circumference);
        }
}
