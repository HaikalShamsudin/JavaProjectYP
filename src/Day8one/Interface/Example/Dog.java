package Day8one.Interface.Example;

// Implement Dog class
class Dog extends AbstractAnimal {
    // Constructor for Dog
    public Dog() {
        // Set the color for Dog
        super("black");
    }

    // Implement makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("Dog makes sound: Woof");
    }
}
