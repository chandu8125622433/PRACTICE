class Dog {
    // Attributes
    String name;
    int age;
    
    // Method to set values
    void setValues(String n, int a) {
        name = n;
        age = a;
    }
    
    // Method to display values
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to invoke methods
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setValues("Buddy", 3);
        myDog.display();
    }
}
