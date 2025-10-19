package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;
    public Dolphin() {}

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public Dolphin(String name, int age, String habitat, float swimmingSpeed) {
        super(name, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println(name + " le dauphin nage à " + swimmingSpeed + " km/h dans " + habitat);
    }


}
