package lab3;

import org.lab1.Animal;
import org.lab1.Animal.Builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Animal.Builder builder = new Builder()
                .setSpecies("Dog");

        Animal dog = builder.build();

        animals.add(dog);

        AnimalService.sortByName(animals);

        List<Animal> filteredAnimals = AnimalService.filterBySpecies(animals, "Dog");
        System.out.println("Filtered Animals: " + filteredAnimals);
    }
}