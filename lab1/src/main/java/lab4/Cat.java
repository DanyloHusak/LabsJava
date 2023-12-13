package lab4;

import org.lab1.Animal;

import java.time.LocalDate;
import java.time.Period;

public class Cat extends Animal {
    private String color;

    Cat(String species, int age, String color) {
        super(species, age);
        this.color = color;
    }

    public Cat(String cat, int age, String black, int i, String luna) {
        super();
    }

    public static class CatBuilder extends Animal.Builder {
        private String color;

        public CatBuilder setColor(String color) {
            if (color == null || color.isEmpty()) {
                throw new IllegalArgumentException("Color cannot be empty or null");
            }
            this.color = color;
            return this;
        }

        @Override
        public void validate() {
            setColor(color);
            }
        }

        @Override
        public Cat build() {
            validate();
            return new Cat(getSpecies(), calculateAge(getDateOfBirth()), color);
        }

    private void validate() {
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }

    private int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
    }
