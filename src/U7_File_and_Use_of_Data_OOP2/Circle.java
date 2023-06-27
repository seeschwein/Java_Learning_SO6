package U7_File_and_Use_of_Data_OOP2;

public class Circle {
        // list all attributes, set them as private
        private double radius;
        private String color;
        private double area;
        private double circumference;
        private double dia;
        // create method constructor
        public Circle(double radius, String color) {
            setRadius(radius);
            setColor(color);
            setArea(area);
            setCC(circumference);
        }

        // create getter and setter methods for each of the attributes
        public double getRadius() {  //getter Radius
            return radius;
        }

        public String getColor() { //getter Color
            return color;
        }
    public double getArea() { //get or calc area
        area = Math.PI * this.radius * this.radius;
        return area;
    }
    public double getDia() { //get or calc dia
        dia = this.radius * 2;
        return dia;
    }

    public double getCC() { //calc circumference
        circumference = Math.PI * this.radius * 2;
        return circumference;
    }

    public void setRadius(double radius) { //Setter radius
            this.radius = radius;
        }

        public void setColor(String color) { //Setter color
            this.color = color;
        }

        public void setArea(double area) { //set area
        this.area = area;
        }
    public void setDia(double dia) { //set area
        this.dia = dia;
    }

    public void setCC(double circumference) {
        this.circumference = circumference;
    }

    public static void main(String[] args) {
            Circle c01 = new Circle(1.0, "Red");
            Circle c02 = new Circle(4.5, "Green");
            Circle c03 = new Circle(3.2, "Blue");

            System.out.println("Radius: " + c01.getRadius() + ", Color: " + c01.getColor() + ", Area: " + c01.getArea()+ ", Circumference: " + c01.getCC()+ ", Diameter: " + c01.getDia());

            System.out.println("Radius: " + c02.getRadius() + ", Color: " + c02.getColor() + ", Area: " + c02.getArea()+ ", Circumference: " + c02.getCC()+ ", Diameter: " + c02.getDia());

            System.out.println("Radius: " + c03.getRadius() + ", Color: " + c03.getColor() + ", Area: " + c03.getArea()+ ", Circumference: " + c03.getCC()+ ", Diameter: " + c03.getDia());
        }

}


