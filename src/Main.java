import java.util.Scanner; // Import Scanner class from java.util package to read input from console

public class Main {

    /**
     * The main method reads an array from user input and calculates its average value.
     * It utilizes the Scanner class to take input and then calls the findAvg method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Initialize an array of size n

        // Loop to input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store input values in the array
        }

        System.out.print(findAvg(arr)); // Print the average value found in the array
        sc.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * This method calculates and returns the average of an integer array.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * The function iterates through the array once, summing the elements, and then computes the average.
     *
     * @param arr The input array of integers.
     * @return The average value of the elements in the array.
     * @throws IllegalArgumentException if the array is empty.
     */
    public static double findAvg(int[] arr) {
        if (arr.length == 0) { // Check if the array is empty
            throw new IllegalArgumentException("Empty array"); // Throw an exception if no elements exist
        }

        int sum = 0; // Initialize sum to accumulate array elements

        // Loop through the array to calculate the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each element of the array to sum
        }

        return (double) sum / arr.length; // Return the average as a double value
    }
}