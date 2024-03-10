import java.io.*;

class Animal implements Serializable {
    String species;

    Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class ISASerializationExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Canine", "Labrador");

        // Serialization
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("dog.ser"))) {
            outputStream.writeObject(myDog);
            System.out.println("Dog object serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("dog.ser"))) {
            Dog deserializedDog = (Dog) inputStream.readObject();
            System.out.println("Deserialized Dog: Species - " + deserializedDog.getSpecies() + ", Breed - " + deserializedDog.getBreed());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
