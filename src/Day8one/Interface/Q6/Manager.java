package Day8one.Interface.Q6;

public class Manager extends Employee {

    //constructor
    public Manager (String name, int id, double salary){
        super(name, id, salary);
    }

    @Override
    public void calculateBonus() {
        setBonus(+2000);
    }
    
}
