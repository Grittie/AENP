package week2;

public class PetTest {
    public static void main(String[] args) {
        // Create multiple Pet instances and add them to an array
        Pet[] pets = {
                new Dog("Nick", 5, "black"),
                new Cat("Ludwig", 3, "yellow"),
                new Poodle("Anthony", 12, "white"),
                new Tiger("Aiden", 9, "orange")
        };

        // Loop through the array and call the makeSound() method on each Pet instance
        for (Pet pet : pets) {
            System.out.println(pet.toString() + " says " + pet.makeSound());
        }
    }
}
