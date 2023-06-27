package U6_Object_Oriented_Programming_OOP1;

public class PersonCreator {

    public static void main(String[] args) {
        // Create (Instantiate) two Person objects: Person01 and Person02
        Person person01 = new Person("James", "Peterson", 34, 180, 73.5);
        Person person02 = new Person("Bob", "Thornley", 25, 171, 68.2);

        // Print their details using the Get methods
        System.out.println("Person01 Details:");
        System.out.println("Name: " + person01.getFirstName());
        System.out.println("Name: " + person01.getLastName());
        System.out.println("Age: " + person01.getAge());
        System.out.println("Height: " + person01.getHeight() + "cm");
        System.out.println("Weight: " + person01.getWeight() + "lbs");

        System.out.println("\nPerson02 Details:");
        System.out.println("Name: " + person02.getFirstName());
        System.out.println("Name: " + person02.getLastName());
        System.out.println("Age: " + person02.getAge());
        System.out.println("Height: " + person02.getHeight() + "cm");
        System.out.println("Weight: " + person02.getWeight() + "lbs");

        //making James older
        person01.growOlder();
        //printing new values
        System.out.println("\nA year has passed, let's check on one person");
        System.out.println("Name: " + person01.getFirstName());
        System.out.println("Name: " + person01.getLastName());
        System.out.println("Age: " + person01.getAge());
        System.out.println("Height: " + person01.getHeight() + "cm");
        System.out.println("Weight: " + person01.getWeight() + "lbs");


    }
}

// Create a Person class
class Person {
    // Define properties: name, age, height, weight
    private String firstname;
    private String lastname;
    private int age;
    private int height;
    private double weight;

    // Create a constructor method
    public Person(String firstname, String lastname, int age, int height, double weight) {
        // Use Set methods to set initial state of properties
        setFirstName(firstname);
        setLastName(lastname);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    // Create Get methods for each property
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Create Set methods for each property
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //  behavioral method growOlder()
    public void growOlder() {
        setAge(getAge() + 1);
        setHeight(getHeight() - 1);
        setWeight(getWeight() - 0.5);
    }
}