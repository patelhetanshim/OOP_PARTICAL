import java.util.Scanner;

class Vehicle {

    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vno, String b, String f) {
        vehicleNumber = vno;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    int numberOfSeats;
    boolean ACavailable;

    Car(String vno, String b, String f, int seats, boolean ac) {
        super(vno, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {

    int batteryCapacity;
    int chargingTime;

    ElectricCar(String vno, String b, String f, int seats, boolean ac, int battery, int charge) {
        super(vno, b, f, seats, ac);
        batteryCapacity = battery;
        chargingTime = charge;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class practical10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Details");

        System.out.print("Vehicle Number: ");
        String vno = sc.nextLine();

        System.out.print("Brand: ");
        String b = sc.nextLine();

        System.out.print("Fuel Type: ");
        String f = sc.nextLine();

        System.out.print("Number of Seats: ");
        int seats = sc.nextInt();

        System.out.print("AC Available (true/false): ");
        boolean ac = sc.nextBoolean();

        System.out.print("Battery Capacity: ");
        int battery = sc.nextInt();

        System.out.print("Charging Time: ");
        int charge = sc.nextInt();

        ElectricCar ec = new ElectricCar(vno, b, f, seats, ac, battery, charge);

        System.out.println("\n--- Electric Car Details ---");
        ec.displayDetails();

        // Upcasting
        Vehicle v1 = new Car(vno, b, f, seats, ac);

        System.out.println("\n--- Upcasting Vehicle -> Car ---");
        v1.displayDetails();

        // Downcasting
        if (v1 instanceof Car) {
            Car c = (Car) v1;
            System.out.println("\nDowncasting successful");
            c.displayDetails();
        }
    }
}