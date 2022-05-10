package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Flower;
import be.intecbrussel.the_notebook.entities.plant_entities.Tree;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {

    public static void main(String[] args) {


        ForestNoteBook myNoteBook = new ForestNoteBook();

        Flower flower = new Flower("Rose",156);
        Tree tree = new Tree("Appletree");
        Flower flower2 = new Flower("Rose",15);

        Omnivore omnivore1 = new Omnivore("dog",465,46,9);
        Omnivore omnivore = new Omnivore("bear");


        Carnivore carnivore = new Carnivore("tiger");

        Herbivore herbivore = new Herbivore("goat");

        herbivore.addPlantToDiet(flower);
        herbivore.addPlantToDiet(tree);


        myNoteBook.addPlant(flower);
        myNoteBook.addPlant(flower2);
        myNoteBook.addPlant(tree);
        myNoteBook.addAnimal(omnivore1);
        myNoteBook.addAnimal(omnivore);

        myNoteBook.addAnimal(carnivore);
        myNoteBook.addAnimal(herbivore);

        System.out.println("Number of animals: "+ myNoteBook.getAnimalCount());
        System.out.println("Number of plants: "+ myNoteBook.getPlantCount());

        myNoteBook.printNoteBook();
        System.out.println();

        System.out.println("These are the omnivres");
        for (Omnivore c: myNoteBook.getOmnivores()){
            System.out.println(c);
        }
        System.out.println("----");
        myNoteBook.sortAnimalsByName();
        myNoteBook.sortPlantsByName();

        myNoteBook.printNoteBook();





    }
}
