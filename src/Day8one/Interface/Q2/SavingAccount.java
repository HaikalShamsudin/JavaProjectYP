package Day8one.Interface.Q2;

public class SavingAccount implements BankAccoutInterface {

    //declare the variable
    private double initialBalance;
    private double interestRate;

    //constructor
    public SavingAccount(double initialBalance, double interestRate) {
        this.initialBalance = initialBalance;
        this.interestRate = interestRate;
    }

    // deposit method for SavingsAccount
    @Override
    public void deposit(double amount) {
        if (amount>0) {
            initialBalance += amount;
            System.out.println("Deposit : $" + amount);
        } 
        else {
            System.out.println("Invalid");
        }
    }
    // withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && initialBalance >= amount) {
            initialBalance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    // getBalance method for SavingsAccount
    @Override
    public double getBalance() {
       return initialBalance;
    }

    //method for calculate the interest
    public void calculateInterest() {
        double interest = initialBalance * interestRate;
        initialBalance += interest;
        System.out.println("Interest added: $" + interest);
    }

    
}
