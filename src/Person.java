class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name= "Manik";
        this.age = 19;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
        // Creating objects using constructors
        // Create an object named "person1" by Default constructor.
        Person person1 = new Person();

        // Create an object named "person2" by Parameterized constructor.
        Person person2 = new Person("Jewel", 21);

        // Accessing object attributes
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
