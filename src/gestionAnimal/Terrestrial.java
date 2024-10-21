package gestionAnimal;

public class Terrestrial extends Animal {
    int nbrLegs ;
    public Terrestrial(int nbl, String name ,String family , int age , boolean isMammal) {
        super(name, family, age , isMammal);
        this.nbrLegs = nbl;
    }
}
