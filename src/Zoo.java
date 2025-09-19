import java.util.Arrays;
public class Zoo {
    Animal animals[];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals= new Animal[25];
    }
    @Override
    public String toString(){
        return "Zoo { " + "name = " + name + " , city = " + city + ", nombre de cages = " + nbrCages + ", animals = " + Arrays.toString(animals) + " } ";
    }
    public void displayZoo(){
        System.out.println("nom du zoo : " + name);
        System.out.println("ville du zoo : " + city);
        System.out.println("nombre de cages  : " + nbrCages);
    }
}
