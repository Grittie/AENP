package week1;

import java.util.Random;

public class FSAexec {

    /**
     * Main method that generates a random string and calls the fsaExec method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calls generateRandomString function to generate a random string
        String input_string = generateRandomString();
        // Call the fsaExec method with the generated string as input
        new FSAexec().fsaExec(input_string);
    }

    /**
     * Method that generates a random string from 3 to 10 characters using "a", "b", and "c".
     * @return the generated random string
     */
    public static String generateRandomString() {
        // The characters to be used in the generated string
        String characters = "abc";
        // Generate a random length for the string between 3 and 10
        int length = new Random().nextInt(8) + 3;
        // Initialize an array of characters with the generated length
        char[] text = new char[length];
        // Loop through the array and fill it with random characters from the characters string
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(new Random().nextInt(characters.length()));
        }
        // Return the generated string
        return new String(text);
    }

    /**
     * Method that executes the finite state automation (FSA)
     * @param input_string the input string to be processed by the FSA
     */
    void fsaExec(String input_string) {
        System.out.println("Lars Grit, IT102");
        // Array of boolean values indicating whether each state is an accept state
        boolean[] acceptState = {false, false, false, true};

        int[][] tranTab = { // transition table for 3 different input symbols
                {0, 1, 0}, // state [0]
                {2, 1, 1}, // state [1]
                {0, 1, 3}, // state [2]
                {0, 1, 3}  // state [3]
        };

        // Prints what the generated input is
        System.out.printf("Input is %s%n", input_string);

        // The current state of the FSA
        int state = 0;
        // Loop through the input string
        for (int i = 0; i < input_string.length(); i++) {
            // Get the current input character
            char inchar = input_string.charAt(i);
            // Get the index of the current input character in the transition table
            int incharIndex = inchar - 'a';
            // Update the current state based on the transition table
            state = tranTab[state][incharIndex];

            // Prints the state and what character is being checked to get the state
            System.out.printf("State: %s of %s%n", incharIndex, input_string.length());
            System.out.printf("Checking %s%n", inchar);
        }
        // Prints final result
        System.out.println(acceptState[state]);
    }
}
