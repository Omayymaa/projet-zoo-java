package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {
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

    public abstract void swim() ;


    @Override
    public boolean equals(Object obj) {
        if (obj == null ) return false;
        if (obj instanceof Aquatic other ) {
            return age == other.age &&
                    name.equals(other.name) &&
                    habitat.equals(other.habitat);
        }return false;
    }


}
