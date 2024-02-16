package Day8one.Interface.Q6;

public class Main {
    public static void main(String[] args) {

        //instantiate 
        Manager manager = new Manager("James", 1019, 5000);
        Developer developer = new Developer("John", 1017, 3000);
        Intern intern = new Intern("Nick", 1013, 1000);

        manager.calculateBonus();
        manager.displayDetails();
        System.out.println();

        developer.calculateBonus();
        developer.displayDetails();
        System.out.println();

        intern.calculateBonus();
        intern.displayDetails();
    }
}
