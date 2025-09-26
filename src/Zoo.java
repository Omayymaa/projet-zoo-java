public class Zoo {
    Animal[] animals = new Animal[25]; // max 25 animaux
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimal = 0 ;
    public Zoo(){}
    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }
    public boolean addAnimal(Animal animal) {
            if (nbrAnimal >= animals.length) {
                System.out.println("Interdit de dépasser le nombre d'animaux !");
                return false;
            }
            if (searchAnimal(animal) != -1) {
                System.out.println("l' animal " + animal.name + " existe déja dans le zoo !");
                return false;
            }
            animals[nbrAnimal] = animal ;
            nbrAnimal++;
            System.out.println("Le nouveau animal " + animal.name + " est ajouté avec succées.");
            return  true;
    }
    public void afficherAnimaux() {
        System.out.println("Les animaux du zoo : ");
        for (int i = 0; i < nbrAnimal ; i++) {
            System.out.println("Animal "+ (i + 1) + " :  " + animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrAnimal ; i++) {
           if (animals[i].name == animal.name)
               return i;
        } return -1;
    }

    public boolean removeAnimal(Animal animal){
        for (int i = 0; i < nbrAnimal ; i++) {
            if (animals[i].name == animal.name){
                 animals[i] = null ;
                 System.out.println("La suppression de l'animal " +animal.name+ " se fait avec succée." );
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
}