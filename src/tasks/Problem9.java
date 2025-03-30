package tasks;

import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for computing the binomial coefficient using recursion.
 */
public class Problem9 {

    /**
     * The main method reads two integers from user input, representing n and k,
     * and calculates the binomial coefficient C(n, k) using the binCoeff function.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        int n = sc.nextInt(); // Read n value
        int k = sc.nextInt(); // Read k value
        sc.close(); // Close the Scanner to free resources

        System.out.print(binCoeff(n, k)); // Call binCoeff function and print the result
    }

    /**
     * This method computes the binomial coefficient C(n, k) using recursion.
     *
     * Time Complexity: O(2^n), since the recursive approach generates a binary tree of function calls.
     *
     * @param n The total number of elements.
     * @param k The number of selected elements.
     * @return The binomial coefficient C(n, k).
     */
    public static int binCoeff(int n, int k) {
        if (k == 0 || k == n) return 1; // since C(n, 0) = C(n, n) = 1
        return binCoeff(n - 1, k - 1) + binCoeff(n - 1, k);
    }
}

