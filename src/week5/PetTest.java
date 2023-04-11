package week5;

import java.io.File;
import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
//        // Create multiple Pet instances and add them to an array
//        Pet[] pets = {
//                new Dog("Nick", 5, "black"),
//                new Cat("Ludwig", 3, "yellow"),
//                new Poodle("Anthony", 12, "white"),
//                new Tiger("Aiden", 9, "orange")
//        };
//
//        // Loop through the array and call the makeSound() method on each Pet instance
//        for (Pet pet : pets) {
//            System.out.println(pet.toString() + " says " + pet.makeSound());
//        }

        System.out.println("Welcome to the Pet Interface.");
        System.out.println("1. Create pet");
        System.out.println("2. Edit pet");
        System.out.println("3. Read pet");

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number between 1 and 3: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < 1 || num > 3);

        switch (num) {
            case 1:
                System.out.println("You entered 1");
                createPet();
                break;
            case 2:
                System.out.println("You entered 2");
                editPet();
                break;
            case 3:
                System.out.println("You entered 3");
                readPets();
                break;
        }
    }

    static void createPet() {
        int age = -1;
        String type = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will help you create an pet!");

        while (!type.equals("dog") && !type.equals("cat") && !type.equals("tiger") && !type.equals("poodle")) {
            System.out.print("Enter an pet type (dog, cat, tiger, or poodle): ");
            type = scanner.next().toLowerCase();
            if (!type.equals("dog") && !type.equals("cat") && !type.equals("tiger") && !type.equals("poodle")) {
                System.out.println("Invalid input: " + type);
            }
        }

        System.out.println("What is this pets name?");
        String name = scanner.next();

        while (age < 0 || age > 100) {
            System.out.print("How old is this pet?");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("Invalid input: " + input);
                System.out.print("Enter a number between 0 and 100: ");
            }
            age = scanner.nextInt();
            if (age < 0 || age > 100) {
                System.out.println("Number must be between 0 and 100.");
            }
        }

        System.out.println("What is this pets color?");
        String color = scanner.next();

        FileManipulator.write(type, name, age, color);
    }

    static void editPet() {
        System.out.println("Every pet in our system:");
        FileManipulator.read();

        System.out.println("Give the number for what pet you want to edit: ");
        Scanner scanner = new Scanner(System.in);
        int lineIndex = scanner.nextInt() - 1;

        System.out.println("Put in the new details?");
        scanner.nextLine();
        String newLine = scanner.nextLine();

        FileManipulator.editLine(lineIndex, newLine);
    }

    static void readPets() {
        System.out.println("Alle dieren in het systeem zijn:");
        FileManipulator.read();
    }
}
