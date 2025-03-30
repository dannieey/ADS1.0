package tasks;


import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for computing the greatest common divisor (GCD) using recursion.
 */
public class Problem10 {

    /**
     * The main method reads two integers from user input, representing a and b,
     * and calculates the greatest common divisor using the gcd function.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        int a = sc.nextInt(); // Read a value
        int b = sc.nextInt(); // Read b value
        sc.close(); // Close the Scanner to free resources

        System.out.print(gcd(a, b)); // Call gcd function and print the result
    }

    /**
     * This method computes the gcd of two numbers using recursion.
     *
     * Time Complexity: O(log(b)), since it is a step
     *
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a; // Base case: if b is 0, return a as the GCD
        return gcd(b, a % b); // Recursive step using the Euclidean algorithm
    }
}
