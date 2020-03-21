package accounts;

public class Accounts {

    private long accountNumber;
    private String lName, fName;
    private double balance;
    private double withdraw;
    private double deposit;
    private double amount;

    public Accounts(String lName, String fName,
            long accountNumber) {
        this.lName = lName;
        this.fName = fName;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {

        return fName + " " + lName
                + "'s account number is: "
                + accountNumber + " and balance is: "
                + balance;

    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.err.println("Insufficient Fund");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return fName + " " + lName;
    }
}
