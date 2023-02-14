package week1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailChecker {
    // The RegEx to check if an email is a valid HvA email
    private static final String EMAIL_PATTERN = "(\\W|^)[\\w.+\\-]*@(?:hva|HvA|HVA)\\.(?:nl|NL)(\\W|$)";


    // This variable stores the compiled pattern for email validation.
    private static Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    /**
     * This method checks if the provided email string matches the email pattern.
     * @param email the email string to validate
     * @return true if the email is valid, false otherwise
     */
    public static boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * The main method of the class that tests the email validation.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        String[] emails = {"john.doe@HvA.nl", "jane.doe@HVA.NL", "john.doe@hvvaa.com", "jane.doe@gmail.NL"};
        for (String email : emails) {
            System.out.println(email + " is valid: " + validate(email));
        }
    }
}
