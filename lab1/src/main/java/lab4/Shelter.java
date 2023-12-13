package lab4;

import org.lab1.Animal;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> animals;

    public Shelter() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Cannot add null animal to the shelter");
        }
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
}