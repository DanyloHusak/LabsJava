package org.lab1;

import java.util.ArrayList;
import java.util.List;


public class Shelter{
    private List<Animal> animals;

    public Shelter() {
        super();
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        Animal dog = new Animal.Builder()
                .setSpecies("Dog")
                .build();
        shelter.addAnimal(dog);

        Cat cat = new Cat("Cat", 5, "Black", 4, "Luna");
        shelter.addAnimal(cat);

        shelter.displayAnimals();
    }
}