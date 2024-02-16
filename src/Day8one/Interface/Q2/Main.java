package Day8one.Interface.Q2;

public class Main {
    
    public static void main(String[] args) {
        
    
    //create an instance for saving and checking account
    SavingAccount savingAccount = new SavingAccount(1000, 0.5);
    CheckingAccount checkingAccount = new CheckingAccount(500, 200);

    //Savingaccount
    System.out.println("Saving Account");
    System.out.println("Initial Balance: $" + savingAccount.getBalance());
    savingAccount.deposit(300);
    savingAccount.calculateInterest();
    savingAccount.withdraw(100);
    System.out.println("Current Balance: $" + savingAccount.getBalance());
    System.out.println();

    //CheckingAccout
    System.out.println("Checking Account");
    System.out.println("Initial Balance: $" + checkingAccount.getBalance());
    checkingAccount.deposit(500);
    checkingAccount.withdraw(50);
    checkingAccount.withdraw(100);
    System.out.println("Current Balance: $" + checkingAccount.getBalance());
    System.out.println();

    }
}
