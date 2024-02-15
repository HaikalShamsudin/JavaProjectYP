package Day8one.Interface.Example;

// Implement Cat class
class Cat extends AbstractAnimal {
    // Constructor for Cat
    public Cat() {
        // Set the color for Cat
        super("yellow");
    }

    // Implement makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("Cat makes sound: Meow");
    }
}

