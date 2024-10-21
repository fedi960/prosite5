package gestionAnimal;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    int nbrAnimals;
    private int nbrAquatics;
    private Aquatic[] aquaticAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Aquatic[10];
    }



    public Aquatic getAquaticAnimalsdei(int i) {
        return aquaticAnimals[i];
    }

    public boolean addAquatic(Aquatic a) {
        if (a.age < 0) {
            System.out.println("enter a logic age");
            return false;
        }
        if (searchAnimal(a) != -1)
            return false;
        if (this.isZooFull())
            return false;
        aquaticAnimals[nbrAquatics] = a;
        nbrAquatics++;
        return true;
    }

    public float maxPenguinSwimmingDepth(int i) {

            return aquaticAnimals[i].swimmingDepth;

    }

    public void displayNumberOfAquaticsByType(){
        int d=0;
        int p=0;
        for (int i=0 ;i < nbrAquatics;i++){
            if (maxPenguinSwimmingDepth(i)==0){
                d++;
            }else
                p++;
        }
        System.out.println("The number of aquatic penguins is " + p+"The number of aquatic dolphin is"+d);
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {

        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (animal.age < 0) {
            System.out.println("enter a logic age");
            return false;
        }
        if (searchAnimal(animal) != -1)
            return false;
        if (this.isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        this.nbrAnimals--;
        animals[nbrAnimals] = null;
        return true;
    }

    public void displayAnimals() {
        if (nbrAnimals == 0)
            System.out.println("No animals found");
        else {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }}

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }

    public int searchAquatic(Aquatic a) {
        int index = -1;
        for (int i = 0; i < nbrAquatics; i++) {
            if (a.name == animals[i].name)
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

}