package lab3;

import org.lab1.Animal;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalService3 {
    public static void sortAnimalsBySpecies(List<Animal> animals) {
        Comparator<Animal> bySpecies = Comparator.comparing(Animal::getSpecies);
        animals.sort(bySpecies);
    }

    public static void sortByColorDesc(List<Animal> animals) {
        Comparator<Animal> byColorDesc = Comparator.comparing(Animal::getColor).reversed();
        animals.sort(byColorDesc);
    }

    public static List<Animal> filterByColor(List<Animal> animals, String color) {
        return animals.stream()
                .filter(animal -> animal.getColor().equals(color))
                .collect(Collectors.toList());
    }

}
