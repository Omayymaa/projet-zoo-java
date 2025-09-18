import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        int nbrCages;
        String zooName;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = sc.nextLine();
        while (zooName.isEmpty()) {
            System.out.print("Le nom ne doit pas être vide. Réessayez : ");
            zooName = sc.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = sc.nextInt();
        while (nbrCages <= 0) {
            System.out.print("Le nombre doit être positif. Réessayez : ");
            nbrCages = sc.nextInt();
        }

        sc.close();
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
