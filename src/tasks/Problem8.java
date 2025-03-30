package tasks;


import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and checking if a string consists only of digits.
 */
public class Problem8 {

    /**
     * The main method reads a string from user input and checks whether it consists only of digits.
     * It utilizes the Scanner class to take input and then calls the onlyDigits method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        String s = sc.nextLine(); // Read a string from user input
        sc.close(); // Close the Scanner to free resources

        if (onlyDigits(s)) { // Based on the result of the function onlyDigits, print Yes/No
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * This method checks whether a given string consists only of digit characters.
     *
     * Time Complexity: O(n), where n is the length of the string.
     * The function iterates through each character in the string once.
     *
     * @param s The input string.
     * @return True if the string consists only of digits, false otherwise.
     */
    public static boolean onlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) { // Iterate through each character in the string
            if (!Character.isDigit(s.charAt(i))) { // Check if the character is not a digit
                return false; // If any character is not a digit, return false
            }
        }
        return true; // If all characters are digits, return true
    }
}
