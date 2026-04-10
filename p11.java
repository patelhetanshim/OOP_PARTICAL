
    import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount;
        System.out.print("Enter amount: ");
        amount = sc.nextInt();

        int notes[] = {100, 50, 10, 5, 2, 1};

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            if (count > 0) {
                System.out.println(notes[i] + " : " + count);
                amount = amount % notes[i];
            }
        }
    }
}
    

