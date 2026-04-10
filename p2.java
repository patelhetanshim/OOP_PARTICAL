 import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 digit number: ");
        String num = sc.next();

        String result = "";

        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            digit = (digit + 1) % 10;
            result = result + digit;
        }

        System.out.println("Output: " + result);
    }
}  

