// TxtS.java
package lab2;

import org.lab1.Animal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TxtS implements Serializer {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public <T> void serialize(T entity, String filename) throws IOException {
        if (entity instanceof Animal) {
            Animal animal = (Animal) entity;
            String data = "Species=" + animal.getSpecies() +
                    ", DateOfBirth=" + animal.getDateOfBirth().format(formatter) +
                    ", Name=" + animal.getName() +
                    ", Color=" + animal.getColor();
            Files.write(Paths.get(filename), data.getBytes());
        }
    }

    @Override
    public <T> T deserialize(String filename, Class<T> entityType) throws IOException {
        if (entityType.equals(Animal.class)) {
            String data = new String(Files.readAllBytes(Paths.get(filename)));
            String[] parts = data.split("[=, ]+");
            String species = parts[1];
            LocalDate dateOfBirth = LocalDate.parse(parts[3], formatter);
            String name = parts[5];
            String color = parts[7];
        }
        return null;
    }
}