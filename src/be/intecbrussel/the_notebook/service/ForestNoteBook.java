package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.AnimalNameSorter;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNoteBook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        animalCount = animals.size();
        return animalCount;
    }

    public void addAnimal(Animal animal){

        if(!animals.contains(animal)){
            animals.add(animal);

            if(animal instanceof Carnivore){
                carnivores.add((Carnivore) animal);
            }
            else if(animal instanceof Herbivore){
                herbivores.add((Herbivore) animal);
            }else {
                omnivores.add((Omnivore) animal);
            }
        }


    }

    public void addPlant(Plant plant){

        if(!plants.contains(plant)) {
            plants.add(plant);
            plantCount++;
        }

    }

    public void printNoteBook(){

        System.out.println("These are the animals I saw: ");
        animals.forEach(System.out::println);
        System.out.println("---");
        System.out.println("These are the plants I saw: ");
        plants.forEach(System.out::println);

    }

    public void sortAnimalsByName(){

        //animals.sort(Comparator.comparing(Animal::getName));
       // animals.sort(new AnimalNameSorter());
        animals.sort((animal1,animal2)-> animal1.getName().compareTo(animal2.getName()));
    }

    public void sortPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));

    }

}
