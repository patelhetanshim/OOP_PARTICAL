import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("ID: " + accountId);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc[] = new BankAccount[5];

        for (int i = 0; i < 5; i++) {
            acc[i] = new BankAccount();

            System.out.println("Enter details for Account " + (i + 1));
            System.out.print("ID: ");
            String id = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Balance: ");
            double bal = sc.nextDouble();

            acc[i].assignValues(id, name, bal);
        }

        System.out.println("\nEnter Account ID to search:");
        String searchId = sc.next();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (acc[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                acc[i].displayValues();
                found = true;
            }
        }

        if (!found)
            System.out.println("Account Not Found");
    }
}