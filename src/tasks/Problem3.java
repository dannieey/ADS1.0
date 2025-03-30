package tasks;

import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and checking whether a number is prime.
 */
public class Problem3 {

    /**
     * The main method reads an integer from user input and determines if it is prime.
     * It utilizes the Scanner class to take input and then calls the isPrime method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console
        int n = sc.nextInt(); // Read an integer from user input
        sc.close(); // Close the Scanner to free resources

        // Check if the number is prime and print the corresponding result
        if (isPrime(n)) {
            System.out.print("Prime");
        } else {
            System.out.print("Composite");
        }
    }

    /**
     * This method checks if a given integer is a prime number.
     *
     * Time Complexity: O(√n), where n is the input number.
     * The function iterates from 2 to √n, checking divisibility.
     *
     * @param n The integer to check for primality.
     * @return True if the number is prime, false otherwise.
     */
    public static Boolean isPrime(int n) {
        if (n < 2) { // Check if the number is less than 2, which is not prime
            return false;
        }

        // Loop from 2 to √n to check for divisibility
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { // If n is divisible by i, it is not prime
                return false;
            }
        }
        return true; // Return true if no divisors were found
    }
}
