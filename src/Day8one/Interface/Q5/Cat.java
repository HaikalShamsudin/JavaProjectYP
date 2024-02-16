package Day8one.Interface.Q5;

public class Cat extends AbstractAnimal {

    public Cat() {
        super("Tony", 4);
    }

    @Override
    public void eat() {
        System.out.println("Cat eating fist");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeSound() {
       System.out.println("Cat make sound 'meow' ");
    }
    
}
