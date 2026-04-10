import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5 digit number: ");
        int num = sc.nextInt();

        
        if (num < 10000 || num > 99999) {
            System.out.println("Invalid input! Please enter a 5 digit number.");
            return;
        }

        int temp = num;
        int result = 0;
        int place = 1;

        while (temp > 0) {
            int digit = temp % 10;
            digit = (digit + 1) % 10;
            result = result + (digit * place);
            place = place * 10;
            temp = temp / 10;
        }

        System.out.println("Output: " + result);
    }
}
