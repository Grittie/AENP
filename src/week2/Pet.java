package week2;

// The abstract "Pet" class
public abstract class Pet {
    private String name;
    private int age;
    private String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public abstract String makeSound();
    
    public String toString() {
        return name + " is " + age + " years old, and is the color " + color;
    }

    public static void main(String[] args) {
        // This creates a poodle instance called Bob
        Poodle bob = new Poodle("Bob", 12, "zwart");


        // This calls the toString function
        System.out.println(bob.toString());

        // This calls the makeSound function of a poodle
        System.out.println(bob.makeSound());
    }
}

// The Dog class extends the Pet class
class Dog extends Pet {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public String makeSound() {
        return "woof";
    }
}

// The Poodle class extends the Dog Class
class Poodle extends Dog {
    public Poodle(String name, int age, String color) {
        super(name, age, color);
    }

    public String makeSound() {
        return "woof (but like a poodle)";
    }
}

// The Cat class extends the Pet Class
class Cat extends Pet {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public String makeSound() {
        return "meow";
    }
}

// The Tiger class extends the Cat Class
class Tiger extends Cat {
    public Tiger(String name, int age, String color) {
        super(name, age, color);
    }

    public String makeSound() {
        return "roar";
    }
}