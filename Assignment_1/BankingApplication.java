//Q7. Consider a scenario where you are tasked with developing a simple banking application
//        using Java, employing the concept of polymorphism. Your application should consist of three
//classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the
//        base class with private attributes for account number and balance, along with abstract methods
//for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include
//an additional attribute for interest rate and override the deposit method to calculate interest, as
//well as override the withdrawal method to ensure a sufficient balance. Similarly, the
//CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit
//attribute and override the withdrawal method to check the overdraft limit. Implement the
//classes as described, ensuring proper encapsulation and abstraction. Finally, create a
//BankingApplication class (Main) to demonstrate the polymorphic behavior by creating
//instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal
//operations, and displaying account details.
package sem_4_Assignments.assignment_1;

abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        super.deposit(amount + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000, 5.0);
        CurrentAccount currentAccount = new CurrentAccount(654321, 2000, 1000);

        // Testing deposit and withdrawal operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);

        // Displaying account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());
        System.out.println("Overdraft Limit: $" + currentAccount.getOverdraftLimit());
    }
}
