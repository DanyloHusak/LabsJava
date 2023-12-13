import lab4.Cat;

public class Animal {
    private String species;
    private int age;

    Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public Animal() {}

    public static class Builder {
        private String species;
        private int age;

        public Builder setSpecies(String species) {
            if (species == null || species.isEmpty()) {
                throw new IllegalArgumentException("Species cannot be empty or null");
            }
            this.species = species;
            return this;
        }

        public Builder setAge(int age) {
            if (age < 0 || age > 20) {
                throw new IllegalArgumentException("Age should be between 0 and 20");
            }
            this.age = age;
            return this;
        }

        public void validate() {
            setSpecies(species);
            setAge(age);
        }

        public Animal build() {
            validate();
            return new Animal(species, age);
        }

        @Override
        public String toString() {
            return "Species: " + species + ", Age: " + age;
        }

        public Cat.CatBuilder setColor(String black) {
            return null;
        }
    }
}