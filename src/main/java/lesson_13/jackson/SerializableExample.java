package lesson_13.jackson;

import java.io.*;

public class SerializableExample {
    private static final String PATH = "C:\\Users\\maxON\\IdeaProjects\\education-project\\src\\main\\resources\\jackson\\simpleData.txt";

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void writeToFile() {
        SimpleUser simpleUser = new SimpleUser("John", "Cena", 46, "12345");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            objectOutputStream.writeObject(simpleUser);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH))) {
            SimpleUser simpleUser = (SimpleUser) inputStream.readObject();
            System.out.println("Получен объект из файла " + simpleUser);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
