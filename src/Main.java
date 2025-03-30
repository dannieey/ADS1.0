import java.util.Scanner; // Import Scanner class from java.util package to read input from console

public class Main {

    /**
     * The main method reads an array from user input and finds the minimum value.
     * It utilizes the Scanner class to take input and then calls the findMin method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        int n = sc.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Initialize an array of size n

        // Loop to input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store input values in the array
        }

        System.out.print(findMin(arr)); // Print the minimum value found in the array
        sc.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * This method finds and returns the minimum element in a given integer array.

     * Time Complexity: O(n), where n is the number of elements in the array.
     * The function iterates through the array once, making a single comparison per element.
     *
     * @param arr The input array of integers.
     * @return The minimum value found in the array.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) { // Check if the array is empty or null
            throw new IllegalArgumentException("Empty array"); // Throw an exception if no elements exist
        }

        int min = arr[0]; // Initialize min with the first element of the array

        // Loop through the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) { // Compare each element with min
                min = arr[i]; // Update min if a smaller element is found
            }
        }

        return min; // Return the minimum value found
    }
}
