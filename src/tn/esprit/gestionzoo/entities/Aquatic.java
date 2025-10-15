package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal {
    protected String habitat;
    public Aquatic() {}

    public Aquatic(String name, int age,String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }


}
