package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

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

        myZoo1.afficherAnimaux();
        System.out.println("La recherche de l'animal retourne : "+ myZoo1.searchAnimal(lion1));
        System.out.println("La recherche de l'animal retourne : "+ myZoo1.searchAnimal(lion));
        System.out.println("La recherche de l'animal retourne : "+ myZoo1.searchAnimal(dauphin));


        myZoo1.removeAnimal(lion);
        myZoo1.afficherAnimaux();

        myZoo1.isZooFull();

        Zoo plusGrand = Zoo.comparerZoo(myZoo1, myZoo);
        System.out.println("Le zoo qui a le plus d'animaux est : " + plusGrand.getName());


        Terrestrial t = new Terrestrial();
        Dolphin d = new Dolphin();
        Penguin p = new Penguin();


        Aquatic d1 = new Dolphin("Flipper", 5, "Océan", 25.5f);
        Aquatic p1 = new Penguin("Pingo", 3, "Arctique", 15.0f);
        Aquatic p2 = new Penguin("Poli", 4, "Antarctique", 22.3f);


        System.out.println(d1);
        System.out.println(p1);
        System.out.println(p2);


        d1.swim();
        p1.swim();
        p2.swim();


        myZoo1.addAquaticAnimal(d1);
        myZoo1.addAquaticAnimal(p1);
        myZoo1.addAquaticAnimal(p2);

        myZoo1.makeAllSwim();


        System.out.println("Profondeur maximale des pingouins : " + myZoo1.maxPenguinSwimmingDepth() + " m");


        myZoo1.displayNumberOfAquaticsByType();

        Aquatic p3 = new Penguin("Pingo", 3, "Arctique", 15.0f);
        System.out.println("p1 equals p3 ? " + p1.equals(p3));


        try {
            myZoo1.addAnimal(chat);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + myZoo1.getNbrAnimal());

        try {
            myZoo1.addAnimal(lion);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + myZoo1.getNbrAnimal());

        try {
            Animal singe = new Animal("Primates", "Singe", -3, true);
            myZoo1.addAnimal(singe);
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + myZoo1.getNbrAnimal());
    }
}