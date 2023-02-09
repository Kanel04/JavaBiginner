import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scan.nextInt();

        int sum = 0;
        int product = 1;
        int i = 1;

        while (i <= n) {
            sum += i;
            product *= i;
            i++;
        }

        System.out.println("The sum of the first " + n + " terms is: " + sum);
        System.out.println("The product of the first " + n + " terms is: " + product);
        scan.close();
    }
}
