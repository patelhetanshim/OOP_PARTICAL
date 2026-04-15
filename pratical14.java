import java.util.Scanner;

public class pratical14{

    
    static double average(String[] values) throws NullPointerException, NumberFormatException {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] == null) {
                throw new NullPointerException("Null value found at index " + i);
            }

            double num = Double.parseDouble(values[i]); // may throw NumberFormatException
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        System.out.println("Enter elements (enter 'null' to test NullPointerException):");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("null")) {
                arr[i] = null;
            } else {
                arr[i] = input;
            }
        }

        try {
            double avg = average(arr);
            System.out.println("Average = " + avg);

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");

        } finally {
            System.out.println("Program executed (finally block)");
        }
    }
}
