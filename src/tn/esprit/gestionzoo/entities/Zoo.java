package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;
    private Animal[] animals = new Animal[25]; // max 25 animaux
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimal = 0 ;

    public Zoo(){}
    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.out.println("Le nom d'un zoo ne peut pas etre vide!");
        }
        else  {
            this.name = name;
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }


    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }

        if (nbrAnimal >= nbrCages) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }

        if (searchAnimal(animal) != -1) {
            System.out.println(" L’animal " + animal.getName() + " existe déjà dans le zoo !");
            return; // Pas une exception ici, juste une information
        }

        animals[nbrAnimal] = animal;
        nbrAnimal++;
        System.out.println(" L’animal " + animal.getName() + " a été ajouté avec succès.");
    }


    public void afficherAnimaux() {
        System.out.println("Les animaux du zoo : ");
        for (int i = 0; i < nbrAnimal ; i++) {
            System.out.println("Animal "+ (i + 1) + " :  " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrAnimal ; i++) {
           if (animals[i].getName() == animal.getName())
               return i;
        } return -1;
    }

    public boolean removeAnimal(Animal animal){
        for (int i = 0; i < nbrAnimal ; i++) {
            if (animals[i].getName() == animal.getName()){
                 animals[i] = null ;
                 System.out.println("La suppression de l'animal " +animal.getName()+ " se fait avec succée." );
                 return true;
            }
        }  return false;
    }

    public boolean isZooFull(){
        if (nbrAnimal == nbrCages) {
            System.out.println("Le zoo est plein !");
            return true;
        }else  {
            System.out.println("Le zoo n'est pas plein .");
            return false;
        }
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimal > z2.nbrAnimal)
             return z1;
        else
            return z2;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("Le zoo est plein !");
        }
    }

    public void makeAllSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }


    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin)
                dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin)
                penguinCount++;
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }


}