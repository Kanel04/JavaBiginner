import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();

            sum += number;
            count++;
            average = (double) sum / count;

            System.out.println("Average so far: " + average);
        }

        System.out.println("Final average: " + average);
        scan.close();
    }
}
