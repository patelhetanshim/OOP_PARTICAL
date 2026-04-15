import java.util.Scanner;

// Custom Exception
class NotSufficientFundException extends Exception {
    NotSufficientFundException(String msg) {
        super(msg);
    }
}

// BankAccount class
class BankAccount {

    double balance;

    // Constructor
    BankAccount() {
        balance = 1000.00;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) throws NotSufficientFundException {

        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

// Main class
public class pratical15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount obj = new BankAccount();

        System.out.println("Initial Balance: " + obj.balance);

        // Dynamic deposit
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        obj.deposit(dep);

        // Three withdrawals (dynamic)
        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter withdrawal amount " + i + ": ");
            double amt = sc.nextDouble();

            try {
                obj.withdraw(amt);
            } catch (NotSufficientFundException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}