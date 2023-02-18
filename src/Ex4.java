import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;  // initialisation de la valeur maximale à la plus petite valeur possible
        int min = Integer.MAX_VALUE;  // initialisation de la valeur minimale à la plus grande valeur possible

        // Demander à l'utilisateur le nombre de variables à saisir
        System.out.print("Entrez le nombre de variables à saisir : ");
        n = sc.nextInt();

        // Saisir les variables et trouver la valeur maximale et minimale
        for (int i = 1; i <= n; i++) {
            System.out.print("Entrez la variable " + i + " : ");
            int variable = sc.nextInt();
            if (variable > max) {
                max = variable;
            }
            if (variable < min) {
                min = variable;
            }
        }

        // Afficher la valeur maximale et minimale
        System.out.println("La valeur maximale est : " + max);
        System.out.println("La valeur minimale est : " + min);
    }
}
