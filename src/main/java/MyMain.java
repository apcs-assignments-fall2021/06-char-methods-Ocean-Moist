import static java.lang.Character.toLowerCase;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        return Character.toLowerCase(ch);
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        // REPLACE WITH YOUR CODE HERE
        return Character.toUpperCase(ch);
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        return str.replaceAll("[1-9]","");
    }

    // Write some code to test your methods!
    public static void main(String[] args) {

    }
}
