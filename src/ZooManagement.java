import java.util.Scanner;

public class ZooManagement {
      static int nbrCages;
      static String zooName;

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("entrez le nom du zoo : ");
          zooName = sc.nextLine();
          while (zooName.isEmpty()){
              System.out.print("le nom ne doit pas etre vide. réessayez : ");
              zooName = sc.nextLine();
          }
          System.out.print("entrez le nombre de cages : ");
          nbrCages = sc.nextInt();
          while(nbrCages <= 0) {
              System.out.print("le nombre doit etre positif. Réessayez : ");
              nbrCages = sc.nextInt();
          }
          sc.close();
          System.out.println(zooName + " comporte " + nbrCages + " cages.");
      }
}