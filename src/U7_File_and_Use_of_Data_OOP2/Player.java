package U7_File_and_Use_of_Data_OOP2;

public class Player {

        private String name;
        private int age;
        private int height;
        private int speed;
        private double weight;

        public Player(String name, int age, int height, int speed, double weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.speed = speed;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void getFaster() {
            this.speed++;
        }

        public void growOlder() {
            this.age++;
        }


    public static void main(String[] args) {
        Player p1 = new Player("Attila", 24, 180, 5, 70.0);
        Player p2 = new Player("Marla", 26, 172, 8, 60.0);

        System.out.println("Player one! Your name is " + p1.getName() + ", age: " + p1.getAge() + ", height: " + p1.getHeight()+ ", speed: " + p1.getSpeed()+ ", weight: " + p1.getWeight());
        System.out.println("Player two! Your name is " + p2.getName() + ", age: " + p2.getAge() + ", height: " + p2.getHeight()+ ", speed: " + p2.getSpeed()+ ", weight: " + p2.getWeight());

        p1.getFaster();
        p1.growOlder();

        p2.getFaster();
        p2.getFaster();
        p2.growOlder();

        System.out.println("Time has passed. The stats have changed");
        System.out.println(p1.getName() + ", age: " + p1.getAge() + ", height: " + p1.getHeight()+ ", speed: " + p1.getSpeed()+ ", weight: " + p1.getWeight());
        System.out.println(p2.getName() + ", age: " + p2.getAge() + ", height: " + p2.getHeight()+ ", speed: " + p2.getSpeed()+ ", weight: " + p2.getWeight());

    }

}
