 public class BubbleSortExample {

    // Method to perform bubble sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    // Mark that a swap occurred
                    swapped = true; 
                }
            }

            // If no elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main method to run and test the program
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(data);

        // Apply bubble sort
        bubbleSort(data);

        System.out.println("\nSorted Array:");
        printArray(data);
    }

    // Helper method to print the array elements
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
