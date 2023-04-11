package week5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManipulator {
    public static void main(String[] args) {

    }

    static void create() {
        try {
            File file = new File("pet.txt");
            if (file.createNewFile()) {
                System.out.println("File created, named: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    static void write(String type, String name, int age, String color) {
        try {
            FileWriter writer = new FileWriter("pet.txt", true);
            PrintWriter output = new PrintWriter(writer);
            output.println(type + "," + name + "," + age + "," + color);
            output.close();
            System.out.println("Klaar!");
        } catch (IOException e) {
            System.out.println("Er ging wat mis...");
            e.printStackTrace();
        }
    }

    static void read() {
        try {
            File file = new File("pet.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) { // Doorloop het bestand
                String tekstRegel = scanner.nextLine(); // Haal er één regel uit.

                String[] pet_values = tekstRegel.split(",");
                ArrayList<String> list = new ArrayList<String>();
                for (String pet_value : pet_values) {
                    list.add(pet_value);
                }
                System.out.println(list); // Print deze regel.
            }
        } catch (IOException e) {
            System.out.println("Er gaat wat mis...");
            e.printStackTrace();
        }
    }

    static void editLine(int lineIndex, String newLine) {
        try {
            // Read the contents of the file
            List<String> lines = Files.readAllLines(Paths.get("pet.txt"), StandardCharsets.UTF_8);

            // Modify the desired line
            System.out.println(lines.size());
            if (lineIndex >= 0 && lineIndex < lines.size()) {
                lines.set(lineIndex, newLine);
            } else {
                throw new IndexOutOfBoundsException("Invalid line index");
            }

            // Write the modified lines back to the file
            Files.write(Paths.get("pet.txt"), lines, StandardCharsets.UTF_8);
            System.out.println("File updated successfully");
        } catch (IOException e) {
            System.out.println("Error occurred while editing the file");
            e.printStackTrace();
        }
    }
}