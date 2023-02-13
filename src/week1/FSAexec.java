package week1;
import java.util.Random;

public class FSAexec {
    public static void main(String[] args) {
        String input_string = generateRandomString();
        new FSAexec().fsaExec(input_string);
    }
    public static String generateRandomString() {
        String characters = "abc";
        int length = new Random().nextInt(8) + 3;
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(new Random().nextInt(characters.length()));
        }
        return new String(text);
    }
    void fsaExec(String input_string) {
        boolean[] acceptState = {false, false, false, true};

        int[][] tranTab = { // transition table for 3 different input symbols
                {0, 1, 0}, // state [0]
                {2, 1, 1}, // state [1]
                {0, 1, 3}, // state [2]
                {0, 1, 3}  // state [3]
        };

        System.out.printf("Input is %s%n", input_string);

        int state = 0;
        for (int i = 0; i < input_string.length(); i++) {
            char inchar = input_string.charAt(i);
            int incharIndex = inchar - 'a';
            state = tranTab[state][incharIndex];

            System.out.printf("State: %s of %s%n",incharIndex,input_string.length());
            System.out.printf("Checking %s%n", inchar);
        }
        System.out.println(acceptState[state]);
    }
}
