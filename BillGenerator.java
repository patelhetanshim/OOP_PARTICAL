import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalBill = itemTotal - discount;
        System.out.println("Final Bill: " + finalBill);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalBill = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BillGenerator b = new BillGenerator();

        System.out.print("Enter Item Total: ");
        int total = sc.nextInt();

        System.out.println("1. Regular");
        System.out.println("2. Privileged");
        System.out.println("3. Festive");
        System.out.print("Select Customer Type: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                b.generateBill(total);
                break;

            case 2:
                System.out.print("Enter Flat Discount: ");
                int dis = sc.nextInt();
                b.generateBill(total, dis);
                break;

            case 3:
                System.out.print("Enter Discount Percentage: ");
                double per = sc.nextDouble();
                b.generateBill(total, per);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}