package main;

import gestionAnimal.*;


public class ZooManagement {

    public static void main(String[] args) {


        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        Terrestrial deg = new Terrestrial(4,"Fox","dog",5,true);
        Aquatic shark = new Aquatic("ocean","meg","shark",5,false);
        Dolphin d = new Dolphin(25.5F,"ocean","marlin","dolphin",7,true);
        Penguin p  = new Penguin(10.2F,"malta","penguin","macaroni",5,false);

        //surcharge de la methode toString()
        System.out.println(shark.toString());
        System.out.println(d.toString());
        System.out.println(p.toString());

        shark.swim();
        d.swim();
        p.swim();

    }

}
