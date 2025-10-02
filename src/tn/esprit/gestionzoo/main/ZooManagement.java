package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /* Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */
        //Instruction 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal();
        lion.setFamily("Félidé");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("Parc Animalier");
        myZoo.setCity("Tunis");


        System.out.println("Zoo : " + myZoo.getName() + " à " + myZoo.getCity());
        System.out.println("Animal : " + lion.getName() + " (" + lion.getFamily() + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo1 = new Zoo("Parc Animalier1", "Tunis");
        Animal chat = new Animal("félidés","mimi",2,true);
        Animal dauphin = new Animal("cétacés","dauphin",1,true);


        System.out.println("Animal créé : " + lion1.getName());
        System.out.println("Zoo créé : " + myZoo1.getName() + " (" + myZoo1.getCity() + ")");

        myZoo1.displayZoo();
        System.out.println(myZoo1);
        System.out.println("Ajout d'animal : " + myZoo1.addAnimal(chat));
        System.out.println("Ajout d'animal : " + myZoo1.addAnimal(lion1));
        System.out.println("Ajout d'animal : " + myZoo1.addAnimal(lion1));
        System.out.println("Ajout d'animal : " + myZoo1.addAnimal(lion1));

        myZoo1.afficherAnimaux();
        System.out.println("La recherche de l'animal retourne : "+ myZoo1.searchAnimal(lion1));
        System.out.println("La recherche de l'animal retourne : "+ myZoo1.searchAnimal(lion));
        System.out.println("La recherche de l'animal retourne : "+ myZoo1.searchAnimal(dauphin));

        myZoo1.addAnimal(dauphin);
        myZoo1.addAnimal(lion1);

        myZoo1.removeAnimal(lion);
        myZoo1.afficherAnimaux();

        myZoo1.isZooFull();

        Zoo plusGrand = Zoo.comparerZoo(myZoo1, myZoo);
        System.out.println("Le zoo qui a le plus d'animaux est : " + plusGrand.getName());

    }
}