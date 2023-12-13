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


        AnimalService1.sortByName(animals);


        List<Animal> filteredAnimals = AnimalService1.filterBySpecies(animals, "Dog");
        System.out.println("Filtered Animals: " + filteredAnimals);
    }
}