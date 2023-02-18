import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = 0;  // distance à parcourir en km
        double essence = 3370;  // coût du litre d'essence
        double gasoil = 2600;  // coût du litre de gasoil

        // Coûts de la voiture essence
        double locationEssence = 50000;  // coût de la location par jour
        double consoEssence = 8;  // consommation en litres aux 100 km
        double prixEssence = essence * consoEssence / 100;  // coût en essence pour 100 km

        // Demander à l'utilisateur la distance à parcourir
        System.out.print("Entrez la distance à parcourir en km : ");
        distance = sc.nextDouble();

        // Calcul du coût de la voiture essence
        double coutEssence = locationEssence + distance / 100 * prixEssence;
        System.out.println("Le coût de la voiture essence est de " + coutEssence + " Ar");

        // Calcul du coût de la voiture gasoil
        double locationGasoil = 45000;  // coût de la location par jour
        double consoGasoil = 5.5;  // consommation en litres aux 100 km
        double prixGasoil = gasoil * consoGasoil / 100;  // coût en gasoil pour 100 km
        double coutGasoil = locationGasoil + distance / 100 * prixGasoil;
        System.out.println("Le coût de la voiture gasoil est de " + coutGasoil + " Ar");

        // Affichage de la voiture la moins chère
        if (coutEssence < coutGasoil) {
            System.out.println("La voiture essence est la moins chère.");
        } else {
            System.out.println("La voiture gasoil est la moins chère.");
        }
    }
}
