package Day8one.Interface.Q6;

abstract class Employee {
    
    private String name;
    private int id;
    private double salary;
    public double bonus;

    //constructor
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //abstract method
    public abstract void calculateBonus();

    //concrete method
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name:" + name);
        System.out.println("ID:" + id);
        System.out.println("Salary:" + salary);
        System.out.println("Bonus:" + (salary + bonus));
    }

    //getter method for name
    public String getName() {
        return name;
    }

    //getter method for ID
    public int getId() {
        return id;
    }
    //getter method for salary
    public double getSalary() {
        return salary;
    }
    //setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //getter method for bonus
    public double getBonus() {
        return bonus;
    }
    //setter method for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
