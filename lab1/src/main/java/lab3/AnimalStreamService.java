package lab3;

import org.lab1.Animal;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalStreamService {

    public static List<Animal> sortByColor(List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::getColor))
                .collect(Collectors.toList());
    }

    public static List<Animal> filterByColor(List<Animal> animals, String color) {
        return animals.stream()
                .filter(animal -> animal.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public static List<Animal> sortByColorDesc(List<Animal> animals) {
        return animals.stream()
                .sorted(Comparator.comparing(Animal::getColor).reversed())
                .collect(Collectors.toList());
    }
}