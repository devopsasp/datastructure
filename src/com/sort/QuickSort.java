package com.sort;

public class QuickSort {

    // Main method to sort an array using QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {

        // Choosing the rightmost element as pivot
        int pivot = arr[high];
 System.out.println("pivot "+pivot);
        int i = (low - 1); // Index of smaller element
       
        for (int j = low; j < high; j++) {
 
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        swap(arr, i + 1, high);
 printArray(arr);
        return i + 1; // Return the partition index
    }

    // Method to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
         System.out.println("swapping "+arr[i] +" and "+ arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6, 4};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Method to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

