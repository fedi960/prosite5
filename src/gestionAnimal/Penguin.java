package gestionAnimal;

public class Penguin extends Aquatic{
    private float swimmingDepthv ;

    public Penguin(float swimmingDepthv, String habitat , String name , String family , int age , boolean isMammal) {
        super(habitat,name,family,age,isMammal);
        this.swimmingDepthv = swimmingDepthv;
    }

    // getter et setter pour "swimmingDepthv" car il est private
    public float getSwimmingDepthv() {
        return swimmingDepthv;
    }

    public void setSwimmingDepthv(float swimmingDepthv) {
        this.swimmingDepthv = swimmingDepthv;
    }

    @Override
    public String toString() {
        return "Penguin [swimming Depthv=" + swimmingDepthv + "] , " + super.toString();
    }

    public void swim(){
        System.out.println("This penguin is swimming");
    }
}

