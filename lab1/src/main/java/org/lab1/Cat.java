package org.lab1;


import java.time.LocalDate;

public class Cat extends Animal {
    private static final LocalDate dateOfBirth = null;
    private String color;


    public Cat(String cat, String black, int i, String luna) {
    }

    public Cat(String species, String color, LocalDate dateOfBirth) {
    }

    public Cat(String cat, int age, String black, int i, String luna) {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "species='" + getSpecies() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Cat(String species, int age, String color, LocalDate dateOfBirth, String name) {
        super(species, dateOfBirth, name, color);
        this.color = color;
    }

    @Override
    public Animal build() {
        return new Cat(getSpecies(), color, dateOfBirth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}