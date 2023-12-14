package org.lab1;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {

    String species;
    private static LocalDate dateOfBirth;

    private String name;
    private String color;

    public Animal(String species, LocalDate dateOfBirth, String name, String color) {
        this.species = species;
        Animal.dateOfBirth = dateOfBirth;
        this.name = name;
        this.color = color;
    }

    public Animal() {

    }

    public Animal(String species, String name, String color) {
    }

    public Animal(String doggo, int i, LocalDate of, String buddy, String brown) {
    }

    public Animal(String species, int age) {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String catInfoToString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;

        return Objects.equals(name, animal.name) && species.equals(animal.species) && color.equals(animal.color) && dateOfBirth.equals(animal.dateOfBirth);
    }


    public String getSpecies() {
        return null;
    }

    public Animal build() {
        return null;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }


    public static class Builder {
        private String species;

        private String color;
        private String name;

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }


        public Animal build() {
            return new Animal(species, name, color);
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public void validate() {
        }
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return name;
    }
    public String getColor() {
        return name;
    }

    public static class AnimalBuilder {
        private String color;

        public AnimalBuilder(String doggo) {
        }

        public void setAdditionalInfo(String color) {
            this.color = color;
        }

        public Animal setAge(LocalDate of) {
            return null;
        }
    }


}