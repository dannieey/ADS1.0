package tasks;


import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and computing power of a number.
 */
public class Problem6 {

    /**
     * The main method reads two integers (base and exponent) from user input and computes the power.
     * It utilizes the Scanner class to take input and then calls the powNum method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        int a = sc.nextInt(); // Read base integer from user input
        int n = sc.nextInt(); // Read exponent integer from user input
        sc.close(); // Close the Scanner to free resources

        System.out.print(powNum(a, n)); // Send a and n to powNum function and print the returned result
    }

    /**
     * This method calculates the power of a number using recursion.
     *
     * Time Complexity: O(n), where n is the exponent.
     * The function makes n recursive calls, leading to a linear time complexity.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     */
    public static int powNum(int a, int n) {
        if (n == 0) return 1; // Base case: any number raised to the power of 0 is 1
        if (n == 1) return a; // Base case: any number raised to the power of 1 is itself

        return a * powNum(a, n - 1); // Recursive call: a^n = a * a^(n-1)
    }
}
