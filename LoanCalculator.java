 import java.util.Scanner;

class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float emi = (principal * rate * time) / 100;
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double emi = (principal * rate * time) / 100;
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        double emi = (principal * 10 * time) / 100;
        System.out.println("Personal Loan EMI: " + emi);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoanCalculator l = new LoanCalculator();

        System.out.println("1. Home Loan");
        System.out.println("2. Vehicle Loan");
        System.out.println("3. Personal Loan");
        System.out.print("Select Loan Type: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Principal, Time, Rate: ");
                int p1 = sc.nextInt();
                int t1 = sc.nextInt();
                float r1 = sc.nextFloat();
                l.calculateEMI(p1, t1, r1);
                break;

            case 2:
                System.out.print("Enter Principal, Time, Rate: ");
                double p2 = sc.nextDouble();
                int t2 = sc.nextInt();
                double r2 = sc.nextDouble();
                l.calculateEMI(p2, t2, r2);
                break;

            case 3:
                System.out.print("Enter Principal and Time: ");
                int p3 = sc.nextInt();
                int t3 = sc.nextInt();
                l.calculateEMI(p3, t3);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}