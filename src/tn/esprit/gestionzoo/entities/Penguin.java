package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;
    public Penguin() {}

    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth;
    }

}
