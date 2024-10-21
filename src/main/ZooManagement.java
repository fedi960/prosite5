package main;

import gestionAnimal.*;


public class ZooManagement {

    public static void main(String[] args) {


        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        Terrestrial deg = new Terrestrial(4,"Fox","dog",5,true);
        /**Aquatic shark = new Aquatic("ocean", "meg", "shark", 5, false);
         * i found a problem here i think when i use an abstract class i can't an instance of it and i wich if you can
         * exlore this problem of our next session with you
        */
        Dolphin d = new Dolphin(25.5F,"ocean","marlin","dolphin",7,true);
        Penguin p  = new Penguin(10.2F,"malta","penguin","macaroni",5,false);


        //System.out.println(shark.toString());
        System.out.println(d.toString());
        System.out.println(p.toString());

        //System.out.println(myZoo.addAquatic(shark));
        System.out.println(myZoo.addAquatic(d));
        System.out.println(myZoo.addAquatic(p));

        for (int i=0 ;i < myZoo.getNbrAquatics();i++) {
            myZoo.getAquaticAnimalsdei(i).swim();
        }

        for (int i=0 ;i < myZoo.getNbrAquatics();i++){
            if (myZoo.maxPenguinSwimmingDepth(i)==0){
                System.out.println("this aquatic "+myZoo.getAquaticAnimalsdei(i).getname()+" is not e penguin");
            }else
                System.out.println("this penguin "+myZoo.getAquaticAnimalsdei(i).getname()+" has "+myZoo.maxPenguinSwimmingDepth(i));
        }

        myZoo.displayNumberOfAquaticsByType();

        }

    }




