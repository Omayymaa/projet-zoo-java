package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal {
    int nbrLegs;
    public Terrestrial() {}

    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Le Nombre de pattes: " + nbrLegs;
    }

}
