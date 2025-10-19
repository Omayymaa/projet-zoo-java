package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;
    public Penguin() {}

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println(name + " le pingouin nage jusqu’à " + swimmingDepth + " mètres de profondeur dans " + habitat);
    }

}
