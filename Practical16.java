import java.util.Scanner;

class SumThread extends Thread {
    int start, end;
    long sum = 0;

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " = " + sum);
    }

    long getSum() {
        return sum;
    }
}

public class Practical16 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range start for Thread 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter range end for Thread 1: ");
        int e1 = sc.nextInt();

        System.out.print("Enter range start for Thread 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter range end for Thread 2: ");
        int e2 = sc.nextInt();

        SumThread t1 = new SumThread(s1, e1);
        SumThread t2 = new SumThread(s2, e2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long total = t1.getSum() + t2.getSum();

        System.out.println("Final Total Sum = " + total);
    }
}