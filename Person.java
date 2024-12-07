import java.util.ArrayList;

public class Person {
    // Attributes
    private String name;
    private int age;
    private String dob;
    private String ssn;
    private ArrayList<String> pets;
    
    // Constructor
    public Person(String name, int age, String dob, String ssn, ArrayList<String> pets) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.ssn = ssn;
        this.pets = pets;
    }
    
    // Getters and Setters
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
    
    public String getDob() {
        return dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getSsn() {
        return ssn;
    }
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }
    
    // Method to greet
    public void Greet() {
        String petMessage;
        if (pets.isEmpty()) {
            petMessage = "I do not have any pets.";
        } else {
            petMessage = "my pets are " + String.join(", ", pets) + ".";
        }
        System.out.printf("Hello! My name is %s, I am %d years old, and %s%n", name, age, petMessage);
    }
    
    public static void main(String[] args) {
        // Create Person Object with Different Values
        ArrayList<String> pets1 = new ArrayList<>();
        pets1.add("Dog");
        pets1.add("Cat");
        
        ArrayList<String> pets2 = new ArrayList<>();
        pets2.add("Parrot");
        
        ArrayList<String> pets3 = new ArrayList<>(); // No pets
        
        ArrayList<String> pets4 = new ArrayList<>();
        pets4.add("Fish");
        pets4.add("Hamster");
        
        ArrayList<String> pets5 = new ArrayList<>();
        pets5.add("Turtle");
        pets5.add("Rabbit");
        
        // Instantiate Person Objects
        Person person1 = new Person("John", 25, "01-01-1998", "123-45-6789", pets1);
        Person person2 = new Person("Jane", 30, "02-14-1994", "987-65-4321", pets2);
        Person person3 = new Person("Alice", 28, "12-05-1995", "555-55-5555", pets3);
        Person person4 = new Person("Bob", 35, "07-07-1988", "444-44-4444", pets4);
        Person person5 = new Person("Charlie", 22, "10-10-2002", "333-33-3333", pets5);
        
        // Create ArrayList and add Person objects
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        
        // Loop through the ArrayList and call the Greet method
        for (Person person : people) {
            person.Greet();
        }
    }
}