package lab3;

import org.lab1.Animal;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalService2 {

    public static <string> string sortByColor(List<Animal> animals) {
        Comparator<Animal> byColor = Comparator.comparing(Animal::getColor);
        animals.sort(byColor);
        return null;
    }

    public static List<Animal> filterByColor(List<Animal> animals, String color) {
        return animals.stream()
                .filter(animal -> animal.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public static void sortAnimalsByAge(List<Animal> animals) {
    }
}
