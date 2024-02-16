package Day8one.Interface.Q5;

public class Dog extends AbstractAnimal{
    
    public Dog() {
        super("Jony", 4);
    }

    @Override
    public void eat() {
        System.out.println("Dog eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is not sleeping");
    }

    @Override
    public void makeSound() {
       System.out.println("Dog make sound 'woof' ");
    }
    
}
