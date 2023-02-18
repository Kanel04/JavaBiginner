import java.util.Scanner;

public class Ex6ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une valeur de x : ");
        double x = sc.nextDouble();

        double y = Math.sin(x);

        System.out.println("La valeur de sin(" + x + ") est : " + y);
    }
}
