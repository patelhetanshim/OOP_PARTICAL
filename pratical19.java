import java.util.*;

class SortUtil {
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }
}

public class pratical19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();
        System.out.print("Enter number of names: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("Before sorting:");
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);

        SortUtil.sortList(numbers);
        SortUtil.sortList(names);

        System.out.println("After sorting:");
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);
    }
}