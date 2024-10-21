package gestionAnimal;

public abstract class Aquatic extends Animal {
    private String habitat ;
    float swimmingSpeed , swimmingDepth ;
    public Aquatic(String habitat , String name ,String family , int age , boolean isMammal) {
        super(name, family, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habitat + "] , " + super.toString();
    }
    public abstract void swim();


}
