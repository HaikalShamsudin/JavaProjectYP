package Day8one.Interface.Q5;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Animal 1: Bird");
        Bird myBird = new Bird();
        myBird.getName();
        myBird.getAge();
        myBird.eat();
        myBird.sleep();
        myBird.makeSound();
        System.out.println();

        System.out.println("Animal 2: Dog");
        Dog myDog = new Dog();
        myDog.getName();
        myDog.getAge();
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();
        System.out.println();

        System.out.println("Animal 3: Cat");
        Cat myCat = new Cat();
        myCat.getName();
        myCat.getAge();
        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
        
    }
}
