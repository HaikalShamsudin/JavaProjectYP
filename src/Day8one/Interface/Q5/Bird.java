package Day8one.Interface.Q5;

public class Bird extends AbstractAnimal {

    public Bird() {
        super("Jimmy", 2);
    }

    @Override
    public void eat() {
        System.out.println("Bird eating bread");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void makeSound() {
       System.out.println("Bird make sound 'waaaaaa' ");
    }
    
}
