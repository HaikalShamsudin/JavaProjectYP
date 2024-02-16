package Day8one.Interface.Q6;

public class Intern extends Employee {
    //constructor
    public Intern (String name, int id, double salary){
        super(name,id,salary);
    }

    @Override
    public void calculateBonus() {
        setBonus(+2000);
    }
}
