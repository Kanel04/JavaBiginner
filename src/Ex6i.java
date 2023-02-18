import java.util.Scanner;

public class Ex6i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une valeur de x : ");
        double x = sc.nextDouble();

        double y = Math.exp(x);

        System.out.println("La valeur de exp(" + x + ") est : " + y);
    }
}
