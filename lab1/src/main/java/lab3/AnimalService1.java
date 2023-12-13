package lab3;

import org.lab1.Animal;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalService1 {

    public static void sortByName(List<Animal> animals) {
        Comparator<Animal> byName = Comparator.comparing(Animal::getName);
        animals.sort(byName);
    }

    public static List<Animal> filterBySpecies(List<Animal> animals, String species) {
        return animals.stream()
                .filter(animal -> animal.getSpecies().equals(species))
                .collect(Collectors.toList());
    }
}

