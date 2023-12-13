package lab2;

import org.lab1.Animal;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("doggo", 5, LocalDate.of(2017, 5, 20), "Buddy", "Brown");

        Serializer jsonSerializer = new JsonS();
        Serializer xmlSerializer = new XmlS();
        Serializer txtSerializer = new TxtS();

        try {
            jsonSerializer.serialize(animal, "animal.json");
            xmlSerializer.serialize(animal, "animal.xml");
            txtSerializer.serialize(animal, "animal.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Animal deserializedFromJson = jsonSerializer.deserialize("animal.json", Animal.class);
            System.out.println("Deserialized from JSON: " + deserializedFromJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Animal deserializedFromXml = xmlSerializer.deserialize("animal.xml", Animal.class);
            System.out.println("Deserialized from XML: " + deserializedFromXml);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Animal deserializedFromTxt = txtSerializer.deserialize("animal.txt", Animal.class);
            System.out.println("Deserialized from TXT: " + deserializedFromTxt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}