package tasks;


import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and finding the average of an array.
 */
public class Problem2 {

    /**
     * The main method reads an array from user input and calculates its average value.
     * It utilizes the Scanner class to take input and then calls the findAvg method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console

        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Declare an array of size n

        // Loop to take array input from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Assign values to the array from user input
        }

        System.out.print(findAvg(arr)); // Call findAvg function and print the result
        sc.close(); // Close the Scanner to free resources
    }

    /**
     * This method calculates and returns the average value of a given integer array.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * The function iterates through the array once, summing up all elements.
     *
     * @param arr The input array of integers.
     * @return The average value of the array elements.
     * @throws IllegalArgumentException if the array is empty.
     */
    public static double findAvg(int[] arr) {
        if (arr.length == 0) { // Check if the array is empty
            throw new IllegalArgumentException("Empty array"); // Throw an exception if no elements exist
        }

        int sum = 0; // Initialize sum to accumulate array elements

        // Iterate through the array to calculate the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each element to sum
        }

        return (double) sum / arr.length; // Return the average value as a double
    }
}
