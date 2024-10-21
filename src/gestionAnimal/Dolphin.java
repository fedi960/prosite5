package gestionAnimal;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(float swimmingSpeed ,String habitat , String name ,String family , int age , boolean isMammal) {
        super(habitat,name,family,age,isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }

    // getter et setter pour "swimmingSpeed" car il est private
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin [swimming speed=" + swimmingSpeed + "] , " + super.toString();
    }

    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
