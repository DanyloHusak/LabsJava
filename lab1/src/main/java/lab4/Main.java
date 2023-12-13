package lab4;

import org.lab1.Animal;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        Animal.Builder dogBuilder = new Animal.Builder()
                .setSpecies("Dog")
                .setAge(3);

        try {
            dogBuilder.validate();
            Animal dog = dogBuilder.build();
            shelter.addAnimal(dog);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        Cat.CatBuilder catBuilder = new Cat.CatBuilder()
                .setSpecies("Cat")
                .setAge(5)
                .setColor("Black");

        try {
            catBuilder.validate();
            Cat cat = (Cat) catBuilder.build();
            shelter.addAnimal(cat);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }

        shelter.displayAnimals();
    }
}