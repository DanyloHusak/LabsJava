package lab3;

import org.lab1.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalService {


    //зібрати всі метощи в один інтерфейс і зробити без і для streamAPI
    public static void sortByName(List<Animal> animals) {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public static List<Animal> filterBySpecies(List<Animal> animals, String species) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            String animalSpecies = animal.getSpecies();
            if (animalSpecies != null && animalSpecies.equals(species)) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public static void sortByColor(List<Animal> animals) {
        animals.sort(Comparator.comparing(Animal::getColor));
    }

    public static List<Animal> filterByColor(List<Animal> animals, String color) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getColor().equals(color)) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public static void sortAnimalsBySpecies(List<Animal> animals) {
        animals.sort(Comparator.comparing(Animal::getSpecies));
    }

    public static void sortByColorDesc(List<Animal> animals) {
        Comparator<Animal> byColorDesc = Comparator.comparing(Animal::getColor).reversed();
        animals.sort(byColorDesc);
    }
}