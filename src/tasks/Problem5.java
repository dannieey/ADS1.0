package tasks;


import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and computing Fibonacci numbers.
 */
public class Problem5 {

    /**
     * The main method reads an integer from user input and computes its Fibonacci number.
     * It utilizes the Scanner class to take input and then calls the fib method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        int n = sc.nextInt(); // Read an integer from user input
        sc.close(); // Close the Scanner to free resources

        System.out.print(fib(n)); // Send n to fib function and print the returned result
    }

    /**
     * This method calculates the nth Fibonacci number using recursion.
     *
     * Time Complexity: O(2^n), where n is the input number.
     * The function recursively calls itself twice for each non-base case,
     * leading to an exponential time complexity.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The Fibonacci number at position n.
     */
    public static int fib(int n) {
        if (n == 1) return 1; // Since the Fibonacci sequence starts with 0, 1, 1, 2, 3, 5..., handle base cases
        if (n == 0) return 0;

        return fib(n - 1) + fib(n - 2); // Recursive call using the Fibonacci formula: fib(n) = fib(n-1) + fib(n-2)
    }
}

