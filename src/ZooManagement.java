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

        Animal lion = new Animal("félidés","lion",4,true);
        Animal chat = new Animal("félidés","mimi",2,true);
        Animal chien = new Animal("canidés","dog",3,true);
        System.out.println(lion);
        Zoo myzoo = new Zoo("abc","tunis",10);
        myzoo.animals[0]=lion;
        myzoo.animals[1]=chat;
        myzoo.animals[2]=chien;
        for (Animal animal : myzoo.animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
        System.out.println(myzoo);
        System.out.println(myzoo.toString()) ;
        myzoo.displayZoo();
    }
}
