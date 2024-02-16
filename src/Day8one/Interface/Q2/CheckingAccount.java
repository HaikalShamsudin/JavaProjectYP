package Day8one.Interface.Q2;

public class CheckingAccount implements BankAccoutInterface {

    //declare the current money in account & overlimit
    private double initialBalance;
    private double overLimit;

    //constructor
    public CheckingAccount(double initialBalance, double overLimit) {
        this.initialBalance = initialBalance;
        this.overLimit = overLimit;
    }

    //Adds the given amount to the account balance.
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("You have receive:" + amount);
        } else {
            System.out.println("No deposit has been made");
        }
    }

    //Subtracts the given amount from the account balance.
    @Override                                                           
    public void withdraw(double amount) {                               
        if (amount < 0 && (initialBalance - amount) >= -overLimit) {    
            initialBalance -= amount;
            System.out.println("withdrawn:" + amount);
        } else { 
            System.out.println("Invalid amount");

        }
    }   

    // Returns the current balance of the account.
    @Override
    public double getBalance() {
        return initialBalance;
    }
    
}
