package tasks;

import java.util.Scanner; // Import Scanner class from java.util package to read input from console

/**
 * The Main class contains the main method for handling user input and finding the minimum element in an array.
 */
public class Problem1 {

    /**
     * The main method reads an array from user input and finds its minimum value.
     * It utilizes the Scanner class to take input and then calls the findMin method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input from console

        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Declare an array of size n

        // Loop to take array input from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Assign values to the array from user input
        }

        System.out.print(findMin(arr)); // Call findMin function and print the result
        sc.close(); // Close the Scanner to free resources
    }

    /**
     * This method finds and returns the minimum value in a given integer array.

     * Time Complexity: O(n), where n is the number of elements in the array.
     * The function iterates through the array once, making a single comparison per element.
     *
     * @param arr The input array of integers.
     * @return The minimum value found in the array.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) { // Check if the array is null or empty
            throw new IllegalArgumentException("Empty array"); // Throw an exception if no elements exist
        }

        int min = arr[0]; // Initialize min with the first element of the array

        // Iterate through the array to find the minimum value
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) { // Compare each element with min
                min = arr[i]; // Update min if a smaller value is found
            }
        }

        return min; // Return the minimum value found
    }
}

