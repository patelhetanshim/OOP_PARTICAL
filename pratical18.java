import java.util.*;

class Box<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class pratical18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box<String> nameBox = new Box<>();
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            nameBox.addItem(name);
        }

        Box<Integer> rollBox = new Box<>();
        System.out.print("Enter number of roll numbers: ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("Enter roll number " + (i + 1) + ": ");
            int roll = sc.nextInt();
            rollBox.addItem(roll);
        }

        System.out.println("Names in Box:");
        nameBox.displayItems();

        System.out.println("Roll numbers in Box:");
        rollBox.displayItems();
    }
}