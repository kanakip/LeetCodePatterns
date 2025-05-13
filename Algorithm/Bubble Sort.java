Bubble Sort Algorithm Explanation

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

The main idea of Bubble Sort is to "bubble" the largest element to the end of the list in each iteration. The algorithm continues until no swaps are needed, indicating that the array is sorted.

Bubble Sort Steps:
1. Start with the first element of the array and compare it to the second element.
2. If the first element is greater than the second, swap them.
3. Move to the next pair (second and third elements) and repeat the process.
4. Continue comparing and swapping adjacent elements until you reach the end of the array.
5. After each full pass through the array, the largest unsorted element "bubbles" to its correct position.
6. Repeat the process for the remaining unsorted portion of the array, ignoring the last sorted elements in each pass.

 Bubble Sort Code in Java:


public class loop1 {
    // Function to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;  // Length of the array
        boolean swapped;     // To check if a swap occurred
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Set swapped to true since a swap occurred
                }
            }
            // If no elements were swapped in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    // Function to print the array
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  // Example unsorted array
        System.out.println("Original array:");
        printArray(arr);
        // Call the Bubble Sort function
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);  // Print the sorted array
    }
}


Explanation of the Code:

1. bubbleSort(int[] arr):
   - This function performs the bubble sort on the array `arr`.
   - The outer loop runs `n-1` times (where `n` is the length of the array) to perform multiple passes through the array.
   - The inner loop compares adjacent elements. If they are out of order, the elements are swapped.
   - A `boolean swapped` is used to track if any swaps occurred during a pass. If no swaps were made, the array is already sorted, and the loop breaks early.

2. printArray(int[] arr):
   - This function prints the elements of the array in a single line.

3. main():
   - In the `main` method, we declare and initialize an array.
   - The original array is printed.
   - We call the `bubbleSort()` function to sort the array.
   - The sorted array is printed after sorting.

Example Input and Output:

Input:

Original array:
64 34 25 12 22 11 90

Output:
Sorted array:
11 12 22 25 34 64 90


Explanation of the Sorting Process:

- Pass 1: Compare adjacent elements and swap if necessary. After the first pass, the largest element (90) is at the end of the array.
- Pass 2: Again, compare and swap if necessary, ignoring the last element (since it's already sorted). The second largest element (64) moves to its correct position.
- This process continues until all the elements are in the correct order.

Time Complexity:

- Worst-case time complexity: O(n²) (when the array is in reverse order).
- Best-case time complexity: O(n) (when the array is already sorted, thanks to the `swapped` flag).
- Average time complexity: O(n²).

Space Complexity:
- Space complexity:O(1) because Bubble Sort only uses a constant amount of extra memory for swapping.

Bubble Sort is simple but inefficient for large datasets compared to other sorting algorithms like QuickSort or MergeSort. However, it’s useful for educational purposes and for small arrays where simplicity is preferred.
