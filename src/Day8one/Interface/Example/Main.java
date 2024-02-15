package Day8one.Interface.Example;

public class Main {
    // Main class to test the program
    public static void main(String[] args) {
        // Create instances of Cat and Dog
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        // Demonstrate Cat's behavior
        System.out.println("Cat's Behavior:");
        System.out.println("Color: " + myCat.getColor());
        myCat.makeSound();
        System.out.println();

        // Demonstrate Dog's behavior
        System.out.println("Dog's Behavior:");
        System.out.println("Color: " + myDog.getColor());
        myDog.makeSound();
    }
}
