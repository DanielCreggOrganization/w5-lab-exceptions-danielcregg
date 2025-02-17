package ie.atu.exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Withdrawal amount exceeds balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}