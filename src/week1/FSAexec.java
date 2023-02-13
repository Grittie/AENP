package week1;
public class FSAexec {

    public static final String input_string = "bac";

    public static void main(String[] args) {
        // TODO: fix it and test with 4 extra examples
        new FSAexec().fsaExec(input_string);
    }

    /**
     * TODO: Understand the code and make it better.
     *
     * @param input the input string for this automaton
     */

    void fsaExec(String input) {
        boolean[] acceptState = {false, false, false, true};

        int[][] tranTab = { // transition table for 3 different input symbols
                {0, 1, 0}, // state [0]
                {2, 1, 1}, // state [1]
                {0, 1, 3}, // state [2]
                {0, 1, 3}  // state [3]
        };

        System.out.printf("Input is %s%n", input_string);

        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char inchar = input.charAt(i);
            int incharIndex = inchar - 'a';
            state = tranTab[state][incharIndex];

            System.out.printf("State: %s of %s%n",incharIndex,input.length());
            System.out.printf("Checking %s%n", inchar);
        }
        System.out.println(acceptState[state]);
    }

}
