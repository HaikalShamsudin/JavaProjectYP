package Day5.Assignment;

public class Animal {
    
    //declare variable
    String name;
    String sound;

    //contructor
    public Animal(String name, String sound){
    this.name = name;
    this.sound = sound;
    }

    //method
    public void makeSound() {
        System.out.println(sound);
    }
    public String getName(){
        return name;
    }
    
}

class Dog extends Animal {

    //CONSTRUCTOR calling the SUPERCLASS CONSTRUCTOR
    public Dog (String name) {
        super(name, "Bark");
    }

    // Override the makeSound method to print "Bark"
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        
        //CREATE OBJECT FOR DOG CLASS
        Dog thisDog = new Dog("Micky");

        // Accessing the inherited method from Animal class
        System.out.println(thisDog.getName() + "sound:");
        thisDog.makeSound();
    }

}
