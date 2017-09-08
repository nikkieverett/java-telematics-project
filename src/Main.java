import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        VehicleInfo newCar = new VehicleInfo();

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your VIN number?");
        newCar.setVin((sc.nextLine().toString()));

        System.out.println("What is your current odometer reading?");
        newCar.setOdometer(Double.parseDouble(sc.nextLine()));

        System.out.println("How many gallons of gas used?");
        newCar.setConsumption(Double.parseDouble(sc.nextLine()));

        System.out.println("What was the odometer reading for your last oil change?");
        newCar.setLastOilchangeReading(Double.parseDouble(sc.nextLine()));

        System.out.println("What is the size of your engine?");
        newCar.setEngineSize(Double.parseDouble(sc.nextLine()));

        TelematicsService newCarReport = new TelematicsService();

        newCarReport.report(newCar);

    }
}

