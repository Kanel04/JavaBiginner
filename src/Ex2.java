import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int GAS_PRICE = 3370;
        final int DIESEL_PRICE = 2600;
        final int PETROL_CAR_RENT = 50000;
        final int DIESEL_CAR_RENT = 60000;
        final int PETROL_CAR_MILEAGE_COST = 250;
        final int DIESEL_CAR_MILEAGE_COST = 200;
        final double PETROL_CAR_FUEL_CONSUMPTION = 8.0;
        final double DIESEL_CAR_FUEL_CONSUMPTION = 7.0;

        System.out.print("Enter the number of kilometers to be traveled: ");
        int kilometers = scan.nextInt();

        double petrolCarCost = PETROL_CAR_RENT + (PETROL_CAR_MILEAGE_COST * kilometers) + 
                              ((PETROL_CAR_FUEL_CONSUMPTION / 100) * kilometers * GAS_PRICE);

        double dieselCarCost = DIESEL_CAR_RENT + (DIESEL_CAR_MILEAGE_COST * kilometers) + 
                               ((DIESEL_CAR_FUEL_CONSUMPTION / 100) * kilometers * DIESEL_PRICE);

        if (petrolCarCost < dieselCarCost) {
            System.out.println("The petrol car is the best option with a cost of " + petrolCarCost + " Ar");
        } else {
            System.out.println("The diesel car is the best option with a cost of " + dieselCarCost + " Ar");
        }

        scan.close();
    }
}
