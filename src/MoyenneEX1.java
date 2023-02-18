import java.util.Scanner;

public class MoyenneEX1 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double[] nombres = new double[10];
    double somme = 0;
    double moyenne = 0;
    
    for (int i = 0; i < nombres.length; i++) {
        System.out.print("Entrez un nombre : ");
        nombres[i] = sc.nextDouble();
        somme += nombres[i];
        moyenne = somme / (i + 1);
        System.out.println("La moyenne est de : " + moyenne);
    }
  }
}
