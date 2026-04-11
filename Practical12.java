import java.util.Scanner;


interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}


abstract class PartialOrder implements Order {

    String itemName;
    int quantity;
    int orderId;
    int price;

    public void placeOrder(String item, int qty) {
        itemName = item;
        quantity = qty;
        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}


class FinalOrder extends PartialOrder {

    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order cancelled successfully!");
        } else {
            System.out.println("Invalid Order ID");
        }
    }

    public void generateBill() {
        int total = quantity * price;

        System.out.println("----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Amount: " + total);
    }
}


public class Practical12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FinalOrder obj = new FinalOrder();

        System.out.print("Enter Order ID: ");
        obj.orderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price per item: ");
        obj.price = sc.nextInt();

        obj.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                obj.generateBill();
                break;

            case 2:
                System.out.print("Enter Order ID to cancel: ");
                int id = sc.nextInt();
                obj.cancelOrder(id);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}