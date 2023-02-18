import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre x : ");
        double x = sc.nextDouble();

        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();

        double p = Math.pow(x, n);

        System.out.println("Le résultat de " + x + "^" + n + " est : " + p);
    }
}
