package tn.esprit.gestionzoo.entities;
public sealed class Animal permits Aquatic,Terrestrial {
    private String family;
    protected String name;
    protected int age;
    private boolean isMammal;
    public Animal(){}
    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age>0)  {
            System.out.println("un animal ne peut avoir un age négatif !");
        }
        else {
            this.age = age;
        }
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }
    @Override
    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

}