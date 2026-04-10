import java.util.Scanner;

class PasswordCheck {

    static boolean isValidPassword(String password) {

        if (password.length() < 8)
            return false;

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch))
                digitCount++;
            else if (!Character.isLetter(ch))
                return false;
        }

        return digitCount >= 2;
    }
}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (PasswordCheck.isValidPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
