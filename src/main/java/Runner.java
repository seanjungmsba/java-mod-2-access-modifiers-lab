import java.util.Scanner;

public class Runner {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(
                "Welcome to your virtual garage. This is where you can add, get, change a car of your choice.");
        try {
            Garage virtualGarage = new Garage();
            openGarage(virtualGarage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openGarage(Garage garage) {

        boolean garageOpened = true;

        while (garageOpened) {
            System.out.println("ENTER '1' to add a car into garage");
            System.out.println("ENTER '2' to get a car from garage");
            System.out.println("ENTER '3' to change a car in garage");
            System.out.println("ENTER '4' to close the garage");

            try {

                int choice = Integer.parseInt(sc.nextLine().trim());

                switch (choice) {
                    case 1:
                        System.out.println("MODE: adding a car to your virtual garage");
                        Car carToaAdd = getCarInfo();
                        garage.addCarToGarage(carToaAdd);
                        System.out.print("Car(s) in garage ======> ");
                        garage.getAllCars();
                        break;
                    case 2:
                        System.out.println("MODE: getting a car from your virtual garage");
                        System.out.print("Car(s) in garage ======> ");
                        garage.getAllCars();
                        System.out.println("Enter position of the car to get from garage in number format");
                        int getIndex = Integer.parseInt(sc.nextLine());
                        System.out.println(garage.getCarFromGarage(getIndex - 1));
                        break;
                    case 3:
                        System.out.println("MODE: switching a car in your virtual garage");
                        System.out.print("Enter position of car to be replaced from from garage: ");
                        int setIndex = Integer.parseInt(sc.nextLine());
                        System.out.println("Now, enter a car info: ");
                        Car carToSwitch = getCarInfo();
                        garage.switchCarInGarage(setIndex - 1, carToSwitch);
                        System.out.print("Car(s) in garage ======> ");
                        garage.getAllCars();
                        break;
                    case 4:
                        System.out.print("(Closing garage...)");
                        garageOpened = false;
                        break;
                    default:
                        System.out.println("Please enter a valid option (1-4)");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }

    public static Car getCarInfo() {

        try {

            System.out.print("Enter a MAKE of car: ");
            String make = sc.nextLine();

            System.out.print("Enter a MODEL of car: ");
            String model = sc.nextLine();

            System.out.print("Enter a manufactured YEAR of car: ");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("Enter a number of WHEELS: ");
            int wheels = Integer.parseInt(sc.nextLine());

            System.out.print("Enter a miles per gallon (MPG): ");
            int mpg = Integer.parseInt(sc.nextLine());

            return new Car(year, make, model, wheels, mpg);

        } catch (Exception e) {
            System.err.println("Enter a valid information!");
        }
        return null;
    }

}