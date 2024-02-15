package Day8one.Interface.Q2;

public class CheckingAccount implements BankAccoutInterface {

    //declare the current money in account
    private double initialBalance;
    private double overLimit;
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("You have receive" + amount);
        } else {
            System.out.println("No deposit has been made");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0 && (initialBalance - amount) >= -overLimit) {
            initialBalance -= amount;
        }
    }   

    @Override
    public void getBalance() {
    }

    



    
}
