package tasks;

import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and computing the factorial of a number.
 */
public class Problem_4 {

    /**
     * The main method reads an integer from user input and computes its factorial.
     * It utilizes the Scanner class to take input and then calls the factorial method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        int n = sc.nextInt(); // Read an integer from user input
        sc.close(); // Close the Scanner to free resources

        System.out.print(factorial(n)); // Send n to factorial function and print the returned result
    }

    /**
     * This method calculates the factorial of a given integer using recursion.
     *
     * Time Complexity: O(n), where n is the input number.
     * The function recursively calls itself n times, leading to linear complexity.
     *
     * @param n The integer to calculate the factorial of.
     * @return The factorial of the given integer.
     */
    public static int factorial(int n) {
        if (n == 1 || n == 0) { // Since factorial of 0 and 1 is always 1, handle this case separately
            return 1;
        }
        return n * factorial(n - 1); // Recursive call to compute factorial
    }
}
