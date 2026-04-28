/*Design a class Time with hours (int) and minutes (int) as data members. Include method setTime(int h, 
int m) to initialize the time and displayTime() to display the time. Implement a method addTime(Time 
t1, Time t2) that takes two Time objects as arguments, adds their hours and minutes, and stores the 
result in the calling object. Do not use constructors for initialization in this specific practical. 
 */   





import java.util.Scanner;

class Time {

    int hours, minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void displayTime() {
        System.out.println(hours + " Hours " + minutes + " Minutes");
    }

    void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours + (minutes / 60);
        minutes = minutes % 60;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        System.out.println("Enter Time 1 (hours minutes):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter Time 2 (hours minutes):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        t1.setTime(h1, m1);
        t2.setTime(h2, m2);

        result.addTime(t1, t2);

        System.out.print("Added Time: ");
        result.displayTime();
    }
}
