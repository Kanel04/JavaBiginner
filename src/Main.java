import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scan.nextInt();

            sum += numbers[i];
            average = (double) sum / (i + 1);

            System.out.println("Average so far: " + average);
        }

        System.out.println("Final average: " + average);
        scan.close();
    }
}
