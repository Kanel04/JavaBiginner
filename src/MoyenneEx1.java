import java.util.Scanner;

public class MoyenneEx1 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double nb = 0;
    double somme = 0;
    double moyenne = 0;
    int i = 0;
    
    while (i < 10) {
        System.out.print("Entrez un nombre : ");
        nb = sc.nextDouble();
        somme += nb;
        moyenne = somme / (i + 1);
        System.out.println("La moyenne est de : " + moyenne);
        i++;
    }
  }
}
