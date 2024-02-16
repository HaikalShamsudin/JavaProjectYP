package Day8one.Interface.Q6;

public class Developer extends Employee {
    //constructor
    public Developer (String name, int id, double salary){
        super(name,id,salary);
    }

    @Override
    public void calculateBonus() {
        setBonus(+2000);
    }
}
