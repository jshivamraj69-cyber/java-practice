public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void depositemoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Deposit");
        } else {
            balance += money;
        }
    }

    public double withdrawMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid Withdraw");
            return 0;
        }

        if (balance >= money) {
            balance -= money;
            return money;
        } else {
            double withdrawn = balance;
            balance = 0;
            return withdrawn;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "John Doe");
        account.depositemoney(500.00);
        System.out.println("Balance after deposit: " + account.getBalance());

        double withdrawn = account.withdrawMoney(200.00);
        System.out.println("Withdrawn: " + withdrawn);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
